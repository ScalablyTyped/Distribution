package typings.devtoolsProtocol.mod.Protocol.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TouchPoint extends js.Object {
  
  /**
    * Force (default: 1.0).
    */
  var force: js.UndefOr[Double] = js.native
  
  /**
    * Identifier used to track touch sources between events, must be unique within an event.
    */
  var id: js.UndefOr[Double] = js.native
  
  /**
    * X radius of the touch area (default: 1.0).
    */
  var radiusX: js.UndefOr[Double] = js.native
  
  /**
    * Y radius of the touch area (default: 1.0).
    */
  var radiusY: js.UndefOr[Double] = js.native
  
  /**
    * Rotation angle (default: 0.0).
    */
  var rotationAngle: js.UndefOr[Double] = js.native
  
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
object TouchPoint {
  
  @scala.inline
  def apply(x: Double, y: Double): TouchPoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchPoint]
  }
  
  @scala.inline
  implicit class TouchPointOps[Self <: TouchPoint] (val x: Self) extends AnyVal {
    
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
    def setForce(value: Double): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setRadiusX(value: Double): Self = this.set("radiusX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusX: Self = this.set("radiusX", js.undefined)
    
    @scala.inline
    def setRadiusY(value: Double): Self = this.set("radiusY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusY: Self = this.set("radiusY", js.undefined)
    
    @scala.inline
    def setRotationAngle(value: Double): Self = this.set("rotationAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationAngle: Self = this.set("rotationAngle", js.undefined)
  }
}
