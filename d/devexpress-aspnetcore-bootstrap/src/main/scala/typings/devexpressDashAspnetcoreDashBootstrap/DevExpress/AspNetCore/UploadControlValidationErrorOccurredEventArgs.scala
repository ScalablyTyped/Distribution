package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadControlValidationErrorOccurredEventArgs extends EventArgs {
  var errorText: String
  val invalidFiles: js.Array[BootstrapUploadControlInvalidFileInfo]
  var showAlert: Boolean
  val validationSettings: BootstrapUploadControlValidationSettings
}

object UploadControlValidationErrorOccurredEventArgs {
  @scala.inline
  def apply(
    errorText: String,
    invalidFiles: js.Array[BootstrapUploadControlInvalidFileInfo],
    sender: Control,
    showAlert: Boolean,
    validationSettings: BootstrapUploadControlValidationSettings
  ): UploadControlValidationErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(errorText = errorText, invalidFiles = invalidFiles, sender = sender, showAlert = showAlert, validationSettings = validationSettings)
  
    __obj.asInstanceOf[UploadControlValidationErrorOccurredEventArgs]
  }
}

