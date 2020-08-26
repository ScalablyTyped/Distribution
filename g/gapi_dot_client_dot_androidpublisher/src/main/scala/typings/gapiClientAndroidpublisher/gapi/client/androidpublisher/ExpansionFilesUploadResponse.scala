package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpansionFilesUploadResponse extends js.Object {
  var expansionFile: js.UndefOr[ExpansionFile] = js.native
}

object ExpansionFilesUploadResponse {
  @scala.inline
  def apply(): ExpansionFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionFilesUploadResponse]
  }
  @scala.inline
  implicit class ExpansionFilesUploadResponseOps[Self <: ExpansionFilesUploadResponse] (val x: Self) extends AnyVal {
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
    def setExpansionFile(value: ExpansionFile): Self = this.set("expansionFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpansionFile: Self = this.set("expansionFile", js.undefined)
  }
  
}

