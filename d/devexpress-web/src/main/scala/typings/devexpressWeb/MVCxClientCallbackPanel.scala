package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side counterpart of the CallbackPanel extension.
  */
@js.native
trait MVCxClientCallbackPanel
  extends StObject
     with ASPxClientCallbackPanel {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientCallbackPanel: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientCallbackPanel]] = js.native
  
  /**
    * Sends a callback with a parameter to update the Callback Panel by processing the passed information on the server, in an Action specified by the Callback Panel's CallbackPanelSettings.CallbackRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified by the CallbackPanelSettings.CallbackRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: Any): Unit = js.native
  def PerformCallback(data: Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}
