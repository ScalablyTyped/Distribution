package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynthesizePinchGestureRequest extends StObject {
  
  /**
    * Which type of input events to be generated (default: 'default', which queries the platform
    * for the preferred input type).
    */
  var gestureSourceType: js.UndefOr[GestureSourceType] = js.undefined
  
  /**
    * Relative pointer speed in pixels per second (default: 800).
    */
  var relativeSpeed: js.UndefOr[integer] = js.undefined
  
  /**
    * Relative scale factor after zooming (>1.0 zooms in, <1.0 zooms out).
    */
  var scaleFactor: Double
  
  /**
    * X coordinate of the start of the gesture in CSS pixels.
    */
  var x: Double
  
  /**
    * Y coordinate of the start of the gesture in CSS pixels.
    */
  var y: Double
}
object SynthesizePinchGestureRequest {
  
  inline def apply(scaleFactor: Double, x: Double, y: Double): SynthesizePinchGestureRequest = {
    val __obj = js.Dynamic.literal(scaleFactor = scaleFactor.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizePinchGestureRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynthesizePinchGestureRequest] (val x: Self) extends AnyVal {
    
    inline def setGestureSourceType(value: GestureSourceType): Self = StObject.set(x, "gestureSourceType", value.asInstanceOf[js.Any])
    
    inline def setGestureSourceTypeUndefined: Self = StObject.set(x, "gestureSourceType", js.undefined)
    
    inline def setRelativeSpeed(value: integer): Self = StObject.set(x, "relativeSpeed", value.asInstanceOf[js.Any])
    
    inline def setRelativeSpeedUndefined: Self = StObject.set(x, "relativeSpeed", js.undefined)
    
    inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
