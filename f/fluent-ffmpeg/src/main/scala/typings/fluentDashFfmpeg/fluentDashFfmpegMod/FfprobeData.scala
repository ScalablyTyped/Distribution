package typings.fluentDashFfmpeg.fluentDashFfmpegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FfprobeData extends js.Object {
  var chapters: js.Array[_]
  var format: FfprobeFormat
  var streams: js.Array[FfprobeStream]
}

object FfprobeData {
  @scala.inline
  def apply(chapters: js.Array[_], format: FfprobeFormat, streams: js.Array[FfprobeStream]): FfprobeData = {
    val __obj = js.Dynamic.literal(chapters = chapters, format = format, streams = streams)
  
    __obj.asInstanceOf[FfprobeData]
  }
}

