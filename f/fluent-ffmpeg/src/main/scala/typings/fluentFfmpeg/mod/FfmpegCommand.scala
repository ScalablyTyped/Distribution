package typings.fluentFfmpeg.mod

import typings.fluentFfmpeg.AnonEnd
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.PassThrough
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluent-ffmpeg", "FfmpegCommand")
@js.native
class FfmpegCommand () extends EventEmitter {
  def this(input: String) = this()
  def this(input: Readable) = this()
  def this(options: FfmpegCommandOptions) = this()
  def this(input: String, options: FfmpegCommandOptions) = this()
  def this(input: Readable, options: FfmpegCommandOptions) = this()
  def FPS(fps: Double): FfmpegCommand = js.native
  def FPSInput(fps: Double): FfmpegCommand = js.native
  def FPSOutput(fps: Double): FfmpegCommand = js.native
  def _getArguments(): js.Array[String] = js.native
  def addInput(source: String): FfmpegCommand = js.native
  def addInput(source: Readable): FfmpegCommand = js.native
  def addInputOption(options: String*): FfmpegCommand = js.native
  // options/custom
  def addInputOption(options: js.Array[String]): FfmpegCommand = js.native
  def addInputOptions(options: String*): FfmpegCommand = js.native
  def addInputOptions(options: js.Array[String]): FfmpegCommand = js.native
  def addOption(options: String*): FfmpegCommand = js.native
  def addOption(options: js.Array[String]): FfmpegCommand = js.native
  def addOptions(options: String*): FfmpegCommand = js.native
  def addOptions(options: js.Array[String]): FfmpegCommand = js.native
  // options/output
  def addOutput(target: String): FfmpegCommand = js.native
  def addOutput(target: String, pipeopts: AnonEnd): FfmpegCommand = js.native
  def addOutput(target: Writable): FfmpegCommand = js.native
  def addOutput(target: Writable, pipeopts: AnonEnd): FfmpegCommand = js.native
  def addOutputOption(options: String*): FfmpegCommand = js.native
  def addOutputOption(options: js.Array[String]): FfmpegCommand = js.native
  def addOutputOptions(options: String*): FfmpegCommand = js.native
  def addOutputOptions(options: js.Array[String]): FfmpegCommand = js.native
  def applyAutoPad(): FfmpegCommand = js.native
  def applyAutoPad(pad: Boolean): FfmpegCommand = js.native
  def applyAutoPad(pad: Boolean, color: String): FfmpegCommand = js.native
  def applyAutoPadding(): FfmpegCommand = js.native
  def applyAutoPadding(pad: Boolean): FfmpegCommand = js.native
  def applyAutoPadding(pad: Boolean, color: String): FfmpegCommand = js.native
  def applyAutopad(): FfmpegCommand = js.native
  def applyAutopad(pad: Boolean): FfmpegCommand = js.native
  def applyAutopad(pad: Boolean, color: String): FfmpegCommand = js.native
  def applyAutopadding(): FfmpegCommand = js.native
  def applyAutopadding(pad: Boolean): FfmpegCommand = js.native
  def applyAutopadding(pad: Boolean, color: String): FfmpegCommand = js.native
  def aspect(aspect: String): FfmpegCommand = js.native
  def aspect(aspect: Double): FfmpegCommand = js.native
  def aspectRatio(aspect: String): FfmpegCommand = js.native
  def aspectRatio(aspect: Double): FfmpegCommand = js.native
  def audioBitrate(bitrate: String): FfmpegCommand = js.native
  def audioBitrate(bitrate: Double): FfmpegCommand = js.native
  def audioChannels(channels: Double): FfmpegCommand = js.native
  def audioCodec(codec: String): FfmpegCommand = js.native
  def audioFilter(filters: String): FfmpegCommand = js.native
  def audioFilter(filters: js.Array[AudioVideoFilter | String]): FfmpegCommand = js.native
  def audioFilters(filters: String): FfmpegCommand = js.native
  def audioFilters(filters: js.Array[AudioVideoFilter | String]): FfmpegCommand = js.native
  def audioFrequency(freq: Double): FfmpegCommand = js.native
  def audioQuality(quality: Double): FfmpegCommand = js.native
  def autoPad(): FfmpegCommand = js.native
  def autoPad(pad: Boolean): FfmpegCommand = js.native
  def autoPad(pad: Boolean, color: String): FfmpegCommand = js.native
  def autopad(): FfmpegCommand = js.native
  def autopad(pad: Boolean): FfmpegCommand = js.native
  def autopad(pad: Boolean, color: String): FfmpegCommand = js.native
  def availableCodecs(callback: CodecsCallback): Unit = js.native
  def availableEncoders(callback: EncodersCallback): Unit = js.native
  def availableFilters(callback: FiltersCallback): Unit = js.native
  def availableFormats(callback: FormatsCallback): Unit = js.native
  def complexFilter(spec: String): FfmpegCommand = js.native
  def complexFilter(spec: String, map: String): FfmpegCommand = js.native
  def complexFilter(spec: String, map: js.Array[String]): FfmpegCommand = js.native
  def complexFilter(spec: js.Array[String | FilterSpecification]): FfmpegCommand = js.native
  def complexFilter(spec: js.Array[String | FilterSpecification], map: String): FfmpegCommand = js.native
  def complexFilter(spec: js.Array[String | FilterSpecification], map: js.Array[String]): FfmpegCommand = js.native
  def complexFilter(spec: FilterSpecification): FfmpegCommand = js.native
  def complexFilter(spec: FilterSpecification, map: String): FfmpegCommand = js.native
  def complexFilter(spec: FilterSpecification, map: js.Array[String]): FfmpegCommand = js.native
  def concat(target: String): FfmpegCommand = js.native
  def concat(target: String, options: AnonEnd): FfmpegCommand = js.native
  def concat(target: Writable): FfmpegCommand = js.native
  def concat(target: Writable, options: AnonEnd): FfmpegCommand = js.native
  def concatenate(target: String): FfmpegCommand = js.native
  def concatenate(target: String, options: AnonEnd): FfmpegCommand = js.native
  def concatenate(target: Writable): FfmpegCommand = js.native
  def concatenate(target: Writable, options: AnonEnd): FfmpegCommand = js.native
  def duration(duration: String): FfmpegCommand = js.native
  def duration(duration: Double): FfmpegCommand = js.native
  // ffprobe
  def ffprobe(callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, Unit]): Unit = js.native
  def ffprobe(index: Double, callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, Unit]): Unit = js.native
   // tslint:disable-line unified-signatures
  def ffprobe(
    index: Double,
    options: js.Array[String],
    callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, Unit]
  ): Unit = js.native
  def ffprobe(options: js.Array[String], callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, Unit]): Unit = js.native
  def filterGraph(spec: String): FfmpegCommand = js.native
  def filterGraph(spec: String, map: String): FfmpegCommand = js.native
  def filterGraph(spec: String, map: js.Array[String]): FfmpegCommand = js.native
  def filterGraph(spec: js.Array[String | FilterSpecification]): FfmpegCommand = js.native
  def filterGraph(spec: js.Array[String | FilterSpecification], map: String): FfmpegCommand = js.native
  def filterGraph(spec: js.Array[String | FilterSpecification], map: js.Array[String]): FfmpegCommand = js.native
  def filterGraph(spec: FilterSpecification): FfmpegCommand = js.native
  def filterGraph(spec: FilterSpecification, map: String): FfmpegCommand = js.native
  def filterGraph(spec: FilterSpecification, map: js.Array[String]): FfmpegCommand = js.native
  def flvmeta(): FfmpegCommand = js.native
  def format(format: String): FfmpegCommand = js.native
  def fps(fps: Double): FfmpegCommand = js.native
  def fpsInput(fps: Double): FfmpegCommand = js.native
  def fpsOutput(fps: Double): FfmpegCommand = js.native
  def frames(frames: Double): FfmpegCommand = js.native
  def fromFormat(format: String): FfmpegCommand = js.native
  def getAvailableCodecs(callback: CodecsCallback): Unit = js.native
  def getAvailableEncoders(callback: EncodersCallback): Unit = js.native
  def getAvailableFilters(callback: FiltersCallback): Unit = js.native
  def getAvailableFormats(callback: FormatsCallback): Unit = js.native
  def input(source: String): FfmpegCommand = js.native
  def input(source: Readable): FfmpegCommand = js.native
  def inputFPS(fps: Double): FfmpegCommand = js.native
  def inputFormat(format: String): FfmpegCommand = js.native
  def inputFps(fps: Double): FfmpegCommand = js.native
  def inputOption(options: String*): FfmpegCommand = js.native
  def inputOption(options: js.Array[String]): FfmpegCommand = js.native
  def inputOptions(options: String*): FfmpegCommand = js.native
  def inputOptions(options: js.Array[String]): FfmpegCommand = js.native
  def keepDAR(): FfmpegCommand = js.native
  def keepDisplayAspect(): FfmpegCommand = js.native
  def keepDisplayAspectRatio(): FfmpegCommand = js.native
  // options/videosize
  def keepPixelAspect(): FfmpegCommand = js.native
  def kill(signal: String): FfmpegCommand = js.native
  def loop(): FfmpegCommand = js.native
  def loop(duration: String): FfmpegCommand = js.native
  def loop(duration: Double): FfmpegCommand = js.native
  def map(spec: String): FfmpegCommand = js.native
  // options/inputs
  def mergeAdd(source: String): FfmpegCommand = js.native
  def mergeAdd(source: Readable): FfmpegCommand = js.native
  def mergeToFile(target: String): FfmpegCommand = js.native
  def mergeToFile(target: String, options: AnonEnd): FfmpegCommand = js.native
  def mergeToFile(target: Writable): FfmpegCommand = js.native
  def mergeToFile(target: Writable, options: AnonEnd): FfmpegCommand = js.native
  def native(): FfmpegCommand = js.native
  def nativeFramerate(): FfmpegCommand = js.native
  def noAudio(): FfmpegCommand = js.native
  def noVideo(): FfmpegCommand = js.native
  def output(target: String): FfmpegCommand = js.native
  def output(target: String, pipeopts: AnonEnd): FfmpegCommand = js.native
  def output(target: Writable): FfmpegCommand = js.native
  def output(target: Writable, pipeopts: AnonEnd): FfmpegCommand = js.native
  def outputFPS(fps: Double): FfmpegCommand = js.native
  def outputFormat(format: String): FfmpegCommand = js.native
  def outputFps(fps: Double): FfmpegCommand = js.native
  def outputOption(options: String*): FfmpegCommand = js.native
  def outputOption(options: js.Array[String]): FfmpegCommand = js.native
  def outputOptions(options: String*): FfmpegCommand = js.native
  def outputOptions(options: js.Array[String]): FfmpegCommand = js.native
  def pipe(): Writable | PassThrough = js.native
  def pipe(stream: Writable): Writable | PassThrough = js.native
  def pipe(stream: Writable, options: AnonEnd): Writable | PassThrough = js.native
  def pnreset(proset: String): FfmpegCommand = js.native
  def pnreset(proset: GetPreset): FfmpegCommand = js.native
  def preset(format: String): FfmpegCommand = js.native
  // processor
  def renice(niceness: Double): FfmpegCommand = js.native
  def run(): Unit = js.native
  def save(output: String): FfmpegCommand = js.native
  // recipes
  def saveToFile(output: String): FfmpegCommand = js.native
  def screenshot(config: Double): FfmpegCommand = js.native
  def screenshot(config: Double, folder: String): FfmpegCommand = js.native
  def screenshot(config: ScreenshotsConfig): FfmpegCommand = js.native
  def screenshot(config: ScreenshotsConfig, folder: String): FfmpegCommand = js.native
  def screenshots(config: Double): FfmpegCommand = js.native
  def screenshots(config: Double, folder: String): FfmpegCommand = js.native
  def screenshots(config: ScreenshotsConfig): FfmpegCommand = js.native
  def screenshots(config: ScreenshotsConfig, folder: String): FfmpegCommand = js.native
  def seek(seek: String): FfmpegCommand = js.native
  def seek(seek: Double): FfmpegCommand = js.native
  def seekInput(seek: String): FfmpegCommand = js.native
  def seekInput(seek: Double): FfmpegCommand = js.native
  def seekOutput(seek: String): FfmpegCommand = js.native
  def seekOutput(seek: Double): FfmpegCommand = js.native
  def setAspect(aspect: String): FfmpegCommand = js.native
  def setAspect(aspect: Double): FfmpegCommand = js.native
  def setAspectRatio(aspect: String): FfmpegCommand = js.native
  def setAspectRatio(aspect: Double): FfmpegCommand = js.native
  def setDuration(duration: String): FfmpegCommand = js.native
  def setDuration(duration: Double): FfmpegCommand = js.native
  // capabilities
  def setFfmpegPath(path: String): FfmpegCommand = js.native
  def setFfprobePath(path: String): FfmpegCommand = js.native
  def setFlvtoolPath(path: String): FfmpegCommand = js.native
  def setSize(size: String): FfmpegCommand = js.native
  def setStartTime(seek: String): FfmpegCommand = js.native
  def setStartTime(seek: Double): FfmpegCommand = js.native
  def size(size: String): FfmpegCommand = js.native
  def stream(stream: Writable): Writable = js.native
  def stream(stream: Writable, options: AnonEnd): Writable = js.native
  def takeFrames(frames: Double): FfmpegCommand = js.native
  def takeScreenshots(config: Double): FfmpegCommand = js.native
  def takeScreenshots(config: Double, folder: String): FfmpegCommand = js.native
  def takeScreenshots(config: ScreenshotsConfig): FfmpegCommand = js.native
  def takeScreenshots(config: ScreenshotsConfig, folder: String): FfmpegCommand = js.native
  def thumbnail(config: Double): FfmpegCommand = js.native
  def thumbnail(config: Double, folder: String): FfmpegCommand = js.native
  def thumbnail(config: ScreenshotsConfig): FfmpegCommand = js.native
  def thumbnail(config: ScreenshotsConfig, folder: String): FfmpegCommand = js.native
  def thumbnails(config: Double): FfmpegCommand = js.native
  def thumbnails(config: Double, folder: String): FfmpegCommand = js.native
  def thumbnails(config: ScreenshotsConfig): FfmpegCommand = js.native
  def thumbnails(config: ScreenshotsConfig, folder: String): FfmpegCommand = js.native
  def toFormat(format: String): FfmpegCommand = js.native
  def updateFlvMetadata(): FfmpegCommand = js.native
  // options/misc
  def usingPreset(proset: String): FfmpegCommand = js.native
  def usingPreset(proset: GetPreset): FfmpegCommand = js.native
  def videoBitrate(bitrate: String): FfmpegCommand = js.native
  def videoBitrate(bitrate: String, constant: Boolean): FfmpegCommand = js.native
  def videoBitrate(bitrate: Double): FfmpegCommand = js.native
  def videoBitrate(bitrate: Double, constant: Boolean): FfmpegCommand = js.native
  def videoCodec(codec: String): FfmpegCommand = js.native
  def videoFilter(filters: String): FfmpegCommand = js.native
  def videoFilter(filters: js.Array[AudioVideoFilter | String]): FfmpegCommand = js.native
  def videoFilters(filters: String): FfmpegCommand = js.native
  def videoFilters(filters: js.Array[AudioVideoFilter | String]): FfmpegCommand = js.native
  def withAspect(aspect: String): FfmpegCommand = js.native
  def withAspect(aspect: Double): FfmpegCommand = js.native
  def withAspectRatio(aspect: String): FfmpegCommand = js.native
  def withAspectRatio(aspect: Double): FfmpegCommand = js.native
  def withAudioBitrate(bitrate: String): FfmpegCommand = js.native
  def withAudioBitrate(bitrate: Double): FfmpegCommand = js.native
  def withAudioChannels(channels: Double): FfmpegCommand = js.native
  def withAudioCodec(codec: String): FfmpegCommand = js.native
  def withAudioFilter(filters: String): FfmpegCommand = js.native
  def withAudioFilter(filters: js.Array[AudioVideoFilter | String]): FfmpegCommand = js.native
  def withAudioFilters(filters: String): FfmpegCommand = js.native
  def withAudioFilters(filters: js.Array[AudioVideoFilter | String]): FfmpegCommand = js.native
  def withAudioFrequency(freq: Double): FfmpegCommand = js.native
  def withAudioQuality(quality: Double): FfmpegCommand = js.native
  def withAutoPad(): FfmpegCommand = js.native
  def withAutoPad(pad: Boolean): FfmpegCommand = js.native
  def withAutoPad(pad: Boolean, color: String): FfmpegCommand = js.native
  def withAutoPadding(): FfmpegCommand = js.native
  def withAutoPadding(pad: Boolean): FfmpegCommand = js.native
  def withAutoPadding(pad: Boolean, color: String): FfmpegCommand = js.native
  def withAutopad(): FfmpegCommand = js.native
  def withAutopad(pad: Boolean): FfmpegCommand = js.native
  def withAutopad(pad: Boolean, color: String): FfmpegCommand = js.native
  def withAutopadding(): FfmpegCommand = js.native
  def withAutopadding(pad: Boolean): FfmpegCommand = js.native
  def withAutopadding(pad: Boolean, color: String): FfmpegCommand = js.native
  def withDuration(duration: String): FfmpegCommand = js.native
  def withDuration(duration: Double): FfmpegCommand = js.native
  def withFPS(fps: Double): FfmpegCommand = js.native
  def withFPSInput(fps: Double): FfmpegCommand = js.native
  def withFPSOutput(fps: Double): FfmpegCommand = js.native
  def withFps(fps: Double): FfmpegCommand = js.native
  def withFpsInput(fps: Double): FfmpegCommand = js.native
  def withFpsOutput(fps: Double): FfmpegCommand = js.native
  def withFrames(frames: Double): FfmpegCommand = js.native
  def withInputFPS(fps: Double): FfmpegCommand = js.native
  def withInputFormat(format: String): FfmpegCommand = js.native
  def withInputFps(fps: Double): FfmpegCommand = js.native
  def withInputOption(options: String*): FfmpegCommand = js.native
  def withInputOption(options: js.Array[String]): FfmpegCommand = js.native
  def withInputOptions(options: String*): FfmpegCommand = js.native
  def withInputOptions(options: js.Array[String]): FfmpegCommand = js.native
  def withNativeFramerate(): FfmpegCommand = js.native
  // options/audio
  def withNoAudio(): FfmpegCommand = js.native
  // options/video;
  def withNoVideo(): FfmpegCommand = js.native
  def withOption(options: String*): FfmpegCommand = js.native
  def withOption(options: js.Array[String]): FfmpegCommand = js.native
  def withOptions(options: String*): FfmpegCommand = js.native
  def withOptions(options: js.Array[String]): FfmpegCommand = js.native
  def withOutputFPS(fps: Double): FfmpegCommand = js.native
  def withOutputFormat(format: String): FfmpegCommand = js.native
  def withOutputFps(fps: Double): FfmpegCommand = js.native
  def withOutputOption(options: String*): FfmpegCommand = js.native
  def withOutputOption(options: js.Array[String]): FfmpegCommand = js.native
  def withOutputOptions(options: String*): FfmpegCommand = js.native
  def withOutputOptions(options: js.Array[String]): FfmpegCommand = js.native
  def withSize(size: String): FfmpegCommand = js.native
  def withVideoBitrate(bitrate: String): FfmpegCommand = js.native
  def withVideoBitrate(bitrate: String, constant: Boolean): FfmpegCommand = js.native
  def withVideoBitrate(bitrate: Double): FfmpegCommand = js.native
  def withVideoBitrate(bitrate: Double, constant: Boolean): FfmpegCommand = js.native
  def withVideoCodec(codec: String): FfmpegCommand = js.native
  def withVideoFilter(filters: String): FfmpegCommand = js.native
  def withVideoFilter(filters: js.Array[AudioVideoFilter | String]): FfmpegCommand = js.native
  def withVideoFilters(filters: String): FfmpegCommand = js.native
  def withVideoFilters(filters: js.Array[AudioVideoFilter | String]): FfmpegCommand = js.native
  def writeToStream(stream: Writable): Writable = js.native
  def writeToStream(stream: Writable, options: AnonEnd): Writable = js.native
}

