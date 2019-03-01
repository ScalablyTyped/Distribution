package typings
package devexpressDashWebLib

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
  var commandName: java.lang.String
  /**
    * Gets or sets the HTML markup that is about to be pasted to the ASPxHtmlEditor's content.
    * Value: A string value that specifies the HTML content to paste.
    */
  var html: java.lang.String
}

object ASPxClientHtmlEditorBeforePasteEventArgs {
  @scala.inline
  def apply(commandName: java.lang.String, html: java.lang.String): ASPxClientHtmlEditorBeforePasteEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("commandName")(commandName)
    __obj.updateDynamic("html")(html)
    __obj.asInstanceOf[ASPxClientHtmlEditorBeforePasteEventArgs]
  }
}

