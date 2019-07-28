package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CustomCommandExecuted event.
  */
trait ASPxClientSpreadsheetCustomCommandExecutedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    * Value: A string value representing the processed command's name.
    */
  var commandName: String
  /**
    * This property is now obsolete. Use the commandName property instead.
    */
  var item: ASPxClientRibbonItem
  /**
    * Gets an optional parameter that complements the processed command.
    * Value: A string value containing additional information about the processed command.
    */
  var parameter: String
}

object ASPxClientSpreadsheetCustomCommandExecutedEventArgs {
  @scala.inline
  def apply(commandName: String, item: ASPxClientRibbonItem, parameter: String): ASPxClientSpreadsheetCustomCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName, item = item, parameter = parameter)
  
    __obj.asInstanceOf[ASPxClientSpreadsheetCustomCommandExecutedEventArgs]
  }
}

