package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Options for trip location provider.
  */
trait FleetEngineTripLocationProviderOptions extends StObject {
  
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
    * The trip ID to track immediately after the location provider is
    * instantiated. If not specified, the location provider does not start
    * tracking any trip; use {@link
    * google.maps.journeySharing.FleetEngineTripLocationProvider.tripId} to set
    * the ID and begin tracking.
    */
  var tripId: String | Null
}
object FleetEngineTripLocationProviderOptions {
  
  inline def apply(authTokenFetcher: AuthTokenFetcherOptions => js.Promise[AuthToken], projectId: String): FleetEngineTripLocationProviderOptions = {
    val __obj = js.Dynamic.literal(authTokenFetcher = js.Any.fromFunction1(authTokenFetcher), projectId = projectId.asInstanceOf[js.Any], pollingIntervalMillis = null, tripId = null)
    __obj.asInstanceOf[FleetEngineTripLocationProviderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FleetEngineTripLocationProviderOptions] (val x: Self) extends AnyVal {
    
    inline def setAuthTokenFetcher(value: AuthTokenFetcherOptions => js.Promise[AuthToken]): Self = StObject.set(x, "authTokenFetcher", js.Any.fromFunction1(value))
    
    inline def setPollingIntervalMillis(value: Double): Self = StObject.set(x, "pollingIntervalMillis", value.asInstanceOf[js.Any])
    
    inline def setPollingIntervalMillisNull: Self = StObject.set(x, "pollingIntervalMillis", null)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setTripId(value: String): Self = StObject.set(x, "tripId", value.asInstanceOf[js.Any])
    
    inline def setTripIdNull: Self = StObject.set(x, "tripId", null)
  }
}
