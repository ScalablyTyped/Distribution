package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadControlValidationErrorOccurredEventArgs extends EventArgs {
  var errorText: java.lang.String
  val invalidFiles: js.Array[BootstrapUploadControlInvalidFileInfo]
  var showAlert: scala.Boolean
  val validationSettings: BootstrapUploadControlValidationSettings
}

object UploadControlValidationErrorOccurredEventArgs {
  @scala.inline
  def apply(
    errorText: java.lang.String,
    invalidFiles: js.Array[BootstrapUploadControlInvalidFileInfo],
    sender: Control,
    showAlert: scala.Boolean,
    validationSettings: BootstrapUploadControlValidationSettings
  ): UploadControlValidationErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(errorText = errorText, invalidFiles = invalidFiles, sender = sender, showAlert = showAlert, validationSettings = validationSettings)
  
    __obj.asInstanceOf[UploadControlValidationErrorOccurredEventArgs]
  }
}

