package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContourGenerateOptions extends js.Object {
  var dst: Layer
  var elevField: js.UndefOr[scala.Double] = js.undefined
  var fixedLevels: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var idField: js.UndefOr[scala.Double] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
  var nodata: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var src: RasterBand
}

object ContourGenerateOptions {
  @scala.inline
  def apply(
    dst: Layer,
    src: RasterBand,
    elevField: scala.Int | scala.Double = null,
    fixedLevels: js.Array[scala.Double] = null,
    idField: scala.Int | scala.Double = null,
    interval: scala.Int | scala.Double = null,
    nodata: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null
  ): ContourGenerateOptions = {
    val __obj = js.Dynamic.literal(dst = dst, src = src)
    if (elevField != null) __obj.updateDynamic("elevField")(elevField.asInstanceOf[js.Any])
    if (fixedLevels != null) __obj.updateDynamic("fixedLevels")(fixedLevels)
    if (idField != null) __obj.updateDynamic("idField")(idField.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (nodata != null) __obj.updateDynamic("nodata")(nodata.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContourGenerateOptions]
  }
}

