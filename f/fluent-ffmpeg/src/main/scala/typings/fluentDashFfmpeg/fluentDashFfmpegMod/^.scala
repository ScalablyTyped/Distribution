package typings.fluentDashFfmpeg.fluentDashFfmpegMod

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluent-ffmpeg", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): FfmpegCommand = js.native
  def apply(input: String | Readable): FfmpegCommand = js.native
  def apply(input: String | Readable, options: FfmpegCommandOptions): FfmpegCommand = js.native
  def apply(options: FfmpegCommandOptions): FfmpegCommand = js.native
  def availableCodecs(callback: CodecsCallback): Unit = js.native
  def availableEncoders(callback: EncodersCallback): Unit = js.native
  def availableFilters(callback: FiltersCallback): Unit = js.native
  def availableFormats(callback: FormatsCallback): Unit = js.native
  def ffprobe(file: String, callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, Unit]): Unit = js.native
  def ffprobe(
    file: String,
    index: Double,
    callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, Unit]
  ): Unit = js.native
  def ffprobe(
    file: String,
    index: Double,
    options: js.Array[String],
    callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, Unit]
  ): Unit = js.native
  def ffprobe(
    file: String,
    options: js.Array[String],
    callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, Unit]
  ): Unit = js.native
  def getAvailableCodecs(callback: CodecsCallback): Unit = js.native
  def getAvailableEncoders(callback: EncodersCallback): Unit = js.native
  def getAvailableFilters(callback: FiltersCallback): Unit = js.native
  def getAvailableFormats(callback: FormatsCallback): Unit = js.native
  // static methods
  def setFfmpegPath(path: String): FfmpegCommand = js.native
  def setFfprobePath(path: String): FfmpegCommand = js.native
  def setFlvtoolPath(path: String): FfmpegCommand = js.native
}

