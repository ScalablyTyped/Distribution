package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the Spreadsheet extension.
  */
@JSGlobal("MVCxClientSpreadsheet")
@js.native
class MVCxClientSpreadsheet () extends ASPxClientSpreadsheet {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientSpreadsheet: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientSpreadsheet]] = js.native
  /**
    * Sends a callback with a parameter to update the Spreadsheet by processing the passed information on the server, in an Action specified via the SpreadsheetSettings.CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the SpreadsheetSettings.CustomActionRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Any): Unit = js.native
  def PerformCallback(data: js.Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}

/* static members */
@JSGlobal("MVCxClientSpreadsheet")
@js.native
object MVCxClientSpreadsheet extends js.Object {
  /**
    * Converts the specified object to the MVCxClientSpreadsheet type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientSpreadsheet = js.native
}

