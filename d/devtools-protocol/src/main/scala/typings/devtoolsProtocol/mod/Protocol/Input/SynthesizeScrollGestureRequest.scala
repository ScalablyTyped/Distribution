package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SynthesizeScrollGestureRequest extends js.Object {
  
  /**
    * Which type of input events to be generated (default: 'default', which queries the platform
    * for the preferred input type).
    */
  var gestureSourceType: js.UndefOr[GestureSourceType] = js.native
  
  /**
    * The name of the interaction markers to generate, if not empty (default: "").
    */
  var interactionMarkerName: js.UndefOr[String] = js.native
  
  /**
    * Prevent fling (default: true).
    */
  var preventFling: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of times to repeat the gesture (default: 0).
    */
  var repeatCount: js.UndefOr[integer] = js.native
  
  /**
    * The number of milliseconds delay between each repeat. (default: 250).
    */
  var repeatDelayMs: js.UndefOr[integer] = js.native
  
  /**
    * Swipe speed in pixels per second (default: 800).
    */
  var speed: js.UndefOr[integer] = js.native
  
  /**
    * X coordinate of the start of the gesture in CSS pixels.
    */
  var x: Double = js.native
  
  /**
    * The distance to scroll along the X axis (positive to scroll left).
    */
  var xDistance: js.UndefOr[Double] = js.native
  
  /**
    * The number of additional pixels to scroll back along the X axis, in addition to the given
    * distance.
    */
  var xOverscroll: js.UndefOr[Double] = js.native
  
  /**
    * Y coordinate of the start of the gesture in CSS pixels.
    */
  var y: Double = js.native
  
  /**
    * The distance to scroll along the Y axis (positive to scroll up).
    */
  var yDistance: js.UndefOr[Double] = js.native
  
  /**
    * The number of additional pixels to scroll back along the Y axis, in addition to the given
    * distance.
    */
  var yOverscroll: js.UndefOr[Double] = js.native
}
object SynthesizeScrollGestureRequest {
  
  @scala.inline
  def apply(x: Double, y: Double): SynthesizeScrollGestureRequest = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizeScrollGestureRequest]
  }
  
  @scala.inline
  implicit class SynthesizeScrollGestureRequestOps[Self <: SynthesizeScrollGestureRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGestureSourceType(value: GestureSourceType): Self = this.set("gestureSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGestureSourceType: Self = this.set("gestureSourceType", js.undefined)
    
    @scala.inline
    def setInteractionMarkerName(value: String): Self = this.set("interactionMarkerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractionMarkerName: Self = this.set("interactionMarkerName", js.undefined)
    
    @scala.inline
    def setPreventFling(value: Boolean): Self = this.set("preventFling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventFling: Self = this.set("preventFling", js.undefined)
    
    @scala.inline
    def setRepeatCount(value: integer): Self = this.set("repeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatCount: Self = this.set("repeatCount", js.undefined)
    
    @scala.inline
    def setRepeatDelayMs(value: integer): Self = this.set("repeatDelayMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeatDelayMs: Self = this.set("repeatDelayMs", js.undefined)
    
    @scala.inline
    def setSpeed(value: integer): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setXDistance(value: Double): Self = this.set("xDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXDistance: Self = this.set("xDistance", js.undefined)
    
    @scala.inline
    def setXOverscroll(value: Double): Self = this.set("xOverscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXOverscroll: Self = this.set("xOverscroll", js.undefined)
    
    @scala.inline
    def setYDistance(value: Double): Self = this.set("yDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYDistance: Self = this.set("yDistance", js.undefined)
    
    @scala.inline
    def setYOverscroll(value: Double): Self = this.set("yOverscroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYOverscroll: Self = this.set("yOverscroll", js.undefined)
  }
}
