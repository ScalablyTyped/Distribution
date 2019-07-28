package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the CallbackPanel extension.
  */
@js.native
trait MVCxClientCallbackPanel extends ASPxClientCallbackPanel {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientCallbackPanel: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientCallbackPanel]] = js.native
  /**
    * Sends a callback with a parameter to update the Callback Panel by processing the passed information on the server, in an Action specified by the Callback Panel's CallbackRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified by the CallbackRouteValues property.
    */
  def PerformCallback(data: js.Object): Unit = js.native
  /**
    * Sends a callback with a parameter to update the Callback Panel by processing the passed information on the server, in an Action specified by the Callback Panel's CallbackRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified by the CallbackRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Object, onSuccess: js.Function1[/* arg1 */ String, Unit]): Unit = js.native
}

