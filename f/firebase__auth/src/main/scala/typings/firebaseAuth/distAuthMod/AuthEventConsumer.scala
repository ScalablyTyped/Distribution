package typings.firebaseAuth.distAuthMod

import typings.firebaseUtil.mod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
trait AuthEventConsumer extends StObject {
  
  var eventId: String | Null
  
  val filter: js.Array[AuthEventType]
  
  def onAuthEvent(event: AuthEvent): Any
  
  def onError(error: FirebaseError): Any
}
object AuthEventConsumer {
  
  inline def apply(filter: js.Array[AuthEventType], onAuthEvent: AuthEvent => Any, onError: FirebaseError => Any): AuthEventConsumer = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], onAuthEvent = js.Any.fromFunction1(onAuthEvent), onError = js.Any.fromFunction1(onError), eventId = null)
    __obj.asInstanceOf[AuthEventConsumer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthEventConsumer] (val x: Self) extends AnyVal {
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdNull: Self = StObject.set(x, "eventId", null)
    
    inline def setFilter(value: js.Array[AuthEventType]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterVarargs(value: AuthEventType*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setOnAuthEvent(value: AuthEvent => Any): Self = StObject.set(x, "onAuthEvent", js.Any.fromFunction1(value))
    
    inline def setOnError(value: FirebaseError => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
  }
}
