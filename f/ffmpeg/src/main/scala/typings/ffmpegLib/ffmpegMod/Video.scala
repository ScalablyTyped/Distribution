package typings
package ffmpegLib.ffmpegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Video extends js.Object {
  var metadata: ffmpegLib.StandardVideoMetadata with ffmpegLib.AVIMetadata with ffmpegLib.FLVMetadata = js.native
  def addCommand(command: java.lang.String, argument: java.lang.String): scala.Unit = js.native
  def addFilterComplex(argument: java.lang.String): scala.Unit = js.native
  def addInput(argument: java.lang.String): scala.Unit = js.native
  def fnAddWatermark(
    watermarkPath: java.lang.String,
    newPilePath: java.lang.String,
    settings: ffmpegLib.WatermarkSettings,
    callback: SaveCallback
  ): scala.Unit = js.native
  def fnExtractFrameToJPG(
    destinationFolder: java.lang.String,
    settings: ffmpegLib.FrameToJPGSettings,
    callback: SaveCallback
  ): scala.Unit = js.native
  def fnExtractSoundToMP3(destinationFileName: java.lang.String, callback: SaveCallback): scala.Unit = js.native
  def save(destinationFileName: java.lang.String, callback: SaveCallback): scala.Unit = js.native
  def setAudioBitrate(bitrate: scala.Double): Video = js.native
  def setAudioChannels(channel: scala.Double): Video = js.native
  def setAudioCodec(codec: java.lang.String): Video = js.native
  def setAudioFrequency(frequency: scala.Double): Video = js.native
  def setAudioQuality(quality: scala.Double): Video = js.native
  def setDisableAudio(): Video = js.native
  def setOutput(path: java.lang.String): scala.Unit = js.native
  def setVideoAspectRatio(aspect: java.lang.String): Video = js.native
  /**
    *
    * @example 1.77
    */
  def setVideoAspectRatio(aspect: scala.Double): Video = js.native
  def setVideoBitRate(bitrate: scala.Double): Video = js.native
  def setVideoCodec(codec: java.lang.String): Video = js.native
  def setVideoDuration(duration: java.lang.String): Video = js.native
  /**
    *
    * @example 13
    */
  def setVideoDuration(duration: scala.Double): Video = js.native
  def setVideoFormat(format: java.lang.String): Video = js.native
  def setVideoFrameRate(framerate: scala.Double): Video = js.native
  def setVideoSize(size: java.lang.String, keepPixelAspectRatio: scala.Boolean, keepAspectRatio: scala.Boolean): Video = js.native
  def setVideoSize(
    size: java.lang.String,
    keepPixelAspectRatio: scala.Boolean,
    keepAspectRatio: scala.Boolean,
    paddingColor: java.lang.String
  ): Video = js.native
  def setVideoStartTime(time: java.lang.String): Video = js.native
  /**
    *
    * @description time in seconds
    * @example 13
    */
  def setVideoStartTime(time: scala.Double): Video = js.native
  def setWatermark(watermarkPath: java.lang.String, settings: ffmpegLib.WatermarkSettings): Video = js.native
}

