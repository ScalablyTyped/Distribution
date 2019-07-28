package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BeforePaste event.
  */
trait ASPxClientHtmlEditorBeforePasteEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    * Value: A string value identifying the command's name.
    */
  var commandName: String
  /**
    * Gets or sets the HTML markup that is about to be pasted to the ASPxHtmlEditor's content.
    * Value: A string value that specifies the HTML content to paste.
    */
  var html: String
}

object ASPxClientHtmlEditorBeforePasteEventArgs {
  @scala.inline
  def apply(commandName: String, html: String): ASPxClientHtmlEditorBeforePasteEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName, html = html)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorBeforePasteEventArgs]
  }
}

