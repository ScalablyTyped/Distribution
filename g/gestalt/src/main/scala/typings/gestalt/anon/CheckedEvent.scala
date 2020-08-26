package typings.gestalt.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckedEvent extends js.Object {
  var checked: Boolean = js.native
  var event: typings.react.mod.SyntheticEvent[MouseEvent[HTMLInputElement, NativeMouseEvent], typings.std.Event] = js.native
}

object CheckedEvent {
  @scala.inline
  def apply(
    checked: Boolean,
    event: typings.react.mod.SyntheticEvent[MouseEvent[HTMLInputElement, NativeMouseEvent], typings.std.Event]
  ): CheckedEvent = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedEvent]
  }
  @scala.inline
  implicit class CheckedEventOps[Self <: CheckedEvent] (val x: Self) extends AnyVal {
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
    def setEvent(
      value: typings.react.mod.SyntheticEvent[MouseEvent[HTMLInputElement, NativeMouseEvent], typings.std.Event]
    ): Self = this.set("event", value.asInstanceOf[js.Any])
  }
  
}

