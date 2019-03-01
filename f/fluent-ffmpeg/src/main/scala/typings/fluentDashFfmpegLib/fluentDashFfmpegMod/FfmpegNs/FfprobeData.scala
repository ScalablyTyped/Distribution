package typings
package fluentDashFfmpegLib.fluentDashFfmpegMod.FfmpegNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FfprobeData extends js.Object {
  var chapters: js.Array[_]
  var format: js.Any
  var streams: js.Array[_]
}

object FfprobeData {
  @scala.inline
  def apply(chapters: js.Array[_], format: js.Any, streams: js.Array[_]): FfprobeData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chapters")(chapters)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("streams")(streams)
    __obj.asInstanceOf[FfprobeData]
  }
}

