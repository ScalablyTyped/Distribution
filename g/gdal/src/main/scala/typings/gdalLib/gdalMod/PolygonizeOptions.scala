package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonizeOptions extends js.Object {
  var connectedness: js.UndefOr[scala.Double] = js.undefined
  var dst: Layer
  var mask: js.UndefOr[RasterBand] = js.undefined
  var pixValField: scala.Double
  var src: RasterBand
  var useFloats: js.UndefOr[scala.Boolean] = js.undefined
}

object PolygonizeOptions {
  @scala.inline
  def apply(
    dst: Layer,
    pixValField: scala.Double,
    src: RasterBand,
    connectedness: scala.Int | scala.Double = null,
    mask: RasterBand = null,
    useFloats: js.UndefOr[scala.Boolean] = js.undefined
  ): PolygonizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dst")(dst)
    __obj.updateDynamic("pixValField")(pixValField)
    __obj.updateDynamic("src")(src)
    if (connectedness != null) __obj.updateDynamic("connectedness")(connectedness.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (!js.isUndefined(useFloats)) __obj.updateDynamic("useFloats")(useFloats)
    __obj.asInstanceOf[PolygonizeOptions]
  }
}

