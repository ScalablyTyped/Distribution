package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerActionSettings extends js.Object {
  /** Specifies the name of the action method used for downloading the PDF document from the PDF viewer control.
    */
  var download: js.UndefOr[String] = js.native
  /** Specifies the name of the action method used for uploading the PDF document to the PDF viewer control.
    */
  var fileUpload: js.UndefOr[String] = js.native
  /** Specifies the name of the action method used for loading the PDF document.
    */
  var load: js.UndefOr[String] = js.native
  /** Specifies the name of the action method used for printing the PDF document in the PDF viewer control.
    */
  var print: js.UndefOr[String] = js.native
}

object ServerActionSettings {
  @scala.inline
  def apply(): ServerActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerActionSettings]
  }
  @scala.inline
  implicit class ServerActionSettingsOps[Self <: ServerActionSettings] (val x: Self) extends AnyVal {
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
    def setDownload(value: String): Self = this.set("download", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownload: Self = this.set("download", js.undefined)
    @scala.inline
    def setFileUpload(value: String): Self = this.set("fileUpload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileUpload: Self = this.set("fileUpload", js.undefined)
    @scala.inline
    def setLoad(value: String): Self = this.set("load", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setPrint(value: String): Self = this.set("print", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
  }
  
}

