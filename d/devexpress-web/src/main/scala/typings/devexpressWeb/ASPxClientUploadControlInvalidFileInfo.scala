package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains settings of the file that hasn't passed validation.
  */
@js.native
trait ASPxClientUploadControlInvalidFileInfo extends js.Object {
  
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
  implicit class ASPxClientUploadControlInvalidFileInfoOps[Self <: ASPxClientUploadControlInvalidFileInfo] (val x: Self) extends AnyVal {
    
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
    def setErrorType(value: ASPxClientUploadControlValidationErrorTypeConsts): Self = this.set("errorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
  }
}
