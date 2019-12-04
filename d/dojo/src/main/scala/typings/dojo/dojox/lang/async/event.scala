package typings.dojo.dojox.lang.async

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/async/event.html
  *
  *
  */
trait event extends js.Object {
  /**
    *
    * @param src
    * @param name
    */
  def failOn(src: js.Any, name: js.Any): Unit
  /**
    *
    * @param src
    * @param name
    */
  def from(src: js.Any, name: js.Any): Unit
}

object event {
  @scala.inline
  def apply(failOn: (js.Any, js.Any) => Unit, from: (js.Any, js.Any) => Unit): event = {
    val __obj = js.Dynamic.literal(failOn = js.Any.fromFunction2(failOn), from = js.Any.fromFunction2(from))
  
    __obj.asInstanceOf[event]
  }
}

