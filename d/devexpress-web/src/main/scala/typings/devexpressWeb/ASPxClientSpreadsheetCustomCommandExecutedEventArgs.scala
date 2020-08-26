package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSpreadsheet.CustomCommandExecuted event.
  */
@js.native
trait ASPxClientSpreadsheetCustomCommandExecutedEventArgs extends ASPxClientEventArgs {
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

object ASPxClientSpreadsheetCustomCommandExecutedEventArgs {
  @scala.inline
  def apply(commandName: String, item: ASPxClientRibbonItem, parameter: String): ASPxClientSpreadsheetCustomCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSpreadsheetCustomCommandExecutedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientSpreadsheetCustomCommandExecutedEventArgsOps[Self <: ASPxClientSpreadsheetCustomCommandExecutedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommandName(value: String): Self = this.set("commandName", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: ASPxClientRibbonItem): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameter(value: String): Self = this.set("parameter", value.asInstanceOf[js.Any])
  }
  
}

