package typings.gamequery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinate3D extends js.Object {
  var x: Double
  var y: Double
  var z: Double
}

object Coordinate3D {
  @scala.inline
  def apply(x: Double, y: Double, z: Double): Coordinate3D = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Coordinate3D]
  }
}

