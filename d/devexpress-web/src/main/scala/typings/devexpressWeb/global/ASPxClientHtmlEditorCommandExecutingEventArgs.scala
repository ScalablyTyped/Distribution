package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.CommandExecuting event.
  */
@JSGlobal("ASPxClientHtmlEditorCommandExecutingEventArgs")
@js.native
class ASPxClientHtmlEditorCommandExecutingEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientHtmlEditorCommandExecutingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorCommandExecutingEventArgs object with the specified settings.
    * @param commandName A string value that identifies the command currently being executed. Initializes the ASPxClientHtmlEditorCommandExecutingEventArgs.commandName property.
    * @param parameter An object that contains the command specific information needed for handling the command execution. Initializes the ASPxClientHtmlEditorCommandExecutingEventArgs.parameter property.
    */
  def this(commandName: String, parameter: js.Any) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets the name of the processed command.
    */
  /* CompleteClass */
  override var commandName: String = js.native
  /**
    * Gets an optional parameter that complements the processed command.
    */
  /* CompleteClass */
  override var parameter: js.Any = js.native
}

