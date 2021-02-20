package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the event object used for client-side events.
  */
@js.native
trait ASPxClientEvent[T] extends StObject {
  
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
object ASPxClientEvent {
  
  @scala.inline
  def apply[T](
    AddHandler: T => Unit,
    ClearHandlers: () => Unit,
    FireEvent: (js.Any, ASPxClientEventArgs) => Unit,
    RemoveHandler: T => Unit
  ): ASPxClientEvent[T] = {
    val __obj = js.Dynamic.literal(AddHandler = js.Any.fromFunction1(AddHandler), ClearHandlers = js.Any.fromFunction0(ClearHandlers), FireEvent = js.Any.fromFunction2(FireEvent), RemoveHandler = js.Any.fromFunction1(RemoveHandler))
    __obj.asInstanceOf[ASPxClientEvent[T]]
  }
  
  @scala.inline
  implicit class ASPxClientEventMutableBuilder[Self <: ASPxClientEvent[_], T] (val x: Self with ASPxClientEvent[T]) extends AnyVal {
    
    @scala.inline
    def setAddHandler(value: T => Unit): Self = StObject.set(x, "AddHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClearHandlers(value: () => Unit): Self = StObject.set(x, "ClearHandlers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFireEvent(value: (js.Any, ASPxClientEventArgs) => Unit): Self = StObject.set(x, "FireEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveHandler(value: T => Unit): Self = StObject.set(x, "RemoveHandler", js.Any.fromFunction1(value))
  }
}
