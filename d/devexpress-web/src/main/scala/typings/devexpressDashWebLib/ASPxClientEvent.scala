package typings
package devexpressDashWebLib

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
  def AddHandler(handler: T): scala.Unit
  /**
    * Dynamically disconnects the event from all the associated event handler functions.
    */
  def ClearHandlers(): scala.Unit
  /**
    * For internal use only.
    * @param source 
    * @param e 
    */
  def FireEvent(source: js.Object, e: ASPxClientEventArgs): scala.Unit
  /**
    * Dynamically disconnects the event from the associated event handler function.
    * @param handler An object representing the event handling function's content.
    */
  def RemoveHandler(handler: T): scala.Unit
}

object ASPxClientEvent {
  @scala.inline
  def apply[T](
    AddHandler: T => scala.Unit,
    ClearHandlers: () => scala.Unit,
    FireEvent: (js.Object, ASPxClientEventArgs) => scala.Unit,
    RemoveHandler: T => scala.Unit
  ): ASPxClientEvent[T] = {
    val __obj = js.Dynamic.literal(AddHandler = js.Any.fromFunction1(AddHandler), ClearHandlers = js.Any.fromFunction0(ClearHandlers), FireEvent = js.Any.fromFunction2(FireEvent), RemoveHandler = js.Any.fromFunction1(RemoveHandler))
  
    __obj.asInstanceOf[ASPxClientEvent[T]]
  }
}

