package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ASPxGridLookup control.
  */
@JSGlobal("ASPxClientGridLookup")
@js.native
class ASPxClientGridLookup () extends ASPxClientDropDownEditBase {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientGridLookup]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientGridLookup]] = js.native
  /**
    * Fires on the client when a data row is clicked within the built-in dropdown grid.
    */
  var RowClick: ASPxClientEvent[ASPxClientGridViewRowClickEventHandler[ASPxClientGridLookup]] = js.native
  /**
    * Confirms the current selection made by an end-user within the editor's dropdown grid.
    */
  def ConfirmCurrentSelection(): Unit = js.native
  /**
    * Returns a client object representing the built-in dropdown grid.
    */
  def GetGridView(): ASPxClientGridView = js.native
  /**
    * Cancels the current selection made by an end-user within the editor's dropdown grid and rolls back to the last confirmed selection. The selection can be confirmed by either pressing the Enter key or calling the ASPxClientGridLookup.ConfirmCurrentSelection method.
    */
  def RollbackToLastConfirmedSelection(): Unit = js.native
}

/* static members */
@JSGlobal("ASPxClientGridLookup")
@js.native
object ASPxClientGridLookup extends js.Object {
  /**
    * Converts the specified object to the ASPxClientGridLookup type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): ASPxClientGridLookup = js.native
}

