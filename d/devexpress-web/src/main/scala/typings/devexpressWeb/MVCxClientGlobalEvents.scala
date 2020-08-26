package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An ASP.NET MVC equivalent of the client ASPxClientGlobalEvents component.
  */
@js.native
trait MVCxClientGlobalEvents extends js.Object {
  /**
    * Occurs on the client when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[MVCxClientGlobalBeginCallbackEventHandler[MVCxClientGlobalEvents]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by a DevExpress MVC extension.
    */
  var CallbackError: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[MVCxClientGlobalEvents]] = js.native
  /**
    * Occurs on the client side after client object models of all DevExpress MVC extensions contained within the page have been initialized.
    */
  var ControlsInitialized: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[MVCxClientGlobalEvents]] = js.native
  /**
    * Occurs on the client after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[MVCxClientGlobalEvents]] = js.native
}

object MVCxClientGlobalEvents {
  @scala.inline
  def apply(
    BeginCallback: ASPxClientEvent[MVCxClientGlobalBeginCallbackEventHandler[MVCxClientGlobalEvents]],
    CallbackError: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[MVCxClientGlobalEvents]],
    ControlsInitialized: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[MVCxClientGlobalEvents]],
    EndCallback: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[MVCxClientGlobalEvents]]
  ): MVCxClientGlobalEvents = {
    val __obj = js.Dynamic.literal(BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], ControlsInitialized = ControlsInitialized.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientGlobalEvents]
  }
  @scala.inline
  implicit class MVCxClientGlobalEventsOps[Self <: MVCxClientGlobalEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBeginCallback(value: ASPxClientEvent[MVCxClientGlobalBeginCallbackEventHandler[MVCxClientGlobalEvents]]): Self = this.set("BeginCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallbackError(value: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[MVCxClientGlobalEvents]]): Self = this.set("CallbackError", value.asInstanceOf[js.Any])
    @scala.inline
    def setControlsInitialized(value: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[MVCxClientGlobalEvents]]): Self = this.set("ControlsInitialized", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndCallback(value: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[MVCxClientGlobalEvents]]): Self = this.set("EndCallback", value.asInstanceOf[js.Any])
  }
  
}

