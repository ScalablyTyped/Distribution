package typings.ffmpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Durationtime extends js.Object {
  var duration_time: String | Double
  var every_n_frames: Double
  var every_n_percentage: Double
  var every_n_seconds: Double
  var file_name: js.UndefOr[String] = js.undefined
  var frame_rate: Double
  var keep_aspect_ration: Boolean
  var keep_pixel_aspect_ratio: Boolean
  var number: Double
  var padding_color: String
  var size: String
  var start_time: String | Double
}

object Anon_Durationtime {
  @scala.inline
  def apply(
    duration_time: String | Double,
    every_n_frames: Double,
    every_n_percentage: Double,
    every_n_seconds: Double,
    frame_rate: Double,
    keep_aspect_ration: Boolean,
    keep_pixel_aspect_ratio: Boolean,
    number: Double,
    padding_color: String,
    size: String,
    start_time: String | Double,
    file_name: String = null
  ): Anon_Durationtime = {
    val __obj = js.Dynamic.literal(duration_time = duration_time.asInstanceOf[js.Any], every_n_frames = every_n_frames, every_n_percentage = every_n_percentage, every_n_seconds = every_n_seconds, frame_rate = frame_rate, keep_aspect_ration = keep_aspect_ration, keep_pixel_aspect_ratio = keep_pixel_aspect_ratio, number = number, padding_color = padding_color, size = size, start_time = start_time.asInstanceOf[js.Any])
    if (file_name != null) __obj.updateDynamic("file_name")(file_name)
    __obj.asInstanceOf[Anon_Durationtime]
  }
}

