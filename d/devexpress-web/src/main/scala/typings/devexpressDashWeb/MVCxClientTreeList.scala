package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the TreeList extension.
  */
@js.native
trait MVCxClientTreeList extends ASPxClientTreeList {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientTreeList: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientTreeList]] = js.native
  /**
    * Sends a callback with a parameter to update the TreeList by processing the passed information on the server, in an Action specified via the TreeList's CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the CustomActionRouteValues property.
    */
  def PerformCallback(data: js.Object): Unit = js.native
  /**
    * Sends a callback with a parameter to update the TreeList by processing the passed information on the server, in an Action specified via the TreeList's CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the CustomActionRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Object, onSuccess: js.Function1[/* arg1 */ String, Unit]): Unit = js.native
  /**
    * Sends a callback with a parameter to process the passed information on the server, in an Action specified via the TreeList's CustomDataCallback event. This method does not update the TreeList.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the CustomDataActionRouteValues property.
    */
  def PerformCustomDataCallback(data: js.Object): Unit = js.native
}

