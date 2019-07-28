package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the event object used for client-side events.
  */
trait ASPxClientEvent[T] extends js.Object {
  /**
    * Dynamically connects the event with an appropriate event handler function.
    * @param handler An object representing the event handling function's content.
    */
  def AddHandler(handler: T): Unit
  /**
    * Dynamically disconnects the event from all the associated event handler functions.
    */
  def ClearHandlers(): Unit
  /**
    * For internal use only.
    * @param source 
    * @param e 
    */
  def FireEvent(source: js.Object, e: ASPxClientEventArgs): Unit
  /**
    * Dynamically disconnects the event from the associated event handler function.
    * @param handler An object representing the event handling function's content.
    */
  def RemoveHandler(handler: T): Unit
}

object ASPxClientEvent {
  @scala.inline
  def apply[T](
    AddHandler: T => Unit,
    ClearHandlers: () => Unit,
    FireEvent: (js.Object, ASPxClientEventArgs) => Unit,
    RemoveHandler: T => Unit
  ): ASPxClientEvent[T] = {
    val __obj = js.Dynamic.literal(AddHandler = js.Any.fromFunction1(AddHandler), ClearHandlers = js.Any.fromFunction0(ClearHandlers), FireEvent = js.Any.fromFunction2(FireEvent), RemoveHandler = js.Any.fromFunction1(RemoveHandler))
  
    __obj.asInstanceOf[ASPxClientEvent[T]]
  }
}

