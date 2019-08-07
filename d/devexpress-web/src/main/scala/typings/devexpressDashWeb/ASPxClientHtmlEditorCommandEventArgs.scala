package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events that relate to command processing (ASPxClientHtmlEditor.CommandExecuted, ASPxClientHtmlEditor.CustomCommand).
  */
@JSGlobal("ASPxClientHtmlEditorCommandEventArgs")
@js.native
class ASPxClientHtmlEditorCommandEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorCommandEventArgs object with the specified settings. For internal use only.
    * @param commandName A string value that identifies the executed command. Initializes the ASPxClientHtmlEditorCommandEventArgs.commandName property.
    * @param parameter An object that can contain a command specific infomation needed for handling of the command execution. Initializes the ASPxClientHtmlEditorCommandEventArgs.parameter property.
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

