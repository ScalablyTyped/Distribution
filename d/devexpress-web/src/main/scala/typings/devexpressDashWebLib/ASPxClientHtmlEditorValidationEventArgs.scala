package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the Validation client event.
 */

trait ASPxClientHtmlEditorValidationEventArgs extends ASPxClientEventArgs {
  /**
       * Gets or sets the error text to be displayed within the editor's error frame if the editor's validation fails.
       * Value: A string value specifying the error description.
       */
  var errorText: java.lang.String
  /**
       * Gets or sets the HTML markup that is the ASPxHtmlEditor's content.
       * Value: A string value that specifies the HTML content to validate.
       */
  var html: java.lang.String
  /**
       * Gets or sets a value specifying whether the validated value is valid.
       * Value: true if the validation has been completed successfully; otherwise, false.
       */
  var isValid: scala.Boolean
}

