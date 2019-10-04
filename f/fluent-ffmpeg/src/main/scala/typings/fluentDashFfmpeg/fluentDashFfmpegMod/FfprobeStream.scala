package typings.fluentDashFfmpeg.fluentDashFfmpegMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FfprobeStream
  extends /* key */ StringDictionary[js.Any] {
  var avg_frame_rate: js.UndefOr[String] = js.undefined
  var bit_rate: js.UndefOr[String] = js.undefined
  var bits_per_raw_sample: js.UndefOr[String] = js.undefined
  var bits_per_sample: js.UndefOr[Double] = js.undefined
  var channel_layout: js.UndefOr[String] = js.undefined
  var channels: js.UndefOr[Double] = js.undefined
  var chroma_location: js.UndefOr[String] = js.undefined
  var codec_long_name: js.UndefOr[String] = js.undefined
  var codec_name: js.UndefOr[String] = js.undefined
  var codec_tag: js.UndefOr[String] = js.undefined
  var codec_tag_string: js.UndefOr[String] = js.undefined
  var codec_time_base: js.UndefOr[String] = js.undefined
  var codec_type: js.UndefOr[String] = js.undefined
  var coded_height: js.UndefOr[Double] = js.undefined
  var coded_width: js.UndefOr[Double] = js.undefined
  var color_primaries: js.UndefOr[String] = js.undefined
  var color_range: js.UndefOr[String] = js.undefined
  var color_space: js.UndefOr[String] = js.undefined
  var color_transfer: js.UndefOr[String] = js.undefined
  var display_aspect_ratio: js.UndefOr[String] = js.undefined
  var disposition: js.UndefOr[FfprobeStreamDisposition] = js.undefined
  var duration: js.UndefOr[String] = js.undefined
  var duration_ts: js.UndefOr[String] = js.undefined
  var field_order: js.UndefOr[String] = js.undefined
  var has_b_frames: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var index: Double
  var level: js.UndefOr[String] = js.undefined
  var max_bit_rate: js.UndefOr[String] = js.undefined
  var nb_frames: js.UndefOr[String] = js.undefined
  var nb_read_frames: js.UndefOr[String] = js.undefined
  var nb_read_packets: js.UndefOr[String] = js.undefined
  var pix_fmt: js.UndefOr[String] = js.undefined
  var profile: js.UndefOr[Double] = js.undefined
  var r_frame_rate: js.UndefOr[String] = js.undefined
  var refs: js.UndefOr[Double] = js.undefined
  var sample_aspect_ratio: js.UndefOr[String] = js.undefined
  var sample_fmt: js.UndefOr[String] = js.undefined
  var sample_rate: js.UndefOr[Double] = js.undefined
  var start_pts: js.UndefOr[Double] = js.undefined
  var start_time: js.UndefOr[Double] = js.undefined
  var time_base: js.UndefOr[String] = js.undefined
  var timecode: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object FfprobeStream {
  @scala.inline
  def apply(
    index: Double,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    avg_frame_rate: String = null,
    bit_rate: String = null,
    bits_per_raw_sample: String = null,
    bits_per_sample: Int | Double = null,
    channel_layout: String = null,
    channels: Int | Double = null,
    chroma_location: String = null,
    codec_long_name: String = null,
    codec_name: String = null,
    codec_tag: String = null,
    codec_tag_string: String = null,
    codec_time_base: String = null,
    codec_type: String = null,
    coded_height: Int | Double = null,
    coded_width: Int | Double = null,
    color_primaries: String = null,
    color_range: String = null,
    color_space: String = null,
    color_transfer: String = null,
    display_aspect_ratio: String = null,
    disposition: FfprobeStreamDisposition = null,
    duration: String = null,
    duration_ts: String = null,
    field_order: String = null,
    has_b_frames: Int | Double = null,
    height: Int | Double = null,
    id: String = null,
    level: String = null,
    max_bit_rate: String = null,
    nb_frames: String = null,
    nb_read_frames: String = null,
    nb_read_packets: String = null,
    pix_fmt: String = null,
    profile: Int | Double = null,
    r_frame_rate: String = null,
    refs: Int | Double = null,
    sample_aspect_ratio: String = null,
    sample_fmt: String = null,
    sample_rate: Int | Double = null,
    start_pts: Int | Double = null,
    start_time: Int | Double = null,
    time_base: String = null,
    timecode: String = null,
    width: Int | Double = null
  ): FfprobeStream = {
    val __obj = js.Dynamic.literal(index = index)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (avg_frame_rate != null) __obj.updateDynamic("avg_frame_rate")(avg_frame_rate)
    if (bit_rate != null) __obj.updateDynamic("bit_rate")(bit_rate)
    if (bits_per_raw_sample != null) __obj.updateDynamic("bits_per_raw_sample")(bits_per_raw_sample)
    if (bits_per_sample != null) __obj.updateDynamic("bits_per_sample")(bits_per_sample.asInstanceOf[js.Any])
    if (channel_layout != null) __obj.updateDynamic("channel_layout")(channel_layout)
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (chroma_location != null) __obj.updateDynamic("chroma_location")(chroma_location)
    if (codec_long_name != null) __obj.updateDynamic("codec_long_name")(codec_long_name)
    if (codec_name != null) __obj.updateDynamic("codec_name")(codec_name)
    if (codec_tag != null) __obj.updateDynamic("codec_tag")(codec_tag)
    if (codec_tag_string != null) __obj.updateDynamic("codec_tag_string")(codec_tag_string)
    if (codec_time_base != null) __obj.updateDynamic("codec_time_base")(codec_time_base)
    if (codec_type != null) __obj.updateDynamic("codec_type")(codec_type)
    if (coded_height != null) __obj.updateDynamic("coded_height")(coded_height.asInstanceOf[js.Any])
    if (coded_width != null) __obj.updateDynamic("coded_width")(coded_width.asInstanceOf[js.Any])
    if (color_primaries != null) __obj.updateDynamic("color_primaries")(color_primaries)
    if (color_range != null) __obj.updateDynamic("color_range")(color_range)
    if (color_space != null) __obj.updateDynamic("color_space")(color_space)
    if (color_transfer != null) __obj.updateDynamic("color_transfer")(color_transfer)
    if (display_aspect_ratio != null) __obj.updateDynamic("display_aspect_ratio")(display_aspect_ratio)
    if (disposition != null) __obj.updateDynamic("disposition")(disposition)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (duration_ts != null) __obj.updateDynamic("duration_ts")(duration_ts)
    if (field_order != null) __obj.updateDynamic("field_order")(field_order)
    if (has_b_frames != null) __obj.updateDynamic("has_b_frames")(has_b_frames.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (level != null) __obj.updateDynamic("level")(level)
    if (max_bit_rate != null) __obj.updateDynamic("max_bit_rate")(max_bit_rate)
    if (nb_frames != null) __obj.updateDynamic("nb_frames")(nb_frames)
    if (nb_read_frames != null) __obj.updateDynamic("nb_read_frames")(nb_read_frames)
    if (nb_read_packets != null) __obj.updateDynamic("nb_read_packets")(nb_read_packets)
    if (pix_fmt != null) __obj.updateDynamic("pix_fmt")(pix_fmt)
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (r_frame_rate != null) __obj.updateDynamic("r_frame_rate")(r_frame_rate)
    if (refs != null) __obj.updateDynamic("refs")(refs.asInstanceOf[js.Any])
    if (sample_aspect_ratio != null) __obj.updateDynamic("sample_aspect_ratio")(sample_aspect_ratio)
    if (sample_fmt != null) __obj.updateDynamic("sample_fmt")(sample_fmt)
    if (sample_rate != null) __obj.updateDynamic("sample_rate")(sample_rate.asInstanceOf[js.Any])
    if (start_pts != null) __obj.updateDynamic("start_pts")(start_pts.asInstanceOf[js.Any])
    if (start_time != null) __obj.updateDynamic("start_time")(start_time.asInstanceOf[js.Any])
    if (time_base != null) __obj.updateDynamic("time_base")(time_base)
    if (timecode != null) __obj.updateDynamic("timecode")(timecode)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FfprobeStream]
  }
}

