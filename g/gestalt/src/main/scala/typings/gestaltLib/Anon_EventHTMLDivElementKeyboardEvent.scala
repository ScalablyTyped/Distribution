package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventHTMLDivElementKeyboardEvent extends js.Object {
  var event: (reactLib.reactMod.SyntheticEvent[
    reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], 
    reactLib.Event
  ]) | (reactLib.reactMod.SyntheticEvent[reactLib.reactMod.KeyboardEvent[stdLib.HTMLDivElement], reactLib.Event])
}

object Anon_EventHTMLDivElementKeyboardEvent {
  @scala.inline
  def apply(
    event: (reactLib.reactMod.SyntheticEvent[
      reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      reactLib.Event
    ]) | (reactLib.reactMod.SyntheticEvent[reactLib.reactMod.KeyboardEvent[stdLib.HTMLDivElement], reactLib.Event])
  ): Anon_EventHTMLDivElementKeyboardEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventHTMLDivElementKeyboardEvent]
  }
}

