package typings.electron.Electron

import typings.electron.electronStrings.char
import typings.electron.electronStrings.keyDown
import typings.electron.electronStrings.keyUp
import typings.electron.electronStrings.rawKeyDown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardInputEvent
  extends StObject
     with InputEvent {
  
  // Docs: https://electronjs.org/docs/api/structures/keyboard-input-event
  /**
    * The character that will be sent as the keyboard event. Should only use the valid
    * key codes in Accelerator.
    */
  var keyCode: String
  
  /**
    * The type of the event, can be `rawKeyDown`, `keyDown`, `keyUp` or `char`.
    */
  @JSName("type")
  var type_KeyboardInputEvent: rawKeyDown | keyDown | keyUp | char
}
object KeyboardInputEvent {
  
  inline def apply(keyCode: String, `type`: rawKeyDown | keyDown | keyUp | char): KeyboardInputEvent = {
    val __obj = js.Dynamic.literal(keyCode = keyCode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardInputEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyboardInputEvent] (val x: Self) extends AnyVal {
    
    inline def setKeyCode(value: String): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    inline def setType(value: rawKeyDown | keyDown | keyUp | char): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
