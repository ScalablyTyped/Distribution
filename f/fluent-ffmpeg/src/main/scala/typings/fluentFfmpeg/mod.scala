package typings.fluentFfmpeg

import org.scalablytyped.runtime.StringDictionary
import typings.fluentFfmpeg.anon.End
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.PassThrough
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): FfmpegCommand = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FfmpegCommand]
  inline def apply(input: String): FfmpegCommand = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[FfmpegCommand]
  inline def apply(input: String, options: FfmpegCommandOptions): FfmpegCommand = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FfmpegCommand]
  inline def apply(input: Unit, options: FfmpegCommandOptions): FfmpegCommand = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FfmpegCommand]
  inline def apply(input: Readable): FfmpegCommand = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[FfmpegCommand]
  inline def apply(input: Readable, options: FfmpegCommandOptions): FfmpegCommand = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FfmpegCommand]
  inline def apply(options: FfmpegCommandOptions): FfmpegCommand = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[FfmpegCommand]
  
  @JSImport("fluent-ffmpeg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fluent-ffmpeg", "FfmpegCommand")
  @js.native
  open class FfmpegCommand () extends EventEmitter {
    def this(input: String) = this()
    def this(input: Readable) = this()
    def this(options: FfmpegCommandOptions) = this()
    def this(input: String, options: FfmpegCommandOptions) = this()
    def this(input: Unit, options: FfmpegCommandOptions) = this()
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
    def applyAutoPad(pad: Boolean): FfmpegCommand = js.native
    def applyAutoPad(pad: Boolean, color: String): FfmpegCommand = js.native
    def applyAutoPad(pad: Unit, color: String): FfmpegCommand = js.native
    
    def applyAutoPadding(): FfmpegCommand = js.native
    def applyAutoPadding(pad: Boolean): FfmpegCommand = js.native
    def applyAutoPadding(pad: Boolean, color: String): FfmpegCommand = js.native
    def applyAutoPadding(pad: Unit, color: String): FfmpegCommand = js.native
    
    def applyAutopad(): FfmpegCommand = js.native
    def applyAutopad(pad: Boolean): FfmpegCommand = js.native
    def applyAutopad(pad: Boolean, color: String): FfmpegCommand = js.native
    def applyAutopad(pad: Unit, color: String): FfmpegCommand = js.native
    
    def applyAutopadding(): FfmpegCommand = js.native
    def applyAutopadding(pad: Boolean): FfmpegCommand = js.native
    def applyAutopadding(pad: Boolean, color: String): FfmpegCommand = js.native
    def applyAutopadding(pad: Unit, color: String): FfmpegCommand = js.native
    
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
    def autoPad(pad: Unit, color: String): FfmpegCommand = js.native
    
    def autopad(): FfmpegCommand = js.native
    def autopad(pad: Boolean): FfmpegCommand = js.native
    def autopad(pad: Boolean, color: String): FfmpegCommand = js.native
    def autopad(pad: Unit, color: String): FfmpegCommand = js.native
    
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
    def ffprobe(callback: js.Function2[/* err */ Any, /* data */ FfprobeData, Unit]): Unit = js.native
    def ffprobe(index: Double, callback: js.Function2[/* err */ Any, /* data */ FfprobeData, Unit]): Unit = js.native
    // tslint:disable-line unified-signatures
    def ffprobe(
      index: Double,
      options: js.Array[String],
      callback: js.Function2[/* err */ Any, /* data */ FfprobeData, Unit]
    ): Unit = js.native
    def ffprobe(options: js.Array[String], callback: js.Function2[/* err */ Any, /* data */ FfprobeData, Unit]): Unit = js.native
    
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
    def pipe(stream: Unit, options: End): Writable | PassThrough = js.native
    def pipe(stream: Writable): Writable | PassThrough = js.native
    def pipe(stream: Writable, options: End): Writable | PassThrough = js.native
    
    def preset(preset: String): FfmpegCommand = js.native
    def preset(preset: PresetFunction): FfmpegCommand = js.native
    
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
    def usingPreset(preset: String): FfmpegCommand = js.native
    def usingPreset(preset: PresetFunction): FfmpegCommand = js.native
    
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
    def withAutoPad(pad: Unit, color: String): FfmpegCommand = js.native
    
    def withAutoPadding(): FfmpegCommand = js.native
    def withAutoPadding(pad: Boolean): FfmpegCommand = js.native
    def withAutoPadding(pad: Boolean, color: String): FfmpegCommand = js.native
    def withAutoPadding(pad: Unit, color: String): FfmpegCommand = js.native
    
    def withAutopad(): FfmpegCommand = js.native
    def withAutopad(pad: Boolean): FfmpegCommand = js.native
    def withAutopad(pad: Boolean, color: String): FfmpegCommand = js.native
    def withAutopad(pad: Unit, color: String): FfmpegCommand = js.native
    
    def withAutopadding(): FfmpegCommand = js.native
    def withAutopadding(pad: Boolean): FfmpegCommand = js.native
    def withAutopadding(pad: Boolean, color: String): FfmpegCommand = js.native
    def withAutopadding(pad: Unit, color: String): FfmpegCommand = js.native
    
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
  
  inline def availableCodecs(callback: CodecsCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("availableCodecs")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def availableEncoders(callback: EncodersCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("availableEncoders")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def availableFilters(callback: FiltersCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("availableFilters")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def availableFormats(callback: FormatsCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("availableFormats")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def ffprobe(file: String, callback: js.Function2[/* err */ Any, /* data */ FfprobeData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ffprobe")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ffprobe(file: String, index: Double, callback: js.Function2[/* err */ Any, /* data */ FfprobeData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ffprobe")(file.asInstanceOf[js.Any], index.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  // tslint:disable-line unified-signatures
  inline def ffprobe(
    file: String,
    index: Double,
    options: js.Array[String],
    callback: js.Function2[/* err */ Any, /* data */ FfprobeData, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ffprobe")(file.asInstanceOf[js.Any], index.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def ffprobe(
    file: String,
    options: js.Array[String],
    callback: js.Function2[/* err */ Any, /* data */ FfprobeData, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ffprobe")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getAvailableCodecs(callback: CodecsCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableCodecs")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getAvailableEncoders(callback: EncodersCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableEncoders")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getAvailableFilters(callback: FiltersCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableFilters")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getAvailableFormats(callback: FormatsCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableFormats")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  // static methods
  inline def setFfmpegPath(path: String): FfmpegCommand = ^.asInstanceOf[js.Dynamic].applyDynamic("setFfmpegPath")(path.asInstanceOf[js.Any]).asInstanceOf[FfmpegCommand]
  
  inline def setFfprobePath(path: String): FfmpegCommand = ^.asInstanceOf[js.Dynamic].applyDynamic("setFfprobePath")(path.asInstanceOf[js.Any]).asInstanceOf[FfmpegCommand]
  
  inline def setFlvtoolPath(path: String): FfmpegCommand = ^.asInstanceOf[js.Dynamic].applyDynamic("setFlvtoolPath")(path.asInstanceOf[js.Any]).asInstanceOf[FfmpegCommand]
  
  trait AudioVideoFilter extends StObject {
    
    var filter: String
    
    var options: String | js.Array[String] | js.Object
  }
  object AudioVideoFilter {
    
    inline def apply(filter: String, options: String | js.Array[String] | js.Object): AudioVideoFilter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AudioVideoFilter]
    }
    
    extension [Self <: AudioVideoFilter](x: Self) {
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: String | js.Array[String] | js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  trait Codec extends StObject {
    
    var canDecode: Boolean
    
    var canEncode: Boolean
    
    var description: String
    
    var directRendering: js.UndefOr[Boolean] = js.undefined
    
    var drawHorizBand: js.UndefOr[Boolean] = js.undefined
    
    var intraFrameOnly: js.UndefOr[Boolean] = js.undefined
    
    var isLossless: js.UndefOr[Boolean] = js.undefined
    
    var isLossy: js.UndefOr[Boolean] = js.undefined
    
    var `type`: String
    
    var weirdFrameTruncation: js.UndefOr[Boolean] = js.undefined
  }
  object Codec {
    
    inline def apply(canDecode: Boolean, canEncode: Boolean, description: String, `type`: String): Codec = {
      val __obj = js.Dynamic.literal(canDecode = canDecode.asInstanceOf[js.Any], canEncode = canEncode.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Codec]
    }
    
    extension [Self <: Codec](x: Self) {
      
      inline def setCanDecode(value: Boolean): Self = StObject.set(x, "canDecode", value.asInstanceOf[js.Any])
      
      inline def setCanEncode(value: Boolean): Self = StObject.set(x, "canEncode", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDirectRendering(value: Boolean): Self = StObject.set(x, "directRendering", value.asInstanceOf[js.Any])
      
      inline def setDirectRenderingUndefined: Self = StObject.set(x, "directRendering", js.undefined)
      
      inline def setDrawHorizBand(value: Boolean): Self = StObject.set(x, "drawHorizBand", value.asInstanceOf[js.Any])
      
      inline def setDrawHorizBandUndefined: Self = StObject.set(x, "drawHorizBand", js.undefined)
      
      inline def setIntraFrameOnly(value: Boolean): Self = StObject.set(x, "intraFrameOnly", value.asInstanceOf[js.Any])
      
      inline def setIntraFrameOnlyUndefined: Self = StObject.set(x, "intraFrameOnly", js.undefined)
      
      inline def setIsLossless(value: Boolean): Self = StObject.set(x, "isLossless", value.asInstanceOf[js.Any])
      
      inline def setIsLosslessUndefined: Self = StObject.set(x, "isLossless", js.undefined)
      
      inline def setIsLossy(value: Boolean): Self = StObject.set(x, "isLossy", value.asInstanceOf[js.Any])
      
      inline def setIsLossyUndefined: Self = StObject.set(x, "isLossy", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWeirdFrameTruncation(value: Boolean): Self = StObject.set(x, "weirdFrameTruncation", value.asInstanceOf[js.Any])
      
      inline def setWeirdFrameTruncationUndefined: Self = StObject.set(x, "weirdFrameTruncation", js.undefined)
    }
  }
  
  type Codecs = StringDictionary[Codec]
  
  type CodecsCallback = js.Function2[/* err */ js.Error, /* codecs */ Codecs, Unit]
  
  trait Encoder extends StObject {
    
    var description: String
    
    var directRendering: Boolean
    
    var drawHorizBand: Boolean
    
    var experimental: Boolean
    
    var frameMT: Boolean
    
    var sliceMT: Boolean
    
    var `type`: String
  }
  object Encoder {
    
    inline def apply(
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
    
    extension [Self <: Encoder](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDirectRendering(value: Boolean): Self = StObject.set(x, "directRendering", value.asInstanceOf[js.Any])
      
      inline def setDrawHorizBand(value: Boolean): Self = StObject.set(x, "drawHorizBand", value.asInstanceOf[js.Any])
      
      inline def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
      
      inline def setFrameMT(value: Boolean): Self = StObject.set(x, "frameMT", value.asInstanceOf[js.Any])
      
      inline def setSliceMT(value: Boolean): Self = StObject.set(x, "sliceMT", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Encoders = StringDictionary[Encoder]
  
  type EncodersCallback = js.Function2[/* err */ js.Error, /* encoders */ Encoders, Unit]
  
  trait FfmpegCommandLogger extends StObject {
    
    def debug(data: Any*): Unit
    
    def error(data: Any*): Unit
    
    def info(data: Any*): Unit
    
    def warn(data: Any*): Unit
  }
  object FfmpegCommandLogger {
    
    inline def apply(
      debug: /* repeated */ Any => Unit,
      error: /* repeated */ Any => Unit,
      info: /* repeated */ Any => Unit,
      warn: /* repeated */ Any => Unit
    ): FfmpegCommandLogger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[FfmpegCommandLogger]
    }
    
    extension [Self <: FfmpegCommandLogger](x: Self) {
      
      inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  trait FfmpegCommandOptions extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var logger: js.UndefOr[FfmpegCommandLogger] = js.undefined
    
    var niceness: js.UndefOr[Double] = js.undefined
    
    var preset: js.UndefOr[String] = js.undefined
    
    var presets: js.UndefOr[String] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var source: js.UndefOr[String | Readable] = js.undefined
    
    var stdoutLines: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object FfmpegCommandOptions {
    
    inline def apply(): FfmpegCommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FfmpegCommandOptions]
    }
    
    extension [Self <: FfmpegCommandOptions](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setLogger(value: FfmpegCommandLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setNiceness(value: Double): Self = StObject.set(x, "niceness", value.asInstanceOf[js.Any])
      
      inline def setNicenessUndefined: Self = StObject.set(x, "niceness", js.undefined)
      
      inline def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      inline def setPresets(value: String): Self = StObject.set(x, "presets", value.asInstanceOf[js.Any])
      
      inline def setPresetsUndefined: Self = StObject.set(x, "presets", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setSource(value: String | Readable): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setStdoutLines(value: Double): Self = StObject.set(x, "stdoutLines", value.asInstanceOf[js.Any])
      
      inline def setStdoutLinesUndefined: Self = StObject.set(x, "stdoutLines", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait FfprobeData extends StObject {
    
    var chapters: js.Array[Any]
    
    var format: FfprobeFormat
    
    var streams: js.Array[FfprobeStream]
  }
  object FfprobeData {
    
    inline def apply(chapters: js.Array[Any], format: FfprobeFormat, streams: js.Array[FfprobeStream]): FfprobeData = {
      val __obj = js.Dynamic.literal(chapters = chapters.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any])
      __obj.asInstanceOf[FfprobeData]
    }
    
    extension [Self <: FfprobeData](x: Self) {
      
      inline def setChapters(value: js.Array[Any]): Self = StObject.set(x, "chapters", value.asInstanceOf[js.Any])
      
      inline def setChaptersVarargs(value: Any*): Self = StObject.set(x, "chapters", js.Array(value*))
      
      inline def setFormat(value: FfprobeFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setStreams(value: js.Array[FfprobeStream]): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      inline def setStreamsVarargs(value: FfprobeStream*): Self = StObject.set(x, "streams", js.Array(value*))
    }
  }
  
  trait FfprobeFormat
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var bit_rate: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var format_long_name: js.UndefOr[String] = js.undefined
    
    var format_name: js.UndefOr[String] = js.undefined
    
    var nb_programs: js.UndefOr[Double] = js.undefined
    
    var nb_streams: js.UndefOr[Double] = js.undefined
    
    var probe_score: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var start_time: js.UndefOr[Double] = js.undefined
    
    var tags: js.UndefOr[Record[String, String | Double]] = js.undefined
  }
  object FfprobeFormat {
    
    inline def apply(): FfprobeFormat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FfprobeFormat]
    }
    
    extension [Self <: FfprobeFormat](x: Self) {
      
      inline def setBit_rate(value: Double): Self = StObject.set(x, "bit_rate", value.asInstanceOf[js.Any])
      
      inline def setBit_rateUndefined: Self = StObject.set(x, "bit_rate", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFormat_long_name(value: String): Self = StObject.set(x, "format_long_name", value.asInstanceOf[js.Any])
      
      inline def setFormat_long_nameUndefined: Self = StObject.set(x, "format_long_name", js.undefined)
      
      inline def setFormat_name(value: String): Self = StObject.set(x, "format_name", value.asInstanceOf[js.Any])
      
      inline def setFormat_nameUndefined: Self = StObject.set(x, "format_name", js.undefined)
      
      inline def setNb_programs(value: Double): Self = StObject.set(x, "nb_programs", value.asInstanceOf[js.Any])
      
      inline def setNb_programsUndefined: Self = StObject.set(x, "nb_programs", js.undefined)
      
      inline def setNb_streams(value: Double): Self = StObject.set(x, "nb_streams", value.asInstanceOf[js.Any])
      
      inline def setNb_streamsUndefined: Self = StObject.set(x, "nb_streams", js.undefined)
      
      inline def setProbe_score(value: Double): Self = StObject.set(x, "probe_score", value.asInstanceOf[js.Any])
      
      inline def setProbe_scoreUndefined: Self = StObject.set(x, "probe_score", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStart_time(value: Double): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
      
      inline def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
      
      inline def setTags(value: Record[String, String | Double]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait FfprobeStream
    extends StObject
       with /* key */ StringDictionary[Any] {
    
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
    
    var rotation: js.UndefOr[String | Double] = js.undefined
    
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
    
    inline def apply(index: Double): FfprobeStream = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[FfprobeStream]
    }
    
    extension [Self <: FfprobeStream](x: Self) {
      
      inline def setAvg_frame_rate(value: String): Self = StObject.set(x, "avg_frame_rate", value.asInstanceOf[js.Any])
      
      inline def setAvg_frame_rateUndefined: Self = StObject.set(x, "avg_frame_rate", js.undefined)
      
      inline def setBit_rate(value: String): Self = StObject.set(x, "bit_rate", value.asInstanceOf[js.Any])
      
      inline def setBit_rateUndefined: Self = StObject.set(x, "bit_rate", js.undefined)
      
      inline def setBits_per_raw_sample(value: String): Self = StObject.set(x, "bits_per_raw_sample", value.asInstanceOf[js.Any])
      
      inline def setBits_per_raw_sampleUndefined: Self = StObject.set(x, "bits_per_raw_sample", js.undefined)
      
      inline def setBits_per_sample(value: Double): Self = StObject.set(x, "bits_per_sample", value.asInstanceOf[js.Any])
      
      inline def setBits_per_sampleUndefined: Self = StObject.set(x, "bits_per_sample", js.undefined)
      
      inline def setChannel_layout(value: String): Self = StObject.set(x, "channel_layout", value.asInstanceOf[js.Any])
      
      inline def setChannel_layoutUndefined: Self = StObject.set(x, "channel_layout", js.undefined)
      
      inline def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      inline def setChroma_location(value: String): Self = StObject.set(x, "chroma_location", value.asInstanceOf[js.Any])
      
      inline def setChroma_locationUndefined: Self = StObject.set(x, "chroma_location", js.undefined)
      
      inline def setCodec_long_name(value: String): Self = StObject.set(x, "codec_long_name", value.asInstanceOf[js.Any])
      
      inline def setCodec_long_nameUndefined: Self = StObject.set(x, "codec_long_name", js.undefined)
      
      inline def setCodec_name(value: String): Self = StObject.set(x, "codec_name", value.asInstanceOf[js.Any])
      
      inline def setCodec_nameUndefined: Self = StObject.set(x, "codec_name", js.undefined)
      
      inline def setCodec_tag(value: String): Self = StObject.set(x, "codec_tag", value.asInstanceOf[js.Any])
      
      inline def setCodec_tagUndefined: Self = StObject.set(x, "codec_tag", js.undefined)
      
      inline def setCodec_tag_string(value: String): Self = StObject.set(x, "codec_tag_string", value.asInstanceOf[js.Any])
      
      inline def setCodec_tag_stringUndefined: Self = StObject.set(x, "codec_tag_string", js.undefined)
      
      inline def setCodec_time_base(value: String): Self = StObject.set(x, "codec_time_base", value.asInstanceOf[js.Any])
      
      inline def setCodec_time_baseUndefined: Self = StObject.set(x, "codec_time_base", js.undefined)
      
      inline def setCodec_type(value: String): Self = StObject.set(x, "codec_type", value.asInstanceOf[js.Any])
      
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
      
      inline def setDisposition(value: FfprobeStreamDisposition): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
      
      inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setDuration_ts(value: String): Self = StObject.set(x, "duration_ts", value.asInstanceOf[js.Any])
      
      inline def setDuration_tsUndefined: Self = StObject.set(x, "duration_ts", js.undefined)
      
      inline def setField_order(value: String): Self = StObject.set(x, "field_order", value.asInstanceOf[js.Any])
      
      inline def setField_orderUndefined: Self = StObject.set(x, "field_order", js.undefined)
      
      inline def setHas_b_frames(value: Double): Self = StObject.set(x, "has_b_frames", value.asInstanceOf[js.Any])
      
      inline def setHas_b_framesUndefined: Self = StObject.set(x, "has_b_frames", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMax_bit_rate(value: String): Self = StObject.set(x, "max_bit_rate", value.asInstanceOf[js.Any])
      
      inline def setMax_bit_rateUndefined: Self = StObject.set(x, "max_bit_rate", js.undefined)
      
      inline def setNb_frames(value: String): Self = StObject.set(x, "nb_frames", value.asInstanceOf[js.Any])
      
      inline def setNb_framesUndefined: Self = StObject.set(x, "nb_frames", js.undefined)
      
      inline def setNb_read_frames(value: String): Self = StObject.set(x, "nb_read_frames", value.asInstanceOf[js.Any])
      
      inline def setNb_read_framesUndefined: Self = StObject.set(x, "nb_read_frames", js.undefined)
      
      inline def setNb_read_packets(value: String): Self = StObject.set(x, "nb_read_packets", value.asInstanceOf[js.Any])
      
      inline def setNb_read_packetsUndefined: Self = StObject.set(x, "nb_read_packets", js.undefined)
      
      inline def setPix_fmt(value: String): Self = StObject.set(x, "pix_fmt", value.asInstanceOf[js.Any])
      
      inline def setPix_fmtUndefined: Self = StObject.set(x, "pix_fmt", js.undefined)
      
      inline def setProfile(value: Double): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setR_frame_rate(value: String): Self = StObject.set(x, "r_frame_rate", value.asInstanceOf[js.Any])
      
      inline def setR_frame_rateUndefined: Self = StObject.set(x, "r_frame_rate", js.undefined)
      
      inline def setRefs(value: Double): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
      
      inline def setRefsUndefined: Self = StObject.set(x, "refs", js.undefined)
      
      inline def setRotation(value: String | Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
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
      
      inline def setTime_base(value: String): Self = StObject.set(x, "time_base", value.asInstanceOf[js.Any])
      
      inline def setTime_baseUndefined: Self = StObject.set(x, "time_base", js.undefined)
      
      inline def setTimecode(value: String): Self = StObject.set(x, "timecode", value.asInstanceOf[js.Any])
      
      inline def setTimecodeUndefined: Self = StObject.set(x, "timecode", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait FfprobeStreamDisposition
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var default: js.UndefOr[Double] = js.undefined
    
    var attached_pic: js.UndefOr[Double] = js.undefined
    
    var clean_effects: js.UndefOr[Double] = js.undefined
    
    var comment: js.UndefOr[Double] = js.undefined
    
    var dub: js.UndefOr[Double] = js.undefined
    
    var forced: js.UndefOr[Double] = js.undefined
    
    var hearing_impaired: js.UndefOr[Double] = js.undefined
    
    var karaoke: js.UndefOr[Double] = js.undefined
    
    var lyrics: js.UndefOr[Double] = js.undefined
    
    var original: js.UndefOr[Double] = js.undefined
    
    var timed_thumbnails: js.UndefOr[Double] = js.undefined
    
    var visual_impaired: js.UndefOr[Double] = js.undefined
  }
  object FfprobeStreamDisposition {
    
    inline def apply(): FfprobeStreamDisposition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FfprobeStreamDisposition]
    }
    
    extension [Self <: FfprobeStreamDisposition](x: Self) {
      
      inline def setAttached_pic(value: Double): Self = StObject.set(x, "attached_pic", value.asInstanceOf[js.Any])
      
      inline def setAttached_picUndefined: Self = StObject.set(x, "attached_pic", js.undefined)
      
      inline def setClean_effects(value: Double): Self = StObject.set(x, "clean_effects", value.asInstanceOf[js.Any])
      
      inline def setClean_effectsUndefined: Self = StObject.set(x, "clean_effects", js.undefined)
      
      inline def setComment(value: Double): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDub(value: Double): Self = StObject.set(x, "dub", value.asInstanceOf[js.Any])
      
      inline def setDubUndefined: Self = StObject.set(x, "dub", js.undefined)
      
      inline def setForced(value: Double): Self = StObject.set(x, "forced", value.asInstanceOf[js.Any])
      
      inline def setForcedUndefined: Self = StObject.set(x, "forced", js.undefined)
      
      inline def setHearing_impaired(value: Double): Self = StObject.set(x, "hearing_impaired", value.asInstanceOf[js.Any])
      
      inline def setHearing_impairedUndefined: Self = StObject.set(x, "hearing_impaired", js.undefined)
      
      inline def setKaraoke(value: Double): Self = StObject.set(x, "karaoke", value.asInstanceOf[js.Any])
      
      inline def setKaraokeUndefined: Self = StObject.set(x, "karaoke", js.undefined)
      
      inline def setLyrics(value: Double): Self = StObject.set(x, "lyrics", value.asInstanceOf[js.Any])
      
      inline def setLyricsUndefined: Self = StObject.set(x, "lyrics", js.undefined)
      
      inline def setOriginal(value: Double): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
      
      inline def setTimed_thumbnails(value: Double): Self = StObject.set(x, "timed_thumbnails", value.asInstanceOf[js.Any])
      
      inline def setTimed_thumbnailsUndefined: Self = StObject.set(x, "timed_thumbnails", js.undefined)
      
      inline def setVisual_impaired(value: Double): Self = StObject.set(x, "visual_impaired", value.asInstanceOf[js.Any])
      
      inline def setVisual_impairedUndefined: Self = StObject.set(x, "visual_impaired", js.undefined)
    }
  }
  
  trait Filter extends StObject {
    
    var description: String
    
    var input: String
    
    var multipleInputs: Boolean
    
    var multipleOutputs: Boolean
    
    var output: String
  }
  object Filter {
    
    inline def apply(
      description: String,
      input: String,
      multipleInputs: Boolean,
      multipleOutputs: Boolean,
      output: String
    ): Filter = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], multipleInputs = multipleInputs.asInstanceOf[js.Any], multipleOutputs = multipleOutputs.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    extension [Self <: Filter](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setMultipleInputs(value: Boolean): Self = StObject.set(x, "multipleInputs", value.asInstanceOf[js.Any])
      
      inline def setMultipleOutputs(value: Boolean): Self = StObject.set(x, "multipleOutputs", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait FilterSpecification extends StObject {
    
    var filter: String
    
    var inputs: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var options: js.UndefOr[Any | String | js.Array[Any]] = js.undefined
    
    var outputs: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object FilterSpecification {
    
    inline def apply(filter: String): FilterSpecification = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterSpecification]
    }
    
    extension [Self <: FilterSpecification](x: Self) {
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setInputs(value: String | js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      inline def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setOptions(value: Any | String | js.Array[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: Any*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setOutputs(value: String | js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      inline def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value*))
    }
  }
  
  type Filters = StringDictionary[Filter]
  
  type FiltersCallback = js.Function2[/* err */ js.Error, /* filters */ Filters, Unit]
  
  trait Format extends StObject {
    
    var canDemux: Boolean
    
    var canMux: Boolean
    
    var description: String
  }
  object Format {
    
    inline def apply(canDemux: Boolean, canMux: Boolean, description: String): Format = {
      val __obj = js.Dynamic.literal(canDemux = canDemux.asInstanceOf[js.Any], canMux = canMux.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setCanDemux(value: Boolean): Self = StObject.set(x, "canDemux", value.asInstanceOf[js.Any])
      
      inline def setCanMux(value: Boolean): Self = StObject.set(x, "canMux", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  type Formats = StringDictionary[Format]
  
  type FormatsCallback = js.Function2[/* err */ js.Error, /* formats */ Formats, Unit]
  
  type PresetFunction = js.Function1[/* command */ FfmpegCommand, Unit]
  
  trait ScreenshotsConfig extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var fastSeek: js.UndefOr[Boolean] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var folder: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var timemarks: js.UndefOr[js.Array[Double | String]] = js.undefined
    
    var timestamps: js.UndefOr[js.Array[Double | String]] = js.undefined
  }
  object ScreenshotsConfig {
    
    inline def apply(): ScreenshotsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScreenshotsConfig]
    }
    
    extension [Self <: ScreenshotsConfig](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setFastSeek(value: Boolean): Self = StObject.set(x, "fastSeek", value.asInstanceOf[js.Any])
      
      inline def setFastSeekUndefined: Self = StObject.set(x, "fastSeek", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTimemarks(value: js.Array[Double | String]): Self = StObject.set(x, "timemarks", value.asInstanceOf[js.Any])
      
      inline def setTimemarksUndefined: Self = StObject.set(x, "timemarks", js.undefined)
      
      inline def setTimemarksVarargs(value: (Double | String)*): Self = StObject.set(x, "timemarks", js.Array(value*))
      
      inline def setTimestamps(value: js.Array[Double | String]): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
      
      inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
      
      inline def setTimestampsVarargs(value: (Double | String)*): Self = StObject.set(x, "timestamps", js.Array(value*))
    }
  }
}
