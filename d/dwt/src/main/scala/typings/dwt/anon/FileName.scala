package typings.dwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileName extends js.Object {
  /**
    * Specify the name(s) (pattern) of the uploaded files.
    * Example: "uploadedFile<%06d>.jpg"
    */
  var fileName: js.UndefOr[String] = js.native
  /**
    * Custom form fields.
    * Example: {"UploadedBy": "Dynamsoft"}
    */
  var formFields: js.UndefOr[js.Any] = js.native
  /**
    * Custom headers in the form.
    * Example: {md5: ""}
    */
  var headers: js.UndefOr[js.Any] = js.native
  /**
    * The maximum size of a file to be uploaded (in bytes).
    */
  var maxSizeLimit: js.UndefOr[Double] = js.native
  /**
    * Specify the names for the files in the form.
    * Example: "RemoteName<%06d>"
    */
  var remoteName: js.UndefOr[String] = js.native
  /**
    * Specify how many threads (<=4) are to be used. Only valid when {useUploader} is true.
    */
  var threads: js.UndefOr[Double] = js.native
  /**
    * Target of the request.
    * Example: "http://dynamsoft.com/receivepost.aspx"
    */
  var url: js.UndefOr[String] = js.native
}

object FileName {
  @scala.inline
  def apply(): FileName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileName]
  }
  @scala.inline
  implicit class FileNameOps[Self <: FileName] (val x: Self) extends AnyVal {
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
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setFormFields(value: js.Any): Self = this.set("formFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormFields: Self = this.set("formFields", js.undefined)
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMaxSizeLimit(value: Double): Self = this.set("maxSizeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSizeLimit: Self = this.set("maxSizeLimit", js.undefined)
    @scala.inline
    def setRemoteName(value: String): Self = this.set("remoteName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteName: Self = this.set("remoteName", js.undefined)
    @scala.inline
    def setThreads(value: Double): Self = this.set("threads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreads: Self = this.set("threads", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

