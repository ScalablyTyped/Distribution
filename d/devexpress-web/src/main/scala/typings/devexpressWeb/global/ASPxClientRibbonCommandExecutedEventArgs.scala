package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRibbon.CommandExecuted event.
  */
@JSGlobal("ASPxClientRibbonCommandExecutedEventArgs")
@js.native
class ASPxClientRibbonCommandExecutedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientRibbonCommandExecutedEventArgs {
  /**
    * Initializes a new object of the ASPxClientRibbonCommandExecutedEventArgs type with the specified settings.
    * @param item An ASPxClientRibbonItem object, manipulations on which forced the event to be raised.
    * @param parameter A string value containing additional information about the processed command.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    */
  def this(item: typings.devexpressWeb.ASPxClientRibbonItem, parameter: String, processOnServer: Boolean) = this()
}

