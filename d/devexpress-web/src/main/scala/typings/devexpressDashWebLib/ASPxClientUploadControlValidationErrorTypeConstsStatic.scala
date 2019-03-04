package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientUploadControlValidationErrorTypeConstsStatic extends js.Object {
  /**
    * A file name contains invalid character.Return Value: 4
    */
  var FileNameContainsInvalidCharacter: scala.Double
  /**
    * The allowed maximum count of the files is exceeded.  Return Value: 3
    */
  var MaxFileCountExceeded: scala.Double
  /**
    * The allowed maximum file size is exceeded.  Return Value: 1
    */
  var MaxFileSizeExceeded: scala.Double
  /**
    * The file's extension is not allowed.  Return Value: 2
    */
  var NotAllowedFileExtension: scala.Double
}

object ASPxClientUploadControlValidationErrorTypeConstsStatic {
  @scala.inline
  def apply(
    FileNameContainsInvalidCharacter: scala.Double,
    MaxFileCountExceeded: scala.Double,
    MaxFileSizeExceeded: scala.Double,
    NotAllowedFileExtension: scala.Double
  ): ASPxClientUploadControlValidationErrorTypeConstsStatic = {
    val __obj = js.Dynamic.literal(FileNameContainsInvalidCharacter = FileNameContainsInvalidCharacter, MaxFileCountExceeded = MaxFileCountExceeded, MaxFileSizeExceeded = MaxFileSizeExceeded, NotAllowedFileExtension = NotAllowedFileExtension)
  
    __obj.asInstanceOf[ASPxClientUploadControlValidationErrorTypeConstsStatic]
  }
}

