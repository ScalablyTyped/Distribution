package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Contains settings that relate to the ValidationErrorOccurred client event.
 */

trait ASPxClientUploadControlValidationSettings extends js.Object {
  /**
       * Gets the allowed file extensions.
       * Value: An array of string values that contains file extensions that are allowed.
       */
  var allowedFileExtensions: js.Array[java.lang.String]
  /**
       * Gets which characters in a file name are not allowed.
       * Value: An array of string values that contains characters that are not allowed.
       */
  var invalidFileNameCharacters: js.Array[java.lang.String]
  /**
       * Gets the maximum count of files that can be selected for uploading at once.
       * Value: An integer value that specifies the maximum count of files.
       */
  var maxFileCount: scala.Double
  /**
       * Gets the maximum file size.
       * Value: An <see cref="Int64" /> value that specifies the maximum file size, in bytes.
       */
  var maxFileSize: js.Any
}

