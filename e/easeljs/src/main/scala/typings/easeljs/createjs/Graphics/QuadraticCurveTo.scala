package typings.easeljs.createjs.Graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuadraticCurveTo extends js.Object {
  // properties
  var cpx: Double
  var cpy: Double
  var x: Double
  var y: Double
}

object QuadraticCurveTo {
  @scala.inline
  def apply(cpx: Double, cpy: Double, x: Double, y: Double): QuadraticCurveTo = {
    val __obj = js.Dynamic.literal(cpx = cpx.asInstanceOf[js.Any], cpy = cpy.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuadraticCurveTo]
  }
}

