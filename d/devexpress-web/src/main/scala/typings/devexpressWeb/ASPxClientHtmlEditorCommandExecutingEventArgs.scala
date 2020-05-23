package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.CommandExecuting event.
  */
trait ASPxClientHtmlEditorCommandExecutingEventArgs extends ASPxClientCancelEventArgs {
  /**
    * Gets the name of the processed command.
    */
  var commandName: String
  /**
    * Gets an optional parameter that complements the processed command.
    */
  var parameter: js.Any
}

object ASPxClientHtmlEditorCommandExecutingEventArgs {
  @scala.inline
  def apply(cancel: Boolean, commandName: String, parameter: js.Any): ASPxClientHtmlEditorCommandExecutingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], commandName = commandName.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCommandExecutingEventArgs]
  }
}

