package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientCallbackErrorEventHandler
import typings.devexpressWeb.ASPxClientControlsInitializedEventHandler
import typings.devexpressWeb.ASPxClientEndCallbackEventHandler
import typings.devexpressWeb.MVCxClientBeginCallbackEventHandler
import org.scalablytyped.runtime.StObject
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
object MVCxClientGlobalEvents {
  
  /**
    * Dynamically connects the MVCxClientGlobalEvents.BeginCallback client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  /* static member */
  @JSGlobal("MVCxClientGlobalEvents.AddBeginCallbackEventHandler")
  @js.native
  def AddBeginCallbackEventHandler(
    handler: typings.devexpressWeb.ASPxClientEvent[
      MVCxClientBeginCallbackEventHandler[typings.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = js.native
  
  /**
    * Dynamically connects the MVCxClientGlobalEvents.CallbackError client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  /* static member */
  @JSGlobal("MVCxClientGlobalEvents.AddCallbackErrorHandler")
  @js.native
  def AddCallbackErrorHandler(
    handler: typings.devexpressWeb.ASPxClientEvent[
      ASPxClientCallbackErrorEventHandler[typings.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = js.native
  
  /**
    * Dynamically connects the MVCxClientGlobalEvents.ControlsInitialized client event with an appropriate event handler function.
    * @param handler A object representing the event handling function's content.
    */
  /* static member */
  @JSGlobal("MVCxClientGlobalEvents.AddControlsInitializedEventHandler")
  @js.native
  def AddControlsInitializedEventHandler(
    handler: typings.devexpressWeb.ASPxClientEvent[
      ASPxClientControlsInitializedEventHandler[typings.devexpressWeb.MVCxClientGlobalEvents]
    ]
  ): Unit = js.native
  
  /**
    * Dynamically connects the MVCxClientGlobalEvents.EndCallback client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  /* static member */
  @JSGlobal("MVCxClientGlobalEvents.AddEndCallbackEventHandler")
  @js.native
  def AddEndCallbackEventHandler(
    handler: typings.devexpressWeb.ASPxClientEvent[ASPxClientEndCallbackEventHandler[typings.devexpressWeb.MVCxClientGlobalEvents]]
  ): Unit = js.native
}
