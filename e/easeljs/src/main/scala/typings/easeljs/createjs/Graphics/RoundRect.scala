package typings.easeljs.createjs.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoundRect extends js.Object {
  var h: Double = js.native
  var radiusBL: Double = js.native
  var radiusBR: Double = js.native
  var radiusTL: Double = js.native
  var radiusTR: Double = js.native
  var w: Double = js.native
  // properties
  var x: Double = js.native
  var y: Double = js.native
}

object RoundRect {
  @scala.inline
  def apply(
    h: Double,
    radiusBL: Double,
    radiusBR: Double,
    radiusTL: Double,
    radiusTR: Double,
    w: Double,
    x: Double,
    y: Double
  ): RoundRect = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], radiusBL = radiusBL.asInstanceOf[js.Any], radiusBR = radiusBR.asInstanceOf[js.Any], radiusTL = radiusTL.asInstanceOf[js.Any], radiusTR = radiusTR.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundRect]
  }
  @scala.inline
  implicit class RoundRectOps[Self <: RoundRect] (val x: Self) extends AnyVal {
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
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadiusBL(value: Double): Self = this.set("radiusBL", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadiusBR(value: Double): Self = this.set("radiusBR", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadiusTL(value: Double): Self = this.set("radiusTL", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadiusTR(value: Double): Self = this.set("radiusTR", value.asInstanceOf[js.Any])
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

