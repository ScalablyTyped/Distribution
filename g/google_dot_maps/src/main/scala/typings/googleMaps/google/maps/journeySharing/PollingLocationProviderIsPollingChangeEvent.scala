package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollingLocationProviderIsPollingChangeEvent extends StObject {
  
  /**
    * The error that caused the polling state to change, if the state change
    * was caused by an error. Undefined if the state change was due to normal
    * operations.
    */
  var error: js.Error | Null
}
object PollingLocationProviderIsPollingChangeEvent {
  
  inline def apply(): PollingLocationProviderIsPollingChangeEvent = {
    val __obj = js.Dynamic.literal(error = null)
    __obj.asInstanceOf[PollingLocationProviderIsPollingChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PollingLocationProviderIsPollingChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
  }
}
