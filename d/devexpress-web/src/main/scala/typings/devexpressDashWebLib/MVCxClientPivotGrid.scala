package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the PivotGrid extension.
  */
@js.native
trait MVCxClientPivotGrid extends ASPxClientPivotGrid {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientPivotGrid: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientPivotGrid]] = js.native
  /**
    * Passes PivotGrid callback parameters to the specified object.
    * @param obj An object that receives PivotGrid callback parameters.
    */
  def FillStateObject(obj: js.Object): scala.Unit = js.native
  /**
    * Sends a callback with a parameter to update the PivotGrid by processing the passed information on the server, in an Action specified via the grid's CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the grid's CustomActionRouteValues property.
    */
  def PerformCallback(data: js.Object): scala.Unit = js.native
  /**
    * Sends a callback with a parameter to update the PivotGrid by processing the passed information on the server, in an Action specified via the grid's CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the grid's CustomActionRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Object, onSuccess: js.Function1[/* arg1 */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

