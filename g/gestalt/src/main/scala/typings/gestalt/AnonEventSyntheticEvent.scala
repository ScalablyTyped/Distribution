package typings.gestalt

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventSyntheticEvent extends js.Object {
  var event: SyntheticEvent[MouseEvent[HTMLDivElement, NativeMouseEvent], Event_]
}

object AnonEventSyntheticEvent {
  @scala.inline
  def apply(event: SyntheticEvent[MouseEvent[HTMLDivElement, NativeMouseEvent], Event_]): AnonEventSyntheticEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventSyntheticEvent]
  }
}

