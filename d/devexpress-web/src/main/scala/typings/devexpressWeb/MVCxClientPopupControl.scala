package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the PopupControl extension.
  */
@JSGlobal("MVCxClientPopupControl")
@js.native
class MVCxClientPopupControl () extends ASPxClientPopupControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientPopupControl: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientPopupControl]] = js.native
  /**
    * Sends a callback with a parameter to update the PopupControl by processing the passed information on the server, in an Action specified via the PopupControl's PopupControlSettingsBase.CallbackRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the PopupControlSettingsBase.CallbackRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Any): Unit = js.native
  def PerformCallback(data: js.Any, onSuccess: js.Function1[/* arg */ String, Unit]): Unit = js.native
  /**
    * Sends a callback with a parameters to update the popup window by processing the related popup window and the passed information on the server, in an Action specified by the PopupControl's PopupControlSettingsBase.CallbackRouteValues property.
    * @param window A ASPxClientPopupWindow object identifying the processed popup window.
    * @param data An object containing any information that needs to be passed to a handling Action specified by the PopupControlSettingsBase.CallbackRouteValues property.
    */
  def PerformWindowCallback(window: ASPxClientPopupWindow, data: js.Any): Unit = js.native
}

/* static members */
@JSGlobal("MVCxClientPopupControl")
@js.native
object MVCxClientPopupControl extends js.Object {
  /**
    * Converts the specified object to the MVCxClientPopupControl type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientPopupControl = js.native
}

