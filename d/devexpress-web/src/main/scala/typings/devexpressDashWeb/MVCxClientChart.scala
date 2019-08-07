package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the Chart extension.
  */
@JSGlobal("MVCxClientChart")
@js.native
class MVCxClientChart () extends ASPxClientWebChartControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientChart: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientChart]] = js.native
  /**
    * Sends a callback with a parameter to update a Chart by processing the passed information on the server, in an Action specified via the Chart's ChartControlSettings.CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the ChartControlSettings.CustomActionRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Any): Unit = js.native
  def PerformCallback(data: js.Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}

/* static members */
@JSGlobal("MVCxClientChart")
@js.native
object MVCxClientChart extends js.Object {
  /**
    * Converts the specified object to the MVCxClientChart type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientChart = js.native
}

