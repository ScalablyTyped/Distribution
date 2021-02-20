package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings of the file that hasn't passed validation.
  */
@js.native
trait ASPxClientUploadControlInvalidFileInfo extends StObject {
  
  /**
    * Gets the error type.
    */
  var errorType: ASPxClientUploadControlValidationErrorTypeConsts = js.native
  
  /**
    * Gets the name of the invalid file.
    */
  var fileName: String = js.native
  
  /**
    * Gets the size of the invalid file.
    */
  var fileSize: Double = js.native
}
object ASPxClientUploadControlInvalidFileInfo {
  
  @scala.inline
  def apply(errorType: ASPxClientUploadControlValidationErrorTypeConsts, fileName: String, fileSize: Double): ASPxClientUploadControlInvalidFileInfo = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlInvalidFileInfo]
  }
  
  @scala.inline
  implicit class ASPxClientUploadControlInvalidFileInfoMutableBuilder[Self <: ASPxClientUploadControlInvalidFileInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorType(value: ASPxClientUploadControlValidationErrorTypeConsts): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
  }
}
