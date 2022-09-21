package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side counterpart of the Chart extension.
  */
@js.native
trait MVCxClientChart
  extends StObject
     with ASPxClientWebChartControl {
  
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
  def PerformCallback(data: Any): Unit = js.native
  def PerformCallback(data: Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}
