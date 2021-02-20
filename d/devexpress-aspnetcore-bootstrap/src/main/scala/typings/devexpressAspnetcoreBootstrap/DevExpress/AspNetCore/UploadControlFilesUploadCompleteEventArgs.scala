package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadControlFilesUploadCompleteEventArgs extends EventArgs {
  
  val callbackData: String = js.native
  
  val errorText: String = js.native
}
object UploadControlFilesUploadCompleteEventArgs {
  
  @scala.inline
  def apply(callbackData: String, errorText: String, sender: Control): UploadControlFilesUploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(callbackData = callbackData.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlFilesUploadCompleteEventArgs]
  }
  
  @scala.inline
  implicit class UploadControlFilesUploadCompleteEventArgsMutableBuilder[Self <: UploadControlFilesUploadCompleteEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallbackData(value: String): Self = StObject.set(x, "callbackData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
  }
}
