package typings.ffmpeg.ffmpegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Video extends js.Object {
  var metadata: StandardVideoMetadata with AVIMetadata with FLVMetadata = js.native
  def addCommand(command: String, argument: String): Unit = js.native
  def addFilterComplex(argument: String): Unit = js.native
  def addInput(argument: String): Unit = js.native
  def fnAddWatermark(watermarkPath: String, newPilePath: String, settings: WatermarkSettings, callback: SaveCallback): Unit = js.native
  def fnExtractFrameToJPG(destinationFolder: String, settings: FrameToJPGSettings, callback: SaveCallback): Unit = js.native
  def fnExtractSoundToMP3(destinationFileName: String, callback: SaveCallback): Unit = js.native
  def save(destinationFileName: String, callback: SaveCallback): Unit = js.native
  def setAudioBitrate(bitrate: Double): Video = js.native
  def setAudioChannels(channel: Double): Video = js.native
  def setAudioCodec(codec: String): Video = js.native
  def setAudioFrequency(frequency: Double): Video = js.native
  def setAudioQuality(quality: Double): Video = js.native
  def setDisableAudio(): Video = js.native
  def setOutput(path: String): Unit = js.native
  def setVideoAspectRatio(aspect: String): Video = js.native
  /**
    *
    * @example 1.77
    */
  def setVideoAspectRatio(aspect: Double): Video = js.native
  def setVideoBitRate(bitrate: Double): Video = js.native
  def setVideoCodec(codec: String): Video = js.native
  def setVideoDuration(duration: String): Video = js.native
  /**
    *
    * @example 13
    */
  def setVideoDuration(duration: Double): Video = js.native
  def setVideoFormat(format: String): Video = js.native
  def setVideoFrameRate(framerate: Double): Video = js.native
  def setVideoSize(size: String, keepPixelAspectRatio: Boolean, keepAspectRatio: Boolean): Video = js.native
  def setVideoSize(size: String, keepPixelAspectRatio: Boolean, keepAspectRatio: Boolean, paddingColor: String): Video = js.native
  def setVideoStartTime(time: String): Video = js.native
  /**
    *
    * @description time in seconds
    * @example 13
    */
  def setVideoStartTime(time: Double): Video = js.native
  def setWatermark(watermarkPath: String, settings: WatermarkSettings): Video = js.native
}

