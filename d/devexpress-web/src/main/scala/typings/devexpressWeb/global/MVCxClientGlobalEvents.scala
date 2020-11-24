package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientCallbackErrorEventHandler
import typings.devexpressWeb.ASPxClientControlsInitializedEventHandler
import typings.devexpressWeb.ASPxClientEndCallbackEventHandler
import typings.devexpressWeb.MVCxClientBeginCallbackEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An ASP.NET MVC equivalent of the client ASPxClientGlobalEvents component.
  */
@JSGlobal("MVCxClientGlobalEvents")
@js.native
class MVCxClientGlobalEvents ()
  extends typings.devexpressWeb.MVCxClientGlobalEvents
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
