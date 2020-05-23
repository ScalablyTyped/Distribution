package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings of the file that hasn't passed validation.
  */
trait ASPxClientUploadControlInvalidFileInfo extends js.Object {
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
  @scala.inline
  def apply(errorType: ASPxClientUploadControlValidationErrorTypeConsts, fileName: String, fileSize: Double): ASPxClientUploadControlInvalidFileInfo = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlInvalidFileInfo]
  }
}

