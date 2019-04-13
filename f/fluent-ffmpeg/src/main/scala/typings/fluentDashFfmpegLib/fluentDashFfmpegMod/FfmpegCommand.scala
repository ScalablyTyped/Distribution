package typings
package fluentDashFfmpegLib.fluentDashFfmpegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluent-ffmpeg", "FfmpegCommand")
@js.native
class FfmpegCommand ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(input: java.lang.String) = this()
  def this(input: nodeLib.streamMod.Readable) = this()
  def this(options: FfmpegCommandOptions) = this()
  def this(input: java.lang.String, options: FfmpegCommandOptions) = this()
  def this(input: nodeLib.streamMod.Readable, options: FfmpegCommandOptions) = this()
  def FPS(fps: scala.Double): FfmpegCommand = js.native
  def FPSInput(fps: scala.Double): FfmpegCommand = js.native
  def FPSOutput(fps: scala.Double): FfmpegCommand = js.native
  def addInput(source: java.lang.String): FfmpegCommand = js.native
  def addInput(source: nodeLib.streamMod.Readable): FfmpegCommand = js.native
  def addInputOption(options: java.lang.String*): FfmpegCommand = js.native
  // options/custom
  def addInputOption(options: js.Array[java.lang.String]): FfmpegCommand = js.native
  def addInputOptions(options: java.lang.String*): FfmpegCommand = js.native
  def addInputOptions(options: js.Array[java.lang.String]): FfmpegCommand = js.native
  def addOption(options: java.lang.String*): FfmpegCommand = js.native
  def addOption(options: js.Array[java.lang.String]): FfmpegCommand = js.native
  def addOptions(options: java.lang.String*): FfmpegCommand = js.native
  def addOptions(options: js.Array[java.lang.String]): FfmpegCommand = js.native
  // options/output
  def addOutput(target: java.lang.String): FfmpegCommand = js.native
  def addOutput(target: java.lang.String, pipeopts: fluentDashFfmpegLib.Anon_End): FfmpegCommand = js.native
  def addOutput(target: nodeLib.streamMod.Writable): FfmpegCommand = js.native
  def addOutput(target: nodeLib.streamMod.Writable, pipeopts: fluentDashFfmpegLib.Anon_End): FfmpegCommand = js.native
  def addOutputOption(options: java.lang.String*): FfmpegCommand = js.native
  def addOutputOption(options: js.Array[java.lang.String]): FfmpegCommand = js.native
  def addOutputOptions(options: java.lang.String*): FfmpegCommand = js.native
  def addOutputOptions(options: js.Array[java.lang.String]): FfmpegCommand = js.native
  def applyAutoPad(pad: scala.Boolean, color: java.lang.String): FfmpegCommand = js.native
  def applyAutoPadding(pad: scala.Boolean, color: java.lang.String): FfmpegCommand = js.native
  def applyAutopad(pad: scala.Boolean, color: java.lang.String): FfmpegCommand = js.native
  def applyAutopadding(pad: scala.Boolean, color: java.lang.String): FfmpegCommand = js.native
  def aspect(aspect: java.lang.String): FfmpegCommand = js.native
  def aspect(aspect: scala.Double): FfmpegCommand = js.native
  def aspectRatio(aspect: java.lang.String): FfmpegCommand = js.native
  def aspectRatio(aspect: scala.Double): FfmpegCommand = js.native
  def audioBitrate(bitrate: java.lang.String): FfmpegCommand = js.native
  def audioBitrate(bitrate: scala.Double): FfmpegCommand = js.native
  def audioChannels(channels: scala.Double): FfmpegCommand = js.native
  def audioCodec(codec: java.lang.String): FfmpegCommand = js.native
  def audioFilter(filters: java.lang.String): FfmpegCommand = js.native
  def audioFilter(filters: js.Array[AudioVideoFilter | java.lang.String]): FfmpegCommand = js.native
  def audioFilters(filters: java.lang.String): FfmpegCommand = js.native
  def audioFilters(filters: js.Array[AudioVideoFilter | java.lang.String]): FfmpegCommand = js.native
  def audioFrequency(freq: scala.Double): FfmpegCommand = js.native
  def audioQuality(quality: scala.Double): FfmpegCommand = js.native
  def autoPad(pad: scala.Boolean, color: java.lang.String): FfmpegCommand = js.native
  def autopad(pad: scala.Boolean, color: java.lang.String): FfmpegCommand = js.native
  def availableCodecs(callback: CodecsCallback): scala.Unit = js.native
  def availableEncoders(callback: EncodersCallback): scala.Unit = js.native
  def availableFilters(callback: FiltersCallback): scala.Unit = js.native
  def availableFormats(callback: FormatsCallback): scala.Unit = js.native
  def complexFilter(spec: java.lang.String, map: js.Array[java.lang.String]): FfmpegCommand = js.native
  def complexFilter(spec: js.Array[FilterSpecification], map: js.Array[java.lang.String]): FfmpegCommand = js.native
  def concat(target: java.lang.String): FfmpegCommand = js.native
  def concat(target: java.lang.String, options: fluentDashFfmpegLib.Anon_End): FfmpegCommand = js.native
  def concat(target: nodeLib.streamMod.Writable): FfmpegCommand = js.native
  def concat(target: nodeLib.streamMod.Writable, options: fluentDashFfmpegLib.Anon_End): FfmpegCommand = js.native
  def concatenate(target: java.lang.String): FfmpegCommand = js.native
  def concatenate(target: java.lang.String, options: fluentDashFfmpegLib.Anon_End): FfmpegCommand = js.native
  def concatenate(target: nodeLib.streamMod.Writable): FfmpegCommand = js.native
  def concatenate(target: nodeLib.streamMod.Writable, options: fluentDashFfmpegLib.Anon_End): FfmpegCommand = js.native
  def duration(duration: java.lang.String): FfmpegCommand = js.native
  def duration(duration: scala.Double): FfmpegCommand = js.native
  // ffprobe
  def ffprobe(callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, scala.Unit]): scala.Unit = js.native
  def ffprobe(index: scala.Double, callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, scala.Unit]): scala.Unit = js.native
   // tslint:disable-line unified-signatures
  def ffprobe(
    index: scala.Double,
    options: js.Array[java.lang.String],
    callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, scala.Unit]
  ): scala.Unit = js.native
  def ffprobe(
    options: js.Array[java.lang.String],
    callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, scala.Unit]
  ): scala.Unit = js.native
  def filterGraph(spec: java.lang.String, map: js.Array[java.lang.String]): FfmpegCommand = js.native
  def filterGraph(spec: js.Array[FilterSpecification], map: js.Array[java.lang.String]): FfmpegCommand = js.native
  def flvmeta(): FfmpegCommand = js.native
  def format(format: java.lang.String): FfmpegCommand = js.native
  def fps(fps: scala.Double): FfmpegCommand = js.native
  def fpsInput(fps: scala.Double): FfmpegCommand = js.native
  def fpsOutput(fps: scala.Double): FfmpegCommand = js.native
  def frames(frames: scala.Double): FfmpegCommand = js.native
  def fromFormat(format: java.lang.String): FfmpegCommand = js.native
  def getAvailableCodecs(callback: CodecsCallback): scala.Unit = js.native
  def getAvailableEncoders(callback: EncodersCallback): scala.Unit = js.native
  def getAvailableFilters(callback: FiltersCallback): scala.Unit = js.native
  def getAvailableFormats(callback: FormatsCallback): scala.Unit = js.native
  def input(source: java.lang.String): FfmpegCommand = js.native
  def input(source: nodeLib.streamMod.Readable): FfmpegCommand = js.native
  def inputFPS(fps: scala.Double): FfmpegCommand = js.native
  def inputFormat(format: java.lang.String): FfmpegCommand = js.native
  def inputFps(fps: scala.Double): FfmpegCommand = js.native
  def inputOption(options: java.lang.String*): FfmpegCommand = js.native
  def inputOption(options: js.Array[java.lang.String]): FfmpegCommand = js.native
  def inputOptions(options: java.lang.String*): FfmpegCommand = js.native
  def inputOptions(options: js.Array[java.lang.String]): FfmpegCommand = js.native
  def keepDAR(): FfmpegCommand = js.native
  def keepDisplayAspect(): FfmpegCommand = js.native
  def keepDisplayAspectRatio(): FfmpegCommand = js.native
  // options/videosize
  def keepPixelAspect(): FfmpegCommand = js.native
  def kill(signal: java.lang.String): FfmpegCommand = js.native
  def loop(duration: java.lang.String): FfmpegCommand = js.native
  def loop(duration: scala.Double): FfmpegCommand = js.native
  def map(spec: java.lang.String): FfmpegCommand = js.native
  // options/inputs
  def mergeAdd(source: java.lang.String): FfmpegCommand = js.native
  def mergeAdd(source: nodeLib.streamMod.Readable): FfmpegCommand = js.native
  def mergeToFile(target: java.lang.String): FfmpegCommand = js.native
  def mergeToFile(target: java.lang.String, options: fluentDashFfmpegLib.Anon_End): FfmpegCommand = js.native
  def mergeToFile(target: nodeLib.streamMod.Writable): FfmpegCommand = js.native
  def mergeToFile(target: nodeLib.streamMod.Writable, options: fluentDashFfmpegLib.Anon_End): FfmpegCommand = js.native
  def native(): FfmpegCommand = js.native
  def nativeFramerate(): FfmpegCommand = js.native
  def noAudio(): FfmpegCommand = js.native
  def noVideo(): FfmpegCommand = js.native
  def output(target: java.lang.String): FfmpegCommand = js.native
  def output(target: java.lang.String, pipeopts: fluentDashFfmpegLib.Anon_End): FfmpegCommand = js.native
  def output(target: nodeLib.streamMod.Writable): FfmpegCommand = js.native
  def output(target: nodeLib.streamMod.Writable, pipeopts: fluentDashFfmpegLib.Anon_End): FfmpegCommand = js.native
  def outputFPS(fps: scala.Double): FfmpegCommand = js.native
  def outputFormat(format: java.lang.String): FfmpegCommand = js.native
  def outputFps(fps: scala.Double): FfmpegCommand = js.native
  def outputOption(options: java.lang.String*): FfmpegCommand = js.native
  def outputOption(options: js.Array[java.lang.String]): FfmpegCommand = js.native
  def outputOptions(options: java.lang.String*): FfmpegCommand = js.native
  def outputOptions(options: js.Array[java.lang.String]): FfmpegCommand = js.native
  def pipe(): nodeLib.streamMod.Writable | nodeLib.streamMod.PassThrough = js.native
  def pipe(stream: nodeLib.streamMod.Writable): nodeLib.streamMod.Writable | nodeLib.streamMod.PassThrough = js.native
  def pipe(stream: nodeLib.streamMod.Writable, options: fluentDashFfmpegLib.Anon_End): nodeLib.streamMod.Writable | nodeLib.streamMod.PassThrough = js.native
  def pnreset(proset: GetPreset): FfmpegCommand = js.native
  def pnreset(proset: java.lang.String): FfmpegCommand = js.native
  def preset(format: java.lang.String): FfmpegCommand = js.native
  // processor
  def renice(niceness: scala.Double): FfmpegCommand = js.native
  def run(): scala.Unit = js.native
  def save(output: java.lang.String): FfmpegCommand = js.native
  // recipes
  def saveToFile(output: java.lang.String): FfmpegCommand = js.native
  def screenshot(config: ScreenshotsConfig): FfmpegCommand = js.native
  def screenshot(config: ScreenshotsConfig, folder: java.lang.String): FfmpegCommand = js.native
  def screenshot(config: scala.Double): FfmpegCommand = js.native
  def screenshot(config: scala.Double, folder: java.lang.String): FfmpegCommand = js.native
  def screenshots(config: ScreenshotsConfig): FfmpegCommand = js.native
  def screenshots(config: ScreenshotsConfig, folder: java.lang.String): FfmpegCommand = js.native
  def screenshots(config: scala.Double): FfmpegCommand = js.native
  def screenshots(config: scala.Double, folder: java.lang.String): FfmpegCommand = js.native
  def seek(seek: java.lang.String): FfmpegCommand = js.native
  def seek(seek: scala.Double): FfmpegCommand = js.native
  def seekInput(seek: java.lang.String): FfmpegCommand = js.native
  def seekInput(seek: scala.Double): FfmpegCommand = js.native
  def seekOutput(seek: java.lang.String): FfmpegCommand = js.native
  def seekOutput(seek: scala.Double): FfmpegCommand = js.native
  def setAspect(aspect: java.lang.String): FfmpegCommand = js.native
  def setAspect(aspect: scala.Double): FfmpegCommand = js.native
  def setAspectRatio(aspect: java.lang.String): FfmpegCommand = js.native
  def setAspectRatio(aspect: scala.Double): FfmpegCommand = js.native
  def setDuration(duration: java.lang.String): FfmpegCommand = js.native
  def setDuration(duration: scala.Double): FfmpegCommand = js.native
  // capabilities
  def setFfmpegPath(path: java.lang.String): FfmpegCommand = js.native
  def setFfprobePath(path: java.lang.String): FfmpegCommand = js.native
  def setFlvtoolPath(path: java.lang.String): FfmpegCommand = js.native
  def setSize(size: java.lang.String): FfmpegCommand = js.native
  def setStartTime(seek: java.lang.String): FfmpegCommand = js.native
  def setStartTime(seek: scala.Double): FfmpegCommand = js.native
  def size(size: java.lang.String): FfmpegCommand = js.native
  def stream(stream: nodeLib.streamMod.Writable): nodeLib.streamMod.Writable = js.native
  def stream(stream: nodeLib.streamMod.Writable, options: fluentDashFfmpegLib.Anon_End): nodeLib.streamMod.Writable = js.native
  def takeFrames(frames: scala.Double): FfmpegCommand = js.native
  def takeScreenshots(config: ScreenshotsConfig): FfmpegCommand = js.native
  def takeScreenshots(config: ScreenshotsConfig, folder: java.lang.String): FfmpegCommand = js.native
  def takeScreenshots(config: scala.Double): FfmpegCommand = js.native
  def takeScreenshots(config: scala.Double, folder: java.lang.String): FfmpegCommand = js.native
  def thumbnail(config: ScreenshotsConfig): FfmpegCommand = js.native
  def thumbnail(config: ScreenshotsConfig, folder: java.lang.String): FfmpegCommand = js.native
  def thumbnail(config: scala.Double): FfmpegCommand = js.native
  def thumbnail(config: scala.Double, folder: java.lang.String): FfmpegCommand = js.native
  def thumbnails(config: ScreenshotsConfig): FfmpegCommand = js.native
  def thumbnails(config: ScreenshotsConfig, folder: java.lang.String): FfmpegCommand = js.native
  def thumbnails(config: scala.Double): FfmpegCommand = js.native
  def thumbnails(config: scala.Double, folder: java.lang.String): FfmpegCommand = js.native
  def toFormat(format: java.lang.String): FfmpegCommand = js.native
  def updateFlvMetadata(): FfmpegCommand = js.native
  def usingPreset(proset: GetPreset): FfmpegCommand = js.native
  // options/misc
  def usingPreset(proset: java.lang.String): FfmpegCommand = js.native
  def videoBitrate(bitrate: java.lang.String): FfmpegCommand = js.native
  def videoBitrate(bitrate: scala.Double): FfmpegCommand = js.native
  def videoCodec(codec: java.lang.String): FfmpegCommand = js.native
  def videoFilter(filters: java.lang.String): FfmpegCommand = js.native
  def videoFilter(filters: js.Array[AudioVideoFilter | java.lang.String]): FfmpegCommand = js.native
  def videoFilters(filters: java.lang.String): FfmpegCommand = js.native
  def videoFilters(filters: js.Array[AudioVideoFilter | java.lang.String]): FfmpegCommand = js.native
  def withAspect(aspect: java.lang.String): FfmpegCommand = js.native
  def withAspect(aspect: scala.Double): FfmpegCommand = js.native
  def withAspectRatio(aspect: java.lang.String): FfmpegCommand = js.native
  def withAspectRatio(aspect: scala.Double): FfmpegCommand = js.native
  def withAudioBitrate(bitrate: java.lang.String): FfmpegCommand = js.native
  def withAudioBitrate(bitrate: scala.Double): FfmpegCommand = js.native
  def withAudioChannels(channels: scala.Double): FfmpegCommand = js.native
  def withAudioCodec(codec: java.lang.String): FfmpegCommand = js.native
  def withAudioFilter(filters: java.lang.String): FfmpegCommand = js.native
  def withAudioFilter(filters: js.Array[AudioVideoFilter | java.lang.String]): FfmpegCommand = js.native
  def withAudioFilters(filters: java.lang.String): FfmpegCommand = js.native
  def withAudioFilters(filters: js.Array[AudioVideoFilter | java.lang.String]): FfmpegCommand = js.native
  def withAudioFrequency(freq: scala.Double): FfmpegCommand = js.native
  def withAudioQuality(quality: scala.Double): FfmpegCommand = js.native
  def withAutoPad(pad: scala.Boolean, color: java.lang.String): FfmpegCommand = js.native
  def withAutoPadding(pad: scala.Boolean, color: java.lang.String): FfmpegCommand = js.native
  def withAutopad(pad: scala.Boolean, color: java.lang.String): FfmpegCommand = js.native
  def withAutopadding(pad: scala.Boolean, color: java.lang.String): FfmpegCommand = js.native
  def withDuration(duration: java.lang.String): FfmpegCommand = js.native
  def withDuration(duration: scala.Double): FfmpegCommand = js.native
  def withFPS(fps: scala.Double): FfmpegCommand = js.native
  def withFPSInput(fps: scala.Double): FfmpegCommand = js.native
  def withFPSOutput(fps: scala.Double): FfmpegCommand = js.native
  def withFps(fps: scala.Double): FfmpegCommand = js.native
  def withFpsInput(fps: scala.Double): FfmpegCommand = js.native
  def withFpsOutput(fps: scala.Double): FfmpegCommand = js.native
  def withFrames(frames: scala.Double): FfmpegCommand = js.native
  def withInputFPS(fps: scala.Double): FfmpegCommand = js.native
  def withInputFormat(format: java.lang.String): FfmpegCommand = js.native
  def withInputFps(fps: scala.Double): FfmpegCommand = js.native
  def withInputOption(options: java.lang.String*): FfmpegCommand = js.native
  def withInputOption(options: js.Array[java.lang.String]): FfmpegCommand = js.native
  def withInputOptions(options: java.lang.String*): FfmpegCommand = js.native
  def withInputOptions(options: js.Array[java.lang.String]): FfmpegCommand = js.native
  def withNativeFramerate(): FfmpegCommand = js.native
  // options/audio
  def withNoAudio(): FfmpegCommand = js.native
  // options/video;
  def withNoVideo(): FfmpegCommand = js.native
  def withOption(options: java.lang.String*): FfmpegCommand = js.native
  def withOption(options: js.Array[java.lang.String]): FfmpegCommand = js.native
  def withOptions(options: java.lang.String*): FfmpegCommand = js.native
  def withOptions(options: js.Array[java.lang.String]): FfmpegCommand = js.native
  def withOutputFPS(fps: scala.Double): FfmpegCommand = js.native
  def withOutputFormat(format: java.lang.String): FfmpegCommand = js.native
  def withOutputFps(fps: scala.Double): FfmpegCommand = js.native
  def withOutputOption(options: java.lang.String*): FfmpegCommand = js.native
  def withOutputOption(options: js.Array[java.lang.String]): FfmpegCommand = js.native
  def withOutputOptions(options: java.lang.String*): FfmpegCommand = js.native
  def withOutputOptions(options: js.Array[java.lang.String]): FfmpegCommand = js.native
  def withSize(size: java.lang.String): FfmpegCommand = js.native
  def withVideoBitrate(bitrate: java.lang.String): FfmpegCommand = js.native
  def withVideoBitrate(bitrate: scala.Double): FfmpegCommand = js.native
  def withVideoCodec(codec: java.lang.String): FfmpegCommand = js.native
  def withVideoFilter(filters: java.lang.String): FfmpegCommand = js.native
  def withVideoFilter(filters: js.Array[AudioVideoFilter | java.lang.String]): FfmpegCommand = js.native
  def withVideoFilters(filters: java.lang.String): FfmpegCommand = js.native
  def withVideoFilters(filters: js.Array[AudioVideoFilter | java.lang.String]): FfmpegCommand = js.native
  def writeToStream(stream: nodeLib.streamMod.Writable): nodeLib.streamMod.Writable = js.native
  def writeToStream(stream: nodeLib.streamMod.Writable, options: fluentDashFfmpegLib.Anon_End): nodeLib.streamMod.Writable = js.native
}

