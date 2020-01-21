package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.CustomCommandExecuted event.
  */
@JSGlobal("ASPxClientSpreadsheetCustomCommandExecutedEventArgs")
@js.native
class ASPxClientSpreadsheetCustomCommandExecutedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetCustomCommandExecutedEventArgs class.
    * @param commandName A string value that specifies the name of the processed command.
    * @param parameter An object that can contain command specific information needed for handling the command execution.
    */
  def this(commandName: String, parameter: js.Any) = this()
  /**
    * Gets the name of the processed command.
    */
  var commandName: String = js.native
  /** @deprecated This property is now obsolete. Use the commandName property instead. */
  /**
    * This property is now obsolete. Use the ASPxClientSpreadsheetCustomCommandExecutedEventArgs.commandName property instead.
    */
  var item: ASPxClientRibbonItem = js.native
  /**
    * Gets an optional parameter that complements the processed command.
    */
  var parameter: String = js.native
}

