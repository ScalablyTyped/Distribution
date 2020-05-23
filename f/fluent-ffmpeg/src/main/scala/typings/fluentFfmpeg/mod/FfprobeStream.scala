package typings.fluentFfmpeg.mod

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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    avg_frame_rate: String = null,
    bit_rate: String = null,
    bits_per_raw_sample: String = null,
    bits_per_sample: js.UndefOr[Double] = js.undefined,
    channel_layout: String = null,
    channels: js.UndefOr[Double] = js.undefined,
    chroma_location: String = null,
    codec_long_name: String = null,
    codec_name: String = null,
    codec_tag: String = null,
    codec_tag_string: String = null,
    codec_time_base: String = null,
    codec_type: String = null,
    coded_height: js.UndefOr[Double] = js.undefined,
    coded_width: js.UndefOr[Double] = js.undefined,
    color_primaries: String = null,
    color_range: String = null,
    color_space: String = null,
    color_transfer: String = null,
    display_aspect_ratio: String = null,
    disposition: FfprobeStreamDisposition = null,
    duration: String = null,
    duration_ts: String = null,
    field_order: String = null,
    has_b_frames: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    id: String = null,
    level: String = null,
    max_bit_rate: String = null,
    nb_frames: String = null,
    nb_read_frames: String = null,
    nb_read_packets: String = null,
    pix_fmt: String = null,
    profile: js.UndefOr[Double] = js.undefined,
    r_frame_rate: String = null,
    refs: js.UndefOr[Double] = js.undefined,
    sample_aspect_ratio: String = null,
    sample_fmt: String = null,
    sample_rate: js.UndefOr[Double] = js.undefined,
    start_pts: js.UndefOr[Double] = js.undefined,
    start_time: js.UndefOr[Double] = js.undefined,
    time_base: String = null,
    timecode: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): FfprobeStream = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (avg_frame_rate != null) __obj.updateDynamic("avg_frame_rate")(avg_frame_rate.asInstanceOf[js.Any])
    if (bit_rate != null) __obj.updateDynamic("bit_rate")(bit_rate.asInstanceOf[js.Any])
    if (bits_per_raw_sample != null) __obj.updateDynamic("bits_per_raw_sample")(bits_per_raw_sample.asInstanceOf[js.Any])
    if (!js.isUndefined(bits_per_sample)) __obj.updateDynamic("bits_per_sample")(bits_per_sample.get.asInstanceOf[js.Any])
    if (channel_layout != null) __obj.updateDynamic("channel_layout")(channel_layout.asInstanceOf[js.Any])
    if (!js.isUndefined(channels)) __obj.updateDynamic("channels")(channels.get.asInstanceOf[js.Any])
    if (chroma_location != null) __obj.updateDynamic("chroma_location")(chroma_location.asInstanceOf[js.Any])
    if (codec_long_name != null) __obj.updateDynamic("codec_long_name")(codec_long_name.asInstanceOf[js.Any])
    if (codec_name != null) __obj.updateDynamic("codec_name")(codec_name.asInstanceOf[js.Any])
    if (codec_tag != null) __obj.updateDynamic("codec_tag")(codec_tag.asInstanceOf[js.Any])
    if (codec_tag_string != null) __obj.updateDynamic("codec_tag_string")(codec_tag_string.asInstanceOf[js.Any])
    if (codec_time_base != null) __obj.updateDynamic("codec_time_base")(codec_time_base.asInstanceOf[js.Any])
    if (codec_type != null) __obj.updateDynamic("codec_type")(codec_type.asInstanceOf[js.Any])
    if (!js.isUndefined(coded_height)) __obj.updateDynamic("coded_height")(coded_height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(coded_width)) __obj.updateDynamic("coded_width")(coded_width.get.asInstanceOf[js.Any])
    if (color_primaries != null) __obj.updateDynamic("color_primaries")(color_primaries.asInstanceOf[js.Any])
    if (color_range != null) __obj.updateDynamic("color_range")(color_range.asInstanceOf[js.Any])
    if (color_space != null) __obj.updateDynamic("color_space")(color_space.asInstanceOf[js.Any])
    if (color_transfer != null) __obj.updateDynamic("color_transfer")(color_transfer.asInstanceOf[js.Any])
    if (display_aspect_ratio != null) __obj.updateDynamic("display_aspect_ratio")(display_aspect_ratio.asInstanceOf[js.Any])
    if (disposition != null) __obj.updateDynamic("disposition")(disposition.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (duration_ts != null) __obj.updateDynamic("duration_ts")(duration_ts.asInstanceOf[js.Any])
    if (field_order != null) __obj.updateDynamic("field_order")(field_order.asInstanceOf[js.Any])
    if (!js.isUndefined(has_b_frames)) __obj.updateDynamic("has_b_frames")(has_b_frames.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (max_bit_rate != null) __obj.updateDynamic("max_bit_rate")(max_bit_rate.asInstanceOf[js.Any])
    if (nb_frames != null) __obj.updateDynamic("nb_frames")(nb_frames.asInstanceOf[js.Any])
    if (nb_read_frames != null) __obj.updateDynamic("nb_read_frames")(nb_read_frames.asInstanceOf[js.Any])
    if (nb_read_packets != null) __obj.updateDynamic("nb_read_packets")(nb_read_packets.asInstanceOf[js.Any])
    if (pix_fmt != null) __obj.updateDynamic("pix_fmt")(pix_fmt.asInstanceOf[js.Any])
    if (!js.isUndefined(profile)) __obj.updateDynamic("profile")(profile.get.asInstanceOf[js.Any])
    if (r_frame_rate != null) __obj.updateDynamic("r_frame_rate")(r_frame_rate.asInstanceOf[js.Any])
    if (!js.isUndefined(refs)) __obj.updateDynamic("refs")(refs.get.asInstanceOf[js.Any])
    if (sample_aspect_ratio != null) __obj.updateDynamic("sample_aspect_ratio")(sample_aspect_ratio.asInstanceOf[js.Any])
    if (sample_fmt != null) __obj.updateDynamic("sample_fmt")(sample_fmt.asInstanceOf[js.Any])
    if (!js.isUndefined(sample_rate)) __obj.updateDynamic("sample_rate")(sample_rate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start_pts)) __obj.updateDynamic("start_pts")(start_pts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start_time)) __obj.updateDynamic("start_time")(start_time.get.asInstanceOf[js.Any])
    if (time_base != null) __obj.updateDynamic("time_base")(time_base.asInstanceOf[js.Any])
    if (timecode != null) __obj.updateDynamic("timecode")(timecode.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FfprobeStream]
  }
}

