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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    bit_rate: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    filename: String = null,
    format_long_name: String = null,
    format_name: String = null,
    nb_programs: js.UndefOr[Double] = js.undefined,
    nb_streams: js.UndefOr[Double] = js.undefined,
    probe_score: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    start_time: js.UndefOr[Double] = js.undefined,
    tags: js.Array[_] = null
  ): FfprobeFormat = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(bit_rate)) __obj.updateDynamic("bit_rate")(bit_rate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (format_long_name != null) __obj.updateDynamic("format_long_name")(format_long_name.asInstanceOf[js.Any])
    if (format_name != null) __obj.updateDynamic("format_name")(format_name.asInstanceOf[js.Any])
    if (!js.isUndefined(nb_programs)) __obj.updateDynamic("nb_programs")(nb_programs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nb_streams)) __obj.updateDynamic("nb_streams")(nb_streams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(probe_score)) __obj.updateDynamic("probe_score")(probe_score.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start_time)) __obj.updateDynamic("start_time")(start_time.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FfprobeFormat]
  }
}

