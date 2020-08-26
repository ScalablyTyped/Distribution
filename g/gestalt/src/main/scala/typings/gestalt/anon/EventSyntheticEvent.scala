package typings.gestalt.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSyntheticEvent extends js.Object {
  var event: typings.react.mod.SyntheticEvent[MouseEvent[HTMLDivElement, NativeMouseEvent], typings.std.Event] = js.native
}

object EventSyntheticEvent {
  @scala.inline
  def apply(
    event: typings.react.mod.SyntheticEvent[MouseEvent[HTMLDivElement, NativeMouseEvent], typings.std.Event]
  ): EventSyntheticEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSyntheticEvent]
  }
  @scala.inline
  implicit class EventSyntheticEventOps[Self <: EventSyntheticEvent] (val x: Self) extends AnyVal {
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
    def setEvent(
      value: typings.react.mod.SyntheticEvent[MouseEvent[HTMLDivElement, NativeMouseEvent], typings.std.Event]
    ): Self = this.set("event", value.asInstanceOf[js.Any])
  }
  
}

