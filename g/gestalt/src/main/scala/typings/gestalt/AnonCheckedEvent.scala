package typings.gestalt

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckedEvent extends js.Object {
  var checked: Boolean
  var event: SyntheticEvent[MouseEvent[HTMLInputElement, NativeMouseEvent], Event_]
}

object AnonCheckedEvent {
  @scala.inline
  def apply(checked: Boolean, event: SyntheticEvent[MouseEvent[HTMLInputElement, NativeMouseEvent], Event_]): AnonCheckedEvent = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCheckedEvent]
  }
}

