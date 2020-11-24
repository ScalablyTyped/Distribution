package typings.easeljs.createjs.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BezierCurveTo extends js.Object {
  
  // properties
  var cp1x: Double = js.native
  
  var cp1y: Double = js.native
  
  var cp2x: Double = js.native
  
  var cp2y: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object BezierCurveTo {
  
  @scala.inline
  def apply(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): BezierCurveTo = {
    val __obj = js.Dynamic.literal(cp1x = cp1x.asInstanceOf[js.Any], cp1y = cp1y.asInstanceOf[js.Any], cp2x = cp2x.asInstanceOf[js.Any], cp2y = cp2y.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BezierCurveTo]
  }
  
  @scala.inline
  implicit class BezierCurveToOps[Self <: BezierCurveTo] (val x: Self) extends AnyVal {
    
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
    def setCp1x(value: Double): Self = this.set("cp1x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCp1y(value: Double): Self = this.set("cp1y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCp2x(value: Double): Self = this.set("cp2x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCp2y(value: Double): Self = this.set("cp2y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
