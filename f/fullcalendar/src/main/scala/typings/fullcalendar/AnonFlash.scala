package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlash extends js.Object {
  def flash(): Unit
  def teardown(): Unit
}

object AnonFlash {
  @scala.inline
  def apply(flash: () => Unit, teardown: () => Unit): AnonFlash = {
    val __obj = js.Dynamic.literal(flash = js.Any.fromFunction0(flash), teardown = js.Any.fromFunction0(teardown))
    __obj.asInstanceOf[AnonFlash]
  }
}

