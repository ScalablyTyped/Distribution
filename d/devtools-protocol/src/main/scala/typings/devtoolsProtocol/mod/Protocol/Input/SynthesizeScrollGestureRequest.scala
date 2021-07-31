package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynthesizeScrollGestureRequest extends StObject {
  
  /**
    * Which type of input events to be generated (default: 'default', which queries the platform
    * for the preferred input type).
    */
  var gestureSourceType: js.UndefOr[GestureSourceType] = js.undefined
  
  /**
    * The name of the interaction markers to generate, if not empty (default: "").
    */
  var interactionMarkerName: js.UndefOr[String] = js.undefined
  
  /**
    * Prevent fling (default: true).
    */
  var preventFling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of times to repeat the gesture (default: 0).
    */
  var repeatCount: js.UndefOr[integer] = js.undefined
  
  /**
    * The number of milliseconds delay between each repeat. (default: 250).
    */
  var repeatDelayMs: js.UndefOr[integer] = js.undefined
  
  /**
    * Swipe speed in pixels per second (default: 800).
    */
  var speed: js.UndefOr[integer] = js.undefined
  
  /**
    * X coordinate of the start of the gesture in CSS pixels.
    */
  var x: Double
  
  /**
    * The distance to scroll along the X axis (positive to scroll left).
    */
  var xDistance: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of additional pixels to scroll back along the X axis, in addition to the given
    * distance.
    */
  var xOverscroll: js.UndefOr[Double] = js.undefined
  
  /**
    * Y coordinate of the start of the gesture in CSS pixels.
    */
  var y: Double
  
  /**
    * The distance to scroll along the Y axis (positive to scroll up).
    */
  var yDistance: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of additional pixels to scroll back along the Y axis, in addition to the given
    * distance.
    */
  var yOverscroll: js.UndefOr[Double] = js.undefined
}
object SynthesizeScrollGestureRequest {
  
  @scala.inline
  def apply(x: Double, y: Double): SynthesizeScrollGestureRequest = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizeScrollGestureRequest]
  }
  
  @scala.inline
  implicit class SynthesizeScrollGestureRequestMutableBuilder[Self <: SynthesizeScrollGestureRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGestureSourceType(value: GestureSourceType): Self = StObject.set(x, "gestureSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureSourceTypeUndefined: Self = StObject.set(x, "gestureSourceType", js.undefined)
    
    @scala.inline
    def setInteractionMarkerName(value: String): Self = StObject.set(x, "interactionMarkerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionMarkerNameUndefined: Self = StObject.set(x, "interactionMarkerName", js.undefined)
    
    @scala.inline
    def setPreventFling(value: Boolean): Self = StObject.set(x, "preventFling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventFlingUndefined: Self = StObject.set(x, "preventFling", js.undefined)
    
    @scala.inline
    def setRepeatCount(value: integer): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatCountUndefined: Self = StObject.set(x, "repeatCount", js.undefined)
    
    @scala.inline
    def setRepeatDelayMs(value: integer): Self = StObject.set(x, "repeatDelayMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatDelayMsUndefined: Self = StObject.set(x, "repeatDelayMs", js.undefined)
    
    @scala.inline
    def setSpeed(value: integer): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDistance(value: Double): Self = StObject.set(x, "xDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDistanceUndefined: Self = StObject.set(x, "xDistance", js.undefined)
    
    @scala.inline
    def setXOverscroll(value: Double): Self = StObject.set(x, "xOverscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXOverscrollUndefined: Self = StObject.set(x, "xOverscroll", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYDistance(value: Double): Self = StObject.set(x, "yDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYDistanceUndefined: Self = StObject.set(x, "yDistance", js.undefined)
    
    @scala.inline
    def setYOverscroll(value: Double): Self = StObject.set(x, "yOverscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYOverscrollUndefined: Self = StObject.set(x, "yOverscroll", js.undefined)
  }
}
