package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SynthesizeTapGestureRequest extends StObject {
  
  /**
    * Duration between touchdown and touchup events in ms (default: 50).
    */
  var duration: js.UndefOr[integer] = js.native
  
  /**
    * Which type of input events to be generated (default: 'default', which queries the platform
    * for the preferred input type).
    */
  var gestureSourceType: js.UndefOr[GestureSourceType] = js.native
  
  /**
    * Number of times to perform the tap (e.g. 2 for double tap, default: 1).
    */
  var tapCount: js.UndefOr[integer] = js.native
  
  /**
    * X coordinate of the start of the gesture in CSS pixels.
    */
  var x: Double = js.native
  
  /**
    * Y coordinate of the start of the gesture in CSS pixels.
    */
  var y: Double = js.native
}
object SynthesizeTapGestureRequest {
  
  @scala.inline
  def apply(x: Double, y: Double): SynthesizeTapGestureRequest = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizeTapGestureRequest]
  }
  
  @scala.inline
  implicit class SynthesizeTapGestureRequestMutableBuilder[Self <: SynthesizeTapGestureRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: integer): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setGestureSourceType(value: GestureSourceType): Self = StObject.set(x, "gestureSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureSourceTypeUndefined: Self = StObject.set(x, "gestureSourceType", js.undefined)
    
    @scala.inline
    def setTapCount(value: integer): Self = StObject.set(x, "tapCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapCountUndefined: Self = StObject.set(x, "tapCount", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
