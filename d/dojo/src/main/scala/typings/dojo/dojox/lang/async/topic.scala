package typings.dojo.dojox.lang.async

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/async/topic.html
  *
  *
  */
trait topic extends js.Object {
  /**
    *
    * @param topic
    */
  def failOn(topic: js.Any): Unit
  /**
    *
    * @param topic
    */
  def from(topic: js.Any): Unit
}

object topic {
  @scala.inline
  def apply(failOn: js.Any => Unit, from: js.Any => Unit): topic = {
    val __obj = js.Dynamic.literal(failOn = js.Any.fromFunction1(failOn), from = js.Any.fromFunction1(from))
    __obj.asInstanceOf[topic]
  }
}

