package typings.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUnwatch extends js.Object {
  def unwatch(): Unit
}

object AnonUnwatch {
  @scala.inline
  def apply(unwatch: () => Unit): AnonUnwatch = {
    val __obj = js.Dynamic.literal(unwatch = js.Any.fromFunction0(unwatch))
    __obj.asInstanceOf[AnonUnwatch]
  }
}

