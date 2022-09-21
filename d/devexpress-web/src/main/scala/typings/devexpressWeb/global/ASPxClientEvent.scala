package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the event object used for client-side events.
  */
@JSGlobal("ASPxClientEvent")
@js.native
open class ASPxClientEvent[T] ()
  extends StObject
     with typings.devexpressWeb.ASPxClientEvent[T] {
  
  /**
    * Dynamically connects the event with an appropriate event handler function.
    * @param handler An object representing the event handling function's content.
    */
  /* CompleteClass */
  override def AddHandler(handler: T): Unit = js.native
  
  /**
    * Dynamically disconnects the event from all the associated event handler functions.
    */
  /* CompleteClass */
  override def ClearHandlers(): Unit = js.native
  
  /**
    * For internal use only.
    */
  /* CompleteClass */
  override def FireEvent(source: Any, e: typings.devexpressWeb.ASPxClientEventArgs): Unit = js.native
  
  /**
    * Dynamically disconnects the event from the associated event handler function.
    * @param handler An object representing the event handling function's content.
    */
  /* CompleteClass */
  override def RemoveHandler(handler: T): Unit = js.native
}
