package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientControlsInitializedEventHandler
import typings.devexpressWeb.ASPxClientEventHandler
import typings.devexpressWeb.ASPxClientGlobalBeginCallbackEventHandler
import typings.devexpressWeb.ASPxClientGlobalCallbackErrorEventHandler
import typings.devexpressWeb.ASPxClientGlobalEndCallbackEventHandler
import typings.devexpressWeb.ASPxClientValidationCompletedEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxGlobalEvents component.
  */
@JSGlobal("ASPxClientGlobalEvents")
@js.native
class ASPxClientGlobalEvents ()
  extends typings.devexpressWeb.ASPxClientGlobalEvents {
  /**
    * Occurs when a callback for server-side processing is initiated by any DevExpress control.
    */
  /* CompleteClass */
  override var BeginCallback: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalBeginCallbackEventHandler[typings.devexpressWeb.ASPxClientGlobalEvents]
  ] = js.native
  /**
    * Occurs when the browser window is being resized.
    */
  /* CompleteClass */
  override var BrowserWindowResized: typings.devexpressWeb.ASPxClientEvent[ASPxClientEventHandler[typings.devexpressWeb.ASPxClientGlobalEvents]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by any of DevExpress web controls.
    */
  /* CompleteClass */
  override var CallbackError: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalCallbackErrorEventHandler[typings.devexpressWeb.ASPxClientGlobalEvents]
  ] = js.native
  /**
    * Occurs on the client side after client object models of all DevExpress web controls contained within the page have been initialized.
    */
  /* CompleteClass */
  override var ControlsInitialized: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientControlsInitializedEventHandler[typings.devexpressWeb.ASPxClientGlobalEvents]
  ] = js.native
  /**
    * Occurs on the client side, after server-side processing of a callback initiated by any DevExpress web control, has been completed.
    */
  /* CompleteClass */
  override var EndCallback: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalEndCallbackEventHandler[typings.devexpressWeb.ASPxClientGlobalEvents]
  ] = js.native
  /**
    * Occurs on the client side after the validation initiated for a DevExpress web control (or a group of DevExpress web controls) has been completed.
    */
  /* CompleteClass */
  override var ValidationCompleted: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientValidationCompletedEventHandler[typings.devexpressWeb.ASPxClientGlobalEvents]
  ] = js.native
}

