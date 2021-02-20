package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.devtoolsProtocolStrings.mouseMoved
import typings.devtoolsProtocol.devtoolsProtocolStrings.mousePressed
import typings.devtoolsProtocol.devtoolsProtocolStrings.mouseReleased
import typings.devtoolsProtocol.devtoolsProtocolStrings.mouseWheel
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmulateTouchFromMouseEventRequest extends StObject {
  
  /**
    * Mouse button. Only "none", "left", "right" are supported.
    */
  var button: MouseButton = js.native
  
  /**
    * Number of times the mouse button was clicked (default: 0).
    */
  var clickCount: js.UndefOr[integer] = js.native
  
  /**
    * X delta in DIP for mouse wheel event (default: 0).
    */
  var deltaX: js.UndefOr[Double] = js.native
  
  /**
    * Y delta in DIP for mouse wheel event (default: 0).
    */
  var deltaY: js.UndefOr[Double] = js.native
  
  /**
    * Bit field representing pressed modifier keys. Alt=1, Ctrl=2, Meta/Command=4, Shift=8
    * (default: 0).
    */
  var modifiers: js.UndefOr[integer] = js.native
  
  /**
    * Time at which the event occurred (default: current time).
    */
  var timestamp: js.UndefOr[TimeSinceEpoch] = js.native
  
  /**
    * Type of the mouse event. (EmulateTouchFromMouseEventRequestType enum)
    */
  var `type`: mousePressed | mouseReleased | mouseMoved | mouseWheel = js.native
  
  /**
    * X coordinate of the mouse pointer in DIP.
    */
  var x: integer = js.native
  
  /**
    * Y coordinate of the mouse pointer in DIP.
    */
  var y: integer = js.native
}
object EmulateTouchFromMouseEventRequest {
  
  @scala.inline
  def apply(
    button: MouseButton,
    `type`: mousePressed | mouseReleased | mouseMoved | mouseWheel,
    x: integer,
    y: integer
  ): EmulateTouchFromMouseEventRequest = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmulateTouchFromMouseEventRequest]
  }
  
  @scala.inline
  implicit class EmulateTouchFromMouseEventRequestMutableBuilder[Self <: EmulateTouchFromMouseEventRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: MouseButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
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
    def setTimestamp(value: TimeSinceEpoch): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setType(value: mousePressed | mouseReleased | mouseMoved | mouseWheel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: integer): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: integer): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
