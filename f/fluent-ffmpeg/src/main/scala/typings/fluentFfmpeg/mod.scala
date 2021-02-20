package typings.fluentFfmpeg

import org.scalablytyped.runtime.StringDictionary
import typings.fluentFfmpeg.anon.End
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.PassThrough
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fluent-ffmpeg", JSImport.Namespace)
  @js.native
  def apply(): FfmpegCommand = js.native
  @JSImport("fluent-ffmpeg", JSImport.Namespace)
  @js.native
  def apply(input: js.UndefOr[scala.Nothing], options: FfmpegCommandOptions): FfmpegCommand = js.native
  @JSImport("fluent-ffmpeg", JSImport.Namespace)
  @js.native
  def apply(input: String): FfmpegCommand = js.native
  @JSImport("fluent-ffmpeg", JSImport.Namespace)
  @js.native
  def apply(input: String, options: FfmpegCommandOptions): FfmpegCommand = js.native
  @JSImport("fluent-ffmpeg", JSImport.Namespace)
  @js.native
  def apply(input: Readable): FfmpegCommand = js.native
  @JSImport("fluent-ffmpeg", JSImport.Namespace)
  @js.native
  def apply(input: Readable, options: FfmpegCommandOptions): FfmpegCommand = js.native
  @JSImport("fluent-ffmpeg", JSImport.Namespace)
  @js.native
  def apply(options: FfmpegCommandOptions): FfmpegCommand = js.native
  
  @JSImport("fluent-ffmpeg", "FfmpegCommand")
  @js.native
  class FfmpegCommand () extends EventEmitter {
    def this(input: String) = this()
    def this(input: Readable) = this()
    def this(options: FfmpegCommandOptions) = this()
    def this(input: js.UndefOr[scala.Nothing], options: FfmpegCommandOptions) = this()
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
    def addOutput(target: String, pipeopts: End): FfmpegCommand = js.native
    def addOutput(target: Writable): FfmpegCommand = js.native
    def addOutput(target: Writable, pipeopts: End): FfmpegCommand = js.native
    
    def addOutputOption(options: String*): FfmpegCommand = js.native
    def addOutputOption(options: js.Array[String]): FfmpegCommand = js.native
    
    def addOutputOptions(options: String*): FfmpegCommand = js.native
    def addOutputOptions(options: js.Array[String]): FfmpegCommand = js.native
    
    def applyAutoPad(): FfmpegCommand = js.native
    def applyAutoPad(pad: js.UndefOr[scala.Nothing], color: String): FfmpegCommand = js.native
    def applyAutoPad(pad: Boolean): FfmpegCommand = js.native
    def applyAutoPad(pad: Boolean, color: String): FfmpegCommand = js.native
    
    def applyAutoPadding(): FfmpegCommand = js.native
    def applyAutoPadding(pad: js.UndefOr[scala.Nothing], color: String): FfmpegCommand = js.native
    def applyAutoPadding(pad: Boolean): FfmpegCommand = js.native
    def applyAutoPadding(pad: Boolean, color: String): FfmpegCommand = js.native
    
    def applyAutopad(): FfmpegCommand = js.native
    def applyAutopad(pad: js.UndefOr[scala.Nothing], color: String): FfmpegCommand = js.native
    def applyAutopad(pad: Boolean): FfmpegCommand = js.native
    def applyAutopad(pad: Boolean, color: String): FfmpegCommand = js.native
    
    def applyAutopadding(): FfmpegCommand = js.native
    def applyAutopadding(pad: js.UndefOr[scala.Nothing], color: String): FfmpegCommand = js.native
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
    def autoPad(pad: js.UndefOr[scala.Nothing], color: String): FfmpegCommand = js.native
    def autoPad(pad: Boolean): FfmpegCommand = js.native
    def autoPad(pad: Boolean, color: String): FfmpegCommand = js.native
    
    def autopad(): FfmpegCommand = js.native
    def autopad(pad: js.UndefOr[scala.Nothing], color: String): FfmpegCommand = js.native
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
    def concat(target: String, options: End): FfmpegCommand = js.native
    def concat(target: Writable): FfmpegCommand = js.native
    def concat(target: Writable, options: End): FfmpegCommand = js.native
    
    def concatenate(target: String): FfmpegCommand = js.native
    def concatenate(target: String, options: End): FfmpegCommand = js.native
    def concatenate(target: Writable): FfmpegCommand = js.native
    def concatenate(target: Writable, options: End): FfmpegCommand = js.native
    
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
    def mergeToFile(target: String, options: End): FfmpegCommand = js.native
    def mergeToFile(target: Writable): FfmpegCommand = js.native
    def mergeToFile(target: Writable, options: End): FfmpegCommand = js.native
    
    def native(): FfmpegCommand = js.native
    
    def nativeFramerate(): FfmpegCommand = js.native
    
    def noAudio(): FfmpegCommand = js.native
    
    def noVideo(): FfmpegCommand = js.native
    
    def output(target: String): FfmpegCommand = js.native
    def output(target: String, pipeopts: End): FfmpegCommand = js.native
    def output(target: Writable): FfmpegCommand = js.native
    def output(target: Writable, pipeopts: End): FfmpegCommand = js.native
    
    def outputFPS(fps: Double): FfmpegCommand = js.native
    
    def outputFormat(format: String): FfmpegCommand = js.native
    
    def outputFps(fps: Double): FfmpegCommand = js.native
    
    def outputOption(options: String*): FfmpegCommand = js.native
    def outputOption(options: js.Array[String]): FfmpegCommand = js.native
    
    def outputOptions(options: String*): FfmpegCommand = js.native
    def outputOptions(options: js.Array[String]): FfmpegCommand = js.native
    
    def pipe(): Writable | PassThrough = js.native
    def pipe(stream: js.UndefOr[scala.Nothing], options: End): Writable | PassThrough = js.native
    def pipe(stream: Writable): Writable | PassThrough = js.native
    def pipe(stream: Writable, options: End): Writable | PassThrough = js.native
    
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
    def stream(stream: Writable, options: End): Writable = js.native
    
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
    def withAutoPad(pad: js.UndefOr[scala.Nothing], color: String): FfmpegCommand = js.native
    def withAutoPad(pad: Boolean): FfmpegCommand = js.native
    def withAutoPad(pad: Boolean, color: String): FfmpegCommand = js.native
    
    def withAutoPadding(): FfmpegCommand = js.native
    def withAutoPadding(pad: js.UndefOr[scala.Nothing], color: String): FfmpegCommand = js.native
    def withAutoPadding(pad: Boolean): FfmpegCommand = js.native
    def withAutoPadding(pad: Boolean, color: String): FfmpegCommand = js.native
    
    def withAutopad(): FfmpegCommand = js.native
    def withAutopad(pad: js.UndefOr[scala.Nothing], color: String): FfmpegCommand = js.native
    def withAutopad(pad: Boolean): FfmpegCommand = js.native
    def withAutopad(pad: Boolean, color: String): FfmpegCommand = js.native
    
    def withAutopadding(): FfmpegCommand = js.native
    def withAutopadding(pad: js.UndefOr[scala.Nothing], color: String): FfmpegCommand = js.native
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
    def writeToStream(stream: Writable, options: End): Writable = js.native
  }
  
  @JSImport("fluent-ffmpeg", "availableCodecs")
  @js.native
  def availableCodecs(callback: CodecsCallback): Unit = js.native
  
  @JSImport("fluent-ffmpeg", "availableEncoders")
  @js.native
  def availableEncoders(callback: EncodersCallback): Unit = js.native
  
  @JSImport("fluent-ffmpeg", "availableFilters")
  @js.native
  def availableFilters(callback: FiltersCallback): Unit = js.native
  
  @JSImport("fluent-ffmpeg", "availableFormats")
  @js.native
  def availableFormats(callback: FormatsCallback): Unit = js.native
  
  @JSImport("fluent-ffmpeg", "ffprobe")
  @js.native
  def ffprobe(file: String, callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, Unit]): Unit = js.native
  @JSImport("fluent-ffmpeg", "ffprobe")
  @js.native
  def ffprobe(
    file: String,
    index: Double,
    callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, Unit]
  ): Unit = js.native
  // tslint:disable-line unified-signatures
  @JSImport("fluent-ffmpeg", "ffprobe")
  @js.native
  def ffprobe(
    file: String,
    index: Double,
    options: js.Array[String],
    callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, Unit]
  ): Unit = js.native
  @JSImport("fluent-ffmpeg", "ffprobe")
  @js.native
  def ffprobe(
    file: String,
    options: js.Array[String],
    callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, Unit]
  ): Unit = js.native
  
  @JSImport("fluent-ffmpeg", "getAvailableCodecs")
  @js.native
  def getAvailableCodecs(callback: CodecsCallback): Unit = js.native
  
  @JSImport("fluent-ffmpeg", "getAvailableEncoders")
  @js.native
  def getAvailableEncoders(callback: EncodersCallback): Unit = js.native
  
  @JSImport("fluent-ffmpeg", "getAvailableFilters")
  @js.native
  def getAvailableFilters(callback: FiltersCallback): Unit = js.native
  
  @JSImport("fluent-ffmpeg", "getAvailableFormats")
  @js.native
  def getAvailableFormats(callback: FormatsCallback): Unit = js.native
  
  // static methods
  @JSImport("fluent-ffmpeg", "setFfmpegPath")
  @js.native
  def setFfmpegPath(path: String): FfmpegCommand = js.native
  
  @JSImport("fluent-ffmpeg", "setFfprobePath")
  @js.native
  def setFfprobePath(path: String): FfmpegCommand = js.native
  
  @JSImport("fluent-ffmpeg", "setFlvtoolPath")
  @js.native
  def setFlvtoolPath(path: String): FfmpegCommand = js.native
  
  @js.native
  trait AudioVideoFilter extends StObject {
    
    var filter: String = js.native
    
    var options: String | js.Array[String] | js.Object = js.native
  }
  object AudioVideoFilter {
    
    @scala.inline
    def apply(filter: String, options: String | js.Array[String] | js.Object): AudioVideoFilter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AudioVideoFilter]
    }
    
    @scala.inline
    implicit class AudioVideoFilterMutableBuilder[Self <: AudioVideoFilter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: String | js.Array[String] | js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Codec extends StObject {
    
    var canDecode: Boolean = js.native
    
    var canEncode: Boolean = js.native
    
    var description: String = js.native
    
    var directRendering: js.UndefOr[Boolean] = js.native
    
    var drawHorizBand: js.UndefOr[Boolean] = js.native
    
    var intraFrameOnly: js.UndefOr[Boolean] = js.native
    
    var isLossless: js.UndefOr[Boolean] = js.native
    
    var isLossy: js.UndefOr[Boolean] = js.native
    
    var `type`: String = js.native
    
    var weirdFrameTruncation: js.UndefOr[Boolean] = js.native
  }
  object Codec {
    
    @scala.inline
    def apply(canDecode: Boolean, canEncode: Boolean, description: String, `type`: String): Codec = {
      val __obj = js.Dynamic.literal(canDecode = canDecode.asInstanceOf[js.Any], canEncode = canEncode.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Codec]
    }
    
    @scala.inline
    implicit class CodecMutableBuilder[Self <: Codec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanDecode(value: Boolean): Self = StObject.set(x, "canDecode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanEncode(value: Boolean): Self = StObject.set(x, "canEncode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectRendering(value: Boolean): Self = StObject.set(x, "directRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectRenderingUndefined: Self = StObject.set(x, "directRendering", js.undefined)
      
      @scala.inline
      def setDrawHorizBand(value: Boolean): Self = StObject.set(x, "drawHorizBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawHorizBandUndefined: Self = StObject.set(x, "drawHorizBand", js.undefined)
      
      @scala.inline
      def setIntraFrameOnly(value: Boolean): Self = StObject.set(x, "intraFrameOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntraFrameOnlyUndefined: Self = StObject.set(x, "intraFrameOnly", js.undefined)
      
      @scala.inline
      def setIsLossless(value: Boolean): Self = StObject.set(x, "isLossless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLosslessUndefined: Self = StObject.set(x, "isLossless", js.undefined)
      
      @scala.inline
      def setIsLossy(value: Boolean): Self = StObject.set(x, "isLossy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLossyUndefined: Self = StObject.set(x, "isLossy", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeirdFrameTruncation(value: Boolean): Self = StObject.set(x, "weirdFrameTruncation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeirdFrameTruncationUndefined: Self = StObject.set(x, "weirdFrameTruncation", js.undefined)
    }
  }
  
  type Codecs = StringDictionary[Codec]
  
  type CodecsCallback = js.Function2[/* err */ Error, /* codecs */ Codecs, Unit]
  
  @js.native
  trait Encoder extends StObject {
    
    var description: String = js.native
    
    var directRendering: Boolean = js.native
    
    var drawHorizBand: Boolean = js.native
    
    var experimental: Boolean = js.native
    
    var frameMT: Boolean = js.native
    
    var sliceMT: Boolean = js.native
    
    var `type`: String = js.native
  }
  object Encoder {
    
    @scala.inline
    def apply(
      description: String,
      directRendering: Boolean,
      drawHorizBand: Boolean,
      experimental: Boolean,
      frameMT: Boolean,
      sliceMT: Boolean,
      `type`: String
    ): Encoder = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], directRendering = directRendering.asInstanceOf[js.Any], drawHorizBand = drawHorizBand.asInstanceOf[js.Any], experimental = experimental.asInstanceOf[js.Any], frameMT = frameMT.asInstanceOf[js.Any], sliceMT = sliceMT.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoder]
    }
    
    @scala.inline
    implicit class EncoderMutableBuilder[Self <: Encoder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectRendering(value: Boolean): Self = StObject.set(x, "directRendering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawHorizBand(value: Boolean): Self = StObject.set(x, "drawHorizBand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameMT(value: Boolean): Self = StObject.set(x, "frameMT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliceMT(value: Boolean): Self = StObject.set(x, "sliceMT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Encoders = StringDictionary[Encoder]
  
  type EncodersCallback = js.Function2[/* err */ Error, /* encoders */ Encoders, Unit]
  
  @js.native
  trait FfmpegCommandLogger extends StObject {
    
    def debug(data: js.Any*): Unit = js.native
    
    def error(data: js.Any*): Unit = js.native
    
    def info(data: js.Any*): Unit = js.native
    
    def warn(data: js.Any*): Unit = js.native
  }
  object FfmpegCommandLogger {
    
    @scala.inline
    def apply(
      debug: /* repeated */ js.Any => Unit,
      error: /* repeated */ js.Any => Unit,
      info: /* repeated */ js.Any => Unit,
      warn: /* repeated */ js.Any => Unit
    ): FfmpegCommandLogger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[FfmpegCommandLogger]
    }
    
    @scala.inline
    implicit class FfmpegCommandLoggerMutableBuilder[Self <: FfmpegCommandLogger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      @scala.inline
      def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarn(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FfmpegCommandOptions extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var logger: js.UndefOr[FfmpegCommandLogger] = js.native
    
    var niceness: js.UndefOr[Double] = js.native
    
    var preset: js.UndefOr[String] = js.native
    
    var presets: js.UndefOr[String] = js.native
    
    var priority: js.UndefOr[Double] = js.native
    
    var source: js.UndefOr[String | Readable] = js.native
    
    var stdoutLines: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object FfmpegCommandOptions {
    
    @scala.inline
    def apply(): FfmpegCommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FfmpegCommandOptions]
    }
    
    @scala.inline
    implicit class FfmpegCommandOptionsMutableBuilder[Self <: FfmpegCommandOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setLogger(value: FfmpegCommandLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setNiceness(value: Double): Self = StObject.set(x, "niceness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNicenessUndefined: Self = StObject.set(x, "niceness", js.undefined)
      
      @scala.inline
      def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      @scala.inline
      def setPresets(value: String): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setSource(value: String | Readable): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setStdoutLines(value: Double): Self = StObject.set(x, "stdoutLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutLinesUndefined: Self = StObject.set(x, "stdoutLines", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait FfprobeData extends StObject {
    
    var chapters: js.Array[_] = js.native
    
    var format: FfprobeFormat = js.native
    
    var streams: js.Array[FfprobeStream] = js.native
  }
  object FfprobeData {
    
    @scala.inline
    def apply(chapters: js.Array[_], format: FfprobeFormat, streams: js.Array[FfprobeStream]): FfprobeData = {
      val __obj = js.Dynamic.literal(chapters = chapters.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any])
      __obj.asInstanceOf[FfprobeData]
    }
    
    @scala.inline
    implicit class FfprobeDataMutableBuilder[Self <: FfprobeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChapters(value: js.Array[_]): Self = StObject.set(x, "chapters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChaptersVarargs(value: js.Any*): Self = StObject.set(x, "chapters", js.Array(value :_*))
      
      @scala.inline
      def setFormat(value: FfprobeFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreams(value: js.Array[FfprobeStream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamsVarargs(value: FfprobeStream*): Self = StObject.set(x, "streams", js.Array(value :_*))
    }
  }
  
  @js.native
  trait FfprobeFormat
    extends /* key */ StringDictionary[js.Any] {
    
    var bit_rate: js.UndefOr[Double] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    var format_long_name: js.UndefOr[String] = js.native
    
    var format_name: js.UndefOr[String] = js.native
    
    var nb_programs: js.UndefOr[Double] = js.native
    
    var nb_streams: js.UndefOr[Double] = js.native
    
    var probe_score: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var start_time: js.UndefOr[Double] = js.native
    
    var tags: js.UndefOr[js.Array[_]] = js.native
  }
  object FfprobeFormat {
    
    @scala.inline
    def apply(): FfprobeFormat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FfprobeFormat]
    }
    
    @scala.inline
    implicit class FfprobeFormatMutableBuilder[Self <: FfprobeFormat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBit_rate(value: Double): Self = StObject.set(x, "bit_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBit_rateUndefined: Self = StObject.set(x, "bit_rate", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setFormat_long_name(value: String): Self = StObject.set(x, "format_long_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat_long_nameUndefined: Self = StObject.set(x, "format_long_name", js.undefined)
      
      @scala.inline
      def setFormat_name(value: String): Self = StObject.set(x, "format_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat_nameUndefined: Self = StObject.set(x, "format_name", js.undefined)
      
      @scala.inline
      def setNb_programs(value: Double): Self = StObject.set(x, "nb_programs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNb_programsUndefined: Self = StObject.set(x, "nb_programs", js.undefined)
      
      @scala.inline
      def setNb_streams(value: Double): Self = StObject.set(x, "nb_streams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNb_streamsUndefined: Self = StObject.set(x, "nb_streams", js.undefined)
      
      @scala.inline
      def setProbe_score(value: Double): Self = StObject.set(x, "probe_score", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProbe_scoreUndefined: Self = StObject.set(x, "probe_score", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStart_time(value: Double): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[_]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: js.Any*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
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
    implicit class FfprobeStreamMutableBuilder[Self <: FfprobeStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvg_frame_rate(value: String): Self = StObject.set(x, "avg_frame_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvg_frame_rateUndefined: Self = StObject.set(x, "avg_frame_rate", js.undefined)
      
      @scala.inline
      def setBit_rate(value: String): Self = StObject.set(x, "bit_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBit_rateUndefined: Self = StObject.set(x, "bit_rate", js.undefined)
      
      @scala.inline
      def setBits_per_raw_sample(value: String): Self = StObject.set(x, "bits_per_raw_sample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBits_per_raw_sampleUndefined: Self = StObject.set(x, "bits_per_raw_sample", js.undefined)
      
      @scala.inline
      def setBits_per_sample(value: Double): Self = StObject.set(x, "bits_per_sample", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBits_per_sampleUndefined: Self = StObject.set(x, "bits_per_sample", js.undefined)
      
      @scala.inline
      def setChannel_layout(value: String): Self = StObject.set(x, "channel_layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannel_layoutUndefined: Self = StObject.set(x, "channel_layout", js.undefined)
      
      @scala.inline
      def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      @scala.inline
      def setChroma_location(value: String): Self = StObject.set(x, "chroma_location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChroma_locationUndefined: Self = StObject.set(x, "chroma_location", js.undefined)
      
      @scala.inline
      def setCodec_long_name(value: String): Self = StObject.set(x, "codec_long_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodec_long_nameUndefined: Self = StObject.set(x, "codec_long_name", js.undefined)
      
      @scala.inline
      def setCodec_name(value: String): Self = StObject.set(x, "codec_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodec_nameUndefined: Self = StObject.set(x, "codec_name", js.undefined)
      
      @scala.inline
      def setCodec_tag(value: String): Self = StObject.set(x, "codec_tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodec_tagUndefined: Self = StObject.set(x, "codec_tag", js.undefined)
      
      @scala.inline
      def setCodec_tag_string(value: String): Self = StObject.set(x, "codec_tag_string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodec_tag_stringUndefined: Self = StObject.set(x, "codec_tag_string", js.undefined)
      
      @scala.inline
      def setCodec_time_base(value: String): Self = StObject.set(x, "codec_time_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodec_time_baseUndefined: Self = StObject.set(x, "codec_time_base", js.undefined)
      
      @scala.inline
      def setCodec_type(value: String): Self = StObject.set(x, "codec_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodec_typeUndefined: Self = StObject.set(x, "codec_type", js.undefined)
      
      @scala.inline
      def setCoded_height(value: Double): Self = StObject.set(x, "coded_height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoded_heightUndefined: Self = StObject.set(x, "coded_height", js.undefined)
      
      @scala.inline
      def setCoded_width(value: Double): Self = StObject.set(x, "coded_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoded_widthUndefined: Self = StObject.set(x, "coded_width", js.undefined)
      
      @scala.inline
      def setColor_primaries(value: String): Self = StObject.set(x, "color_primaries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_primariesUndefined: Self = StObject.set(x, "color_primaries", js.undefined)
      
      @scala.inline
      def setColor_range(value: String): Self = StObject.set(x, "color_range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_rangeUndefined: Self = StObject.set(x, "color_range", js.undefined)
      
      @scala.inline
      def setColor_space(value: String): Self = StObject.set(x, "color_space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_spaceUndefined: Self = StObject.set(x, "color_space", js.undefined)
      
      @scala.inline
      def setColor_transfer(value: String): Self = StObject.set(x, "color_transfer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor_transferUndefined: Self = StObject.set(x, "color_transfer", js.undefined)
      
      @scala.inline
      def setDisplay_aspect_ratio(value: String): Self = StObject.set(x, "display_aspect_ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplay_aspect_ratioUndefined: Self = StObject.set(x, "display_aspect_ratio", js.undefined)
      
      @scala.inline
      def setDisposition(value: FfprobeStreamDisposition): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
      
      @scala.inline
      def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setDuration_ts(value: String): Self = StObject.set(x, "duration_ts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration_tsUndefined: Self = StObject.set(x, "duration_ts", js.undefined)
      
      @scala.inline
      def setField_order(value: String): Self = StObject.set(x, "field_order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setField_orderUndefined: Self = StObject.set(x, "field_order", js.undefined)
      
      @scala.inline
      def setHas_b_frames(value: Double): Self = StObject.set(x, "has_b_frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_b_framesUndefined: Self = StObject.set(x, "has_b_frames", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setMax_bit_rate(value: String): Self = StObject.set(x, "max_bit_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_bit_rateUndefined: Self = StObject.set(x, "max_bit_rate", js.undefined)
      
      @scala.inline
      def setNb_frames(value: String): Self = StObject.set(x, "nb_frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNb_framesUndefined: Self = StObject.set(x, "nb_frames", js.undefined)
      
      @scala.inline
      def setNb_read_frames(value: String): Self = StObject.set(x, "nb_read_frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNb_read_framesUndefined: Self = StObject.set(x, "nb_read_frames", js.undefined)
      
      @scala.inline
      def setNb_read_packets(value: String): Self = StObject.set(x, "nb_read_packets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNb_read_packetsUndefined: Self = StObject.set(x, "nb_read_packets", js.undefined)
      
      @scala.inline
      def setPix_fmt(value: String): Self = StObject.set(x, "pix_fmt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPix_fmtUndefined: Self = StObject.set(x, "pix_fmt", js.undefined)
      
      @scala.inline
      def setProfile(value: Double): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setR_frame_rate(value: String): Self = StObject.set(x, "r_frame_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR_frame_rateUndefined: Self = StObject.set(x, "r_frame_rate", js.undefined)
      
      @scala.inline
      def setRefs(value: Double): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefsUndefined: Self = StObject.set(x, "refs", js.undefined)
      
      @scala.inline
      def setSample_aspect_ratio(value: String): Self = StObject.set(x, "sample_aspect_ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSample_aspect_ratioUndefined: Self = StObject.set(x, "sample_aspect_ratio", js.undefined)
      
      @scala.inline
      def setSample_fmt(value: String): Self = StObject.set(x, "sample_fmt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSample_fmtUndefined: Self = StObject.set(x, "sample_fmt", js.undefined)
      
      @scala.inline
      def setSample_rate(value: Double): Self = StObject.set(x, "sample_rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSample_rateUndefined: Self = StObject.set(x, "sample_rate", js.undefined)
      
      @scala.inline
      def setStart_pts(value: Double): Self = StObject.set(x, "start_pts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_ptsUndefined: Self = StObject.set(x, "start_pts", js.undefined)
      
      @scala.inline
      def setStart_time(value: Double): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
      
      @scala.inline
      def setTime_base(value: String): Self = StObject.set(x, "time_base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime_baseUndefined: Self = StObject.set(x, "time_base", js.undefined)
      
      @scala.inline
      def setTimecode(value: String): Self = StObject.set(x, "timecode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimecodeUndefined: Self = StObject.set(x, "timecode", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait FfprobeStreamDisposition
    extends /* key */ StringDictionary[js.Any] {
    
    var default: js.UndefOr[Double] = js.native
    
    var attached_pic: js.UndefOr[Double] = js.native
    
    var clean_effects: js.UndefOr[Double] = js.native
    
    var comment: js.UndefOr[Double] = js.native
    
    var dub: js.UndefOr[Double] = js.native
    
    var forced: js.UndefOr[Double] = js.native
    
    var hearing_impaired: js.UndefOr[Double] = js.native
    
    var karaoke: js.UndefOr[Double] = js.native
    
    var lyrics: js.UndefOr[Double] = js.native
    
    var original: js.UndefOr[Double] = js.native
    
    var timed_thumbnails: js.UndefOr[Double] = js.native
    
    var visual_impaired: js.UndefOr[Double] = js.native
  }
  object FfprobeStreamDisposition {
    
    @scala.inline
    def apply(): FfprobeStreamDisposition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FfprobeStreamDisposition]
    }
    
    @scala.inline
    implicit class FfprobeStreamDispositionMutableBuilder[Self <: FfprobeStreamDisposition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttached_pic(value: Double): Self = StObject.set(x, "attached_pic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttached_picUndefined: Self = StObject.set(x, "attached_pic", js.undefined)
      
      @scala.inline
      def setClean_effects(value: Double): Self = StObject.set(x, "clean_effects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClean_effectsUndefined: Self = StObject.set(x, "clean_effects", js.undefined)
      
      @scala.inline
      def setComment(value: Double): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDub(value: Double): Self = StObject.set(x, "dub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDubUndefined: Self = StObject.set(x, "dub", js.undefined)
      
      @scala.inline
      def setForced(value: Double): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForcedUndefined: Self = StObject.set(x, "forced", js.undefined)
      
      @scala.inline
      def setHearing_impaired(value: Double): Self = StObject.set(x, "hearing_impaired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHearing_impairedUndefined: Self = StObject.set(x, "hearing_impaired", js.undefined)
      
      @scala.inline
      def setKaraoke(value: Double): Self = StObject.set(x, "karaoke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKaraokeUndefined: Self = StObject.set(x, "karaoke", js.undefined)
      
      @scala.inline
      def setLyrics(value: Double): Self = StObject.set(x, "lyrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLyricsUndefined: Self = StObject.set(x, "lyrics", js.undefined)
      
      @scala.inline
      def setOriginal(value: Double): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
      
      @scala.inline
      def setTimed_thumbnails(value: Double): Self = StObject.set(x, "timed_thumbnails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimed_thumbnailsUndefined: Self = StObject.set(x, "timed_thumbnails", js.undefined)
      
      @scala.inline
      def setVisual_impaired(value: Double): Self = StObject.set(x, "visual_impaired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisual_impairedUndefined: Self = StObject.set(x, "visual_impaired", js.undefined)
    }
  }
  
  @js.native
  trait Filter extends StObject {
    
    var description: String = js.native
    
    var input: String = js.native
    
    var multipleInputs: Boolean = js.native
    
    var multipleOutputs: Boolean = js.native
    
    var output: String = js.native
  }
  object Filter {
    
    @scala.inline
    def apply(
      description: String,
      input: String,
      multipleInputs: Boolean,
      multipleOutputs: Boolean,
      output: String
    ): Filter = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], multipleInputs = multipleInputs.asInstanceOf[js.Any], multipleOutputs = multipleOutputs.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleInputs(value: Boolean): Self = StObject.set(x, "multipleInputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleOutputs(value: Boolean): Self = StObject.set(x, "multipleOutputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FilterSpecification extends StObject {
    
    var filter: String = js.native
    
    var inputs: js.UndefOr[String | js.Array[String]] = js.native
    
    var options: js.UndefOr[js.Any | String | js.Array[_]] = js.native
    
    var outputs: js.UndefOr[String | js.Array[String]] = js.native
  }
  object FilterSpecification {
    
    @scala.inline
    def apply(filter: String): FilterSpecification = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterSpecification]
    }
    
    @scala.inline
    implicit class FilterSpecificationMutableBuilder[Self <: FilterSpecification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputs(value: String | js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      @scala.inline
      def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: js.Any | String | js.Array[_]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: js.Any*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setOutputs(value: String | js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      @scala.inline
      def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    }
  }
  
  type Filters = StringDictionary[Filter]
  
  type FiltersCallback = js.Function2[/* err */ Error, /* filters */ Filters, Unit]
  
  @js.native
  trait Format extends StObject {
    
    var canDemux: Boolean = js.native
    
    var canMux: Boolean = js.native
    
    var description: String = js.native
  }
  object Format {
    
    @scala.inline
    def apply(canDemux: Boolean, canMux: Boolean, description: String): Format = {
      val __obj = js.Dynamic.literal(canDemux = canDemux.asInstanceOf[js.Any], canMux = canMux.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanDemux(value: Boolean): Self = StObject.set(x, "canDemux", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanMux(value: Boolean): Self = StObject.set(x, "canMux", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  type Formats = StringDictionary[Format]
  
  type FormatsCallback = js.Function2[/* err */ Error, /* formats */ Formats, Unit]
  
  type GetPreset = js.Function1[/* command */ FfmpegCommand, String]
  
  @js.native
  trait ScreenshotsConfig extends StObject {
    
    var count: js.UndefOr[Double] = js.native
    
    var fastSeek: js.UndefOr[Boolean] = js.native
    
    var filename: js.UndefOr[String] = js.native
    
    var folder: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[String] = js.native
    
    var timemarks: js.UndefOr[js.Array[Double | String]] = js.native
    
    var timestamps: js.UndefOr[js.Array[Double | String]] = js.native
  }
  object ScreenshotsConfig {
    
    @scala.inline
    def apply(): ScreenshotsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScreenshotsConfig]
    }
    
    @scala.inline
    implicit class ScreenshotsConfigMutableBuilder[Self <: ScreenshotsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setFastSeek(value: Boolean): Self = StObject.set(x, "fastSeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFastSeekUndefined: Self = StObject.set(x, "fastSeek", js.undefined)
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTimemarks(value: js.Array[Double | String]): Self = StObject.set(x, "timemarks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimemarksUndefined: Self = StObject.set(x, "timemarks", js.undefined)
      
      @scala.inline
      def setTimemarksVarargs(value: (Double | String)*): Self = StObject.set(x, "timemarks", js.Array(value :_*))
      
      @scala.inline
      def setTimestamps(value: js.Array[Double | String]): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
      
      @scala.inline
      def setTimestampsVarargs(value: (Double | String)*): Self = StObject.set(x, "timestamps", js.Array(value :_*))
    }
  }
}
