package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientUploadControl.FileUploadComplete event.
  */
@js.native
trait ASPxClientUploadControlFileUploadCompleteEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a string that contains specific information (if any) passed from the server side for further client processing.
    */
  var callbackData: String = js.native
  
  /**
    * Gets the error text to be displayed within the ASPxUploadControl's error frame.
    */
  var errorText: String = js.native
  
  /**
    * Gets the index of a file input element within the ASPxUploadControl.
    */
  var inputIndex: Double = js.native
  
  /**
    * Gets or sets a value indicating whether the uploaded file passes validation.
    */
  var isValid: Boolean = js.native
}
object ASPxClientUploadControlFileUploadCompleteEventArgs {
  
  @scala.inline
  def apply(callbackData: String, errorText: String, inputIndex: Double, isValid: Boolean): ASPxClientUploadControlFileUploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(callbackData = callbackData.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], inputIndex = inputIndex.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlFileUploadCompleteEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientUploadControlFileUploadCompleteEventArgsMutableBuilder[Self <: ASPxClientUploadControlFileUploadCompleteEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallbackData(value: String): Self = StObject.set(x, "callbackData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputIndex(value: Double): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
  }
}
