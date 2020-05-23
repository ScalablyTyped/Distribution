package typings.easeljs.createjs.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arc extends js.Object {
  // properties
  var anticlockwise: Double
  var endAngle: Double
  var radius: Double
  var startAngle: Double
  var x: Double
  var y: Double
}

object Arc {
  @scala.inline
  def apply(anticlockwise: Double, endAngle: Double, radius: Double, startAngle: Double, x: Double, y: Double): Arc = {
    val __obj = js.Dynamic.literal(anticlockwise = anticlockwise.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc]
  }
}

