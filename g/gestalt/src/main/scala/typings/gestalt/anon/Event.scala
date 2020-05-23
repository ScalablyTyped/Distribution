package typings.gestalt.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var event: typings.react.mod.SyntheticEvent[MouseEvent[Element, NativeMouseEvent], typings.std.Event]
}

object Event {
  @scala.inline
  def apply(event: typings.react.mod.SyntheticEvent[MouseEvent[Element, NativeMouseEvent], typings.std.Event]): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

