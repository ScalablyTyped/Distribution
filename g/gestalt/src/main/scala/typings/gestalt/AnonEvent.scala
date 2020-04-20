package typings.gestalt

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEvent extends js.Object {
  var event: SyntheticEvent[MouseEvent[Element, NativeMouseEvent], Event_]
}

object AnonEvent {
  @scala.inline
  def apply(event: SyntheticEvent[MouseEvent[Element, NativeMouseEvent], Event_]): AnonEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEvent]
  }
}

