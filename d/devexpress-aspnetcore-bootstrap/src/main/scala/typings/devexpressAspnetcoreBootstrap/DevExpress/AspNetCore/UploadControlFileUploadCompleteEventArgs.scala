package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadControlFileUploadCompleteEventArgs
  extends StObject
     with EventArgs {
  
  val callbackData: String
  
  val errorText: String
  
  val inputIndex: Double
  
  val isValid: Boolean
}
object UploadControlFileUploadCompleteEventArgs {
  
  inline def apply(callbackData: String, errorText: String, inputIndex: Double, isValid: Boolean, sender: Control): UploadControlFileUploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(callbackData = callbackData.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], inputIndex = inputIndex.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlFileUploadCompleteEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadControlFileUploadCompleteEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCallbackData(value: String): Self = StObject.set(x, "callbackData", value.asInstanceOf[js.Any])
    
    inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    inline def setInputIndex(value: Double): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
  }
}
