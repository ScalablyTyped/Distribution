package typings.ffmpeg

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.ffmpeg.ffmpegStrings.C
import typings.ffmpeg.ffmpegStrings.CE
import typings.ffmpeg.ffmpegStrings.CW
import typings.ffmpeg.ffmpegStrings.NC
import typings.ffmpeg.ffmpegStrings.NE
import typings.ffmpeg.ffmpegStrings.NW
import typings.ffmpeg.ffmpegStrings.SC
import typings.ffmpeg.ffmpegStrings.SE
import typings.ffmpeg.ffmpegStrings.SW
import typings.std.Date
import typings.std.Error
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("ffmpeg", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Promise[Video] {
    def this(filePath: String) = this()
    def this(filePath: String, cb: js.Function2[/* err */ Error, /* video */ Video, Unit]) = this()
  }
  @JSImport("ffmpeg", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Iffmpeg = js.native
  
  /* Inlined std.Partial<{  IARL :string,   IART :string,   ICMS :string,   ICMT :string,   ICOP :string,   ICRD :string | std.Date,   ICRP :string,   IDIM :string,   IDPI :string,   IENG :string,   IGNR :string,   IKEY :string,   ILGT :string,   ILNG :string,   IMED :string,   INAM :string,   IPLT :string,   IPRD :string,   ISBJ :string,   ISFT :string,   ISHP :string,   ISRC :string,   ISRF :string,   ITCH :string}> */
  trait AVIMetadata extends StObject {
    
    var IARL: js.UndefOr[String] = js.undefined
    
    var IART: js.UndefOr[String] = js.undefined
    
    var ICMS: js.UndefOr[String] = js.undefined
    
    var ICMT: js.UndefOr[String] = js.undefined
    
    var ICOP: js.UndefOr[String] = js.undefined
    
    var ICRD: js.UndefOr[String | Date] = js.undefined
    
    var ICRP: js.UndefOr[String] = js.undefined
    
    var IDIM: js.UndefOr[String] = js.undefined
    
    var IDPI: js.UndefOr[String] = js.undefined
    
    var IENG: js.UndefOr[String] = js.undefined
    
    var IGNR: js.UndefOr[String] = js.undefined
    
    var IKEY: js.UndefOr[String] = js.undefined
    
    var ILGT: js.UndefOr[String] = js.undefined
    
    var ILNG: js.UndefOr[String] = js.undefined
    
    var IMED: js.UndefOr[String] = js.undefined
    
    var INAM: js.UndefOr[String] = js.undefined
    
    var IPLT: js.UndefOr[String] = js.undefined
    
    var IPRD: js.UndefOr[String] = js.undefined
    
    var ISBJ: js.UndefOr[String] = js.undefined
    
    var ISFT: js.UndefOr[String] = js.undefined
    
    var ISHP: js.UndefOr[String] = js.undefined
    
    var ISRC: js.UndefOr[String] = js.undefined
    
    var ISRF: js.UndefOr[String] = js.undefined
    
    var ITCH: js.UndefOr[String] = js.undefined
  }
  object AVIMetadata {
    
    @scala.inline
    def apply(): AVIMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AVIMetadata]
    }
    
    @scala.inline
    implicit class AVIMetadataMutableBuilder[Self <: AVIMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIARL(value: String): Self = StObject.set(x, "IARL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIARLUndefined: Self = StObject.set(x, "IARL", js.undefined)
      
      @scala.inline
      def setIART(value: String): Self = StObject.set(x, "IART", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIARTUndefined: Self = StObject.set(x, "IART", js.undefined)
      
      @scala.inline
      def setICMS(value: String): Self = StObject.set(x, "ICMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setICMSUndefined: Self = StObject.set(x, "ICMS", js.undefined)
      
      @scala.inline
      def setICMT(value: String): Self = StObject.set(x, "ICMT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setICMTUndefined: Self = StObject.set(x, "ICMT", js.undefined)
      
      @scala.inline
      def setICOP(value: String): Self = StObject.set(x, "ICOP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setICOPUndefined: Self = StObject.set(x, "ICOP", js.undefined)
      
      @scala.inline
      def setICRD(value: String | Date): Self = StObject.set(x, "ICRD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setICRDUndefined: Self = StObject.set(x, "ICRD", js.undefined)
      
      @scala.inline
      def setICRP(value: String): Self = StObject.set(x, "ICRP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setICRPUndefined: Self = StObject.set(x, "ICRP", js.undefined)
      
      @scala.inline
      def setIDIM(value: String): Self = StObject.set(x, "IDIM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIDIMUndefined: Self = StObject.set(x, "IDIM", js.undefined)
      
      @scala.inline
      def setIDPI(value: String): Self = StObject.set(x, "IDPI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIDPIUndefined: Self = StObject.set(x, "IDPI", js.undefined)
      
      @scala.inline
      def setIENG(value: String): Self = StObject.set(x, "IENG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIENGUndefined: Self = StObject.set(x, "IENG", js.undefined)
      
      @scala.inline
      def setIGNR(value: String): Self = StObject.set(x, "IGNR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIGNRUndefined: Self = StObject.set(x, "IGNR", js.undefined)
      
      @scala.inline
      def setIKEY(value: String): Self = StObject.set(x, "IKEY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIKEYUndefined: Self = StObject.set(x, "IKEY", js.undefined)
      
      @scala.inline
      def setILGT(value: String): Self = StObject.set(x, "ILGT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setILGTUndefined: Self = StObject.set(x, "ILGT", js.undefined)
      
      @scala.inline
      def setILNG(value: String): Self = StObject.set(x, "ILNG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setILNGUndefined: Self = StObject.set(x, "ILNG", js.undefined)
      
      @scala.inline
      def setIMED(value: String): Self = StObject.set(x, "IMED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIMEDUndefined: Self = StObject.set(x, "IMED", js.undefined)
      
      @scala.inline
      def setINAM(value: String): Self = StObject.set(x, "INAM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setINAMUndefined: Self = StObject.set(x, "INAM", js.undefined)
      
      @scala.inline
      def setIPLT(value: String): Self = StObject.set(x, "IPLT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIPLTUndefined: Self = StObject.set(x, "IPLT", js.undefined)
      
      @scala.inline
      def setIPRD(value: String): Self = StObject.set(x, "IPRD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIPRDUndefined: Self = StObject.set(x, "IPRD", js.undefined)
      
      @scala.inline
      def setISBJ(value: String): Self = StObject.set(x, "ISBJ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setISBJUndefined: Self = StObject.set(x, "ISBJ", js.undefined)
      
      @scala.inline
      def setISFT(value: String): Self = StObject.set(x, "ISFT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setISFTUndefined: Self = StObject.set(x, "ISFT", js.undefined)
      
      @scala.inline
      def setISHP(value: String): Self = StObject.set(x, "ISHP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setISHPUndefined: Self = StObject.set(x, "ISHP", js.undefined)
      
      @scala.inline
      def setISRC(value: String): Self = StObject.set(x, "ISRC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setISRCUndefined: Self = StObject.set(x, "ISRC", js.undefined)
      
      @scala.inline
      def setISRF(value: String): Self = StObject.set(x, "ISRF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setISRFUndefined: Self = StObject.set(x, "ISRF", js.undefined)
      
      @scala.inline
      def setITCH(value: String): Self = StObject.set(x, "ITCH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setITCHUndefined: Self = StObject.set(x, "ITCH", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  duration :number,   filesize :string,   encoder :string,   width :number,   height :number,   videodatarate :number,   videocodecid :string,   audiodatarate :number,   audiosamplerate :number,   stereo :boolean,   audiocodecid :string}> */
  trait FLVMetadata extends StObject {
    
    var audiocodecid: js.UndefOr[String] = js.undefined
    
    var audiodatarate: js.UndefOr[Double] = js.undefined
    
    var audiosamplerate: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var encoder: js.UndefOr[String] = js.undefined
    
    var filesize: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var stereo: js.UndefOr[Boolean] = js.undefined
    
    var videocodecid: js.UndefOr[String] = js.undefined
    
    var videodatarate: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object FLVMetadata {
    
    @scala.inline
    def apply(): FLVMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FLVMetadata]
    }
    
    @scala.inline
    implicit class FLVMetadataMutableBuilder[Self <: FLVMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudiocodecid(value: String): Self = StObject.set(x, "audiocodecid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudiocodecidUndefined: Self = StObject.set(x, "audiocodecid", js.undefined)
      
      @scala.inline
      def setAudiodatarate(value: Double): Self = StObject.set(x, "audiodatarate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudiodatarateUndefined: Self = StObject.set(x, "audiodatarate", js.undefined)
      
      @scala.inline
      def setAudiosamplerate(value: Double): Self = StObject.set(x, "audiosamplerate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudiosamplerateUndefined: Self = StObject.set(x, "audiosamplerate", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEncoder(value: String): Self = StObject.set(x, "encoder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoderUndefined: Self = StObject.set(x, "encoder", js.undefined)
      
      @scala.inline
      def setFilesize(value: String): Self = StObject.set(x, "filesize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesizeUndefined: Self = StObject.set(x, "filesize", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setStereo(value: Boolean): Self = StObject.set(x, "stereo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStereoUndefined: Self = StObject.set(x, "stereo", js.undefined)
      
      @scala.inline
      def setVideocodecid(value: String): Self = StObject.set(x, "videocodecid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideocodecidUndefined: Self = StObject.set(x, "videocodecid", js.undefined)
      
      @scala.inline
      def setVideodatarate(value: Double): Self = StObject.set(x, "videodatarate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideodatarateUndefined: Self = StObject.set(x, "videodatarate", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  start_time :string | number,   duration_time :string | number,   frame_rate :number,   size :string,   number :number,   every_n_frames :number,   every_n_seconds :number,   every_n_percentage :number,   keep_pixel_aspect_ratio :boolean,   keep_aspect_ration :boolean,   padding_color :string,   file_name :string}> */
  trait FrameToJPGSettings extends StObject {
    
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
    def apply(): FrameToJPGSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FrameToJPGSettings]
    }
    
    @scala.inline
    implicit class FrameToJPGSettingsMutableBuilder[Self <: FrameToJPGSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration_time(value: String | Double): Self = StObject.set(x, "duration_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration_timeUndefined: Self = StObject.set(x, "duration_time", js.undefined)
      
      @scala.inline
      def setEvery_n_frames(value: Double): Self = StObject.set(x, "every_n_frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvery_n_framesUndefined: Self = StObject.set(x, "every_n_frames", js.undefined)
      
      @scala.inline
      def setEvery_n_percentage(value: Double): Self = StObject.set(x, "every_n_percentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvery_n_percentageUndefined: Self = StObject.set(x, "every_n_percentage", js.undefined)
      
      @scala.inline
      def setEvery_n_seconds(value: Double): Self = StObject.set(x, "every_n_seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvery_n_secondsUndefined: Self = StObject.set(x, "every_n_seconds", js.undefined)
      
      @scala.inline
      def setFile_name(value: String): Self = StObject.set(x, "file_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile_nameUndefined: Self = StObject.set(x, "file_name", js.undefined)
      
      @scala.inline
      def setFrame_rate(value: Double): Self = StObject.set(x, "frame_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrame_rateUndefined: Self = StObject.set(x, "frame_rate", js.undefined)
      
      @scala.inline
      def setKeep_aspect_ration(value: Boolean): Self = StObject.set(x, "keep_aspect_ration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_aspect_rationUndefined: Self = StObject.set(x, "keep_aspect_ration", js.undefined)
      
      @scala.inline
      def setKeep_pixel_aspect_ratio(value: Boolean): Self = StObject.set(x, "keep_pixel_aspect_ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeep_pixel_aspect_ratioUndefined: Self = StObject.set(x, "keep_pixel_aspect_ratio", js.undefined)
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setPadding_color(value: String): Self = StObject.set(x, "padding_color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding_colorUndefined: Self = StObject.set(x, "padding_color", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStart_time(value: String | Double): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
    }
  }
  
  @js.native
  trait Iffmpeg
    extends StObject
       with Instantiable1[/* filePath */ String, js.Promise[Video]]
       with Instantiable2[
          /* filePath */ String, 
          /* cb */ js.Function2[/* err */ Error, /* video */ Video, Unit], 
          js.Promise[Video]
        ]
  
  /* Inlined std.Partial<{  title :string,   author :string,   album_artist :string,   album :string,   grouping :string,   composer :string,   year :string,   track :string,   comment :string,   genre :string,   copyright :string,   description :string,   synopsis :string,   show :string,   episode_id :string,   network :string,   lyrics :string}> */
  trait StandardVideoMetadata extends StObject {
    
    var album: js.UndefOr[String] = js.undefined
    
    var album_artist: js.UndefOr[String] = js.undefined
    
    var author: js.UndefOr[String] = js.undefined
    
    var comment: js.UndefOr[String] = js.undefined
    
    var composer: js.UndefOr[String] = js.undefined
    
    var copyright: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var episode_id: js.UndefOr[String] = js.undefined
    
    var genre: js.UndefOr[String] = js.undefined
    
    var grouping: js.UndefOr[String] = js.undefined
    
    var lyrics: js.UndefOr[String] = js.undefined
    
    var network: js.UndefOr[String] = js.undefined
    
    var show: js.UndefOr[String] = js.undefined
    
    var synopsis: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var track: js.UndefOr[String] = js.undefined
    
    var year: js.UndefOr[String] = js.undefined
  }
  object StandardVideoMetadata {
    
    @scala.inline
    def apply(): StandardVideoMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StandardVideoMetadata]
    }
    
    @scala.inline
    implicit class StandardVideoMetadataMutableBuilder[Self <: StandardVideoMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlbumUndefined: Self = StObject.set(x, "album", js.undefined)
      
      @scala.inline
      def setAlbum_artist(value: String): Self = StObject.set(x, "album_artist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlbum_artistUndefined: Self = StObject.set(x, "album_artist", js.undefined)
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setComposer(value: String): Self = StObject.set(x, "composer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComposerUndefined: Self = StObject.set(x, "composer", js.undefined)
      
      @scala.inline
      def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEpisode_id(value: String): Self = StObject.set(x, "episode_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpisode_idUndefined: Self = StObject.set(x, "episode_id", js.undefined)
      
      @scala.inline
      def setGenre(value: String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenreUndefined: Self = StObject.set(x, "genre", js.undefined)
      
      @scala.inline
      def setGrouping(value: String): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
      
      @scala.inline
      def setLyrics(value: String): Self = StObject.set(x, "lyrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLyricsUndefined: Self = StObject.set(x, "lyrics", js.undefined)
      
      @scala.inline
      def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      @scala.inline
      def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setSynopsis(value: String): Self = StObject.set(x, "synopsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSynopsisUndefined: Self = StObject.set(x, "synopsis", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTrack(value: String): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
      
      @scala.inline
      def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  @js.native
  trait Video extends StObject {
    
    /**
      * If the ffmpeg parameters are not present in the list of available function
      * you can add it manually through the following function.
      * @param command
      * @param argument
      * @example
      * ```ts
      * // Change the output to avi format
      * video.addCommand('-f', 'avi');
      * ```
      */
    def addCommand(command: String, argument: String): Unit = js.native
    
    def addFilterComplex(argument: String): Unit = js.native
    
    def addInput(argument: String): Unit = js.native
    
    def fnAddWatermark(watermarkPath: String): Unit = js.native
    def fnAddWatermark(watermarkPath: String, newPilePath: String): Unit = js.native
    def fnAddWatermark(
      watermarkPath: String,
      newPilePath: String,
      settings: Unit,
      cb: js.Function2[/* err */ Error, /* file */ String, Unit]
    ): Unit = js.native
    def fnAddWatermark(watermarkPath: String, newPilePath: String, settings: WatermarkSettings): Unit = js.native
    def fnAddWatermark(
      watermarkPath: String,
      newPilePath: String,
      settings: WatermarkSettings,
      cb: js.Function2[/* err */ Error, /* file */ String, Unit]
    ): Unit = js.native
    def fnAddWatermark(
      watermarkPath: String,
      newPilePath: Unit,
      settings: Unit,
      cb: js.Function2[/* err */ Error, /* file */ String, Unit]
    ): Unit = js.native
    def fnAddWatermark(watermarkPath: String, newPilePath: Unit, settings: WatermarkSettings): Unit = js.native
    def fnAddWatermark(
      watermarkPath: String,
      newPilePath: Unit,
      settings: WatermarkSettings,
      cb: js.Function2[/* err */ Error, /* file */ String, Unit]
    ): Unit = js.native
    /**
      * This function takes care of adding a watermark to the video that is being developed.
      * You can specify the exact position in which position the image.
      * @param watermarkPath The full path where the image is stored to add as watermark
      * @param newPilePath Name of the new video. If not specified will be created by the function
      * @param settings Settings to change the default settings
      * @param cb A callback function for the path of the new video containing the watermark
      * @returns The path to the newly created video, or void if the callback was defined
      */
    @JSName("fnAddWatermark")
    def fnAddWatermark_Promise(watermarkPath: String): js.Promise[String] = js.native
    @JSName("fnAddWatermark")
    def fnAddWatermark_Promise(watermarkPath: String, newPilePath: String): js.Promise[String] = js.native
    @JSName("fnAddWatermark")
    def fnAddWatermark_Promise(watermarkPath: String, newPilePath: String, settings: WatermarkSettings): js.Promise[String] = js.native
    @JSName("fnAddWatermark")
    def fnAddWatermark_Promise(watermarkPath: String, newPilePath: Unit, settings: WatermarkSettings): js.Promise[String] = js.native
    
    def fnExtractFrameToJPG(destinationFolder: String): Unit = js.native
    def fnExtractFrameToJPG(
      destinationFolder: String,
      settings: Unit,
      cb: js.Function2[/* err */ Error, /* files */ js.Array[String], Unit]
    ): Unit = js.native
    def fnExtractFrameToJPG(destinationFolder: String, settings: FrameToJPGSettings): Unit = js.native
    def fnExtractFrameToJPG(
      destinationFolder: String,
      settings: FrameToJPGSettings,
      cb: js.Function2[/* err */ Error, /* files */ js.Array[String], Unit]
    ): Unit = js.native
    /**
      * This function takes care of extracting one or more frames from the video that is being developed.
      * @param destinationFolder Destination folder for the frames generated
      * @param settings Settings to change the default settings
      * @param cb A callback function for an array of paths to the created frames
      * @returns A promise for an array of paths to the created frames, or void if the callback was defined
      */
    @JSName("fnExtractFrameToJPG")
    def fnExtractFrameToJPG_Promise(destinationFolder: String): js.Promise[js.Array[String]] = js.native
    @JSName("fnExtractFrameToJPG")
    def fnExtractFrameToJPG_Promise(destinationFolder: String, settings: FrameToJPGSettings): js.Promise[js.Array[String]] = js.native
    
    /**
      * This function extracts the audio stream of a video into an mp3 file.
      * @param destinationFileName Full path of the new file
      * @param cb A callback function fo the path of the new audio file
      * @returns The path to the newly created file, or void if the callback was defined
      */
    def fnExtractSoundToMP3(destinationFileName: String): js.Promise[String] = js.native
    def fnExtractSoundToMP3(destinationFileName: String, cb: js.Function2[/* err */ Error, /* file */ String, Unit]): Unit = js.native
    
    var metadata: StandardVideoMetadata & AVIMetadata & FLVMetadata = js.native
    
    /**
      * After setting the desired parameters have to start the conversion process.
      * To do this you must call the function 'save'.
      * @param destinationFileName The final destination of the file
      * @param cb A callback function for the path of the new file
      * @returns The path to the newly created file, or void if the callback was defined
      */
    def save(destinationFileName: String): js.Promise[String] = js.native
    def save(destinationFileName: String, cb: js.Function2[/* err */ Error, /* file */ String, Unit]): Unit = js.native
    
    /**
      * Sets the audio bitrate in kb.
      * @param bitrate
      * @example
      * ```ts
      * video.setAudioBitRate(128)
      * ```
      */
    def setAudioBitRate(bitrate: Double): Video = js.native
    
    /**
      * Sets the number of audio channels.
      * @param channel
      * @example
      * ```ts
      * video.setAudioChannels(2)
      * ```
      */
    def setAudioChannels(channel: Double): Video = js.native
    
    /**
      * Sets the new audio codec.
      * @param codec
      * @example
      * ```ts
      * video.setAudioCodec('libfaac')
      * ```
      */
    def setAudioCodec(codec: String): Video = js.native
    
    /**
      * Sets the audio sample frequency for audio outputs in kb.
      * @param frequency
      * @example
      * ```ts
      * video.setAudioFrequency(48)
      * ```
      */
    def setAudioFrequency(frequency: Double): Video = js.native
    
    /**
      * Sets the audio quality.
      * @param quality
      * @example
      * ```ts
      * video.setAudioQuality(128)
      * ```
      */
    def setAudioQuality(quality: Double): Video = js.native
    
    /**
      * Disables audio encoding.
      */
    def setDisableAudio(): Video = js.native
    
    /**
      * Disables video encoding.
      */
    def setDisableVideo(): Video = js.native
    
    def setOutput(path: String): Unit = js.native
    
    def setVideoAspectRatio(aspect: String): Video = js.native
    /**
      * Sets the new aspetc ratio. You can specify the value with a number or with a string in the format 'xx:xx'.
      * @param aspect the ratio as a number or string in the format 'xx:xx'
      * @example
      * ```ts
      * // Value
      * video.setVideoAspectRatio(1.77)
      * // Format xx:xx
      * video.setVideoAspectRatio('16:9')
      * ```
      */
    def setVideoAspectRatio(aspect: Double): Video = js.native
    
    /**
      * Sets the video bitrate in kb.
      * @param bitrate
      * @example
      * ```ts
      * video.setVideoBitRate(1024)
      * ```
      */
    def setVideoBitRate(bitrate: Double): Video = js.native
    
    /**
      * Sets the new audio codec.
      * @param codec
      * @example
      * ```ts
      * video.setVideoCodec('mpeg4')
      * ```
      */
    def setVideoCodec(codec: String): Video = js.native
    
    def setVideoDuration(duration: String): Video = js.native
    /**
      * Sets the duration. You can specify the value in seconds or in date time format.
      * @param duration the time in seconds or a date time string
      * @example
      * ```ts
      * // Seconds
      * video.setVideoDuration(100)
      * // Date time format
      * video.setVideoDuration('00:01:40')
      * ```
      */
    def setVideoDuration(duration: Double): Video = js.native
    
    /**
      * Sets the new video format.
      * @param format
      * @example
      * ```ts
      * video.setVideoFormat('avi')
      * ```
      */
    def setVideoFormat(format: String): Video = js.native
    
    /**
      * Sets the framerate of the video.
      * @param framerate
      * @example
      * ```ts
      * video.setVideoFrameRate(25)
      * ```
      */
    def setVideoFrameRate(framerate: Double): Video = js.native
    
    /**
      * Set the size of the video. This library can handle automatic resizing of the video.
      * You can also apply a padding automatically keeping the original aspect ratio.
      * @param size The following size formats are allowed:
      * - 640x480 Fixed size (plain ffmpeg way)
      * - 50% Percental resizing
      * - ?x480 Fixed height, calculate width
      * - 640x? Fixed width, calculate height
      * @param keepPixelAspectRatio
      * @param keepAspectRatio
      * @param paddingColor
      * ```ts
      * // In this example, the video will be automatically resized to 640 pixels wide and will be applied a white padding
      * video.setVideoSize('640x?', true, true, '#fff')
      * // In this example, the video will be resized to 640x480 pixel, and if the aspect ratio is different the video will be stretched
      * video.setVideoSize('640x480', true, false)
      * ```
      */
    def setVideoSize(size: String, keepPixelAspectRatio: Boolean, keepAspectRatio: Boolean): Video = js.native
    def setVideoSize(size: String, keepPixelAspectRatio: Boolean, keepAspectRatio: Boolean, paddingColor: String): Video = js.native
    
    def setVideoStartTime(time: String): Video = js.native
    /**
      * Sets the start time. You can specify the value in seconds or in date time format.
      * @param time the time in seconds or a date time string
      * @example
      * ```ts
      * // Seconds
      * video.setVideoStartTime(13)
      * // Date time format
      * video.setVideoStartTime('00:00:13')
      * ```
      */
    def setVideoStartTime(time: Double): Video = js.native
    
    /**
      * Sets the watermark.
      * @param watermarkPath The path where the image is stored to be inserted as watermark
      * @param settings
      * @example
      * ```ts
      * // Add the watermark to the bottom right corner of the video
      * video.setWatermark('/path/to/retrieve/watermark_file.png')
      * ```
      */
    def setWatermark(watermarkPath: String): Video = js.native
    def setWatermark(watermarkPath: String, settings: WatermarkSettings): Video = js.native
  }
  
  /* Inlined std.Partial<{  title :string,   author :string,   copyright :string,   comment :string,   rating :string}> */
  trait WMVMetadata extends StObject {
    
    var author: js.UndefOr[String] = js.undefined
    
    var comment: js.UndefOr[String] = js.undefined
    
    var copyright: js.UndefOr[String] = js.undefined
    
    var rating: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object WMVMetadata {
    
    @scala.inline
    def apply(): WMVMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WMVMetadata]
    }
    
    @scala.inline
    implicit class WMVMetadataMutableBuilder[Self <: WMVMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
      
      @scala.inline
      def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  position :'NE' | 'NC' | 'NW' | 'SE' | 'SC' | 'SW' | 'C' | 'CE' | 'CW',   margin_nord :number,   margin_sud :number,   margin_east :number,   margin_west :number}> */
  trait WatermarkSettings extends StObject {
    
    var margin_east: js.UndefOr[Double] = js.undefined
    
    var margin_nord: js.UndefOr[Double] = js.undefined
    
    var margin_sud: js.UndefOr[Double] = js.undefined
    
    var margin_west: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[NE | NC | NW | SE | SC | SW | C | CE | CW] = js.undefined
  }
  object WatermarkSettings {
    
    @scala.inline
    def apply(): WatermarkSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatermarkSettings]
    }
    
    @scala.inline
    implicit class WatermarkSettingsMutableBuilder[Self <: WatermarkSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMargin_east(value: Double): Self = StObject.set(x, "margin_east", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMargin_eastUndefined: Self = StObject.set(x, "margin_east", js.undefined)
      
      @scala.inline
      def setMargin_nord(value: Double): Self = StObject.set(x, "margin_nord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMargin_nordUndefined: Self = StObject.set(x, "margin_nord", js.undefined)
      
      @scala.inline
      def setMargin_sud(value: Double): Self = StObject.set(x, "margin_sud", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMargin_sudUndefined: Self = StObject.set(x, "margin_sud", js.undefined)
      
      @scala.inline
      def setMargin_west(value: Double): Self = StObject.set(x, "margin_west", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMargin_westUndefined: Self = StObject.set(x, "margin_west", js.undefined)
      
      @scala.inline
      def setPosition(value: NE | NC | NW | SE | SC | SW | C | CE | CW): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  type _To = js.Object & Iffmpeg
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & Iffmpeg = ^
}
