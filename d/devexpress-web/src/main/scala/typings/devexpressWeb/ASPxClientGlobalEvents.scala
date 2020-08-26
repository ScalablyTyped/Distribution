package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxGlobalEvents component.
  */
@js.native
trait ASPxClientGlobalEvents extends js.Object {
  /**
    * Occurs when a callback for server-side processing is initiated by any DevExpress control.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientGlobalBeginCallbackEventHandler[ASPxClientGlobalEvents]] = js.native
  /**
    * Occurs when the browser window is being resized.
    */
  var BrowserWindowResized: ASPxClientEvent[ASPxClientEventHandler[ASPxClientGlobalEvents]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by any of DevExpress web controls.
    */
  var CallbackError: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[ASPxClientGlobalEvents]] = js.native
  /**
    * Occurs on the client side after client object models of all DevExpress web controls contained within the page have been initialized.
    */
  var ControlsInitialized: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[ASPxClientGlobalEvents]] = js.native
  /**
    * Occurs on the client side, after server-side processing of a callback initiated by any DevExpress web control, has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[ASPxClientGlobalEvents]] = js.native
  /**
    * Occurs on the client side after the validation initiated for a DevExpress web control (or a group of DevExpress web controls) has been completed.
    */
  var ValidationCompleted: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientGlobalEvents]] = js.native
}

object ASPxClientGlobalEvents {
  @scala.inline
  def apply(
    BeginCallback: ASPxClientEvent[ASPxClientGlobalBeginCallbackEventHandler[ASPxClientGlobalEvents]],
    BrowserWindowResized: ASPxClientEvent[ASPxClientEventHandler[ASPxClientGlobalEvents]],
    CallbackError: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[ASPxClientGlobalEvents]],
    ControlsInitialized: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[ASPxClientGlobalEvents]],
    EndCallback: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[ASPxClientGlobalEvents]],
    ValidationCompleted: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientGlobalEvents]]
  ): ASPxClientGlobalEvents = {
    val __obj = js.Dynamic.literal(BeginCallback = BeginCallback.asInstanceOf[js.Any], BrowserWindowResized = BrowserWindowResized.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], ControlsInitialized = ControlsInitialized.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], ValidationCompleted = ValidationCompleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientGlobalEvents]
  }
  @scala.inline
  implicit class ASPxClientGlobalEventsOps[Self <: ASPxClientGlobalEvents] (val x: Self) extends AnyVal {
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
    def setBeginCallback(value: ASPxClientEvent[ASPxClientGlobalBeginCallbackEventHandler[ASPxClientGlobalEvents]]): Self = this.set("BeginCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowserWindowResized(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientGlobalEvents]]): Self = this.set("BrowserWindowResized", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallbackError(value: ASPxClientEvent[ASPxClientGlobalCallbackErrorEventHandler[ASPxClientGlobalEvents]]): Self = this.set("CallbackError", value.asInstanceOf[js.Any])
    @scala.inline
    def setControlsInitialized(value: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[ASPxClientGlobalEvents]]): Self = this.set("ControlsInitialized", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndCallback(value: ASPxClientEvent[ASPxClientGlobalEndCallbackEventHandler[ASPxClientGlobalEvents]]): Self = this.set("EndCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidationCompleted(value: ASPxClientEvent[ASPxClientValidationCompletedEventHandler[ASPxClientGlobalEvents]]): Self = this.set("ValidationCompleted", value.asInstanceOf[js.Any])
  }
  
}

