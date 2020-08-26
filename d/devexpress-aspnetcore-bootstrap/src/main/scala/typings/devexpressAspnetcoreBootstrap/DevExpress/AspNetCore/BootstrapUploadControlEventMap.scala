package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapUploadControlEventMap extends ControlEventMap {
  var dropZoneEnter: UploadControlDropZoneEnterEventArgs = js.native
  var dropZoneLeave: UploadControlDropZoneLeaveEventArgs = js.native
  var fileInputCountChanged: EventArgs = js.native
  var fileUploadComplete: UploadControlFileUploadCompleteEventArgs = js.native
  var filesUploadComplete: UploadControlFilesUploadCompleteEventArgs = js.native
  var filesUploadStart: UploadControlFilesUploadStartEventArgs = js.native
  var textChanged: UploadControlTextChangedEventArgs = js.native
  var uploadingProgressChanged: UploadControlUploadingProgressChangedEventArgs = js.native
  var validationErrorOccurred: UploadControlValidationErrorOccurredEventArgs = js.native
}

object BootstrapUploadControlEventMap {
  @scala.inline
  def apply(
    dropZoneEnter: UploadControlDropZoneEnterEventArgs,
    dropZoneLeave: UploadControlDropZoneLeaveEventArgs,
    fileInputCountChanged: EventArgs,
    fileUploadComplete: UploadControlFileUploadCompleteEventArgs,
    filesUploadComplete: UploadControlFilesUploadCompleteEventArgs,
    filesUploadStart: UploadControlFilesUploadStartEventArgs,
    init: EventArgs,
    textChanged: UploadControlTextChangedEventArgs,
    uploadingProgressChanged: UploadControlUploadingProgressChangedEventArgs,
    validationErrorOccurred: UploadControlValidationErrorOccurredEventArgs
  ): BootstrapUploadControlEventMap = {
    val __obj = js.Dynamic.literal(dropZoneEnter = dropZoneEnter.asInstanceOf[js.Any], dropZoneLeave = dropZoneLeave.asInstanceOf[js.Any], fileInputCountChanged = fileInputCountChanged.asInstanceOf[js.Any], fileUploadComplete = fileUploadComplete.asInstanceOf[js.Any], filesUploadComplete = filesUploadComplete.asInstanceOf[js.Any], filesUploadStart = filesUploadStart.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], uploadingProgressChanged = uploadingProgressChanged.asInstanceOf[js.Any], validationErrorOccurred = validationErrorOccurred.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapUploadControlEventMap]
  }
  @scala.inline
  implicit class BootstrapUploadControlEventMapOps[Self <: BootstrapUploadControlEventMap] (val x: Self) extends AnyVal {
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
    def setDropZoneEnter(value: UploadControlDropZoneEnterEventArgs): Self = this.set("dropZoneEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropZoneLeave(value: UploadControlDropZoneLeaveEventArgs): Self = this.set("dropZoneLeave", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileInputCountChanged(value: EventArgs): Self = this.set("fileInputCountChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileUploadComplete(value: UploadControlFileUploadCompleteEventArgs): Self = this.set("fileUploadComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesUploadComplete(value: UploadControlFilesUploadCompleteEventArgs): Self = this.set("filesUploadComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesUploadStart(value: UploadControlFilesUploadStartEventArgs): Self = this.set("filesUploadStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextChanged(value: UploadControlTextChangedEventArgs): Self = this.set("textChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadingProgressChanged(value: UploadControlUploadingProgressChangedEventArgs): Self = this.set("uploadingProgressChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidationErrorOccurred(value: UploadControlValidationErrorOccurredEventArgs): Self = this.set("validationErrorOccurred", value.asInstanceOf[js.Any])
  }
  
}

