package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ASPxGridLookup control.
  */
trait ASPxClientGridLookup extends ASPxClientDropDownEditBase {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientGridLookup]]
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientGridLookup]]
  /**
    * Fires on the client when a data row is clicked within the built-in dropdown grid.
    */
  var RowClick: ASPxClientEvent[ASPxClientGridViewRowClickEventHandler[ASPxClientGridLookup]]
  /**
    * Confirms the current selection made by an end-user within the editor's dropdown grid.
    */
  def ConfirmCurrentSelection(): scala.Unit
  /**
    * Returns a client object representing the built-in dropdown grid.
    */
  def GetGridView(): ASPxClientGridView
  /**
    * Cancels the current selection made by an end-user within the editor's dropdown grid and rolls back to the last confirmed selection. The selection can be confirmed by either pressing the Enter key or calling the ConfirmCurrentSelection method.
    */
  def RollbackToLastConfirmedSelection(): scala.Unit
}

