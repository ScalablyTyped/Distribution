package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientCallbackErrorEventHandler
import typings.devexpressWeb.ASPxClientControlsInitializedEventHandler
import typings.devexpressWeb.ASPxClientEndCallbackEventHandler
import typings.devexpressWeb.ASPxClientGlobalCallbackErrorEventHandler
import typings.devexpressWeb.ASPxClientGlobalEndCallbackEventHandler
import typings.devexpressWeb.MVCxClientBeginCallbackEventHandler
import typings.devexpressWeb.MVCxClientGlobalBeginCallbackEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An ASP.NET MVC equivalent of the client ASPxClientGlobalEvents component.
  */
@JSGlobal("MVCxClientGlobalEvents")
@js.native
class MVCxClientGlobalEvents ()
  extends typings.devexpressWeb.MVCxClientGlobalEvents {
  /**
    * Occurs on the client when a callback for server-side processing is initiated.
    */
  /* CompleteClass */
  override var BeginCallback: typings.devexpressWeb.ASPxClientEvent[
    MVCxClientGlobalBeginCallbackEventHandler[typings.devexpressWeb.MVCxClientGlobalEvents]
  ] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by a DevExpress MVC extension.
    */
  /* CompleteClass */
  override var CallbackError: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalCallbackErrorEventHandler[typings.devexpressWeb.MVCxClientGlobalEvents]
  ] = js.native
  /**
    * Occurs on the client side after client object models of all DevExpress MVC extensions contained within the page have been initialized.
    */
  /* CompleteClass */
  override var ControlsInitialized: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientControlsInitializedEventHandler[typings.devexpressWeb.MVCxClientGlobalEvents]
  ] = js.native
  /**
    * Occurs on the client after a callback's server-side processing has been completed.
    */
  /* CompleteClass */
  override var EndCallback: typings.devexpressWeb.ASPxClientEvent[
    ASPxClientGlobalEndCallbackEventHandler[typings.devexpressWeb.MVCxClientGlobalEvents]
  ] = js.native
}

/* static members */
@JSGlobal("MVCxClientGlobalEvents")
@js.native
object MVCxClientGlobalEvents extends js.Object {
  /**
    * Dynamically connects the MVCxClientGlobalEvents.BeginCallback client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  def AddBeginCallbackEventHandler(
    handler: typings.devexpressWeb.ASPxClientEvent[
      MVCxClientBeginCallbackEventHandler[typings.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = js.native
  /**
    * Dynamically connects the MVCxClientGlobalEvents.CallbackError client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  def AddCallbackErrorHandler(
    handler: typings.devexpressWeb.ASPxClientEvent[
      ASPxClientCallbackErrorEventHandler[typings.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = js.native
  /**
    * Dynamically connects the MVCxClientGlobalEvents.ControlsInitialized client event with an appropriate event handler function.
    * @param handler A object representing the event handling function's content.
    */
  def AddControlsInitializedEventHandler(
    handler: typings.devexpressWeb.ASPxClientEvent[
      ASPxClientControlsInitializedEventHandler[typings.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = js.native
  /**
    * Dynamically connects the MVCxClientGlobalEvents.EndCallback client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  def AddEndCallbackEventHandler(
    handler: typings.devexpressWeb.ASPxClientEvent[ASPxClientEndCallbackEventHandler[typings.devexpressWeb.MVCxClientGlobalEvents]]
  ): Unit = js.native
}

