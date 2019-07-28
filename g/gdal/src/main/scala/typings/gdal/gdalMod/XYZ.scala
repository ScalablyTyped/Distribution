package typings.gdal.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XYZ extends XY {
  var z: Double
}

object XYZ {
  @scala.inline
  def apply(x: Double, y: Double, z: Double): XYZ = {
    val __obj = js.Dynamic.literal(x = x, y = y, z = z)
  
    __obj.asInstanceOf[XYZ]
  }
}

