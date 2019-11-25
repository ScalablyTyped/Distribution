package typings.gdal.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterBandStatistics extends js.Object {
  var max: Double
  var mean: Double
  var min: Double
  var std_dev: Double
}

object RasterBandStatistics {
  @scala.inline
  def apply(max: Double, mean: Double, min: Double, std_dev: Double): RasterBandStatistics = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], std_dev = std_dev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RasterBandStatistics]
  }
}

