package typings.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/topic.html
  *
  * Pubsub hub.
  *
  */
trait topic extends js.Object {
  /**
    * Publishes a message to a topic on the pub/sub hub. All arguments after
    * the first will be passed to the subscribers, so any number of arguments
    * can be provided (not just event).
    *
    * @param topic The name of the topic to publish to
    * @param event An event to distribute to the topic listeners
    */
  def publish(topic: String, event: js.Object): js.Any
  /**
    * Subscribes to a topic on the pub/sub hub
    *
    * @param topic The topic to subscribe to
    * @param listener A function to call when a message is published to the given topic
    */
  def subscribe(topic: String, listener: js.Function): js.Any
}

object topic {
  @scala.inline
  def apply(publish: (String, js.Object) => js.Any, subscribe: (String, js.Function) => js.Any): topic = {
    val __obj = js.Dynamic.literal(publish = js.Any.fromFunction2(publish), subscribe = js.Any.fromFunction2(subscribe))
  
    __obj.asInstanceOf[topic]
  }
}

