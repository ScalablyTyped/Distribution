package typings.electron.Electron

import typings.electron.electronStrings.contextMenu
import typings.electron.electronStrings.left
import typings.electron.electronStrings.middle
import typings.electron.electronStrings.mouseDown
import typings.electron.electronStrings.mouseEnter
import typings.electron.electronStrings.mouseLeave
import typings.electron.electronStrings.mouseMove
import typings.electron.electronStrings.mouseUp
import typings.electron.electronStrings.mouseWheel
import typings.electron.electronStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseInputEvent
  extends StObject
     with InputEvent {
  
  // Docs: https://electronjs.org/docs/api/structures/mouse-input-event
  /**
    * The button pressed, can be `left`, `middle`, `right`.
    */
  var button: js.UndefOr[left | middle | right] = js.undefined
  
  var clickCount: js.UndefOr[Double] = js.undefined
  
  var globalX: js.UndefOr[Double] = js.undefined
  
  var globalY: js.UndefOr[Double] = js.undefined
  
  var movementX: js.UndefOr[Double] = js.undefined
  
  var movementY: js.UndefOr[Double] = js.undefined
  
  /**
    * The type of the event, can be `mouseDown`, `mouseUp`, `mouseEnter`,
    * `mouseLeave`, `contextMenu`, `mouseWheel` or `mouseMove`.
    */
  var `type`: mouseDown | mouseUp | mouseEnter | mouseLeave | contextMenu | mouseWheel | mouseMove
  
  var x: Double
  
  var y: Double
}
object MouseInputEvent {
  
  inline def apply(
    `type`: mouseDown | mouseUp | mouseEnter | mouseLeave | contextMenu | mouseWheel | mouseMove,
    x: Double,
    y: Double
  ): MouseInputEvent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseInputEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MouseInputEvent] (val x: Self) extends AnyVal {
    
    inline def setButton(value: left | middle | right): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
    
    inline def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
    
    inline def setGlobalX(value: Double): Self = StObject.set(x, "globalX", value.asInstanceOf[js.Any])
    
    inline def setGlobalXUndefined: Self = StObject.set(x, "globalX", js.undefined)
    
    inline def setGlobalY(value: Double): Self = StObject.set(x, "globalY", value.asInstanceOf[js.Any])
    
    inline def setGlobalYUndefined: Self = StObject.set(x, "globalY", js.undefined)
    
    inline def setMovementX(value: Double): Self = StObject.set(x, "movementX", value.asInstanceOf[js.Any])
    
    inline def setMovementXUndefined: Self = StObject.set(x, "movementX", js.undefined)
    
    inline def setMovementY(value: Double): Self = StObject.set(x, "movementY", value.asInstanceOf[js.Any])
    
    inline def setMovementYUndefined: Self = StObject.set(x, "movementY", js.undefined)
    
    inline def setType(value: mouseDown | mouseUp | mouseEnter | mouseLeave | contextMenu | mouseWheel | mouseMove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
