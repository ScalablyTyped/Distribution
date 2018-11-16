package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A client-side equivalent of the ASPxSpreadsheet object.
 */
@js.native
trait ASPxClientSpreadsheet extends ASPxClientControl {
  /**
       * Occurs when a callback for server-side processing is initiated.
       */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientSpreadsheet]] = js.native
  /**
       * Fires after a client change has been made to the document and the client-server synchronization starts to apply the change on the server.
       */
  var BeginSynchronization: ASPxClientEvent[ASPxClientSpreadsheetSynchronizationEventHandler[ASPxClientSpreadsheet]] = js.native
  /**
       * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientSpreadsheet.
       */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientSpreadsheet]] = js.native
  /**
       * Occurs after a custom command has been executed on the client side.
       */
  var CustomCommandExecuted: ASPxClientEvent[ASPxClientSpreadsheetCustomCommandExecutedEventHandler[ASPxClientSpreadsheet]] = js.native
  /**
       * Fires if any change is made to the Spreadsheet's document on the client.
       */
  var DocumentChanged: ASPxClientEvent[ASPxClientSpreadsheetDocumentChangedEventHandler[ASPxClientSpreadsheet]] = js.native
  /**
       * Occurs on the client side after a callback's server-side processing has been completed.
       */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientSpreadsheet]] = js.native
  /**
       * Fires after a document change has been applied to the server and server and client document models have been synchronized.
       */
  var EndSynchronization: ASPxClientEvent[ASPxClientSpreadsheetSynchronizationEventHandler[ASPxClientSpreadsheet]] = js.native
  /**
       * Occurs on the client side after a hyperlink is clicked within the Spreadsheet's document.
       */
  var HyperlinkClick: ASPxClientEvent[ASPxClientSpreadsheetHyperlinkClickEventHandler[ASPxClientSpreadsheet]] = js.native
  /**
       * Occurs before the context menu is displayed and allows menu customization.
       */
  var PopupMenuShowing: ASPxClientEvent[ASPxClientSpreadsheetPopupMenuShowingEventHandler[ASPxClientSpreadsheet]] = js.native
  /**
       * Occurs on the client when a selection is changed in the ASPxSpreadsheet.
       */
  var SelectionChanged: ASPxClientEvent[ASPxClientSpreadsheetSelectionChangedEventHandler[ASPxClientSpreadsheet]] = js.native
  /**
       * Sets input focus to the Spreadsheet.
       */
  def Focus(): scala.Unit = js.native
  /**
       * Gets the value of the currently active cell.
       */
  def GetActiveCellValue(): js.Object = js.native
  /**
       * Returns the comment associated with the specified data cell.
       * @param colModelIndex An integer value specifying the data cell's column index.
       * @param rowModelIndex An integer value specifying the data cell's row index.
       */
  def GetCellComment(colModelIndex: scala.Double, rowModelIndex: scala.Double): js.Object = js.native
  /**
       * Gets the value of the specified cell.
       * @param colModelIndex An integer value specifying the cell's column index.
       * @param rowModelIndex An integer value specifying the cell's row index.
       */
  def GetCellValue(colModelIndex: scala.Double, rowModelIndex: scala.Double): js.Object = js.native
  /**
       * Gets access to the client ribbon object.
       */
  def GetRibbon(): ASPxClientRibbon = js.native
  /**
       * Returns the current selection made in a Spreadsheet.
       */
  def GetSelection(): ASPxClientSpreadsheetSelection = js.native
  /**
       * Indicates whether any unsaved changes are contained in the current document.
       */
  def HasUnsavedChanges(): scala.Boolean = js.native
  /**
       * Sends a callback to the server and generates the server-side Callback event, passing it the specified argument.
       * @param parameter A string value that represents any information that needs to be sent to the server-side event.
       */
  def PerformCallback(parameter: java.lang.String): scala.Unit = js.native
  /**
       * Sends a callback to the server and generates the server-side Callback event, passing it the specified argument.
       * @param parameter A string value that represents any information that needs to be sent to the server-side event.
       * @param onSuccess A client action to perform if the server round-trip completed successfully.
       */
  def PerformCallback(parameter: java.lang.String, onSuccess: js.Function1[/* arg1 */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
       * Sends a callback to the server and generates the server-side DocumentCallback event, passing it the specified argument.
       * @param parameter A string value that represents any information that needs to be sent to the server-side DocumentCallback event.
       */
  def PerformDocumentCallback(parameter: java.lang.String): scala.Unit = js.native
  /**
       * Reconnects the Spreadsheet to an external ribbon.
       */
  def ReconnectToExternalRibbon(): scala.Unit = js.native
  /**
       * Enables you to switch the full-screen mode of the Spreadsheet.
       * @param fullscreen true to activate full-screen mode; false to deactivate full-screen mode.
       */
  def SetFullscreenMode(fullscreen: scala.Boolean): scala.Unit = js.native
}

