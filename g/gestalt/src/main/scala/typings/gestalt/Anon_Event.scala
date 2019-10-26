package typings.gestalt

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: SyntheticEvent[MouseEvent[Element, NativeMouseEvent], Event]
}

object Anon_Event {
  @scala.inline
  def apply(event: SyntheticEvent[MouseEvent[Element, NativeMouseEvent], Event]): Anon_Event = {
    val __obj = js.Dynamic.literal(event = event)
  
    __obj.asInstanceOf[Anon_Event]
  }
}

