package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobPayloadOutput extends js.Object {
  var formats: js.Array[JobPayloadItem] = js.native
}

object JobPayloadOutput {
  @scala.inline
  def apply(formats: js.Array[JobPayloadItem]): JobPayloadOutput = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobPayloadOutput]
  }
  @scala.inline
  implicit class JobPayloadOutputOps[Self <: JobPayloadOutput] (val x: Self) extends AnyVal {
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
    def setFormatsVarargs(value: JobPayloadItem*): Self = this.set("formats", js.Array(value :_*))
    @scala.inline
    def setFormats(value: js.Array[JobPayloadItem]): Self = this.set("formats", value.asInstanceOf[js.Any])
  }
  
}

