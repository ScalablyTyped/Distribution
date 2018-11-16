package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client file that corresponds to a particular file selected for uploading in the upload control.
 */

trait ASPxClientUploadControlFile extends js.Object {
  /**
       * Gets the name of the file selected for uploading.
       * Value: A string value that specifies the file's name.
       */
  var name: java.lang.String
  /**
       * Gets the size of the file selected for uploading.
       * Value: An Int64 value specifying the file's size, in bytes.
       */
  var size: js.Any
  /**
       * Provides access to the file as a native Javascript object.
       * Value: A JavaScript object that is the file selected for uploading.
       */
  var sourceFileObject: js.Any
}

