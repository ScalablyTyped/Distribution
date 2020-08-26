package typings.dropzone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropzoneFileUpload extends js.Object {
  var bytesSent: Double = js.native
  var progress: Double = js.native
  var total: Double = js.native
  var totalChunkCount: js.UndefOr[Double] = js.native
  var uuid: String = js.native
}

object DropzoneFileUpload {
  @scala.inline
  def apply(bytesSent: Double, progress: Double, total: Double, uuid: String): DropzoneFileUpload = {
    val __obj = js.Dynamic.literal(bytesSent = bytesSent.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropzoneFileUpload]
  }
  @scala.inline
  implicit class DropzoneFileUploadOps[Self <: DropzoneFileUpload] (val x: Self) extends AnyVal {
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
    def setBytesSent(value: Double): Self = this.set("bytesSent", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalChunkCount(value: Double): Self = this.set("totalChunkCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalChunkCount: Self = this.set("totalChunkCount", js.undefined)
  }
  
}

