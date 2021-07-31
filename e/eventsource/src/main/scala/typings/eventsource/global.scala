package typings.eventsource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("MessageEvent")
  @js.native
  class MessageEvent[T] protected ()
    extends StObject
       with typings.eventsource.MessageEvent[T] {
    def this(`type`: String) = this()
    def this(`type`: String, eventInitDict: MessageEventInit[T]) = this()
  }
}
