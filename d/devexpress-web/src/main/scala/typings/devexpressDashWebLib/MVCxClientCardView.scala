package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A client-side counterpart of the CardView extension.
 */
@js.native
trait MVCxClientCardView extends ASPxClientCardView {
  /**
       * Occurs when a callback for server-side processing is initiated.
       */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientCardView: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientCardView]] = js.native
  /**
       * Sends a callback with a parameter to process the passed information on the server, in an Action specified via the CardView's CustomDataActionRouteValues property, and then process the returned result in the specified client function. This method does not update the CardView.
       * @param data An object containing any information that needs to be passed to a handling Action specified via the CustomDataActionRouteValues property.
       * @param onCallback A ASPxClientCardViewValuesCallback object that represents the JavaScript function which receives the information on the client side.
       */
  def GetValuesOnCustomCallback(data: js.Object, onCallback: ASPxClientCardViewValuesCallback): scala.Unit = js.native
  /**
       * Sends a callback with a parameter to update the CardView by processing the passed information on the server, in an Action specified via the CardView's CustomActionRouteValues property.
       * @param data An object containing any information that needs to be passed to a handling Action specified via the CardView's CustomActionRouteValues property.
       */
  def PerformCallback(data: js.Object): scala.Unit = js.native
  /**
       * Sends a callback with a parameter to update the CardView by processing the passed information on the server, in an Action specified via the CardView's CustomActionRouteValues property.
       * @param data An object containing any information that needs to be passed to a handling Action specified via the CardView's CustomActionRouteValues property.
       * @param onSuccess A client action to perform if the server round-trip completed successfully.
       */
  def PerformCallback(data: js.Object, onSuccess: js.Function1[/* arg1 */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

