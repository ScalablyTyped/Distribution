package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings of the file that hasn't passed validation.
  */
trait ASPxClientUploadControlInvalidFileInfo extends StObject {
  
  /**
    * Gets the error type.
    */
  var errorType: ASPxClientUploadControlValidationErrorTypeConsts
  
  /**
    * Gets the name of the invalid file.
    */
  var fileName: String
  
  /**
    * Gets the size of the invalid file.
    */
  var fileSize: Double
}
object ASPxClientUploadControlInvalidFileInfo {
  
  inline def apply(errorType: ASPxClientUploadControlValidationErrorTypeConsts, fileName: String, fileSize: Double): ASPxClientUploadControlInvalidFileInfo = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlInvalidFileInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientUploadControlInvalidFileInfo] (val x: Self) extends AnyVal {
    
    inline def setErrorType(value: ASPxClientUploadControlValidationErrorTypeConsts): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
  }
}
