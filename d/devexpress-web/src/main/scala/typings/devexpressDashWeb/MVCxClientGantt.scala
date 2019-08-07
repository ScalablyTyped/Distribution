package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the Gantt extension.
  */
@JSGlobal("MVCxClientGantt")
@js.native
class MVCxClientGantt () extends ASPxClientGantt {
  /**
    * Occurs when you initiates a callback to the server side.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientGantt: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientGantt]] = js.native
  /**
    * Sends a callback with a parameter to update the Gantt by processing the passed information on the server, in an Action specified via the gantts CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the gantt's CustomActionRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Any): Unit = js.native
  def PerformCallback(data: js.Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
  /**
    * Sends a callback with a parameter to process the passed information on the server, in an Action specified via the Gantt's CustomDataActionRouteValues property, and then returns the processing result to the client, to the ASPxClientGantt.PerformCustomDataCallback event. This method does not update the Gantt.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the CustomDataActionRouteValues property.
    */
  def PerformCustomDataCallback(data: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("MVCxClientGantt")
@js.native
object MVCxClientGantt extends js.Object {
  /**
    * Converts the specified object to the MVCxClientGantt type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientGantt = js.native
}

