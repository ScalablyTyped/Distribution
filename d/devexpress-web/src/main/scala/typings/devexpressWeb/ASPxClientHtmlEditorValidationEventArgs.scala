package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.Validation client event.
  */
trait ASPxClientHtmlEditorValidationEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets the error text to be displayed within the editor's error frame if the editor's validation fails.
    */
  var errorText: String
  /**
    * Gets or sets the HTML markup that is the ASPxHtmlEditor's content.
    */
  var html: String
  /**
    * Gets or sets a value specifying whether the validated value is valid.
    */
  var isValid: Boolean
}

object ASPxClientHtmlEditorValidationEventArgs {
  @scala.inline
  def apply(errorText: String, html: String, isValid: Boolean): ASPxClientHtmlEditorValidationEventArgs = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorValidationEventArgs]
  }
}

