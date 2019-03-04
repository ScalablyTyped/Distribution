package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MVCxClientGlobalEventsStatic extends js.Object {
  /**
    * Dynamically connects the BeginCallback client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  def AddBeginCallbackEventHandler(handler: MVCxClientBeginCallbackEventHandler[_]): scala.Unit
  /**
    * Dynamically connects the CallbackError client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  def AddCallbackErrorHandler(handler: ASPxClientCallbackErrorEventHandler[_]): scala.Unit
  /**
    * Dynamically connects the ControlsInitialized client event with an appropriate event handler function.
    * @param handler A object representing the event handling function's content.
    */
  def AddControlsInitializedEventHandler(handler: ASPxClientControlsInitializedEventHandler[_]): scala.Unit
  /**
    * Dynamically connects the EndCallback client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  def AddEndCallbackEventHandler(handler: ASPxClientEndCallbackEventHandler[_]): scala.Unit
}

object MVCxClientGlobalEventsStatic {
  @scala.inline
  def apply(
    AddBeginCallbackEventHandler: js.Function1[MVCxClientBeginCallbackEventHandler[_], scala.Unit],
    AddCallbackErrorHandler: js.Function1[ASPxClientCallbackErrorEventHandler[_], scala.Unit],
    AddControlsInitializedEventHandler: js.Function1[ASPxClientControlsInitializedEventHandler[_], scala.Unit],
    AddEndCallbackEventHandler: js.Function1[ASPxClientEndCallbackEventHandler[_], scala.Unit]
  ): MVCxClientGlobalEventsStatic = {
    val __obj = js.Dynamic.literal(AddBeginCallbackEventHandler = AddBeginCallbackEventHandler, AddCallbackErrorHandler = AddCallbackErrorHandler, AddControlsInitializedEventHandler = AddControlsInitializedEventHandler, AddEndCallbackEventHandler = AddEndCallbackEventHandler)
  
    __obj.asInstanceOf[MVCxClientGlobalEventsStatic]
  }
}

