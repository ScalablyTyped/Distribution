package typings.ffprobe.mod

import typings.ffprobe.anon.Attachedpic
import typings.ffprobe.anon.Creationtime
import typings.ffprobe.ffprobeStrings.audio
import typings.ffprobe.ffprobeStrings.images
import typings.ffprobe.ffprobeStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FFProbeStream extends js.Object {
  
  var avg_frame_rate: js.UndefOr[String] = js.native
  
  var bit_rate: Double = js.native
  
  var bits_per_raw_sample: js.UndefOr[Double] = js.native
  
  var bits_per_sample: js.UndefOr[Double] = js.native
  
  var channel_layout: js.UndefOr[String] = js.native
  
  var channels: js.UndefOr[Double] = js.native
  
  var chroma_location: js.UndefOr[String] = js.native
  
  var codec_long_name: String = js.native
  
  var codec_name: String = js.native
  
  var codec_tag: String = js.native
  
  var codec_tag_string: String = js.native
  
  var codec_time_base: String = js.native
  
  var codec_type: video | audio | images = js.native
  
  var coded_height: js.UndefOr[Double] = js.native
  
  var coded_width: js.UndefOr[Double] = js.native
  
  var display_aspect_ratio: js.UndefOr[String] = js.native
  
  var disposition: Attachedpic = js.native
  
  var duration: Double = js.native
  
  var duration_ts: String = js.native
  
  var has_b_frames: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var index: Double = js.native
  
  var is_avc: js.UndefOr[Double] = js.native
  
  var level: js.UndefOr[Double] = js.native
  
  var nal_length_size: js.UndefOr[Double] = js.native
  
  var nb_frames: Double = js.native
  
  var pix_fmt: js.UndefOr[String] = js.native
  
  var profile: String = js.native
  
  var r_frame_rate: String = js.native
  
  var refs: js.UndefOr[Double] = js.native
  
  var sample_aspect_ratio: js.UndefOr[String] = js.native
  
  var sample_fmt: js.UndefOr[String] = js.native
  
  var sample_rate: js.UndefOr[Double] = js.native
  
  var start_pts: Double = js.native
  
  var start_time: Double = js.native
  
  var tags: Creationtime = js.native
  
  var time_base: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object FFProbeStream {
  
  @scala.inline
  def apply(
    bit_rate: Double,
    codec_long_name: String,
    codec_name: String,
    codec_tag: String,
    codec_tag_string: String,
    codec_time_base: String,
    codec_type: video | audio | images,
    disposition: Attachedpic,
    duration: Double,
    duration_ts: String,
    index: Double,
    nb_frames: Double,
    profile: String,
    r_frame_rate: String,
    start_pts: Double,
    start_time: Double,
    tags: Creationtime
  ): FFProbeStream = {
    val __obj = js.Dynamic.literal(bit_rate = bit_rate.asInstanceOf[js.Any], codec_long_name = codec_long_name.asInstanceOf[js.Any], codec_name = codec_name.asInstanceOf[js.Any], codec_tag = codec_tag.asInstanceOf[js.Any], codec_tag_string = codec_tag_string.asInstanceOf[js.Any], codec_time_base = codec_time_base.asInstanceOf[js.Any], codec_type = codec_type.asInstanceOf[js.Any], disposition = disposition.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], duration_ts = duration_ts.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nb_frames = nb_frames.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], r_frame_rate = r_frame_rate.asInstanceOf[js.Any], start_pts = start_pts.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FFProbeStream]
  }
  
  @scala.inline
  implicit class FFProbeStreamOps[Self <: FFProbeStream] (val x: Self) extends AnyVal {
    
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
    def setBit_rate(value: Double): Self = this.set("bit_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodec_long_name(value: String): Self = this.set("codec_long_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodec_name(value: String): Self = this.set("codec_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodec_tag(value: String): Self = this.set("codec_tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodec_tag_string(value: String): Self = this.set("codec_tag_string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodec_time_base(value: String): Self = this.set("codec_time_base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodec_type(value: video | audio | images): Self = this.set("codec_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisposition(value: Attachedpic): Self = this.set("disposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration_ts(value: String): Self = this.set("duration_ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNb_frames(value: Double): Self = this.set("nb_frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR_frame_rate(value: String): Self = this.set("r_frame_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_pts(value: Double): Self = this.set("start_pts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_time(value: Double): Self = this.set("start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Creationtime): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvg_frame_rate(value: String): Self = this.set("avg_frame_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvg_frame_rate: Self = this.set("avg_frame_rate", js.undefined)
    
    @scala.inline
    def setBits_per_raw_sample(value: Double): Self = this.set("bits_per_raw_sample", value.asInstanceOf[js.Any])
    
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
    def setCoded_height(value: Double): Self = this.set("coded_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoded_height: Self = this.set("coded_height", js.undefined)
    
    @scala.inline
    def setCoded_width(value: Double): Self = this.set("coded_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoded_width: Self = this.set("coded_width", js.undefined)
    
    @scala.inline
    def setDisplay_aspect_ratio(value: String): Self = this.set("display_aspect_ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay_aspect_ratio: Self = this.set("display_aspect_ratio", js.undefined)
    
    @scala.inline
    def setHas_b_frames(value: Double): Self = this.set("has_b_frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_b_frames: Self = this.set("has_b_frames", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIs_avc(value: Double): Self = this.set("is_avc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_avc: Self = this.set("is_avc", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setNal_length_size(value: Double): Self = this.set("nal_length_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNal_length_size: Self = this.set("nal_length_size", js.undefined)
    
    @scala.inline
    def setPix_fmt(value: String): Self = this.set("pix_fmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePix_fmt: Self = this.set("pix_fmt", js.undefined)
    
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
    def setTime_base(value: String): Self = this.set("time_base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime_base: Self = this.set("time_base", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
