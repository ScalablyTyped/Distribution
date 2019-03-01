package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterBandStatistics extends js.Object {
  var max: scala.Double
  var mean: scala.Double
  var min: scala.Double
  var std_dev: scala.Double
}

object RasterBandStatistics {
  @scala.inline
  def apply(max: scala.Double, mean: scala.Double, min: scala.Double, std_dev: scala.Double): RasterBandStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("mean")(mean)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("std_dev")(std_dev)
    __obj.asInstanceOf[RasterBandStatistics]
  }
}

