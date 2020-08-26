package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadControlValidationErrorOccurredEventArgs extends EventArgs {
  var errorText: String = js.native
  val invalidFiles: js.Array[BootstrapUploadControlInvalidFileInfo] = js.native
  var showAlert: Boolean = js.native
  val validationSettings: BootstrapUploadControlValidationSettings = js.native
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
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], invalidFiles = invalidFiles.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], showAlert = showAlert.asInstanceOf[js.Any], validationSettings = validationSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlValidationErrorOccurredEventArgs]
  }
  @scala.inline
  implicit class UploadControlValidationErrorOccurredEventArgsOps[Self <: UploadControlValidationErrorOccurredEventArgs] (val x: Self) extends AnyVal {
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
    def setErrorText(value: String): Self = this.set("errorText", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidFilesVarargs(value: BootstrapUploadControlInvalidFileInfo*): Self = this.set("invalidFiles", js.Array(value :_*))
    @scala.inline
    def setInvalidFiles(value: js.Array[BootstrapUploadControlInvalidFileInfo]): Self = this.set("invalidFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowAlert(value: Boolean): Self = this.set("showAlert", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidationSettings(value: BootstrapUploadControlValidationSettings): Self = this.set("validationSettings", value.asInstanceOf[js.Any])
  }
  
}

