package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputEvent extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/input-event
  /**
    * An array of modifiers of the event, can be `shift`, `control`, `ctrl`, `alt`,
    * `meta`, `command`, `cmd`, `isKeypad`, `isAutoRepeat`, `leftButtonDown`,
    * `middleButtonDown`, `rightButtonDown`, `capsLock`, `numLock`, `left`, `right`.
    */
  var modifiers: js.UndefOr[
    js.Array[
      "shift" | "control" | "ctrl" | "alt" | "meta" | "command" | "cmd" | "isKeypad" | "isAutoRepeat" | "leftButtonDown" | "middleButtonDown" | "rightButtonDown" | "capsLock" | "numLock" | "left" | "right"
    ]
  ] = js.undefined
}
object InputEvent {
  
  inline def apply(): InputEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputEvent]
  }
  
  extension [Self <: InputEvent](x: Self) {
    
    inline def setModifiers(
      value: js.Array[
          "shift" | "control" | "ctrl" | "alt" | "meta" | "command" | "cmd" | "isKeypad" | "isAutoRepeat" | "leftButtonDown" | "middleButtonDown" | "rightButtonDown" | "capsLock" | "numLock" | "left" | "right"
        ]
    ): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setModifiersVarargs(
      value: ("shift" | "control" | "ctrl" | "alt" | "meta" | "command" | "cmd" | "isKeypad" | "isAutoRepeat" | "leftButtonDown" | "middleButtonDown" | "rightButtonDown" | "capsLock" | "numLock" | "left" | "right")*
    ): Self = StObject.set(x, "modifiers", js.Array(value*))
  }
}
