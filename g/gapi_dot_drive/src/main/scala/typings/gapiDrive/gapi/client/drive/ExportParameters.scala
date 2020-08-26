package typings.gapiDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportParameters extends js.Object {
  var fileId: String = js.native
  var mimeType: String = js.native
}

object ExportParameters {
  @scala.inline
  def apply(fileId: String, mimeType: String): ExportParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportParameters]
  }
  @scala.inline
  implicit class ExportParametersOps[Self <: ExportParameters] (val x: Self) extends AnyVal {
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
    def setFileId(value: String): Self = this.set("fileId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
  }
  
}

