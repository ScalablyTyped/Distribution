package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(dropZoneEnter = dropZoneEnter, dropZoneLeave = dropZoneLeave, fileInputCountChanged = fileInputCountChanged, fileUploadComplete = fileUploadComplete, filesUploadComplete = filesUploadComplete, filesUploadStart = filesUploadStart, init = init, textChanged = textChanged, uploadingProgressChanged = uploadingProgressChanged, validationErrorOccurred = validationErrorOccurred)
  
    __obj.asInstanceOf[BootstrapUploadControlEventMap]
  }
}

