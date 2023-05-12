package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MarkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetEngineTripLocationProviderOptions extends StObject {
  
  /**
    * Provides JSON Web Tokens for authenticating the client to Fleet Engine.
    */
  def authTokenFetcher(a: AuthTokenFetcherOptions): js.Promise[AuthToken]
  
  /**
    * Customization applied to the destination marker. <br><br>Use this field
    * to specify custom styling (such as marker icon) and interactivity (such
    * as click handling).<ul><li>If a {@link google.maps.MarkerOptions} object
    * is specified, the changes specified in it are applied to the marker after
    * the marker has been created, overwriting its default options if they
    * exist.</li><li>If a function is specified, it is invoked once when the
    * marker is created, before it is added to the map view. (On this
    * invocation, the <code>isNew</code> parameter in the function parameters
    * object is set to <code>true</code>.) Additionally, this function is
    * invoked when the location provider receives data from Fleet Engine,
    * regardless of whether the data corresponding to this marker have
    * changed.<br><br>See {@link
    * google.maps.journeySharing.TripMarkerCustomizationFunctionParams} for a
    * list of supplied parameters and their uses.</li></ul>
    */
  var destinationMarkerCustomization: js.UndefOr[
    (js.Function1[/* a */ TripMarkerCustomizationFunctionParams, Unit]) | Null | MarkerOptions
  ] = js.undefined
  
  /**
    * Customization applied to the origin marker. <br><br>Use this field to
    * specify custom styling (such as marker icon) and interactivity (such as
    * click handling).<ul><li>If a {@link google.maps.MarkerOptions} object is
    * specified, the changes specified in it are applied to the marker after
    * the marker has been created, overwriting its default options if they
    * exist.</li><li>If a function is specified, it is invoked once when the
    * marker is created, before it is added to the map view. (On this
    * invocation, the <code>isNew</code> parameter in the function parameters
    * object is set to <code>true</code>.) Additionally, this function is
    * invoked when the location provider receives data from Fleet Engine,
    * regardless of whether the data corresponding to this marker have
    * changed.<br><br>See {@link
    * google.maps.journeySharing.TripMarkerCustomizationFunctionParams} for a
    * list of supplied parameters and their uses.</li></ul>
    */
  var originMarkerCustomization: js.UndefOr[
    (js.Function1[/* a */ TripMarkerCustomizationFunctionParams, Unit]) | Null | MarkerOptions
  ] = js.undefined
  
  /**
    * Minimum time between fetching location updates in milliseconds. If it
    * takes longer than <code>pollingIntervalMillis</code> to fetch a location
    * update, the next location update is not started until the current one
    * finishes. <br><br>Setting this value to 0 disables recurring location
    * updates. A new location update is fetched if any of the parameters
    * observed by the location provider changes. <br><br>The default polling
    * interval is 5000 milliseconds, the minimum interval. If you set the
    * polling interval to a lower non-zero value, 5000 is used.
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
  
  /**
    * Customization applied to the vehicle marker. <br><br>Use this field to
    * specify custom styling (such as marker icon) and interactivity (such as
    * click handling).<ul><li>If a {@link google.maps.MarkerOptions} object is
    * specified, the changes specified in it are applied to the marker after
    * the marker has been created, overwriting its default options if they
    * exist.</li><li>If a function is specified, it is invoked once when the
    * marker is created, before it is added to the map view. (On this
    * invocation, the <code>isNew</code> parameter in the function parameters
    * object is set to <code>true</code>.) Additionally, this function is
    * invoked when the location provider receives data from Fleet Engine,
    * regardless of whether the data corresponding to this marker have
    * changed.<br><br>See {@link
    * google.maps.journeySharing.TripMarkerCustomizationFunctionParams} for a
    * list of supplied parameters and their uses.</li></ul>
    */
  var vehicleMarkerCustomization: js.UndefOr[
    (js.Function1[/* a */ TripMarkerCustomizationFunctionParams, Unit]) | Null | MarkerOptions
  ] = js.undefined
  
  /**
    * Customization applied to a waypoint marker. <br><br>Use this field to
    * specify custom styling (such as marker icon) and interactivity (such as
    * click handling).<ul><li>If a {@link google.maps.MarkerOptions} object is
    * specified, the changes specified in it are applied to the marker after
    * the marker has been created, overwriting its default options if they
    * exist.</li><li>If a function is specified, it is invoked once when the
    * marker is created, before it is added to the map view. (On this
    * invocation, the <code>isNew</code> parameter in the function parameters
    * object is set to <code>true</code>.) Additionally, this function is
    * invoked when the location provider receives data from Fleet Engine,
    * regardless of whether the data corresponding to this marker have
    * changed.<br><br>See {@link
    * google.maps.journeySharing.TripWaypointMarkerCustomizationFunctionParams}
    * for a list of supplied parameters and their uses.</li></ul>
    */
  var waypointMarkerCustomization: js.UndefOr[
    (js.Function1[/* a */ TripWaypointMarkerCustomizationFunctionParams, Unit]) | Null | MarkerOptions
  ] = js.undefined
}
object FleetEngineTripLocationProviderOptions {
  
  inline def apply(authTokenFetcher: AuthTokenFetcherOptions => js.Promise[AuthToken], projectId: String): FleetEngineTripLocationProviderOptions = {
    val __obj = js.Dynamic.literal(authTokenFetcher = js.Any.fromFunction1(authTokenFetcher), projectId = projectId.asInstanceOf[js.Any], pollingIntervalMillis = null, tripId = null)
    __obj.asInstanceOf[FleetEngineTripLocationProviderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FleetEngineTripLocationProviderOptions] (val x: Self) extends AnyVal {
    
    inline def setAuthTokenFetcher(value: AuthTokenFetcherOptions => js.Promise[AuthToken]): Self = StObject.set(x, "authTokenFetcher", js.Any.fromFunction1(value))
    
    inline def setDestinationMarkerCustomization(value: (js.Function1[/* a */ TripMarkerCustomizationFunctionParams, Unit]) | MarkerOptions): Self = StObject.set(x, "destinationMarkerCustomization", value.asInstanceOf[js.Any])
    
    inline def setDestinationMarkerCustomizationFunction1(value: /* a */ TripMarkerCustomizationFunctionParams => Unit): Self = StObject.set(x, "destinationMarkerCustomization", js.Any.fromFunction1(value))
    
    inline def setDestinationMarkerCustomizationNull: Self = StObject.set(x, "destinationMarkerCustomization", null)
    
    inline def setDestinationMarkerCustomizationUndefined: Self = StObject.set(x, "destinationMarkerCustomization", js.undefined)
    
    inline def setOriginMarkerCustomization(value: (js.Function1[/* a */ TripMarkerCustomizationFunctionParams, Unit]) | MarkerOptions): Self = StObject.set(x, "originMarkerCustomization", value.asInstanceOf[js.Any])
    
    inline def setOriginMarkerCustomizationFunction1(value: /* a */ TripMarkerCustomizationFunctionParams => Unit): Self = StObject.set(x, "originMarkerCustomization", js.Any.fromFunction1(value))
    
    inline def setOriginMarkerCustomizationNull: Self = StObject.set(x, "originMarkerCustomization", null)
    
    inline def setOriginMarkerCustomizationUndefined: Self = StObject.set(x, "originMarkerCustomization", js.undefined)
    
    inline def setPollingIntervalMillis(value: Double): Self = StObject.set(x, "pollingIntervalMillis", value.asInstanceOf[js.Any])
    
    inline def setPollingIntervalMillisNull: Self = StObject.set(x, "pollingIntervalMillis", null)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setTripId(value: String): Self = StObject.set(x, "tripId", value.asInstanceOf[js.Any])
    
    inline def setTripIdNull: Self = StObject.set(x, "tripId", null)
    
    inline def setVehicleMarkerCustomization(value: (js.Function1[/* a */ TripMarkerCustomizationFunctionParams, Unit]) | MarkerOptions): Self = StObject.set(x, "vehicleMarkerCustomization", value.asInstanceOf[js.Any])
    
    inline def setVehicleMarkerCustomizationFunction1(value: /* a */ TripMarkerCustomizationFunctionParams => Unit): Self = StObject.set(x, "vehicleMarkerCustomization", js.Any.fromFunction1(value))
    
    inline def setVehicleMarkerCustomizationNull: Self = StObject.set(x, "vehicleMarkerCustomization", null)
    
    inline def setVehicleMarkerCustomizationUndefined: Self = StObject.set(x, "vehicleMarkerCustomization", js.undefined)
    
    inline def setWaypointMarkerCustomization(value: (js.Function1[/* a */ TripWaypointMarkerCustomizationFunctionParams, Unit]) | MarkerOptions): Self = StObject.set(x, "waypointMarkerCustomization", value.asInstanceOf[js.Any])
    
    inline def setWaypointMarkerCustomizationFunction1(value: /* a */ TripWaypointMarkerCustomizationFunctionParams => Unit): Self = StObject.set(x, "waypointMarkerCustomization", js.Any.fromFunction1(value))
    
    inline def setWaypointMarkerCustomizationNull: Self = StObject.set(x, "waypointMarkerCustomization", null)
    
    inline def setWaypointMarkerCustomizationUndefined: Self = StObject.set(x, "waypointMarkerCustomization", js.undefined)
  }
}
