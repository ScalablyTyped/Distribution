package typings.electron.Electron

import typings.electron.electronStrings.alt
import typings.electron.electronStrings.capsLock
import typings.electron.electronStrings.cmd
import typings.electron.electronStrings.command
import typings.electron.electronStrings.control
import typings.electron.electronStrings.ctrl
import typings.electron.electronStrings.isAutoRepeat
import typings.electron.electronStrings.isKeypad
import typings.electron.electronStrings.left
import typings.electron.electronStrings.leftButtonDown
import typings.electron.electronStrings.meta
import typings.electron.electronStrings.middleButtonDown
import typings.electron.electronStrings.numLock
import typings.electron.electronStrings.right
import typings.electron.electronStrings.rightButtonDown
import typings.electron.electronStrings.shift
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputEvent extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/input-event
  /**
    * An array of modifiers of the event, can be `shift`, `control`, `ctrl`, `alt`,
    * `meta`, `command`, `cmd`, `isKeypad`, `isAutoRepeat`, `leftButtonDown`,
    * `middleButtonDown`, `rightButtonDown`, `capsLock`, `numLock`, `left`, `right`.
    */
  var modifiers: js.UndefOr[
    js.Array[
      shift | control | ctrl | alt | meta | command | cmd | isKeypad | isAutoRepeat | leftButtonDown | middleButtonDown | rightButtonDown | capsLock | numLock | left | right
    ]
  ] = js.native
}
object InputEvent {
  
  @scala.inline
  def apply(): InputEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputEvent]
  }
  
  @scala.inline
  implicit class InputEventMutableBuilder[Self <: InputEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifiers(
      value: js.Array[
          shift | control | ctrl | alt | meta | command | cmd | isKeypad | isAutoRepeat | leftButtonDown | middleButtonDown | rightButtonDown | capsLock | numLock | left | right
        ]
    ): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setModifiersVarargs(
      value: (shift | control | ctrl | alt | meta | command | cmd | isKeypad | isAutoRepeat | leftButtonDown | middleButtonDown | rightButtonDown | capsLock | numLock | left | right)*
    ): Self = StObject.set(x, "modifiers", js.Array(value :_*))
  }
}
