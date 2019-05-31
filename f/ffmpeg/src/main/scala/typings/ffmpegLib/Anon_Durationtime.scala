package typings
package ffmpegLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Durationtime extends js.Object {
  var duration_time: java.lang.String | scala.Double
  var every_n_frames: scala.Double
  var every_n_percentage: scala.Double
  var every_n_seconds: scala.Double
  var file_name: js.UndefOr[java.lang.String] = js.undefined
  var frame_rate: scala.Double
  var keep_aspect_ration: scala.Boolean
  var keep_pixel_aspect_ratio: scala.Boolean
  var number: scala.Double
  var padding_color: java.lang.String
  var size: java.lang.String
  var start_time: java.lang.String | scala.Double
}

object Anon_Durationtime {
  @scala.inline
  def apply(
    duration_time: java.lang.String | scala.Double,
    every_n_frames: scala.Double,
    every_n_percentage: scala.Double,
    every_n_seconds: scala.Double,
    frame_rate: scala.Double,
    keep_aspect_ration: scala.Boolean,
    keep_pixel_aspect_ratio: scala.Boolean,
    number: scala.Double,
    padding_color: java.lang.String,
    size: java.lang.String,
    start_time: java.lang.String | scala.Double,
    file_name: java.lang.String = null
  ): Anon_Durationtime = {
    val __obj = js.Dynamic.literal(duration_time = duration_time.asInstanceOf[js.Any], every_n_frames = every_n_frames, every_n_percentage = every_n_percentage, every_n_seconds = every_n_seconds, frame_rate = frame_rate, keep_aspect_ration = keep_aspect_ration, keep_pixel_aspect_ratio = keep_pixel_aspect_ratio, number = number, padding_color = padding_color, size = size, start_time = start_time.asInstanceOf[js.Any])
    if (file_name != null) __obj.updateDynamic("file_name")(file_name)
    __obj.asInstanceOf[Anon_Durationtime]
  }
}

