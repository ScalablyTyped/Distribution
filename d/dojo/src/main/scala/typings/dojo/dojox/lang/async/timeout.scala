package typings.dojo.dojox.lang.async

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/async/timeout.html
  *
  *
  */
trait timeout extends js.Object {
  /**
    *
    * @param ms
    */
  def failOn(ms: js.Any): Unit
  /**
    *
    * @param ms
    */
  def from(ms: js.Any): Unit
}

object timeout {
  @scala.inline
  def apply(failOn: js.Any => Unit, from: js.Any => Unit): timeout = {
    val __obj = js.Dynamic.literal(failOn = js.Any.fromFunction1(failOn), from = js.Any.fromFunction1(from))
  
    __obj.asInstanceOf[timeout]
  }
}

