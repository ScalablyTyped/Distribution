package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientUploadControl.FileUploadComplete event.
  */
trait ASPxClientUploadControlFileUploadCompleteEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a string that contains specific information (if any) passed from the server side for further client processing.
    */
  var callbackData: String
  
  /**
    * Gets the error text to be displayed within the ASPxUploadControl's error frame.
    */
  var errorText: String
  
  /**
    * Gets the index of a file input element within the ASPxUploadControl.
    */
  var inputIndex: Double
  
  /**
    * Gets or sets a value indicating whether the uploaded file passes validation.
    */
  var isValid: Boolean
}
object ASPxClientUploadControlFileUploadCompleteEventArgs {
  
  inline def apply(callbackData: String, errorText: String, inputIndex: Double, isValid: Boolean): ASPxClientUploadControlFileUploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(callbackData = callbackData.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], inputIndex = inputIndex.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlFileUploadCompleteEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientUploadControlFileUploadCompleteEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCallbackData(value: String): Self = StObject.set(x, "callbackData", value.asInstanceOf[js.Any])
    
    inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    inline def setInputIndex(value: Double): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
  }
}
