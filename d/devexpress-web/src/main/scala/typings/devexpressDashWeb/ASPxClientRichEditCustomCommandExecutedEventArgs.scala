package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.CustomCommandExecuted event.
  */
@JSGlobal("ASPxClientRichEditCustomCommandExecutedEventArgs")
@js.native
class ASPxClientRichEditCustomCommandExecutedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditCustomCommandExecutedEventArgs object. For internal use only.
    * @param commandName A string value that specifies the name of the processed command.
    * @param parameter An object that can contain command specific information needed for handling the command execution.
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

