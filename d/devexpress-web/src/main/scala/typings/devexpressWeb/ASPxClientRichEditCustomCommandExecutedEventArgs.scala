package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.CustomCommandExecuted event.
  */
trait ASPxClientRichEditCustomCommandExecutedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the processed command.
    */
  var commandName: String
  /**
    * Gets an optional parameter that complements the processed command.
    */
  var parameter: js.Any
}

object ASPxClientRichEditCustomCommandExecutedEventArgs {
  @scala.inline
  def apply(commandName: String, parameter: js.Any): ASPxClientRichEditCustomCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRichEditCustomCommandExecutedEventArgs]
  }
}

