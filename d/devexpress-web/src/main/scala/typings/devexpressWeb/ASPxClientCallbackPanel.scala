package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxCallbackPanel control.
  */
@js.native
trait ASPxClientCallbackPanel extends ASPxClientPanel {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientCallbackPanel]] = js.native
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientCallbackPanel.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientCallbackPanel]] = js.native
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientCallbackPanel]] = js.native
  
  /**
    * Returns the text displayed within the control's loading panel.
    */
  def GetLoadingPanelText(): String = js.native
  
  /**
    * Sends a callback to the server and generates the server-side ASPxCallbackPanel.Callback event, passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side ASPxCallbackPanel.Callback event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(parameter: String): Unit = js.native
  def PerformCallback(parameter: String, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
  
  /**
    * Sets the text to be displayed within the control's loading panel.
    * @param loadingPanelText A string value specifying the text to be displayed within the loading panel.
    */
  def SetLoadingPanelText(loadingPanelText: String): Unit = js.native
}
