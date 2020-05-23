package typings.gestalt.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckedEvent extends js.Object {
  var checked: Boolean
  var event: typings.react.mod.SyntheticEvent[MouseEvent[HTMLInputElement, NativeMouseEvent], typings.std.Event]
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
}

