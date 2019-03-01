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

object ASPxClientHtmlEditorValidationEventArgs {
  @scala.inline
  def apply(errorText: java.lang.String, html: java.lang.String, isValid: scala.Boolean): ASPxClientHtmlEditorValidationEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errorText")(errorText)
    __obj.updateDynamic("html")(html)
    __obj.updateDynamic("isValid")(isValid)
    __obj.asInstanceOf[ASPxClientHtmlEditorValidationEventArgs]
  }
}

