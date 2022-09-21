package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.LatLngBounds
import typings.googleMaps.google.maps.LatLngBoundsLiteral
import typings.googleMaps.google.maps.MapsEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Delivery Fleet Location Provider.
  */
trait FleetEngineDeliveryFleetLocationProvider
  extends StObject
     with LocationProvider {
  
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
    * Minimum time between fetching location updates in milliseconds. If it
    * takes longer than <code>pollingIntervalMillis</code> to fetch a location
    * update, the next location update is not started until the current one
    * finishes. <p>Setting this value to 0 disables recurring location updates.
    * A new location update is fetched if any of the parameters observed by the
    * location provider changes. <p>The default polling interval is 5000
    * milliseconds, the minimum interval. If you set the polling interval to a
    * lower non-zero value, 5000 is used.
    */
  var pollingIntervalMillis: Double | Null
  
  /**
    * This Field is read-only. Threshold for stale vehicle location. If the
    * last updated location for the vehicle is older than this threshold, the
    * vehicle will not be displayed.
    */
  var staleLocationThresholdMillis: Double
}
object FleetEngineDeliveryFleetLocationProvider {
  
  inline def apply(addListener: (String, js.Function) => MapsEventListener, staleLocationThresholdMillis: Double): FleetEngineDeliveryFleetLocationProvider = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), staleLocationThresholdMillis = staleLocationThresholdMillis.asInstanceOf[js.Any], pollingIntervalMillis = null)
    __obj.asInstanceOf[FleetEngineDeliveryFleetLocationProvider]
  }
  
  extension [Self <: FleetEngineDeliveryFleetLocationProvider](x: Self) {
    
    inline def setDeliveryVehicleFilter(value: String): Self = StObject.set(x, "deliveryVehicleFilter", value.asInstanceOf[js.Any])
    
    inline def setDeliveryVehicleFilterNull: Self = StObject.set(x, "deliveryVehicleFilter", null)
    
    inline def setDeliveryVehicleFilterUndefined: Self = StObject.set(x, "deliveryVehicleFilter", js.undefined)
    
    inline def setLocationRestriction(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "locationRestriction", value.asInstanceOf[js.Any])
    
    inline def setLocationRestrictionNull: Self = StObject.set(x, "locationRestriction", null)
    
    inline def setLocationRestrictionUndefined: Self = StObject.set(x, "locationRestriction", js.undefined)
    
    inline def setPollingIntervalMillis(value: Double): Self = StObject.set(x, "pollingIntervalMillis", value.asInstanceOf[js.Any])
    
    inline def setPollingIntervalMillisNull: Self = StObject.set(x, "pollingIntervalMillis", null)
    
    inline def setStaleLocationThresholdMillis(value: Double): Self = StObject.set(x, "staleLocationThresholdMillis", value.asInstanceOf[js.Any])
  }
}
