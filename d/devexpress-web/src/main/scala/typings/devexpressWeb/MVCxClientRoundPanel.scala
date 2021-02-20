package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side counterpart of the RoundPanel extension.
  */
@js.native
trait MVCxClientRoundPanel extends ASPxClientRoundPanel {
  
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientRoundPanel: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientRoundPanel]] = js.native
  
  /**
    * Sends a callback with a parameter to update the Round Panel by processing the passed information on the server, in an Action specified by the Round Panel's RoundPanelSettings.CallbackRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified by the RoundPanelSettings.CallbackRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Any): Unit = js.native
  def PerformCallback(data: js.Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}
