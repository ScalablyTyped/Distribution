package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Options for shipment location provider.
  */
trait FleetEngineShipmentLocationProviderOptions extends StObject {
  
  /**
    * Provides JSON Web Tokens for authenticating the client to Fleet Engine.
    */
  def authTokenFetcher(a: AuthTokenFetcherOptions): js.Promise[AuthToken]
  
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
    * The consumer&#39;s project ID from Google Cloud Console.
    */
  var projectId: String
  
  /**
    * The tracking ID of the task to track immediately after the location
    * provider is instantiated. If not specified, the location provider does
    * not start tracking any task; use {@link
    * google.maps.journeySharing.FleetEngineShipmentLocationProvider.trackingId}
    * to set the tracking ID and begin tracking.
    */
  var trackingId: String | Null
}
object FleetEngineShipmentLocationProviderOptions {
  
  inline def apply(authTokenFetcher: AuthTokenFetcherOptions => js.Promise[AuthToken], projectId: String): FleetEngineShipmentLocationProviderOptions = {
    val __obj = js.Dynamic.literal(authTokenFetcher = js.Any.fromFunction1(authTokenFetcher), projectId = projectId.asInstanceOf[js.Any], pollingIntervalMillis = null, trackingId = null)
    __obj.asInstanceOf[FleetEngineShipmentLocationProviderOptions]
  }
  
  extension [Self <: FleetEngineShipmentLocationProviderOptions](x: Self) {
    
    inline def setAuthTokenFetcher(value: AuthTokenFetcherOptions => js.Promise[AuthToken]): Self = StObject.set(x, "authTokenFetcher", js.Any.fromFunction1(value))
    
    inline def setPollingIntervalMillis(value: Double): Self = StObject.set(x, "pollingIntervalMillis", value.asInstanceOf[js.Any])
    
    inline def setPollingIntervalMillisNull: Self = StObject.set(x, "pollingIntervalMillis", null)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    inline def setTrackingIdNull: Self = StObject.set(x, "trackingId", null)
  }
}
