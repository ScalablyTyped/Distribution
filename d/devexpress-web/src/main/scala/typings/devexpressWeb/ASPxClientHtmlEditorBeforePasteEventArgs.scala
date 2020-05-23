package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.BeforePaste event.
  */
trait ASPxClientHtmlEditorBeforePasteEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    */
  var commandName: String
  /**
    * Gets or sets the HTML markup that is about to be pasted to the ASPxHtmlEditor's content.
    */
  var html: String
}

object ASPxClientHtmlEditorBeforePasteEventArgs {
  @scala.inline
  def apply(commandName: String, html: String): ASPxClientHtmlEditorBeforePasteEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorBeforePasteEventArgs]
  }
}

