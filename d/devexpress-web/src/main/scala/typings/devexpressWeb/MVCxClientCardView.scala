package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the CardView extension.
  */
@JSGlobal("MVCxClientCardView")
@js.native
class MVCxClientCardView () extends ASPxClientCardView {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientCardView: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientCardView]] = js.native
  /**
    * Sends a callback with a parameter to process the passed information on the server, in an Action specified via the CardView's GridSettingsBase.CustomDataActionRouteValues property, and then process the returned result in the specified client function. This method does not update the CardView.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the GridSettingsBase.CustomDataActionRouteValues property.
    * @param onCallback A ASPxClientCardViewValuesCallback object that represents the JavaScript function which receives the information on the client side.
    */
  def GetValuesOnCustomCallback(data: js.Any, onCallback: ASPxClientCardViewValuesCallback): Unit = js.native
  /**
    * Sends a callback with a parameter to update the CardView by processing the passed information on the server, in an Action specified via the CardView's GridSettingsBase.CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the CardView's GridSettingsBase.CustomActionRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Any): Unit = js.native
  def PerformCallback(data: js.Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
}

/* static members */
@JSGlobal("MVCxClientCardView")
@js.native
object MVCxClientCardView extends js.Object {
  /**
    * Converts the specified object to the MVCxClientCardView type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientCardView = js.native
}

