package typings
package fluentDashFfmpegLib.fluentDashFfmpegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluent-ffmpeg", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfmpegCommand = js.native
  def apply(input: java.lang.String | nodeLib.streamMod.Readable): fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfmpegCommand = js.native
  def apply(
    input: java.lang.String | nodeLib.streamMod.Readable,
    options: fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfmpegCommandOptions
  ): fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfmpegCommand = js.native
  def apply(options: fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfmpegCommandOptions): fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfmpegCommand = js.native
  def availableCodecs(callback: fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.CodecsCallback): scala.Unit = js.native
  def availableEncoders(callback: fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.EncodersCallback): scala.Unit = js.native
  def availableFilters(callback: fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FiltersCallback): scala.Unit = js.native
  def availableFormats(callback: fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FormatsCallback): scala.Unit = js.native
  def ffprobe(
    file: java.lang.String,
    callback: js.Function2[
      /* err */ js.Any, 
      /* data */ fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfprobeData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ffprobe(
    file: java.lang.String,
    index: scala.Double,
    callback: js.Function2[
      /* err */ js.Any, 
      /* data */ fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfprobeData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ffprobe(
    file: java.lang.String,
    index: scala.Double,
    options: js.Array[java.lang.String],
    callback: js.Function2[
      /* err */ js.Any, 
      /* data */ fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfprobeData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ffprobe(
    file: java.lang.String,
    options: js.Array[java.lang.String],
    callback: js.Function2[
      /* err */ js.Any, 
      /* data */ fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfprobeData, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getAvailableCodecs(callback: fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.CodecsCallback): scala.Unit = js.native
  def getAvailableEncoders(callback: fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.EncodersCallback): scala.Unit = js.native
  def getAvailableFilters(callback: fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FiltersCallback): scala.Unit = js.native
  def getAvailableFormats(callback: fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FormatsCallback): scala.Unit = js.native
  // static methods
  def setFfmpegPath(path: java.lang.String): fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfmpegCommand = js.native
  def setFfprobePath(path: java.lang.String): fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfmpegCommand = js.native
  def setFlvtoolPath(path: java.lang.String): fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfmpegCommand = js.native
}

