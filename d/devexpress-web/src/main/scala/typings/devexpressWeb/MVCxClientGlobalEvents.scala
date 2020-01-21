package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An ASP.NET MVC equivalent of the client ASPxClientGlobalEvents component.
  */
@JSGlobal("MVCxClientGlobalEvents")
@js.native
class MVCxClientGlobalEvents () extends js.Object {
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

/* static members */
@JSGlobal("MVCxClientGlobalEvents")
@js.native
object MVCxClientGlobalEvents extends js.Object {
  /**
    * Dynamically connects the MVCxClientGlobalEvents.BeginCallback client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  def AddBeginCallbackEventHandler(handler: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientGlobalEvents]]): Unit = js.native
  /**
    * Dynamically connects the MVCxClientGlobalEvents.CallbackError client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  def AddCallbackErrorHandler(handler: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[MVCxClientGlobalEvents]]): Unit = js.native
  /**
    * Dynamically connects the MVCxClientGlobalEvents.ControlsInitialized client event with an appropriate event handler function.
    * @param handler A object representing the event handling function's content.
    */
  def AddControlsInitializedEventHandler(handler: ASPxClientEvent[ASPxClientControlsInitializedEventHandler[MVCxClientGlobalEvents]]): Unit = js.native
  /**
    * Dynamically connects the MVCxClientGlobalEvents.EndCallback client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  def AddEndCallbackEventHandler(handler: ASPxClientEvent[ASPxClientEndCallbackEventHandler[MVCxClientGlobalEvents]]): Unit = js.native
}

