package typings.fullcalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flash extends js.Object {
  def flash(): Unit
  def teardown(): Unit
}

object Flash {
  @scala.inline
  def apply(flash: () => Unit, teardown: () => Unit): Flash = {
    val __obj = js.Dynamic.literal(flash = js.Any.fromFunction0(flash), teardown = js.Any.fromFunction0(teardown))
    __obj.asInstanceOf[Flash]
  }
}

