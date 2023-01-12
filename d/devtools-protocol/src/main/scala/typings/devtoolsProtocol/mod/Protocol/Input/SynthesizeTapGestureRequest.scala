package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynthesizeTapGestureRequest extends StObject {
  
  /**
    * Duration between touchdown and touchup events in ms (default: 50).
    */
  var duration: js.UndefOr[integer] = js.undefined
  
  /**
    * Which type of input events to be generated (default: 'default', which queries the platform
    * for the preferred input type).
    */
  var gestureSourceType: js.UndefOr[GestureSourceType] = js.undefined
  
  /**
    * Number of times to perform the tap (e.g. 2 for double tap, default: 1).
    */
  var tapCount: js.UndefOr[integer] = js.undefined
  
  /**
    * X coordinate of the start of the gesture in CSS pixels.
    */
  var x: Double
  
  /**
    * Y coordinate of the start of the gesture in CSS pixels.
    */
  var y: Double
}
object SynthesizeTapGestureRequest {
  
  inline def apply(x: Double, y: Double): SynthesizeTapGestureRequest = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizeTapGestureRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynthesizeTapGestureRequest] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: integer): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setGestureSourceType(value: GestureSourceType): Self = StObject.set(x, "gestureSourceType", value.asInstanceOf[js.Any])
    
    inline def setGestureSourceTypeUndefined: Self = StObject.set(x, "gestureSourceType", js.undefined)
    
    inline def setTapCount(value: integer): Self = StObject.set(x, "tapCount", value.asInstanceOf[js.Any])
    
    inline def setTapCountUndefined: Self = StObject.set(x, "tapCount", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
