package typings.electron.Electron

import typings.electron.electronStrings.char
import typings.electron.electronStrings.keyDown
import typings.electron.electronStrings.keyUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardInputEvent extends InputEvent {
  
  // Docs: https://electronjs.org/docs/api/structures/keyboard-input-event
  /**
    * The character that will be sent as the keyboard event. Should only use the valid
    * key codes in Accelerator.
    */
  var keyCode: String = js.native
  
  /**
    * The type of the event, can be `keyDown`, `keyUp` or `char`.
    */
  var `type`: keyDown | keyUp | char = js.native
}
object KeyboardInputEvent {
  
  @scala.inline
  def apply(keyCode: String, `type`: keyDown | keyUp | char): KeyboardInputEvent = {
    val __obj = js.Dynamic.literal(keyCode = keyCode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardInputEvent]
  }
  
  @scala.inline
  implicit class KeyboardInputEventMutableBuilder[Self <: KeyboardInputEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyCode(value: String): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: keyDown | keyUp | char): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
