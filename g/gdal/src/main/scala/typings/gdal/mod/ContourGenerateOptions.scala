package typings.gdal.mod

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
    elevField: js.UndefOr[Double] = js.undefined,
    fixedLevels: js.Array[Double] = null,
    idField: js.UndefOr[Double] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined,
    nodata: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined
  ): ContourGenerateOptions = {
    val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    if (!js.isUndefined(elevField)) __obj.updateDynamic("elevField")(elevField.get.asInstanceOf[js.Any])
    if (fixedLevels != null) __obj.updateDynamic("fixedLevels")(fixedLevels.asInstanceOf[js.Any])
    if (!js.isUndefined(idField)) __obj.updateDynamic("idField")(idField.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodata)) __obj.updateDynamic("nodata")(nodata.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContourGenerateOptions]
  }
}

