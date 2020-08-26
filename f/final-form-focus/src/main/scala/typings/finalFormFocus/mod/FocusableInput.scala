package typings.finalFormFocus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusableInput extends js.Object {
  var name: String = js.native
  def focus(): Unit = js.native
}

object FocusableInput {
  @scala.inline
  def apply(focus: () => Unit, name: String): FocusableInput = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusableInput]
  }
  @scala.inline
  implicit class FocusableInputOps[Self <: FocusableInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

