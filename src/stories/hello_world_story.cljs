(ns stories.hello-world-story
  (:require [reagent.core :as r]
            [stories.helper :as helper]))

(def a 1)

(defn my-example-comp [msg]
  [:h1 (str "hello world " msg) ])

(def ^export default
  (helper/->default {:title "my hello world"
                     :component my-example-comp
                     :args {:message "this is me"}}))

(defn ^:export my-hello-world-story [args]
  (let [params (helper/->params args)]
    (r/as-element [my-example-comp (:message params)])))
