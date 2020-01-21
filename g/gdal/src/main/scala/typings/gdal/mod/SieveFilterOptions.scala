package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SieveFilterOptions extends js.Object {
  var connectedness: js.UndefOr[Double] = js.undefined
  var dst: RasterBand
  var mask: js.UndefOr[RasterBand] = js.undefined
  var src: RasterBand
  var threshold: Double
}

object SieveFilterOptions {
  @scala.inline
  def apply(
    dst: RasterBand,
    src: RasterBand,
    threshold: Double,
    connectedness: Int | Double = null,
    mask: RasterBand = null
  ): SieveFilterOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    if (connectedness != null) __obj.updateDynamic("connectedness")(connectedness.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[SieveFilterOptions]
  }
}

