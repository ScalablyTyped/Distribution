package typings
package gestaltLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventHTMLDivElementKeyboardEvent extends js.Object {
  var event: (reactLib.reactMod.ReactNs.SyntheticEvent[
    reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
    reactLib.Event
  ]) | (reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLDivElement], reactLib.Event])
}

object Anon_EventHTMLDivElementKeyboardEvent {
  @scala.inline
  def apply(
    event: (reactLib.reactMod.ReactNs.SyntheticEvent[
      reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLDivElement, reactLib.NativeMouseEvent], 
      reactLib.Event
    ]) | (reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLDivElement], reactLib.Event])
  ): Anon_EventHTMLDivElementKeyboardEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EventHTMLDivElementKeyboardEvent]
  }
}

