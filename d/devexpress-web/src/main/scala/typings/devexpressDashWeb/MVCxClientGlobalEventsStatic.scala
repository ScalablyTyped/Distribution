package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MVCxClientGlobalEventsStatic extends js.Object {
  /**
    * Dynamically connects the BeginCallback client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  def AddBeginCallbackEventHandler(handler: MVCxClientBeginCallbackEventHandler[_]): Unit
  /**
    * Dynamically connects the CallbackError client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  def AddCallbackErrorHandler(handler: ASPxClientCallbackErrorEventHandler[_]): Unit
  /**
    * Dynamically connects the ControlsInitialized client event with an appropriate event handler function.
    * @param handler A object representing the event handling function's content.
    */
  def AddControlsInitializedEventHandler(handler: ASPxClientControlsInitializedEventHandler[_]): Unit
  /**
    * Dynamically connects the EndCallback client event with an appropriate event handler function.
    * @param handler A object containing the event handling function's content.
    */
  def AddEndCallbackEventHandler(handler: ASPxClientEndCallbackEventHandler[_]): Unit
}

object MVCxClientGlobalEventsStatic {
  @scala.inline
  def apply(
    AddBeginCallbackEventHandler: MVCxClientBeginCallbackEventHandler[_] => Unit,
    AddCallbackErrorHandler: ASPxClientCallbackErrorEventHandler[_] => Unit,
    AddControlsInitializedEventHandler: ASPxClientControlsInitializedEventHandler[_] => Unit,
    AddEndCallbackEventHandler: ASPxClientEndCallbackEventHandler[_] => Unit
  ): MVCxClientGlobalEventsStatic = {
    val __obj = js.Dynamic.literal(AddBeginCallbackEventHandler = js.Any.fromFunction1(AddBeginCallbackEventHandler), AddCallbackErrorHandler = js.Any.fromFunction1(AddCallbackErrorHandler), AddControlsInitializedEventHandler = js.Any.fromFunction1(AddControlsInitializedEventHandler), AddEndCallbackEventHandler = js.Any.fromFunction1(AddEndCallbackEventHandler))
  
    __obj.asInstanceOf[MVCxClientGlobalEventsStatic]
  }
}

