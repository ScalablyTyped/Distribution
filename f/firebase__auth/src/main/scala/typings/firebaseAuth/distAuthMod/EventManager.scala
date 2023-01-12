package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
trait EventManager extends StObject {
  
  def registerConsumer(authEventConsumer: AuthEventConsumer): Unit
  
  def unregisterConsumer(authEventConsumer: AuthEventConsumer): Unit
}
object EventManager {
  
  inline def apply(registerConsumer: AuthEventConsumer => Unit, unregisterConsumer: AuthEventConsumer => Unit): EventManager = {
    val __obj = js.Dynamic.literal(registerConsumer = js.Any.fromFunction1(registerConsumer), unregisterConsumer = js.Any.fromFunction1(unregisterConsumer))
    __obj.asInstanceOf[EventManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventManager] (val x: Self) extends AnyVal {
    
    inline def setRegisterConsumer(value: AuthEventConsumer => Unit): Self = StObject.set(x, "registerConsumer", js.Any.fromFunction1(value))
    
    inline def setUnregisterConsumer(value: AuthEventConsumer => Unit): Self = StObject.set(x, "unregisterConsumer", js.Any.fromFunction1(value))
  }
}
