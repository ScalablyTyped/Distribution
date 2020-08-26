package typings.fluentFfmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FfprobeData extends js.Object {
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
  implicit class FfprobeDataOps[Self <: FfprobeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChaptersVarargs(value: js.Any*): Self = this.set("chapters", js.Array(value :_*))
    @scala.inline
    def setChapters(value: js.Array[_]): Self = this.set("chapters", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: FfprobeFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamsVarargs(value: FfprobeStream*): Self = this.set("streams", js.Array(value :_*))
    @scala.inline
    def setStreams(value: js.Array[FfprobeStream]): Self = this.set("streams", value.asInstanceOf[js.Any])
  }
  
}

