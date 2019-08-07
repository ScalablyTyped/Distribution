package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.CommandExecuting event.
  */
@JSGlobal("ASPxClientHtmlEditorCommandExecutingEventArgs")
@js.native
class ASPxClientHtmlEditorCommandExecutingEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorCommandExecutingEventArgs object with the specified settings.
    * @param commandName A string value that identifies the command currently being executed. Initializes the ASPxClientHtmlEditorCommandExecutingEventArgs.commandName property.
    * @param parameter An object that contains the command specific information needed for handling the command execution. Initializes the ASPxClientHtmlEditorCommandExecutingEventArgs.parameter property.
    */
  def this(commandName: String, parameter: js.Any) = this()
  /**
    * Gets the name of the processed command.
    */
  var commandName: String = js.native
  /**
    * Gets an optional parameter that complements the processed command.
    */
  var parameter: js.Any = js.native
}

