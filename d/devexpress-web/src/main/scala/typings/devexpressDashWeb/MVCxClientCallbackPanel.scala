package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the CallbackPanel extension.
  */
@JSGlobal("MVCxClientCallbackPanel")
@js.native
class MVCxClientCallbackPanel () extends ASPxClientCallbackPanel {
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
  def PerformCallback(data: js.Any): Unit = js.native
  def PerformCallback(data: js.Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}

/* static members */
@JSGlobal("MVCxClientCallbackPanel")
@js.native
object MVCxClientCallbackPanel extends js.Object {
  /**
    * Converts the specified object to the MVCxClientCallbackPanel type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientCallbackPanel = js.native
}

