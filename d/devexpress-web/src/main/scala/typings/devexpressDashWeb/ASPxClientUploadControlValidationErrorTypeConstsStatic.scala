package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientUploadControlValidationErrorTypeConstsStatic extends js.Object {
  /**
    * A file name contains invalid character.Return Value: 4
    */
  var FileNameContainsInvalidCharacter: Double
  /**
    * The allowed maximum count of the files is exceeded.  Return Value: 3
    */
  var MaxFileCountExceeded: Double
  /**
    * The allowed maximum file size is exceeded.  Return Value: 1
    */
  var MaxFileSizeExceeded: Double
  /**
    * The file's extension is not allowed.  Return Value: 2
    */
  var NotAllowedFileExtension: Double
}

object ASPxClientUploadControlValidationErrorTypeConstsStatic {
  @scala.inline
  def apply(
    FileNameContainsInvalidCharacter: Double,
    MaxFileCountExceeded: Double,
    MaxFileSizeExceeded: Double,
    NotAllowedFileExtension: Double
  ): ASPxClientUploadControlValidationErrorTypeConstsStatic = {
    val __obj = js.Dynamic.literal(FileNameContainsInvalidCharacter = FileNameContainsInvalidCharacter, MaxFileCountExceeded = MaxFileCountExceeded, MaxFileSizeExceeded = MaxFileSizeExceeded, NotAllowedFileExtension = NotAllowedFileExtension)
  
    __obj.asInstanceOf[ASPxClientUploadControlValidationErrorTypeConstsStatic]
  }
}

