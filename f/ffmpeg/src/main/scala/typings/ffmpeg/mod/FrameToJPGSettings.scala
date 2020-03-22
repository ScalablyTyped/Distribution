package typings.ffmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  start_time  :string | number,   duration_time  :string | number,   frame_rate  :number,   size  :string,   number  :number,   every_n_frames  :number,   every_n_seconds  :number,   every_n_percentage  :number,   keep_pixel_aspect_ratio  :boolean,   keep_aspect_ration  :boolean,   padding_color  :string,   file_name ? :string}> */
trait FrameToJPGSettings extends js.Object {
  var duration_time: js.UndefOr[String | Double] = js.undefined
  var every_n_frames: js.UndefOr[Double] = js.undefined
  var every_n_percentage: js.UndefOr[Double] = js.undefined
  var every_n_seconds: js.UndefOr[Double] = js.undefined
  var file_name: js.UndefOr[String] = js.undefined
  var frame_rate: js.UndefOr[Double] = js.undefined
  var keep_aspect_ration: js.UndefOr[Boolean] = js.undefined
  var keep_pixel_aspect_ratio: js.UndefOr[Boolean] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var padding_color: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var start_time: js.UndefOr[String | Double] = js.undefined
}

object FrameToJPGSettings {
  @scala.inline
  def apply(
    duration_time: String | Double = null,
    every_n_frames: Int | Double = null,
    every_n_percentage: Int | Double = null,
    every_n_seconds: Int | Double = null,
    file_name: String = null,
    frame_rate: Int | Double = null,
    keep_aspect_ration: js.UndefOr[Boolean] = js.undefined,
    keep_pixel_aspect_ratio: js.UndefOr[Boolean] = js.undefined,
    number: Int | Double = null,
    padding_color: String = null,
    size: String = null,
    start_time: String | Double = null
  ): FrameToJPGSettings = {
    val __obj = js.Dynamic.literal()
    if (duration_time != null) __obj.updateDynamic("duration_time")(duration_time.asInstanceOf[js.Any])
    if (every_n_frames != null) __obj.updateDynamic("every_n_frames")(every_n_frames.asInstanceOf[js.Any])
    if (every_n_percentage != null) __obj.updateDynamic("every_n_percentage")(every_n_percentage.asInstanceOf[js.Any])
    if (every_n_seconds != null) __obj.updateDynamic("every_n_seconds")(every_n_seconds.asInstanceOf[js.Any])
    if (file_name != null) __obj.updateDynamic("file_name")(file_name.asInstanceOf[js.Any])
    if (frame_rate != null) __obj.updateDynamic("frame_rate")(frame_rate.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_aspect_ration)) __obj.updateDynamic("keep_aspect_ration")(keep_aspect_ration.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_pixel_aspect_ratio)) __obj.updateDynamic("keep_pixel_aspect_ratio")(keep_pixel_aspect_ratio.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (padding_color != null) __obj.updateDynamic("padding_color")(padding_color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (start_time != null) __obj.updateDynamic("start_time")(start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameToJPGSettings]
  }
}

