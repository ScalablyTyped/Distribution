package typings.gestalt.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSyntheticEvent extends js.Object {
  var event: typings.react.mod.SyntheticEvent[MouseEvent[HTMLDivElement, NativeMouseEvent], typings.std.Event]
}

object EventSyntheticEvent {
  @scala.inline
  def apply(
    event: typings.react.mod.SyntheticEvent[MouseEvent[HTMLDivElement, NativeMouseEvent], typings.std.Event]
  ): EventSyntheticEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSyntheticEvent]
  }
}

