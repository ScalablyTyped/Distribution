package typings
package devexpressDashWebLib

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
  var commandName: java.lang.String
  /**
    * This property is now obsolete. Use the commandName property instead.
    */
  var item: ASPxClientRibbonItem
  /**
    * Gets an optional parameter that complements the processed command.
    * Value: A string value containing additional information about the processed command.
    */
  var parameter: java.lang.String
}

object ASPxClientSpreadsheetCustomCommandExecutedEventArgs {
  @scala.inline
  def apply(commandName: java.lang.String, item: ASPxClientRibbonItem, parameter: java.lang.String): ASPxClientSpreadsheetCustomCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName, item = item, parameter = parameter)
  
    __obj.asInstanceOf[ASPxClientSpreadsheetCustomCommandExecutedEventArgs]
  }
}

