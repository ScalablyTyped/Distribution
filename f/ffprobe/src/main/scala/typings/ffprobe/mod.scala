package typings.ffprobe

import typings.ffprobe.anon.Attachedpic
import typings.ffprobe.anon.Dicttag
import typings.ffprobe.ffprobeStrings.audio
import typings.ffprobe.ffprobeStrings.images
import typings.ffprobe.ffprobeStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(filePath: String, options: Options): js.Promise[FFProbeResult] = (^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FFProbeResult]]
  inline def apply(
    filePath: String,
    options: Options,
    cb: js.Function2[/* err */ js.Error, /* info */ FFProbeResult, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("ffprobe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.ffprobe.ffprobeStrings.`0`
    - typings.ffprobe.ffprobeStrings.`1`
  */
  trait FFProbeBoolean extends StObject
  object FFProbeBoolean {
    
    inline def `0`: typings.ffprobe.ffprobeStrings.`0` = "0".asInstanceOf[typings.ffprobe.ffprobeStrings.`0`]
    
    inline def `1`: typings.ffprobe.ffprobeStrings.`1` = "1".asInstanceOf[typings.ffprobe.ffprobeStrings.`1`]
  }
  
  trait FFProbeResult extends StObject {
    
    var streams: js.Array[FFProbeStream]
  }
  object FFProbeResult {
    
    inline def apply(streams: js.Array[FFProbeStream]): FFProbeResult = {
      val __obj = js.Dynamic.literal(streams = streams.asInstanceOf[js.Any])
      __obj.asInstanceOf[FFProbeResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FFProbeResult] (val x: Self) extends AnyVal {
      
      inline def setStreams(value: js.Array[FFProbeStream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      inline def setStreamsVarargs(value: FFProbeStream*): Self = StObject.set(x, "streams", js.Array(value*))
    }
  }
  
  /**
    * Based on the XML definition of the ffprobe stream type
    * {@see https://github.com/FFmpeg/FFmpeg/blob/master/doc/ffprobe.xsd#L206}
    */
  trait FFProbeStream extends StObject {
    
    var avg_frame_rate: String
    
    var bit_rate: js.UndefOr[Double] = js.undefined
    
    var bits_per_raw_sample: js.UndefOr[Double] = js.undefined
    
    var bits_per_sample: js.UndefOr[Double] = js.undefined
    
    var channel_layout: js.UndefOr[String] = js.undefined
    
    var channels: js.UndefOr[Double] = js.undefined
    
    var chroma_location: js.UndefOr[String] = js.undefined
    
    var closed_captions: js.UndefOr[FFProbeBoolean] = js.undefined
    
    var codec_long_name: js.UndefOr[String] = js.undefined
    
    var codec_name: js.UndefOr[String] = js.undefined
    
    var codec_tag: String
    
    var codec_tag_string: String
    
    var codec_time_base: String
    
    var codec_type: js.UndefOr[video | audio | images] = js.undefined
    
    var coded_height: js.UndefOr[Double] = js.undefined
    
    var coded_width: js.UndefOr[Double] = js.undefined
    
    var color_primaries: js.UndefOr[String] = js.undefined
    
    var color_range: js.UndefOr[String] = js.undefined
    
    var color_space: js.UndefOr[String] = js.undefined
    
    var color_transfer: js.UndefOr[String] = js.undefined
    
    var display_aspect_ratio: js.UndefOr[String] = js.undefined
    
    var disposition: Attachedpic
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var duration_ts: js.UndefOr[String] = js.undefined
    
    var extradata: js.UndefOr[String] = js.undefined
    
    var field_order: js.UndefOr[String] = js.undefined
    
    var has_b_frames: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var id: String
    
    var index: Double
    
    // Not in XML file, but is still in the output of ffprobe MKV files.
    var is_avc: js.UndefOr[Double] = js.undefined
    
    var level: js.UndefOr[Double] = js.undefined
    
    var max_bit_rate: js.UndefOr[Double] = js.undefined
    
    var nal_length_size: js.UndefOr[Double] = js.undefined
    
    var nb_frames: js.UndefOr[Double] = js.undefined
    
    var nb_read_frames: js.UndefOr[Double] = js.undefined
    
    var nb_read_packets: js.UndefOr[Double] = js.undefined
    
    var pix_fmt: js.UndefOr[String] = js.undefined
    
    var profile: js.UndefOr[String] = js.undefined
    
    var r_frame_rate: String
    
    var refs: js.UndefOr[Double] = js.undefined
    
    var sample_aspect_ratio: js.UndefOr[String] = js.undefined
    
    // Audio attributes
    var sample_fmt: js.UndefOr[String] = js.undefined
    
    var sample_rate: js.UndefOr[Double] = js.undefined
    
    var start_pts: js.UndefOr[Double] = js.undefined
    
    var start_time: js.UndefOr[Double] = js.undefined
    
    var tags: Dicttag
    
    var time_base: String
    
    var timecode: js.UndefOr[String] = js.undefined
    
    // Video attributes
    var width: js.UndefOr[Double] = js.undefined
  }
  object FFProbeStream {
    
    inline def apply(
      avg_frame_rate: String,
      codec_tag: String,
      codec_tag_string: String,
      codec_time_base: String,
      disposition: Attachedpic,
      id: String,
      index: Double,
      r_frame_rate: String,
      tags: Dicttag,
      time_base: String
    ): FFProbeStream = {
      val __obj = js.Dynamic.literal(avg_frame_rate = avg_frame_rate.asInstanceOf[js.Any], codec_tag = codec_tag.asInstanceOf[js.Any], codec_tag_string = codec_tag_string.asInstanceOf[js.Any], codec_time_base = codec_time_base.asInstanceOf[js.Any], disposition = disposition.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], r_frame_rate = r_frame_rate.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], time_base = time_base.asInstanceOf[js.Any])
      __obj.asInstanceOf[FFProbeStream]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FFProbeStream] (val x: Self) extends AnyVal {
      
      inline def setAvg_frame_rate(value: String): Self = StObject.set(x, "avg_frame_rate", value.asInstanceOf[js.Any])
      
      inline def setBit_rate(value: Double): Self = StObject.set(x, "bit_rate", value.asInstanceOf[js.Any])
      
      inline def setBit_rateUndefined: Self = StObject.set(x, "bit_rate", js.undefined)
      
      inline def setBits_per_raw_sample(value: Double): Self = StObject.set(x, "bits_per_raw_sample", value.asInstanceOf[js.Any])
      
      inline def setBits_per_raw_sampleUndefined: Self = StObject.set(x, "bits_per_raw_sample", js.undefined)
      
      inline def setBits_per_sample(value: Double): Self = StObject.set(x, "bits_per_sample", value.asInstanceOf[js.Any])
      
      inline def setBits_per_sampleUndefined: Self = StObject.set(x, "bits_per_sample", js.undefined)
      
      inline def setChannel_layout(value: String): Self = StObject.set(x, "channel_layout", value.asInstanceOf[js.Any])
      
      inline def setChannel_layoutUndefined: Self = StObject.set(x, "channel_layout", js.undefined)
      
      inline def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      inline def setChroma_location(value: String): Self = StObject.set(x, "chroma_location", value.asInstanceOf[js.Any])
      
      inline def setChroma_locationUndefined: Self = StObject.set(x, "chroma_location", js.undefined)
      
      inline def setClosed_captions(value: FFProbeBoolean): Self = StObject.set(x, "closed_captions", value.asInstanceOf[js.Any])
      
      inline def setClosed_captionsUndefined: Self = StObject.set(x, "closed_captions", js.undefined)
      
      inline def setCodec_long_name(value: String): Self = StObject.set(x, "codec_long_name", value.asInstanceOf[js.Any])
      
      inline def setCodec_long_nameUndefined: Self = StObject.set(x, "codec_long_name", js.undefined)
      
      inline def setCodec_name(value: String): Self = StObject.set(x, "codec_name", value.asInstanceOf[js.Any])
      
      inline def setCodec_nameUndefined: Self = StObject.set(x, "codec_name", js.undefined)
      
      inline def setCodec_tag(value: String): Self = StObject.set(x, "codec_tag", value.asInstanceOf[js.Any])
      
      inline def setCodec_tag_string(value: String): Self = StObject.set(x, "codec_tag_string", value.asInstanceOf[js.Any])
      
      inline def setCodec_time_base(value: String): Self = StObject.set(x, "codec_time_base", value.asInstanceOf[js.Any])
      
      inline def setCodec_type(value: video | audio | images): Self = StObject.set(x, "codec_type", value.asInstanceOf[js.Any])
      
      inline def setCodec_typeUndefined: Self = StObject.set(x, "codec_type", js.undefined)
      
      inline def setCoded_height(value: Double): Self = StObject.set(x, "coded_height", value.asInstanceOf[js.Any])
      
      inline def setCoded_heightUndefined: Self = StObject.set(x, "coded_height", js.undefined)
      
      inline def setCoded_width(value: Double): Self = StObject.set(x, "coded_width", value.asInstanceOf[js.Any])
      
      inline def setCoded_widthUndefined: Self = StObject.set(x, "coded_width", js.undefined)
      
      inline def setColor_primaries(value: String): Self = StObject.set(x, "color_primaries", value.asInstanceOf[js.Any])
      
      inline def setColor_primariesUndefined: Self = StObject.set(x, "color_primaries", js.undefined)
      
      inline def setColor_range(value: String): Self = StObject.set(x, "color_range", value.asInstanceOf[js.Any])
      
      inline def setColor_rangeUndefined: Self = StObject.set(x, "color_range", js.undefined)
      
      inline def setColor_space(value: String): Self = StObject.set(x, "color_space", value.asInstanceOf[js.Any])
      
      inline def setColor_spaceUndefined: Self = StObject.set(x, "color_space", js.undefined)
      
      inline def setColor_transfer(value: String): Self = StObject.set(x, "color_transfer", value.asInstanceOf[js.Any])
      
      inline def setColor_transferUndefined: Self = StObject.set(x, "color_transfer", js.undefined)
      
      inline def setDisplay_aspect_ratio(value: String): Self = StObject.set(x, "display_aspect_ratio", value.asInstanceOf[js.Any])
      
      inline def setDisplay_aspect_ratioUndefined: Self = StObject.set(x, "display_aspect_ratio", js.undefined)
      
      inline def setDisposition(value: Attachedpic): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setDuration_ts(value: String): Self = StObject.set(x, "duration_ts", value.asInstanceOf[js.Any])
      
      inline def setDuration_tsUndefined: Self = StObject.set(x, "duration_ts", js.undefined)
      
      inline def setExtradata(value: String): Self = StObject.set(x, "extradata", value.asInstanceOf[js.Any])
      
      inline def setExtradataUndefined: Self = StObject.set(x, "extradata", js.undefined)
      
      inline def setField_order(value: String): Self = StObject.set(x, "field_order", value.asInstanceOf[js.Any])
      
      inline def setField_orderUndefined: Self = StObject.set(x, "field_order", js.undefined)
      
      inline def setHas_b_frames(value: Double): Self = StObject.set(x, "has_b_frames", value.asInstanceOf[js.Any])
      
      inline def setHas_b_framesUndefined: Self = StObject.set(x, "has_b_frames", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIs_avc(value: Double): Self = StObject.set(x, "is_avc", value.asInstanceOf[js.Any])
      
      inline def setIs_avcUndefined: Self = StObject.set(x, "is_avc", js.undefined)
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMax_bit_rate(value: Double): Self = StObject.set(x, "max_bit_rate", value.asInstanceOf[js.Any])
      
      inline def setMax_bit_rateUndefined: Self = StObject.set(x, "max_bit_rate", js.undefined)
      
      inline def setNal_length_size(value: Double): Self = StObject.set(x, "nal_length_size", value.asInstanceOf[js.Any])
      
      inline def setNal_length_sizeUndefined: Self = StObject.set(x, "nal_length_size", js.undefined)
      
      inline def setNb_frames(value: Double): Self = StObject.set(x, "nb_frames", value.asInstanceOf[js.Any])
      
      inline def setNb_framesUndefined: Self = StObject.set(x, "nb_frames", js.undefined)
      
      inline def setNb_read_frames(value: Double): Self = StObject.set(x, "nb_read_frames", value.asInstanceOf[js.Any])
      
      inline def setNb_read_framesUndefined: Self = StObject.set(x, "nb_read_frames", js.undefined)
      
      inline def setNb_read_packets(value: Double): Self = StObject.set(x, "nb_read_packets", value.asInstanceOf[js.Any])
      
      inline def setNb_read_packetsUndefined: Self = StObject.set(x, "nb_read_packets", js.undefined)
      
      inline def setPix_fmt(value: String): Self = StObject.set(x, "pix_fmt", value.asInstanceOf[js.Any])
      
      inline def setPix_fmtUndefined: Self = StObject.set(x, "pix_fmt", js.undefined)
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setR_frame_rate(value: String): Self = StObject.set(x, "r_frame_rate", value.asInstanceOf[js.Any])
      
      inline def setRefs(value: Double): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      inline def setRefsUndefined: Self = StObject.set(x, "refs", js.undefined)
      
      inline def setSample_aspect_ratio(value: String): Self = StObject.set(x, "sample_aspect_ratio", value.asInstanceOf[js.Any])
      
      inline def setSample_aspect_ratioUndefined: Self = StObject.set(x, "sample_aspect_ratio", js.undefined)
      
      inline def setSample_fmt(value: String): Self = StObject.set(x, "sample_fmt", value.asInstanceOf[js.Any])
      
      inline def setSample_fmtUndefined: Self = StObject.set(x, "sample_fmt", js.undefined)
      
      inline def setSample_rate(value: Double): Self = StObject.set(x, "sample_rate", value.asInstanceOf[js.Any])
      
      inline def setSample_rateUndefined: Self = StObject.set(x, "sample_rate", js.undefined)
      
      inline def setStart_pts(value: Double): Self = StObject.set(x, "start_pts", value.asInstanceOf[js.Any])
      
      inline def setStart_ptsUndefined: Self = StObject.set(x, "start_pts", js.undefined)
      
      inline def setStart_time(value: Double): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      inline def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
      
      inline def setTags(value: Dicttag): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTime_base(value: String): Self = StObject.set(x, "time_base", value.asInstanceOf[js.Any])
      
      inline def setTimecode(value: String): Self = StObject.set(x, "timecode", value.asInstanceOf[js.Any])
      
      inline def setTimecodeUndefined: Self = StObject.set(x, "timecode", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var path: String
  }
  object Options {
    
    inline def apply(path: String): Options = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
