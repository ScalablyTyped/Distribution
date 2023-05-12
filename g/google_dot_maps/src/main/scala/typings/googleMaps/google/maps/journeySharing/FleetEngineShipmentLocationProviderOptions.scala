package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MarkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetEngineShipmentLocationProviderOptions extends StObject {
  
  /**
    * Provides JSON Web Tokens for authenticating the client to Fleet Engine.
    */
  def authTokenFetcher(a: AuthTokenFetcherOptions): js.Promise[AuthToken]
  
  /**
    * Customization applied to the delivery vehicle marker. <br><br>Use this
    * field to specify custom styling (such as marker icon) and interactivity
    * (such as click handling).<ul><li> If a {@link google.maps.MarkerOptions}
    * object is specified, the changes specified in it are applied to the
    * marker after the marker has been created, overwriting its default options
    * if they exist.</li><li>If a function is specified, it is invoked once
    * when the marker is created, before it is added to the map view. (On this
    * invocation, the <code>isNew</code> parameter in the function parameters
    * object is set to <code>true</code>.) Additionally, this function is
    * invoked when the location provider receives data from Fleet Engine,
    * regardless of whether the data corresponding to this marker have
    * changed.<br><br>See {@link
    * google.maps.journeySharing.ShipmentMarkerCustomizationFunctionParams} for
    * a list of supplied parameters and their uses.</li></ul>
    */
  var deliveryVehicleMarkerCustomization: js.UndefOr[
    (js.Function1[/* a */ ShipmentMarkerCustomizationFunctionParams, Unit]) | Null | MarkerOptions
  ] = js.undefined
  
  /**
    * Customization applied to the destination marker. <br><br>Use this field
    * to specify custom styling (such as marker icon) and interactivity (such
    * as click handling).<ul><li> If a {@link google.maps.MarkerOptions} object
    * is specified, the changes specified in it are applied to the marker after
    * the marker has been created, overwriting its default options if they
    * exist.</li><li>If a function is specified, it is invoked once when the
    * marker is created, before it is added to the map view. (On this
    * invocation, the <code>isNew</code> parameter in the function parameters
    * object is set to <code>true</code>.) Additionally, this function is
    * invoked when the location provider receives data from Fleet Engine,
    * regardless of whether the data corresponding to this marker have
    * changed.<br><br>See {@link
    * google.maps.journeySharing.ShipmentMarkerCustomizationFunctionParams} for
    * a list of supplied parameters and their uses.</li></ul>
    */
  var destinationMarkerCustomization: js.UndefOr[
    (js.Function1[/* a */ ShipmentMarkerCustomizationFunctionParams, Unit]) | Null | MarkerOptions
  ] = js.undefined
  
  /**
    * Minimum time between fetching location updates in milliseconds. If it
    * takes longer than <code>pollingIntervalMillis</code> to fetch a location
    * update, the next location update is not started until the current one
    * finishes. <br><br>Setting this value to 0, Infinity, or a negative value
    * disables automatic location updates. A new location update is fetched
    * once if the tracking ID parameter (for example, the shipment tracking ID
    * of the shipment location provider), or a filtering option (for example,
    * viewport bounds or attribute filters for fleet location providers)
    * changes. <br><br>The default, and minimum, polling interval is 5000
    * milliseconds. If you set the polling interval to a lower positive value,
    * 5000 is stored and used.
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FleetEngineShipmentLocationProviderOptions] (val x: Self) extends AnyVal {
    
    inline def setAuthTokenFetcher(value: AuthTokenFetcherOptions => js.Promise[AuthToken]): Self = StObject.set(x, "authTokenFetcher", js.Any.fromFunction1(value))
    
    inline def setDeliveryVehicleMarkerCustomization(value: (js.Function1[/* a */ ShipmentMarkerCustomizationFunctionParams, Unit]) | MarkerOptions): Self = StObject.set(x, "deliveryVehicleMarkerCustomization", value.asInstanceOf[js.Any])
    
    inline def setDeliveryVehicleMarkerCustomizationFunction1(value: /* a */ ShipmentMarkerCustomizationFunctionParams => Unit): Self = StObject.set(x, "deliveryVehicleMarkerCustomization", js.Any.fromFunction1(value))
    
    inline def setDeliveryVehicleMarkerCustomizationNull: Self = StObject.set(x, "deliveryVehicleMarkerCustomization", null)
    
    inline def setDeliveryVehicleMarkerCustomizationUndefined: Self = StObject.set(x, "deliveryVehicleMarkerCustomization", js.undefined)
    
    inline def setDestinationMarkerCustomization(value: (js.Function1[/* a */ ShipmentMarkerCustomizationFunctionParams, Unit]) | MarkerOptions): Self = StObject.set(x, "destinationMarkerCustomization", value.asInstanceOf[js.Any])
    
    inline def setDestinationMarkerCustomizationFunction1(value: /* a */ ShipmentMarkerCustomizationFunctionParams => Unit): Self = StObject.set(x, "destinationMarkerCustomization", js.Any.fromFunction1(value))
    
    inline def setDestinationMarkerCustomizationNull: Self = StObject.set(x, "destinationMarkerCustomization", null)
    
    inline def setDestinationMarkerCustomizationUndefined: Self = StObject.set(x, "destinationMarkerCustomization", js.undefined)
    
    inline def setPollingIntervalMillis(value: Double): Self = StObject.set(x, "pollingIntervalMillis", value.asInstanceOf[js.Any])
    
    inline def setPollingIntervalMillisNull: Self = StObject.set(x, "pollingIntervalMillis", null)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    inline def setTrackingIdNull: Self = StObject.set(x, "trackingId", null)
  }
}
