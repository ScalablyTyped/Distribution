package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class UploadControlValidationErrorOccurredEventArgsMutableBuilder[Self <: UploadControlValidationErrorOccurredEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidFiles(value: js.Array[BootstrapUploadControlInvalidFileInfo]): Self = StObject.set(x, "invalidFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidFilesVarargs(value: BootstrapUploadControlInvalidFileInfo*): Self = StObject.set(x, "invalidFiles", js.Array(value :_*))
    
    @scala.inline
    def setShowAlert(value: Boolean): Self = StObject.set(x, "showAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationSettings(value: BootstrapUploadControlValidationSettings): Self = StObject.set(x, "validationSettings", value.asInstanceOf[js.Any])
  }
}
