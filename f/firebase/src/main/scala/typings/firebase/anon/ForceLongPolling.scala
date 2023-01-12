package typings.firebase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceLongPolling extends StObject {
  
  /**
    * Force the use of long polling instead of WebSockets. This will be ignored if the WebSocket protocol is used in `databaseURL`.
    */
  def forceLongPolling(): Unit
  
  /**
    * Force the use of WebSockets instead of long polling.
    */
  def forceWebSockets(): Unit
}
object ForceLongPolling {
  
  inline def apply(forceLongPolling: () => Unit, forceWebSockets: () => Unit): ForceLongPolling = {
    val __obj = js.Dynamic.literal(forceLongPolling = js.Any.fromFunction0(forceLongPolling), forceWebSockets = js.Any.fromFunction0(forceWebSockets))
    __obj.asInstanceOf[ForceLongPolling]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForceLongPolling] (val x: Self) extends AnyVal {
    
    inline def setForceLongPolling(value: () => Unit): Self = StObject.set(x, "forceLongPolling", js.Any.fromFunction0(value))
    
    inline def setForceWebSockets(value: () => Unit): Self = StObject.set(x, "forceWebSockets", js.Any.fromFunction0(value))
  }
}
