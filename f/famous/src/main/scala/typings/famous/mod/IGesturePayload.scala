package typings.famous.mod

import typings.famous.mathMod.Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGesturePayload extends js.Object {
  
  var center: Vec2 = js.native
  
  var centerDelta: Vec2 = js.native
  
  var centerVelocity: Vec2 = js.native
  
  var current: Double = js.native
  
  var pointers: js.Array[IGesturePointer] = js.native
  
  var points: Double = js.native
  
  var status: String = js.native
  
  var time: Double = js.native
}
object IGesturePayload {
  
  @scala.inline
  def apply(
    center: Vec2,
    centerDelta: Vec2,
    centerVelocity: Vec2,
    current: Double,
    pointers: js.Array[IGesturePointer],
    points: Double,
    status: String,
    time: Double
  ): IGesturePayload = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], centerDelta = centerDelta.asInstanceOf[js.Any], centerVelocity = centerVelocity.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGesturePayload]
  }
  
  @scala.inline
  implicit class IGesturePayloadOps[Self <: IGesturePayload] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: Vec2): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterDelta(value: Vec2): Self = this.set("centerDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterVelocity(value: Vec2): Self = this.set("centerVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointersVarargs(value: IGesturePointer*): Self = this.set("pointers", js.Array(value :_*))
    
    @scala.inline
    def setPointers(value: js.Array[IGesturePointer]): Self = this.set("pointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoints(value: Double): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
