package typings.gestalt.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckedBoolean extends js.Object {
  var checked: Boolean = js.native
  var event: typings.react.mod.SyntheticEvent[HTMLElement, typings.std.Event] = js.native
}

object CheckedBoolean {
  @scala.inline
  def apply(checked: Boolean, event: typings.react.mod.SyntheticEvent[HTMLElement, typings.std.Event]): CheckedBoolean = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedBoolean]
  }
  @scala.inline
  implicit class CheckedBooleanOps[Self <: CheckedBoolean] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvent(value: typings.react.mod.SyntheticEvent[HTMLElement, typings.std.Event]): Self = this.set("event", value.asInstanceOf[js.Any])
  }
  
}

