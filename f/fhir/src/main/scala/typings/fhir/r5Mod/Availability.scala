package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Availability
  extends StObject
     with Element {
  
  /**
    * Times the {item} is available.
    */
  var availableTime: js.UndefOr[js.Array[AvailabilityAvailableTime]] = js.undefined
  
  /**
    * Not available during this time due to provided reason.
    */
  var notAvailableTime: js.UndefOr[js.Array[AvailabilityNotAvailableTime]] = js.undefined
}
object Availability {
  
  inline def apply(): Availability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Availability]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Availability] (val x: Self) extends AnyVal {
    
    inline def setAvailableTime(value: js.Array[AvailabilityAvailableTime]): Self = StObject.set(x, "availableTime", value.asInstanceOf[js.Any])
    
    inline def setAvailableTimeUndefined: Self = StObject.set(x, "availableTime", js.undefined)
    
    inline def setAvailableTimeVarargs(value: AvailabilityAvailableTime*): Self = StObject.set(x, "availableTime", js.Array(value*))
    
    inline def setNotAvailableTime(value: js.Array[AvailabilityNotAvailableTime]): Self = StObject.set(x, "notAvailableTime", value.asInstanceOf[js.Any])
    
    inline def setNotAvailableTimeUndefined: Self = StObject.set(x, "notAvailableTime", js.undefined)
    
    inline def setNotAvailableTimeVarargs(value: AvailabilityNotAvailableTime*): Self = StObject.set(x, "notAvailableTime", js.Array(value*))
  }
}
