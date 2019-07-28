package typings.gdal.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContourGenerateOptions extends js.Object {
  var dst: Layer
  var elevField: js.UndefOr[Double] = js.undefined
  var fixedLevels: js.UndefOr[js.Array[Double]] = js.undefined
  var idField: js.UndefOr[Double] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var nodata: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var src: RasterBand
}

object ContourGenerateOptions {
  @scala.inline
  def apply(
    dst: Layer,
    src: RasterBand,
    elevField: Int | Double = null,
    fixedLevels: js.Array[Double] = null,
    idField: Int | Double = null,
    interval: Int | Double = null,
    nodata: Int | Double = null,
    offset: Int | Double = null
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

