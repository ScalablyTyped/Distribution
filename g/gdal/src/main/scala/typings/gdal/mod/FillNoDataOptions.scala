package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillNoDataOptions extends js.Object {
  var mask: js.UndefOr[RasterBand] = js.undefined
  var searchDist: Double
  var smoothingIterations: js.UndefOr[Double] = js.undefined
  var src: RasterBand
}

object FillNoDataOptions {
  @scala.inline
  def apply(
    searchDist: Double,
    src: RasterBand,
    mask: RasterBand = null,
    smoothingIterations: Int | Double = null
  ): FillNoDataOptions = {
    val __obj = js.Dynamic.literal(searchDist = searchDist.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (smoothingIterations != null) __obj.updateDynamic("smoothingIterations")(smoothingIterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillNoDataOptions]
  }
}

