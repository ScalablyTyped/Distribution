package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillNoDataOptions extends js.Object {
  var mask: js.UndefOr[RasterBand] = js.undefined
  var searchDist: scala.Double
  var smoothingIterations: js.UndefOr[scala.Double] = js.undefined
  var src: RasterBand
}

object FillNoDataOptions {
  @scala.inline
  def apply(
    searchDist: scala.Double,
    src: RasterBand,
    mask: RasterBand = null,
    smoothingIterations: scala.Int | scala.Double = null
  ): FillNoDataOptions = {
    val __obj = js.Dynamic.literal(searchDist = searchDist, src = src)
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (smoothingIterations != null) __obj.updateDynamic("smoothingIterations")(smoothingIterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillNoDataOptions]
  }
}

