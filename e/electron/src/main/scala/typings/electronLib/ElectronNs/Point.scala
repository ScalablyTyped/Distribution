package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/point
  var x: scala.Double
  var y: scala.Double
}

object Point {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Point = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Point]
  }
}

