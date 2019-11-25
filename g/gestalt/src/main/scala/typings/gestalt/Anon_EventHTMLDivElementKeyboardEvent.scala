package typings.gestalt

import typings.react.NativeMouseEvent
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventHTMLDivElementKeyboardEvent extends js.Object {
  var event: SyntheticEvent[
    KeyboardEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement, NativeMouseEvent]), 
    Event
  ]
}

object Anon_EventHTMLDivElementKeyboardEvent {
  @scala.inline
  def apply(
    event: SyntheticEvent[
      KeyboardEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement, NativeMouseEvent]), 
      Event
    ]
  ): Anon_EventHTMLDivElementKeyboardEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventHTMLDivElementKeyboardEvent]
  }
}

