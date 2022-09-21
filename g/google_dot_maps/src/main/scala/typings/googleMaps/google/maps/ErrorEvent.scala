package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event with an associated Error.
  */
trait ErrorEvent extends StObject {
  
  /**
    * The Error related to the event.
    */
  var error: js.Error
}
object ErrorEvent {
  
  inline def apply(error: js.Error): ErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorEvent]
  }
  
  extension [Self <: ErrorEvent](x: Self) {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
