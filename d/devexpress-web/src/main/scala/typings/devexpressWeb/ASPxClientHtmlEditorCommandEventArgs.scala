package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events that relate to command processing (ASPxClientHtmlEditor.CommandExecuted, ASPxClientHtmlEditor.CustomCommand).
  */
trait ASPxClientHtmlEditorCommandEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    */
  var commandName: String
  /**
    * Gets an optional parameter that complements the processed command.
    */
  var parameter: js.Any
}

object ASPxClientHtmlEditorCommandEventArgs {
  @scala.inline
  def apply(commandName: String, parameter: js.Any): ASPxClientHtmlEditorCommandEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCommandEventArgs]
  }
}

