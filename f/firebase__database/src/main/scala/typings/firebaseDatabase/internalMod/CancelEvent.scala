package typings.firebaseDatabase.internalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelEvent
  extends StObject
     with Event2 {
  
  var error: js.Error
  
  var eventRegistration: EventRegistration
  
  var path: Path
}
object CancelEvent {
  
  inline def apply(
    error: js.Error,
    eventRegistration: EventRegistration,
    getEventRunner: () => js.Function0[Unit],
    getEventType: () => String,
    getPath: () => Path,
    path: Path
  ): CancelEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], eventRegistration = eventRegistration.asInstanceOf[js.Any], getEventRunner = js.Any.fromFunction0(getEventRunner), getEventType = js.Any.fromFunction0(getEventType), getPath = js.Any.fromFunction0(getPath), path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelEvent]
  }
  
  extension [Self <: CancelEvent](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setEventRegistration(value: EventRegistration): Self = StObject.set(x, "eventRegistration", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Path): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
