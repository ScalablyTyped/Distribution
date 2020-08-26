package typings.fluentFfmpeg.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FfprobeStream
  extends /* key */ StringDictionary[js.Any] {
  var avg_frame_rate: js.UndefOr[String] = js.native
  var bit_rate: js.UndefOr[String] = js.native
  var bits_per_raw_sample: js.UndefOr[String] = js.native
  var bits_per_sample: js.UndefOr[Double] = js.native
  var channel_layout: js.UndefOr[String] = js.native
  var channels: js.UndefOr[Double] = js.native
  var chroma_location: js.UndefOr[String] = js.native
  var codec_long_name: js.UndefOr[String] = js.native
  var codec_name: js.UndefOr[String] = js.native
  var codec_tag: js.UndefOr[String] = js.native
  var codec_tag_string: js.UndefOr[String] = js.native
  var codec_time_base: js.UndefOr[String] = js.native
  var codec_type: js.UndefOr[String] = js.native
  var coded_height: js.UndefOr[Double] = js.native
  var coded_width: js.UndefOr[Double] = js.native
  var color_primaries: js.UndefOr[String] = js.native
  var color_range: js.UndefOr[String] = js.native
  var color_space: js.UndefOr[String] = js.native
  var color_transfer: js.UndefOr[String] = js.native
  var display_aspect_ratio: js.UndefOr[String] = js.native
  var disposition: js.UndefOr[FfprobeStreamDisposition] = js.native
  var duration: js.UndefOr[String] = js.native
  var duration_ts: js.UndefOr[String] = js.native
  var field_order: js.UndefOr[String] = js.native
  var has_b_frames: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var id: js.UndefOr[String] = js.native
  var index: Double = js.native
  var level: js.UndefOr[String] = js.native
  var max_bit_rate: js.UndefOr[String] = js.native
  var nb_frames: js.UndefOr[String] = js.native
  var nb_read_frames: js.UndefOr[String] = js.native
  var nb_read_packets: js.UndefOr[String] = js.native
  var pix_fmt: js.UndefOr[String] = js.native
  var profile: js.UndefOr[Double] = js.native
  var r_frame_rate: js.UndefOr[String] = js.native
  var refs: js.UndefOr[Double] = js.native
  var sample_aspect_ratio: js.UndefOr[String] = js.native
  var sample_fmt: js.UndefOr[String] = js.native
  var sample_rate: js.UndefOr[Double] = js.native
  var start_pts: js.UndefOr[Double] = js.native
  var start_time: js.UndefOr[Double] = js.native
  var time_base: js.UndefOr[String] = js.native
  var timecode: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object FfprobeStream {
  @scala.inline
  def apply(index: Double): FfprobeStream = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[FfprobeStream]
  }
  @scala.inline
  implicit class FfprobeStreamOps[Self <: FfprobeStream] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvg_frame_rate(value: String): Self = this.set("avg_frame_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvg_frame_rate: Self = this.set("avg_frame_rate", js.undefined)
    @scala.inline
    def setBit_rate(value: String): Self = this.set("bit_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBit_rate: Self = this.set("bit_rate", js.undefined)
    @scala.inline
    def setBits_per_raw_sample(value: String): Self = this.set("bits_per_raw_sample", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBits_per_raw_sample: Self = this.set("bits_per_raw_sample", js.undefined)
    @scala.inline
    def setBits_per_sample(value: Double): Self = this.set("bits_per_sample", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBits_per_sample: Self = this.set("bits_per_sample", js.undefined)
    @scala.inline
    def setChannel_layout(value: String): Self = this.set("channel_layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel_layout: Self = this.set("channel_layout", js.undefined)
    @scala.inline
    def setChannels(value: Double): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    @scala.inline
    def setChroma_location(value: String): Self = this.set("chroma_location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChroma_location: Self = this.set("chroma_location", js.undefined)
    @scala.inline
    def setCodec_long_name(value: String): Self = this.set("codec_long_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodec_long_name: Self = this.set("codec_long_name", js.undefined)
    @scala.inline
    def setCodec_name(value: String): Self = this.set("codec_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodec_name: Self = this.set("codec_name", js.undefined)
    @scala.inline
    def setCodec_tag(value: String): Self = this.set("codec_tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodec_tag: Self = this.set("codec_tag", js.undefined)
    @scala.inline
    def setCodec_tag_string(value: String): Self = this.set("codec_tag_string", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodec_tag_string: Self = this.set("codec_tag_string", js.undefined)
    @scala.inline
    def setCodec_time_base(value: String): Self = this.set("codec_time_base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodec_time_base: Self = this.set("codec_time_base", js.undefined)
    @scala.inline
    def setCodec_type(value: String): Self = this.set("codec_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodec_type: Self = this.set("codec_type", js.undefined)
    @scala.inline
    def setCoded_height(value: Double): Self = this.set("coded_height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoded_height: Self = this.set("coded_height", js.undefined)
    @scala.inline
    def setCoded_width(value: Double): Self = this.set("coded_width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoded_width: Self = this.set("coded_width", js.undefined)
    @scala.inline
    def setColor_primaries(value: String): Self = this.set("color_primaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor_primaries: Self = this.set("color_primaries", js.undefined)
    @scala.inline
    def setColor_range(value: String): Self = this.set("color_range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor_range: Self = this.set("color_range", js.undefined)
    @scala.inline
    def setColor_space(value: String): Self = this.set("color_space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor_space: Self = this.set("color_space", js.undefined)
    @scala.inline
    def setColor_transfer(value: String): Self = this.set("color_transfer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor_transfer: Self = this.set("color_transfer", js.undefined)
    @scala.inline
    def setDisplay_aspect_ratio(value: String): Self = this.set("display_aspect_ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay_aspect_ratio: Self = this.set("display_aspect_ratio", js.undefined)
    @scala.inline
    def setDisposition(value: FfprobeStreamDisposition): Self = this.set("disposition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisposition: Self = this.set("disposition", js.undefined)
    @scala.inline
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setDuration_ts(value: String): Self = this.set("duration_ts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration_ts: Self = this.set("duration_ts", js.undefined)
    @scala.inline
    def setField_order(value: String): Self = this.set("field_order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField_order: Self = this.set("field_order", js.undefined)
    @scala.inline
    def setHas_b_frames(value: Double): Self = this.set("has_b_frames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHas_b_frames: Self = this.set("has_b_frames", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setMax_bit_rate(value: String): Self = this.set("max_bit_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_bit_rate: Self = this.set("max_bit_rate", js.undefined)
    @scala.inline
    def setNb_frames(value: String): Self = this.set("nb_frames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNb_frames: Self = this.set("nb_frames", js.undefined)
    @scala.inline
    def setNb_read_frames(value: String): Self = this.set("nb_read_frames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNb_read_frames: Self = this.set("nb_read_frames", js.undefined)
    @scala.inline
    def setNb_read_packets(value: String): Self = this.set("nb_read_packets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNb_read_packets: Self = this.set("nb_read_packets", js.undefined)
    @scala.inline
    def setPix_fmt(value: String): Self = this.set("pix_fmt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePix_fmt: Self = this.set("pix_fmt", js.undefined)
    @scala.inline
    def setProfile(value: Double): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setR_frame_rate(value: String): Self = this.set("r_frame_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR_frame_rate: Self = this.set("r_frame_rate", js.undefined)
    @scala.inline
    def setRefs(value: Double): Self = this.set("refs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefs: Self = this.set("refs", js.undefined)
    @scala.inline
    def setSample_aspect_ratio(value: String): Self = this.set("sample_aspect_ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSample_aspect_ratio: Self = this.set("sample_aspect_ratio", js.undefined)
    @scala.inline
    def setSample_fmt(value: String): Self = this.set("sample_fmt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSample_fmt: Self = this.set("sample_fmt", js.undefined)
    @scala.inline
    def setSample_rate(value: Double): Self = this.set("sample_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSample_rate: Self = this.set("sample_rate", js.undefined)
    @scala.inline
    def setStart_pts(value: Double): Self = this.set("start_pts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_pts: Self = this.set("start_pts", js.undefined)
    @scala.inline
    def setStart_time(value: Double): Self = this.set("start_time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_time: Self = this.set("start_time", js.undefined)
    @scala.inline
    def setTime_base(value: String): Self = this.set("time_base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime_base: Self = this.set("time_base", js.undefined)
    @scala.inline
    def setTimecode(value: String): Self = this.set("timecode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimecode: Self = this.set("timecode", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

