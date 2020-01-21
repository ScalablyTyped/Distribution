package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the event object used for client-side events.
  */
@JSGlobal("ASPxClientEvent")
@js.native
class ASPxClientEvent[T] () extends js.Object {
  /**
    * Dynamically connects the event with an appropriate event handler function.
    * @param handler An object representing the event handling function's content.
    */
  def AddHandler(handler: T): Unit = js.native
  /**
    * Dynamically disconnects the event from all the associated event handler functions.
    */
  def ClearHandlers(): Unit = js.native
  /**
    * For internal use only.
    */
  def FireEvent(source: js.Any, e: ASPxClientEventArgs): Unit = js.native
  /**
    * Dynamically disconnects the event from the associated event handler function.
    * @param handler An object representing the event handling function's content.
    */
  def RemoveHandler(handler: T): Unit = js.native
}

