package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the FileUploadComplete event.
 */

trait ASPxClientUploadControlFileUploadCompleteEventArgs extends ASPxClientEventArgs {
  /**
       * Gets a string that contains specific information (if any) passed from the server side for further client processing.
       * Value: A string value representing callback data passed from the server.
       */
  var callbackData: java.lang.String
  /**
       * Gets the error text to be displayed within the ASPxUploadControl's error frame.
       * Value: A string value that represents the error text.
       */
  var errorText: java.lang.String
  /**
       * Gets the index of a file input element within the ASPxUploadControl.
       * Value: An integer value that specifies the file input element's index.
       */
  var inputIndex: scala.Double
  /**
       * Gets or sets a value indicating whether the uploaded file passes validation.
       * Value: true if the file is valid; otherwise, false.
       */
  var isValid: scala.Boolean
}

