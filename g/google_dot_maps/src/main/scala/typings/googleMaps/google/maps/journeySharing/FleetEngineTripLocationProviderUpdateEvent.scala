package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetEngineTripLocationProviderUpdateEvent extends StObject {
  
  /**
    * The trip structure returned by the update. Unmodifiable.
    */
  var trip: Trip | Null
}
object FleetEngineTripLocationProviderUpdateEvent {
  
  inline def apply(): FleetEngineTripLocationProviderUpdateEvent = {
    val __obj = js.Dynamic.literal(trip = null)
    __obj.asInstanceOf[FleetEngineTripLocationProviderUpdateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FleetEngineTripLocationProviderUpdateEvent] (val x: Self) extends AnyVal {
    
    inline def setTrip(value: Trip): Self = StObject.set(x, "trip", value.asInstanceOf[js.Any])
    
    inline def setTripNull: Self = StObject.set(x, "trip", null)
  }
}
