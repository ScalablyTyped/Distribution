package typings.easeljs.createjs.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BezierCurveTo extends js.Object {
  // properties
  var cp1x: Double
  var cp1y: Double
  var cp2x: Double
  var cp2y: Double
  var x: Double
  var y: Double
}

object BezierCurveTo {
  @scala.inline
  def apply(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): BezierCurveTo = {
    val __obj = js.Dynamic.literal(cp1x = cp1x.asInstanceOf[js.Any], cp1y = cp1y.asInstanceOf[js.Any], cp2x = cp2x.asInstanceOf[js.Any], cp2y = cp2y.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BezierCurveTo]
  }
}

