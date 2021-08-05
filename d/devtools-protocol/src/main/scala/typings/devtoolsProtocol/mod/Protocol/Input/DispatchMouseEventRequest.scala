package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.devtoolsProtocolStrings.mouse
import typings.devtoolsProtocol.devtoolsProtocolStrings.mouseMoved
import typings.devtoolsProtocol.devtoolsProtocolStrings.mousePressed
import typings.devtoolsProtocol.devtoolsProtocolStrings.mouseReleased
import typings.devtoolsProtocol.devtoolsProtocolStrings.mouseWheel
import typings.devtoolsProtocol.devtoolsProtocolStrings.pen
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DispatchMouseEventRequest extends StObject {
  
  /**
    * Mouse button (default: "none").
    */
  var button: js.UndefOr[MouseButton] = js.undefined
  
  /**
    * A number indicating which buttons are pressed on the mouse when a mouse event is triggered.
    * Left=1, Right=2, Middle=4, Back=8, Forward=16, None=0.
    */
  var buttons: js.UndefOr[integer] = js.undefined
  
  /**
    * Number of times the mouse button was clicked (default: 0).
    */
  var clickCount: js.UndefOr[integer] = js.undefined
  
  /**
    * X delta in CSS pixels for mouse wheel event (default: 0).
    */
  var deltaX: js.UndefOr[Double] = js.undefined
  
  /**
    * Y delta in CSS pixels for mouse wheel event (default: 0).
    */
  var deltaY: js.UndefOr[Double] = js.undefined
  
  /**
    * Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4, Shift=8
    * (default: 0).
    */
  var modifiers: js.UndefOr[integer] = js.undefined
  
  /**
    * Pointer type (default: "mouse"). (DispatchMouseEventRequestPointerType enum)
    */
  var pointerType: js.UndefOr[mouse | pen] = js.undefined
  
  /**
    * Time at which the event occurred.
    */
  var timestamp: js.UndefOr[TimeSinceEpoch] = js.undefined
  
  /**
    * Type of the mouse event. (DispatchMouseEventRequestType enum)
    */
  var `type`: mousePressed | mouseReleased | mouseMoved | mouseWheel
  
  /**
    * X coordinate of the event relative to the main frame's viewport in CSS pixels.
    */
  var x: Double
  
  /**
    * Y coordinate of the event relative to the main frame's viewport in CSS pixels. 0 refers to
    * the top of the viewport and Y increases as it proceeds towards the bottom of the viewport.
    */
  var y: Double
}
object DispatchMouseEventRequest {
  
  inline def apply(`type`: mousePressed | mouseReleased | mouseMoved | mouseWheel, x: Double, y: Double): DispatchMouseEventRequest = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchMouseEventRequest]
  }
  
  extension [Self <: DispatchMouseEventRequest](x: Self) {
    
    inline def setButton(value: MouseButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setButtons(value: integer): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setClickCount(value: integer): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
    
    inline def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
    
    inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaXUndefined: Self = StObject.set(x, "deltaX", js.undefined)
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
    
    inline def setModifiers(value: integer): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setPointerType(value: mouse | pen): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    inline def setPointerTypeUndefined: Self = StObject.set(x, "pointerType", js.undefined)
    
    inline def setTimestamp(value: TimeSinceEpoch): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setType(value: mousePressed | mouseReleased | mouseMoved | mouseWheel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
