package typings.expo.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var x: Axis
  var y: Axis
}

object Point {
  @scala.inline
  def apply(x: Axis, y: Axis): Point = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Point]
  }
}

