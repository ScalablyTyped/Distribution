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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DispatchMouseEventRequest extends StObject {
  
  /**
    * Mouse button (default: "none").
    */
  var button: js.UndefOr[MouseButton] = js.native
  
  /**
    * A number indicating which buttons are pressed on the mouse when a mouse event is triggered.
    * Left=1, Right=2, Middle=4, Back=8, Forward=16, None=0.
    */
  var buttons: js.UndefOr[integer] = js.native
  
  /**
    * Number of times the mouse button was clicked (default: 0).
    */
  var clickCount: js.UndefOr[integer] = js.native
  
  /**
    * X delta in CSS pixels for mouse wheel event (default: 0).
    */
  var deltaX: js.UndefOr[Double] = js.native
  
  /**
    * Y delta in CSS pixels for mouse wheel event (default: 0).
    */
  var deltaY: js.UndefOr[Double] = js.native
  
  /**
    * Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4, Shift=8
    * (default: 0).
    */
  var modifiers: js.UndefOr[integer] = js.native
  
  /**
    * Pointer type (default: "mouse"). (DispatchMouseEventRequestPointerType enum)
    */
  var pointerType: js.UndefOr[mouse | pen] = js.native
  
  /**
    * Time at which the event occurred.
    */
  var timestamp: js.UndefOr[TimeSinceEpoch] = js.native
  
  /**
    * Type of the mouse event. (DispatchMouseEventRequestType enum)
    */
  var `type`: mousePressed | mouseReleased | mouseMoved | mouseWheel = js.native
  
  /**
    * X coordinate of the event relative to the main frame's viewport in CSS pixels.
    */
  var x: Double = js.native
  
  /**
    * Y coordinate of the event relative to the main frame's viewport in CSS pixels. 0 refers to
    * the top of the viewport and Y increases as it proceeds towards the bottom of the viewport.
    */
  var y: Double = js.native
}
object DispatchMouseEventRequest {
  
  @scala.inline
  def apply(`type`: mousePressed | mouseReleased | mouseMoved | mouseWheel, x: Double, y: Double): DispatchMouseEventRequest = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchMouseEventRequest]
  }
  
  @scala.inline
  implicit class DispatchMouseEventRequestMutableBuilder[Self <: DispatchMouseEventRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: MouseButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setButtons(value: integer): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setClickCount(value: integer): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickCountUndefined: Self = StObject.set(x, "clickCount", js.undefined)
    
    @scala.inline
    def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaXUndefined: Self = StObject.set(x, "deltaX", js.undefined)
    
    @scala.inline
    def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
    
    @scala.inline
    def setModifiers(value: integer): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setPointerType(value: mouse | pen): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerTypeUndefined: Self = StObject.set(x, "pointerType", js.undefined)
    
    @scala.inline
    def setTimestamp(value: TimeSinceEpoch): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setType(value: mousePressed | mouseReleased | mouseMoved | mouseWheel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
