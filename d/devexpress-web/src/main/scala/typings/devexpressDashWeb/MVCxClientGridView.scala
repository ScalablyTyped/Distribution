package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the GridView extension.
  */
@js.native
trait MVCxClientGridView extends ASPxClientGridView {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientGridView: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientGridView]] = js.native
  /**
    * Sends a callback with a parameter to process the passed information on the server, in an Action specified via the GridView's CustomDataActionRouteValues property, and then process the returned result in the specified client function. This method does not update the GridView.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the CustomDataActionRouteValues property.
    * @param onCallback A ASPxClientGridViewValuesCallback object that represents the JavaScript function which receives the information on the client side.
    */
  def GetValuesOnCustomCallback(data: js.Object, onCallback: ASPxClientGridViewValuesCallback): Unit = js.native
  /**
    * Sends a callback with a parameter to update the GridView by processing the passed information on the server, in an Action specified via the grid's CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the grid's CustomActionRouteValues property.
    */
  def PerformCallback(data: js.Object): Unit = js.native
  /**
    * Sends a callback with a parameter to update the GridView by processing the passed information on the server, in an Action specified via the grid's CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the grid's CustomActionRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Object, onSuccess: js.Function1[/* arg1 */ String, Unit]): Unit = js.native
}

