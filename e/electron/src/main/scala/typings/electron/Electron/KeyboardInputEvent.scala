package typings.electron.Electron

import typings.electron.electronStrings.alt
import typings.electron.electronStrings.capsLock
import typings.electron.electronStrings.char
import typings.electron.electronStrings.cmd
import typings.electron.electronStrings.command
import typings.electron.electronStrings.control
import typings.electron.electronStrings.ctrl
import typings.electron.electronStrings.isAutoRepeat
import typings.electron.electronStrings.isKeypad
import typings.electron.electronStrings.keyDown
import typings.electron.electronStrings.keyUp
import typings.electron.electronStrings.left
import typings.electron.electronStrings.leftButtonDown
import typings.electron.electronStrings.meta
import typings.electron.electronStrings.middleButtonDown
import typings.electron.electronStrings.numLock
import typings.electron.electronStrings.right
import typings.electron.electronStrings.rightButtonDown
import typings.electron.electronStrings.shift
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardInputEvent extends InputEvent {
  // Docs: http://electronjs.org/docs/api/structures/keyboard-input-event
  /**
    * The character that will be sent as the keyboard event. Should only use the valid
    * key codes in Accelerator.
    */
  var keyCode: String
  /**
    * The type of the event, can be `keyDown`, `keyUp` or `char`.
    */
  var `type`: keyDown | keyUp | char
}

object KeyboardInputEvent {
  @scala.inline
  def apply(
    keyCode: String,
    `type`: keyDown | keyUp | char,
    modifiers: js.Array[
      shift | control | ctrl | alt | meta | command | cmd | isKeypad | isAutoRepeat | leftButtonDown | middleButtonDown | rightButtonDown | capsLock | numLock | left | right
    ] = null
  ): KeyboardInputEvent = {
    val __obj = js.Dynamic.literal(keyCode = keyCode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardInputEvent]
  }
}

