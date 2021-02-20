package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a client-side equivalent of the ASPxCallback control.
  */
@js.native
trait ASPxClientCallback extends ASPxClientControl {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientCallback]] = js.native
  
  /**
    * Fires on the client side when a callback initiated by the client ASPxClientCallback.PerformCallback method and processed within the server ASPxCallback.Callback event's handler returns back to the client.
    */
  var CallbackComplete: ASPxClientEvent[ASPxClientCallbackCompleteEventHandler[ASPxClientCallback]] = js.native
  
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientCallback.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientCallback]] = js.native
  
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientCallback]] = js.native
  
  /**
    * Sends a callback to the server and generates the server-side ASPxCallback.Callback event, passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side ASPxCallback.Callback event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(parameter: String): Unit = js.native
  def PerformCallback(parameter: String, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
  
  /** @deprecated Use the PerformCallback method instead. */
  /**
    * Sends a callback to the server and generates the server-side ASPxCallback.Callback event passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side ASPxCallback.Callback event.
    */
  def SendCallback(parameter: String): Unit = js.native
}
