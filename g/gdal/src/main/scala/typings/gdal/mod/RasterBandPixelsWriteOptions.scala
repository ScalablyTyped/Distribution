package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterBandPixelsWriteOptions extends js.Object {
  var buffer_height: js.UndefOr[Double] = js.undefined
  var buffer_width: js.UndefOr[Double] = js.undefined
  var line_space: js.UndefOr[Double] = js.undefined
  var pixel_space: js.UndefOr[Double] = js.undefined
}

object RasterBandPixelsWriteOptions {
  @scala.inline
  def apply(
    buffer_height: js.UndefOr[Double] = js.undefined,
    buffer_width: js.UndefOr[Double] = js.undefined,
    line_space: js.UndefOr[Double] = js.undefined,
    pixel_space: js.UndefOr[Double] = js.undefined
  ): RasterBandPixelsWriteOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffer_height)) __obj.updateDynamic("buffer_height")(buffer_height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(buffer_width)) __obj.updateDynamic("buffer_width")(buffer_width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(line_space)) __obj.updateDynamic("line_space")(line_space.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixel_space)) __obj.updateDynamic("pixel_space")(pixel_space.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterBandPixelsWriteOptions]
  }
}

