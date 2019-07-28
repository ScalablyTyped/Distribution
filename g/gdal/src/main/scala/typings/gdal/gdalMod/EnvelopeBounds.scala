package typings.gdal.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvelopeBounds extends js.Object {
  var maxX: Double
  var maxY: Double
  var minX: Double
  var minY: Double
}

object EnvelopeBounds {
  @scala.inline
  def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): EnvelopeBounds = {
    val __obj = js.Dynamic.literal(maxX = maxX, maxY = maxY, minX = minX, minY = minY)
  
    __obj.asInstanceOf[EnvelopeBounds]
  }
}

