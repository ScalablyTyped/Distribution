package typings.ffmpeg.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Video extends js.Object {
  
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
  def fnAddWatermark(
    watermarkPath: String,
    newPilePath: js.UndefOr[scala.Nothing],
    settings: js.UndefOr[scala.Nothing],
    cb: js.Function2[/* err */ Error, /* file */ String, Unit]
  ): Unit = js.native
  def fnAddWatermark(watermarkPath: String, newPilePath: js.UndefOr[scala.Nothing], settings: WatermarkSettings): Unit = js.native
  def fnAddWatermark(
    watermarkPath: String,
    newPilePath: js.UndefOr[scala.Nothing],
    settings: WatermarkSettings,
    cb: js.Function2[/* err */ Error, /* file */ String, Unit]
  ): Unit = js.native
  def fnAddWatermark(watermarkPath: String, newPilePath: String): Unit = js.native
  def fnAddWatermark(
    watermarkPath: String,
    newPilePath: String,
    settings: js.UndefOr[scala.Nothing],
    cb: js.Function2[/* err */ Error, /* file */ String, Unit]
  ): Unit = js.native
  def fnAddWatermark(watermarkPath: String, newPilePath: String, settings: WatermarkSettings): Unit = js.native
  def fnAddWatermark(
    watermarkPath: String,
    newPilePath: String,
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
  def fnAddWatermark_Promise(watermarkPath: String, newPilePath: js.UndefOr[scala.Nothing], settings: WatermarkSettings): js.Promise[String] = js.native
  @JSName("fnAddWatermark")
  def fnAddWatermark_Promise(watermarkPath: String, newPilePath: String): js.Promise[String] = js.native
  @JSName("fnAddWatermark")
  def fnAddWatermark_Promise(watermarkPath: String, newPilePath: String, settings: WatermarkSettings): js.Promise[String] = js.native
  
  def fnExtractFrameToJPG(destinationFolder: String): Unit = js.native
  def fnExtractFrameToJPG(
    destinationFolder: String,
    settings: js.UndefOr[scala.Nothing],
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
  
  var metadata: StandardVideoMetadata with AVIMetadata with FLVMetadata = js.native
  
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
