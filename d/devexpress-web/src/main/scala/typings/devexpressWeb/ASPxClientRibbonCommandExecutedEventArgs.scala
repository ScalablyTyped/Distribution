package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRibbon.CommandExecuted event.
  */
trait ASPxClientRibbonCommandExecutedEventArgs extends ASPxClientProcessingModeEventArgs {
  /**
    * Gets an item object related to the event.
    */
  var item: ASPxClientRibbonItem
  /**
    * Gets an optional parameter that complements the processed command.
    */
  var parameter: String
}

object ASPxClientRibbonCommandExecutedEventArgs {
  @scala.inline
  def apply(item: ASPxClientRibbonItem, parameter: String, processOnServer: Boolean): ASPxClientRibbonCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonCommandExecutedEventArgs]
  }
}

