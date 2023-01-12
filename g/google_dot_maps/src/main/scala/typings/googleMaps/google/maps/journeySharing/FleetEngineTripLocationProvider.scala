package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MapsEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Trip location provider.
  */
trait FleetEngineTripLocationProvider
  extends StObject
     with LocationProvider {
  
  /**
    * Explicitly refreshes the tracked location.
    */
  def refresh(): Unit
  
  /**
    * The ID for the trip that this location provider observes. Set this field
    * to begin tracking.
    */
  var tripId: String
}
object FleetEngineTripLocationProvider {
  
  inline def apply(addListener: (String, js.Function) => MapsEventListener, refresh: () => Unit, tripId: String): FleetEngineTripLocationProvider = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), refresh = js.Any.fromFunction0(refresh), tripId = tripId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetEngineTripLocationProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FleetEngineTripLocationProvider] (val x: Self) extends AnyVal {
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    inline def setTripId(value: String): Self = StObject.set(x, "tripId", value.asInstanceOf[js.Any])
  }
}
