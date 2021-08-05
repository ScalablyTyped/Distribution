package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientUploadControl.FilesUploadComplete client event, which enables you to perform specific actions after all selected files have been uploaded.
  */
trait ASPxClientUploadControlFilesUploadCompleteEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a string that contains specific information (if any) passed from the server side for further client processing.
    */
  var callbackData: String
  
  /**
    * Gets the error text to be displayed within the upload control's error frame.
    */
  var errorText: String
}
object ASPxClientUploadControlFilesUploadCompleteEventArgs {
  
  inline def apply(callbackData: String, errorText: String): ASPxClientUploadControlFilesUploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(callbackData = callbackData.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlFilesUploadCompleteEventArgs]
  }
  
  extension [Self <: ASPxClientUploadControlFilesUploadCompleteEventArgs](x: Self) {
    
    inline def setCallbackData(value: String): Self = StObject.set(x, "callbackData", value.asInstanceOf[js.Any])
    
    inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
  }
}
