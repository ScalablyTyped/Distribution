package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Contains settings of the file that hasn't passed validation.
 */

trait ASPxClientUploadControlInvalidFileInfo extends js.Object {
  /**
       * Gets the error type.
       * Value: An ASPxClientUploadControlValidationErrorTypeConsts object that provides possible types of errors.
       */
  var errorType: ASPxClientUploadControlValidationErrorTypeConsts
  /**
       * Gets the name of the invalid file.
       * Value: A string value that specifies the file name.
       */
  var fileName: java.lang.String
  /**
       * Gets the size of the invalid file.
       * Value: An integer value that specifies the file size.
       */
  var fileSize: scala.Double
}

