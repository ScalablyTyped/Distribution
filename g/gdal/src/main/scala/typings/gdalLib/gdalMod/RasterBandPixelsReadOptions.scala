package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterBandPixelsReadOptions extends js.Object {
  var buffer_height: js.UndefOr[scala.Double] = js.undefined
  var buffer_width: js.UndefOr[scala.Double] = js.undefined
  var data_type: js.UndefOr[java.lang.String] = js.undefined
  var line_space: js.UndefOr[scala.Double] = js.undefined
  var pixel_space: js.UndefOr[scala.Double] = js.undefined
}

object RasterBandPixelsReadOptions {
  @scala.inline
  def apply(
    buffer_height: scala.Int | scala.Double = null,
    buffer_width: scala.Int | scala.Double = null,
    data_type: java.lang.String = null,
    line_space: scala.Int | scala.Double = null,
    pixel_space: scala.Int | scala.Double = null
  ): RasterBandPixelsReadOptions = {
    val __obj = js.Dynamic.literal()
    if (buffer_height != null) __obj.updateDynamic("buffer_height")(buffer_height.asInstanceOf[js.Any])
    if (buffer_width != null) __obj.updateDynamic("buffer_width")(buffer_width.asInstanceOf[js.Any])
    if (data_type != null) __obj.updateDynamic("data_type")(data_type)
    if (line_space != null) __obj.updateDynamic("line_space")(line_space.asInstanceOf[js.Any])
    if (pixel_space != null) __obj.updateDynamic("pixel_space")(pixel_space.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterBandPixelsReadOptions]
  }
}

