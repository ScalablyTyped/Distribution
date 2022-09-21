package typings.firebaseAuth.authMod

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthPopup extends StObject {
  
  var associatedEvent: String | Null
  
  def close(): Unit
  
  val window: Window | Null
}
object AuthPopup {
  
  inline def apply(close: () => Unit): AuthPopup = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), associatedEvent = null, window = null)
    __obj.asInstanceOf[AuthPopup]
  }
  
  extension [Self <: AuthPopup](x: Self) {
    
    inline def setAssociatedEvent(value: String): Self = StObject.set(x, "associatedEvent", value.asInstanceOf[js.Any])
    
    inline def setAssociatedEventNull: Self = StObject.set(x, "associatedEvent", null)
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowNull: Self = StObject.set(x, "window", null)
  }
}
