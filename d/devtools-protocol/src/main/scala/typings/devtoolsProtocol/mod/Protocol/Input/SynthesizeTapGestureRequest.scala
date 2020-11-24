package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SynthesizeTapGestureRequest extends js.Object {
  
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
  implicit class SynthesizeTapGestureRequestOps[Self <: SynthesizeTapGestureRequest] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: integer): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setGestureSourceType(value: GestureSourceType): Self = this.set("gestureSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGestureSourceType: Self = this.set("gestureSourceType", js.undefined)
    
    @scala.inline
    def setTapCount(value: integer): Self = this.set("tapCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTapCount: Self = this.set("tapCount", js.undefined)
  }
}
