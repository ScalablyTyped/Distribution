package typings
package fluentDashFfmpegLib.fluentDashFfmpegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluent-ffmpeg", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): FfmpegCommand = js.native
  def apply(input: java.lang.String | nodeLib.streamMod.Readable): FfmpegCommand = js.native
  def apply(input: java.lang.String | nodeLib.streamMod.Readable, options: FfmpegCommandOptions): FfmpegCommand = js.native
  def apply(options: FfmpegCommandOptions): FfmpegCommand = js.native
  def availableCodecs(callback: CodecsCallback): scala.Unit = js.native
  def availableEncoders(callback: EncodersCallback): scala.Unit = js.native
  def availableFilters(callback: FiltersCallback): scala.Unit = js.native
  def availableFormats(callback: FormatsCallback): scala.Unit = js.native
  def ffprobe(
    file: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, scala.Unit]
  ): scala.Unit = js.native
  def ffprobe(
    file: java.lang.String,
    index: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, scala.Unit]
  ): scala.Unit = js.native
  def ffprobe(
    file: java.lang.String,
    index: scala.Double,
    options: js.Array[java.lang.String],
    callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, scala.Unit]
  ): scala.Unit = js.native
  def ffprobe(
    file: java.lang.String,
    options: js.Array[java.lang.String],
    callback: js.Function2[/* err */ js.Any, /* data */ FfprobeData, scala.Unit]
  ): scala.Unit = js.native
  def getAvailableCodecs(callback: CodecsCallback): scala.Unit = js.native
  def getAvailableEncoders(callback: EncodersCallback): scala.Unit = js.native
  def getAvailableFilters(callback: FiltersCallback): scala.Unit = js.native
  def getAvailableFormats(callback: FormatsCallback): scala.Unit = js.native
  // static methods
  def setFfmpegPath(path: java.lang.String): FfmpegCommand = js.native
  def setFfprobePath(path: java.lang.String): FfmpegCommand = js.native
  def setFlvtoolPath(path: java.lang.String): FfmpegCommand = js.native
}

