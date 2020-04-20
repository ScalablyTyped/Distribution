package typings.finalFormFocus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusableInput extends js.Object {
  var name: String
  def focus(): Unit
}

object FocusableInput {
  @scala.inline
  def apply(focus: () => Unit, name: String): FocusableInput = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusableInput]
  }
}

