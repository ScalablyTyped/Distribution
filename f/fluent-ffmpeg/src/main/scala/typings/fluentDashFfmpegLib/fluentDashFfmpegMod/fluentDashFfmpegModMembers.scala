package typings
package fluentDashFfmpegLib.fluentDashFfmpegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluent-ffmpeg", JSImport.Namespace)
@js.native
object fluentDashFfmpegModMembers extends js.Object {
  def apply(): fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfmpegCommand = js.native
  def apply(input: java.lang.String | nodeLib.streamMod.Readable): fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfmpegCommand = js.native
  def apply(
    input: java.lang.String | nodeLib.streamMod.Readable,
    options: fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfmpegCommandOptions
  ): fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfmpegCommand = js.native
  def apply(options: fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfmpegCommandOptions): fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs.FfmpegCommand = js.native
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
}

