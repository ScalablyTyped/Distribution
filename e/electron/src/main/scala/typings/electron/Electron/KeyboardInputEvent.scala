package typings.electron.Electron

import typings.electron.electronStrings.char
import typings.electron.electronStrings.keyDown
import typings.electron.electronStrings.keyUp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardInputEvent extends InputEvent {
  // Docs: http://electronjs.org/docs/api/structures/keyboard-input-event
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
  implicit class KeyboardInputEventOps[Self <: KeyboardInputEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeyCode(value: String): Self = this.set("keyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: keyDown | keyUp | char): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

