package typings
package gamequeryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinate3D extends js.Object {
  var x: scala.Double
  var y: scala.Double
  var z: scala.Double
}

object Coordinate3D {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double, z: scala.Double): Coordinate3D = {
    val __obj = js.Dynamic.literal(x = x, y = y, z = z)
  
    __obj.asInstanceOf[Coordinate3D]
  }
}

