package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the event object used for client-side events.
  */
trait ASPxClientEvent[T] extends StObject {
  
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
    */
  def FireEvent(source: Any, e: ASPxClientEventArgs): Unit
  
  /**
    * Dynamically disconnects the event from the associated event handler function.
    * @param handler An object representing the event handling function's content.
    */
  def RemoveHandler(handler: T): Unit
}
object ASPxClientEvent {
  
  inline def apply[T](
    AddHandler: T => Unit,
    ClearHandlers: () => Unit,
    FireEvent: (Any, ASPxClientEventArgs) => Unit,
    RemoveHandler: T => Unit
  ): ASPxClientEvent[T] = {
    val __obj = js.Dynamic.literal(AddHandler = js.Any.fromFunction1(AddHandler), ClearHandlers = js.Any.fromFunction0(ClearHandlers), FireEvent = js.Any.fromFunction2(FireEvent), RemoveHandler = js.Any.fromFunction1(RemoveHandler))
    __obj.asInstanceOf[ASPxClientEvent[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientEvent[?], T] (val x: Self & ASPxClientEvent[T]) extends AnyVal {
    
    inline def setAddHandler(value: T => Unit): Self = StObject.set(x, "AddHandler", js.Any.fromFunction1(value))
    
    inline def setClearHandlers(value: () => Unit): Self = StObject.set(x, "ClearHandlers", js.Any.fromFunction0(value))
    
    inline def setFireEvent(value: (Any, ASPxClientEventArgs) => Unit): Self = StObject.set(x, "FireEvent", js.Any.fromFunction2(value))
    
    inline def setRemoveHandler(value: T => Unit): Self = StObject.set(x, "RemoveHandler", js.Any.fromFunction1(value))
  }
}
