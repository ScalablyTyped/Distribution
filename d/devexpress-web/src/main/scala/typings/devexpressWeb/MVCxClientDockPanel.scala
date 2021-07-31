package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side counterpart of the DockPanel extension.
  */
@js.native
trait MVCxClientDockPanel
  extends StObject
     with ASPxClientDockPanel {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientDockPanel: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientDockPanel]] = js.native
  
  /**
    * Sends a callback with a parameter to update the DockPanel by processing the passed information on the server, in an Action specified by the DockPanel's PopupControlSettingsBase.CallbackRouteValues (via the DockPanelSettings.CallbackRouteValues) property.
    * @param data An object containing any information that needs to be passed to a handling Action specified by the PopupControlSettingsBase.CallbackRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Any): Unit = js.native
  def PerformCallback(data: js.Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}
