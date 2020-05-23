package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.CustomCommandExecuted event.
  */
trait ASPxClientSpreadsheetCustomCommandExecutedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    */
  var commandName: String
  /** @deprecated This property is now obsolete. Use the commandName property instead. */
  /**
    * This property is now obsolete. Use the ASPxClientSpreadsheetCustomCommandExecutedEventArgs.commandName property instead.
    */
  var item: ASPxClientRibbonItem
  /**
    * Gets an optional parameter that complements the processed command.
    */
  var parameter: String
}

object ASPxClientSpreadsheetCustomCommandExecutedEventArgs {
  @scala.inline
  def apply(commandName: String, item: ASPxClientRibbonItem, parameter: String): ASPxClientSpreadsheetCustomCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetCustomCommandExecutedEventArgs]
  }
}

