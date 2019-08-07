package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRibbon.CommandExecuted event.
  */
@JSGlobal("ASPxClientRibbonCommandExecutedEventArgs")
@js.native
class ASPxClientRibbonCommandExecutedEventArgs protected () extends ASPxClientProcessingModeEventArgs {
  /**
    * Initializes a new object of the ASPxClientRibbonCommandExecutedEventArgs type with the specified settings.
    * @param item An ASPxClientRibbonItem object, manipulations on which forced the event to be raised.
    * @param parameter A string value containing additional information about the processed command.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    */
  def this(item: ASPxClientRibbonItem, parameter: String, processOnServer: Boolean) = this()
  /**
    * Gets an item object related to the event.
    */
  var item: ASPxClientRibbonItem = js.native
  /**
    * Gets an optional parameter that complements the processed command.
    */
  var parameter: String = js.native
}

