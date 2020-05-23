package typings.easeljs.createjs.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolyStar extends js.Object {
  // properties
  var angle: Double
  var pointSize: Double
  var radius: Double
  var sides: Double
  var x: Double
  var y: Double
}

object PolyStar {
  @scala.inline
  def apply(angle: Double, pointSize: Double, radius: Double, sides: Double, x: Double, y: Double): PolyStar = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], pointSize = pointSize.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], sides = sides.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyStar]
  }
}

