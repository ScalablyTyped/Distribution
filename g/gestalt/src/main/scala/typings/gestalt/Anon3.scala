package typings.gestalt

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3 extends js.Object {
  var event: SyntheticEvent[
    KeyboardEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement, NativeMouseEvent]), 
    Event_
  ]
}

object Anon3 {
  @scala.inline
  def apply(
    event: SyntheticEvent[
      KeyboardEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement, NativeMouseEvent]), 
      Event_
    ]
  ): Anon3 = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon3]
  }
}

