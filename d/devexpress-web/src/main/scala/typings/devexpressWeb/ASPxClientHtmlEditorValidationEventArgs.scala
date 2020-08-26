package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.Validation client event.
  */
@js.native
trait ASPxClientHtmlEditorValidationEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets the error text to be displayed within the editor's error frame if the editor's validation fails.
    */
  var errorText: String = js.native
  /**
    * Gets or sets the HTML markup that is the ASPxHtmlEditor's content.
    */
  var html: String = js.native
  /**
    * Gets or sets a value specifying whether the validated value is valid.
    */
  var isValid: Boolean = js.native
}

object ASPxClientHtmlEditorValidationEventArgs {
  @scala.inline
  def apply(errorText: String, html: String, isValid: Boolean): ASPxClientHtmlEditorValidationEventArgs = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorValidationEventArgs]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorValidationEventArgsOps[Self <: ASPxClientHtmlEditorValidationEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorText(value: String): Self = this.set("errorText", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
  }
  
}

