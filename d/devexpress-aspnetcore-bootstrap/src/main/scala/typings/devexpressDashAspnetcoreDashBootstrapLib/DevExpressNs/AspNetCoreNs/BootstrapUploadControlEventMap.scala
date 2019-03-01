package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dropZoneEnter")(dropZoneEnter)
    __obj.updateDynamic("dropZoneLeave")(dropZoneLeave)
    __obj.updateDynamic("fileInputCountChanged")(fileInputCountChanged)
    __obj.updateDynamic("fileUploadComplete")(fileUploadComplete)
    __obj.updateDynamic("filesUploadComplete")(filesUploadComplete)
    __obj.updateDynamic("filesUploadStart")(filesUploadStart)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("textChanged")(textChanged)
    __obj.updateDynamic("uploadingProgressChanged")(uploadingProgressChanged)
    __obj.updateDynamic("validationErrorOccurred")(validationErrorOccurred)
    __obj.asInstanceOf[BootstrapUploadControlEventMap]
  }
}

