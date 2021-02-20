package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the ASPxPivotGrid control.
  */
@js.native
trait ASPxClientPivotGrid extends ASPxClientControl {
  
  /** @deprecated Use the EndCallback event instead */
  /**
    * Fires after a callback that has been processed on the server returns back to the client.
    */
  var AfterCallback: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPivotGrid]] = js.native
  
  /** @deprecated Use the BeginCallback event instead */
  /**
    * Fires before a callback is sent to the server for server-side processing.
    */
  var BeforeCallback: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPivotGrid]] = js.native
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientPivotGrid]] = js.native
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientPivotGrid.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientPivotGrid]] = js.native
  
  /**
    * Occurs when a cell is clicked.
    */
  var CellClick: ASPxClientEvent[ASPxClientClickEventHandler[ASPxClientPivotGrid]] = js.native
  
  /**
    * Occurs when a cell is double clicked.
    */
  var CellDblClick: ASPxClientEvent[ASPxClientClickEventHandler[ASPxClientPivotGrid]] = js.native
  
  /**
    * Switches the customization form's visible state.
    */
  def ChangeCustomizationFieldsVisibility(): Unit = js.native
  
  /**
    * Enables or disables the current filter displayed in the Filter Panel.
    */
  def ChangeFilterEnabled(): Unit = js.native
  
  /**
    * Enables or disables the current filter applied by the Filter Editor (Prefilter).
    */
  def ChangePrefilterEnabled(): Unit = js.native
  
  /**
    * Clears the filter expression displayed in the Filter Panel.
    */
  def ClearFilter(): Unit = js.native
  
  /**
    * Clears the filter expression displayed in the Filter Panel.
    */
  def ClearPrefilter(): Unit = js.native
  
  /**
    * Fires on the client side after the customization form's visible state has been changed.
    */
  var CustomizationFieldsVisibleChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientPivotGrid]] = js.native
  
  /**
    * Occurs on the client after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientPivotGrid]] = js.native
  
  /**
    * Returns a value that specifies whether the customization form is visible.
    */
  def GetCustomizationFieldsVisibility(): Boolean = js.native
  
  /**
    * Hides the Filter Editor.
    */
  def HideFilterEditor(): Unit = js.native
  
  /**
    * Hides the Filter Editor.
    */
  def HidePrefilter(): Unit = js.native
  
  /**
    * Indicates whether the Defer Layout Update check box is enabled.
    */
  def IsDeferUpdatesChecked(): Boolean = js.native
  
  /**
    * Indicates whether the Filter Editor is visible.
    */
  def IsFilterEditorVisible(): Boolean = js.native
  
  /**
    * Indicates whether the Filter Editor (Prefilter) is visible.
    */
  def IsPrefilterVisible(): Boolean = js.native
  
  /**
    * Sends a callback to the server and generates the server-side ASPxPivotGrid.CustomCallback event, passing it the specified argument.
    * @param args A string value that represents any information that needs to be sent to the server-side ASPxPivotGrid.CustomCallback event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(args: String): Unit = js.native
  def PerformCallback(args: String, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
  
  /**
    * Occurs when a custom menu item has been clicked.
    */
  var PopupMenuItemClick: ASPxClientEvent[ASPxClientPivotMenuItemClickEventHandler[ASPxClientPivotGrid]] = js.native
  
  /**
    * Specifies the visibility of the customization form.
    * @param value true to display the customization form; false to hide the customization form.
    */
  def SetCustomizationFieldsVisibility(value: Boolean): Unit = js.native
  
  /**
    * Shows the Filter Editor.
    */
  def ShowFilterEditor(): Unit = js.native
  
  /**
    * Shows the Filter Editor.
    */
  def ShowPrefilter(): Unit = js.native
}
