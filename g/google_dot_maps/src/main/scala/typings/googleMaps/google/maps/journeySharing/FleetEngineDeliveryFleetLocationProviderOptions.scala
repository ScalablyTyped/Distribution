package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.LatLngBounds
import typings.googleMaps.google.maps.LatLngBoundsLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Options for delivery fleet location provider.
  */
trait FleetEngineDeliveryFleetLocationProviderOptions extends StObject {
  
  /**
    * Provides JSON Web Tokens for authenticating the client to Fleet Engine.
    */
  def authTokenFetcher(a: AuthTokenFetcherOptions): js.Promise[AuthToken]
  
  /**
    * A filter query to apply when fetching delivery vehicles. This filter is
    * passed directly to Fleet Engine. <p>See <a
    * href="https://goo.gle/3wT0Dlt">ListDeliveryVehiclesRequest.filter</a> for
    * supported formats. <p>Note that valid filters for attributes must have
    * the &quot;attributes&quot; prefix. For example, <code>attributes.x =
    * &quot;y&quot;</code> or <code>attributes.&quot;x y&quot; =
    * &quot;z&quot;</code>.
    */
  var deliveryVehicleFilter: String | Null
  
  /**
    * The latitude/longitude bounds within which to track vehicles immediately
    * after the location provider is instantiated. If not set, the location
    * provider does not start tracking any vehicles; use {@link
    * google.maps.journeySharing.FleetEngineDeliveryFleetLocationProvider.locationRestriction}
    * to set the bounds and begin tracking. To track all delivery vehicles
    * regardless of location, set bounds equivalent to the entire earth.
    */
  var locationRestriction: LatLngBounds | Null | LatLngBoundsLiteral
  
  /**
    * The consumer&#39;s project ID from Google Cloud Console.
    */
  var projectId: String
  
  /**
    * Threshold for stale vehicle location. If the last updated location for
    * the vehicle is older this threshold, the vehicle will not be displayed.
    * Defaults to 24 hours in milliseconds. If the threshold is less than zero,
    * or <i>Infinity</i>, the threshold will be ignored and the vehicle
    * location will not be considered stale.
    */
  var staleLocationThresholdMillis: Double | Null
}
object FleetEngineDeliveryFleetLocationProviderOptions {
  
  inline def apply(authTokenFetcher: AuthTokenFetcherOptions => js.Promise[AuthToken], projectId: String): FleetEngineDeliveryFleetLocationProviderOptions = {
    val __obj = js.Dynamic.literal(authTokenFetcher = js.Any.fromFunction1(authTokenFetcher), projectId = projectId.asInstanceOf[js.Any], deliveryVehicleFilter = null, locationRestriction = null, staleLocationThresholdMillis = null)
    __obj.asInstanceOf[FleetEngineDeliveryFleetLocationProviderOptions]
  }
  
  extension [Self <: FleetEngineDeliveryFleetLocationProviderOptions](x: Self) {
    
    inline def setAuthTokenFetcher(value: AuthTokenFetcherOptions => js.Promise[AuthToken]): Self = StObject.set(x, "authTokenFetcher", js.Any.fromFunction1(value))
    
    inline def setDeliveryVehicleFilter(value: String): Self = StObject.set(x, "deliveryVehicleFilter", value.asInstanceOf[js.Any])
    
    inline def setDeliveryVehicleFilterNull: Self = StObject.set(x, "deliveryVehicleFilter", null)
    
    inline def setLocationRestriction(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "locationRestriction", value.asInstanceOf[js.Any])
    
    inline def setLocationRestrictionNull: Self = StObject.set(x, "locationRestriction", null)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setStaleLocationThresholdMillis(value: Double): Self = StObject.set(x, "staleLocationThresholdMillis", value.asInstanceOf[js.Any])
    
    inline def setStaleLocationThresholdMillisNull: Self = StObject.set(x, "staleLocationThresholdMillis", null)
  }
}
