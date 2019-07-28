package typings.gdal.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Envelope3DBounds extends EnvelopeBounds {
  var maxZ: Double
  var minZ: Double
}

object Envelope3DBounds {
  @scala.inline
  def apply(maxX: Double, maxY: Double, maxZ: Double, minX: Double, minY: Double, minZ: Double): Envelope3DBounds = {
    val __obj = js.Dynamic.literal(maxX = maxX, maxY = maxY, maxZ = maxZ, minX = minX, minY = minY, minZ = minZ)
  
    __obj.asInstanceOf[Envelope3DBounds]
  }
}

