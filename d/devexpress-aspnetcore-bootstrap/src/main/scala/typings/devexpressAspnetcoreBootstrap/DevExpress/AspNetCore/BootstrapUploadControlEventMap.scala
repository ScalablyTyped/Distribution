package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapUploadControlEventMap extends ControlEventMap {
  var dropZoneEnter: UploadControlDropZoneEnterEventArgs
  var dropZoneLeave: UploadControlDropZoneLeaveEventArgs
  var fileInputCountChanged: EventArgs
  var fileUploadComplete: UploadControlFileUploadCompleteEventArgs
  var filesUploadComplete: UploadControlFilesUploadCompleteEventArgs
  var filesUploadStart: UploadControlFilesUploadStartEventArgs
  var textChanged: UploadControlTextChangedEventArgs
  var uploadingProgressChanged: UploadControlUploadingProgressChangedEventArgs
  var validationErrorOccurred: UploadControlValidationErrorOccurredEventArgs
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
}

