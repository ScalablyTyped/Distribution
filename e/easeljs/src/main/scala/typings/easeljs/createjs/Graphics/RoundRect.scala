package typings.easeljs.createjs.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoundRect extends js.Object {
  var h: Double
  var radiusBL: Double
  var radiusBR: Double
  var radiusTL: Double
  var radiusTR: Double
  var w: Double
  // properties
  var x: Double
  var y: Double
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
}

