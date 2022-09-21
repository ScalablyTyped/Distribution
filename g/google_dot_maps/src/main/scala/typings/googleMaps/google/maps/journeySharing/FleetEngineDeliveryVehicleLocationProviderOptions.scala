package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Options for delivery vehicle location provider.
  */
trait FleetEngineDeliveryVehicleLocationProviderOptions extends StObject {
  
  /**
    * Provides JSON Web Tokens for authenticating the client to Fleet Engine.
    */
  def authTokenFetcher(a: AuthTokenFetcherOptions): js.Promise[AuthToken]
  
  /**
    * The delivery vehicle ID to track immediately after the location provider
    * is instantiated. If not specified, the location provider does not start
    * tracking any vehicle; use {@link
    * google.maps.journeySharing.FleetEngineDeliveryVehicleLocationProvider.deliveryVehicleId}
    * to set the ID and begin tracking.
    */
  var deliveryVehicleId: String | Null
  
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
    * Boolean to show or hide outcome locations for the fetched tasks.
    */
  var shouldShowOutcomeLocations: Boolean | Null
  
  /**
    * Boolean to show or hide tasks. Setting this to false will prevent the
    * ListTasks endpoint from being called to fetch the tasks. Only the
    * upcoming vehicle stops will be displayed.
    */
  var shouldShowTasks: Boolean | Null
  
  /**
    * Threshold for stale vehicle location. If the last updated location for
    * the vehicle is older this threshold, the vehicle will not be displayed.
    * Defaults to 24 hours in milliseconds. If the threshold is less than 0, or
    * <i>Infinity</i>, the threshold will be ignored and the vehicle location
    * will not be considered stale.
    */
  var staleLocationThresholdMillis: Double | Null
  
  /**
    * Filter options to apply when fetching tasks. The options can include
    * specific vehicle, time, and task status.
    */
  var taskFilterOptions: FleetEngineTaskFilterOptions | Null
}
object FleetEngineDeliveryVehicleLocationProviderOptions {
  
  inline def apply(authTokenFetcher: AuthTokenFetcherOptions => js.Promise[AuthToken], projectId: String): FleetEngineDeliveryVehicleLocationProviderOptions = {
    val __obj = js.Dynamic.literal(authTokenFetcher = js.Any.fromFunction1(authTokenFetcher), projectId = projectId.asInstanceOf[js.Any], deliveryVehicleId = null, pollingIntervalMillis = null, shouldShowOutcomeLocations = null, shouldShowTasks = null, staleLocationThresholdMillis = null, taskFilterOptions = null)
    __obj.asInstanceOf[FleetEngineDeliveryVehicleLocationProviderOptions]
  }
  
  extension [Self <: FleetEngineDeliveryVehicleLocationProviderOptions](x: Self) {
    
    inline def setAuthTokenFetcher(value: AuthTokenFetcherOptions => js.Promise[AuthToken]): Self = StObject.set(x, "authTokenFetcher", js.Any.fromFunction1(value))
    
    inline def setDeliveryVehicleId(value: String): Self = StObject.set(x, "deliveryVehicleId", value.asInstanceOf[js.Any])
    
    inline def setDeliveryVehicleIdNull: Self = StObject.set(x, "deliveryVehicleId", null)
    
    inline def setPollingIntervalMillis(value: Double): Self = StObject.set(x, "pollingIntervalMillis", value.asInstanceOf[js.Any])
    
    inline def setPollingIntervalMillisNull: Self = StObject.set(x, "pollingIntervalMillis", null)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setShouldShowOutcomeLocations(value: Boolean): Self = StObject.set(x, "shouldShowOutcomeLocations", value.asInstanceOf[js.Any])
    
    inline def setShouldShowOutcomeLocationsNull: Self = StObject.set(x, "shouldShowOutcomeLocations", null)
    
    inline def setShouldShowTasks(value: Boolean): Self = StObject.set(x, "shouldShowTasks", value.asInstanceOf[js.Any])
    
    inline def setShouldShowTasksNull: Self = StObject.set(x, "shouldShowTasks", null)
    
    inline def setStaleLocationThresholdMillis(value: Double): Self = StObject.set(x, "staleLocationThresholdMillis", value.asInstanceOf[js.Any])
    
    inline def setStaleLocationThresholdMillisNull: Self = StObject.set(x, "staleLocationThresholdMillis", null)
    
    inline def setTaskFilterOptions(value: FleetEngineTaskFilterOptions): Self = StObject.set(x, "taskFilterOptions", value.asInstanceOf[js.Any])
    
    inline def setTaskFilterOptionsNull: Self = StObject.set(x, "taskFilterOptions", null)
  }
}
