package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.LatLngBounds
import typings.googleMaps.google.maps.LatLngBoundsLiteral
import typings.googleMaps.google.maps.MapsEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetEngineDeliveryFleetLocationProvider
  extends StObject
     with PollingLocationProvider {
  
  /**
    * The filter applied when fetching the delivery vehicles.
    */
  var deliveryVehicleFilter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The bounds within which to track delivery vehicles. If no bounds are set,
    * no delivery vehicles will be tracked. To track all delivery vehicles
    * regardless of location, set bounds equivalent to the entire earth.
    */
  var locationRestriction: js.UndefOr[LatLngBounds | Null | LatLngBoundsLiteral] = js.undefined
  
  /**
    * This Field is read-only. Threshold for stale vehicle location. If the
    * last updated location for the vehicle is older than this threshold, the
    * vehicle will not be displayed.
    */
  var staleLocationThresholdMillis: Double
}
object FleetEngineDeliveryFleetLocationProvider {
  
  inline def apply(
    addListener: (String, js.Function) => MapsEventListener,
    isPolling: Boolean,
    pollingIntervalMillis: Double,
    staleLocationThresholdMillis: Double
  ): FleetEngineDeliveryFleetLocationProvider = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), isPolling = isPolling.asInstanceOf[js.Any], pollingIntervalMillis = pollingIntervalMillis.asInstanceOf[js.Any], staleLocationThresholdMillis = staleLocationThresholdMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetEngineDeliveryFleetLocationProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FleetEngineDeliveryFleetLocationProvider] (val x: Self) extends AnyVal {
    
    inline def setDeliveryVehicleFilter(value: String): Self = StObject.set(x, "deliveryVehicleFilter", value.asInstanceOf[js.Any])
    
    inline def setDeliveryVehicleFilterNull: Self = StObject.set(x, "deliveryVehicleFilter", null)
    
    inline def setDeliveryVehicleFilterUndefined: Self = StObject.set(x, "deliveryVehicleFilter", js.undefined)
    
    inline def setLocationRestriction(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "locationRestriction", value.asInstanceOf[js.Any])
    
    inline def setLocationRestrictionNull: Self = StObject.set(x, "locationRestriction", null)
    
    inline def setLocationRestrictionUndefined: Self = StObject.set(x, "locationRestriction", js.undefined)
    
    inline def setStaleLocationThresholdMillis(value: Double): Self = StObject.set(x, "staleLocationThresholdMillis", value.asInstanceOf[js.Any])
  }
}
