package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SieveFilterOptions extends js.Object {
  var connectedness: js.UndefOr[scala.Double] = js.undefined
  var dst: RasterBand
  var mask: js.UndefOr[RasterBand] = js.undefined
  var src: RasterBand
  var threshold: scala.Double
}

object SieveFilterOptions {
  @scala.inline
  def apply(
    dst: RasterBand,
    src: RasterBand,
    threshold: scala.Double,
    connectedness: scala.Int | scala.Double = null,
    mask: RasterBand = null
  ): SieveFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dst")(dst)
    __obj.updateDynamic("src")(src)
    __obj.updateDynamic("threshold")(threshold)
    if (connectedness != null) __obj.updateDynamic("connectedness")(connectedness.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask)
    __obj.asInstanceOf[SieveFilterOptions]
  }
}

