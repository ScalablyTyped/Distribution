package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the DataView extension.
  */
@JSGlobal("MVCxClientDataView")
@js.native
class MVCxClientDataView () extends ASPxClientDataView {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientDataView: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientDataView]] = js.native
  /**
    * Sends a callback with a parameter to update the DataView by processing the passed information on the server, in an Action specified via the DataView's DataViewSettings.CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the DataViewSettings.CustomActionRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Any): Unit = js.native
  def PerformCallback(data: js.Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}

/* static members */
@JSGlobal("MVCxClientDataView")
@js.native
object MVCxClientDataView extends js.Object {
  /**
    * Converts the specified object to the MVCxClientDataView type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientDataView = js.native
}

