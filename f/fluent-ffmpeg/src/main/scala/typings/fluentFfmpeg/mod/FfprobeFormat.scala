package typings.fluentFfmpeg.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FfprobeFormat
  extends /* key */ StringDictionary[js.Any] {
  var bit_rate: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var format_long_name: js.UndefOr[String] = js.undefined
  var format_name: js.UndefOr[String] = js.undefined
  var nb_programs: js.UndefOr[Double] = js.undefined
  var nb_streams: js.UndefOr[Double] = js.undefined
  var probe_score: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var start_time: js.UndefOr[Double] = js.undefined
  var tags: js.UndefOr[js.Array[_]] = js.undefined
}

object FfprobeFormat {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    bit_rate: Int | Double = null,
    duration: Int | Double = null,
    filename: String = null,
    format_long_name: String = null,
    format_name: String = null,
    nb_programs: Int | Double = null,
    nb_streams: Int | Double = null,
    probe_score: Int | Double = null,
    size: Int | Double = null,
    start_time: Int | Double = null,
    tags: js.Array[_] = null
  ): FfprobeFormat = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (bit_rate != null) __obj.updateDynamic("bit_rate")(bit_rate.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (format_long_name != null) __obj.updateDynamic("format_long_name")(format_long_name.asInstanceOf[js.Any])
    if (format_name != null) __obj.updateDynamic("format_name")(format_name.asInstanceOf[js.Any])
    if (nb_programs != null) __obj.updateDynamic("nb_programs")(nb_programs.asInstanceOf[js.Any])
    if (nb_streams != null) __obj.updateDynamic("nb_streams")(nb_streams.asInstanceOf[js.Any])
    if (probe_score != null) __obj.updateDynamic("probe_score")(probe_score.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (start_time != null) __obj.updateDynamic("start_time")(start_time.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FfprobeFormat]
  }
}

