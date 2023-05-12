package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MarkerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Customization applied to the delivery vehicle marker. <br><br>Use this
    * field to specify custom styling (such as marker icon) and interactivity
    * (such as click handling).<ul><li>If a {@link google.maps.MarkerOptions}
    * object is specified, the changes specified in it are applied to the
    * marker after the marker has been created, overwriting its default options
    * if they exist.</li><li>If a function is specified, it is invoked once
    * when the marker is created, before it is added to the map view. (On this
    * invocation, the <code>isNew</code> parameter in the function parameters
    * object is set to <code>true</code>.) Additionally, this function is
    * invoked when the location provider receives data from Fleet Engine,
    * regardless of whether the data corresponding to this marker have
    * changed.<br><br>See {@link
    * google.maps.journeySharing.DeliveryVehicleMarkerCustomizationFunctionParams}
    * for a list of supplied parameters and their uses.</li></ul>
    */
  var deliveryVehicleMarkerCustomization: js.UndefOr[
    (js.Function1[/* a */ DeliveryVehicleMarkerCustomizationFunctionParams, Unit]) | Null | MarkerOptions
  ] = js.undefined
  
  /**
    * Customization applied to a planned stop marker. <br><br>Use this field to
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
    * google.maps.journeySharing.PlannedStopMarkerCustomizationFunctionParams}
    * for a list of supplied parameters and their uses.</li></ul>
    */
  var plannedStopMarkerCustomization: js.UndefOr[
    (js.Function1[/* a */ PlannedStopMarkerCustomizationFunctionParams, Unit]) | Null | MarkerOptions
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
  
  /**
    * Customization applied to a task marker. A task marker is rendered at the
    * planned location of each task assigned to the delivery vehicle.
    * <br><br>Use this field to specify custom styling (such as marker icon)
    * and interactivity (such as click handling).<ul><li>If a {@link
    * google.maps.MarkerOptions} object is specified, the changes specified in
    * it are applied to the marker after the marker has been created,
    * overwriting its default options if they exist.</li><li>If a function is
    * specified, it is invoked once when the marker is created, before it is
    * added to the map view. (On this invocation, the <code>isNew</code>
    * parameter in the function parameters object is set to <code>true</code>.)
    * Additionally, this function is invoked when the location provider
    * receives data from Fleet Engine, regardless of whether the data
    * corresponding to this marker have changed.<br><br>See {@link
    * google.maps.journeySharing.TaskMarkerCustomizationFunctionParams} for a
    * list of supplied parameters and their uses.</li></ul>
    */
  var taskMarkerCustomization: js.UndefOr[
    (js.Function1[/* a */ TaskMarkerCustomizationFunctionParams, Unit]) | Null | MarkerOptions
  ] = js.undefined
  
  /**
    * Customization applied to a task outcome marker. A task outcome marker is
    * rendered at the actual outcome location of each task assigned to the
    * delivery vehicle. <br><br>Use this field to specify custom styling (such
    * as marker icon) and interactivity (such as click handling).<ul><li>If
    * a {@link google.maps.MarkerOptions} object is specified, the changes
    * specified in it are applied to the marker after the marker has been
    * created, overwriting its default options if they exist.</li><li>If a
    * function is specified, it is invoked once when the marker is created,
    * before it is added to the map view. (On this invocation, the
    * <code>isNew</code> parameter in the function parameters object is set to
    * <code>true</code>.) Additionally, this function is invoked when the
    * location provider receives data from Fleet Engine, regardless of whether
    * the data corresponding to this marker have changed.<br><br>See {@link
    * google.maps.journeySharing.TaskMarkerCustomizationFunctionParams} for a
    * list of supplied parameters and their uses.</li></ul>
    */
  var taskOutcomeMarkerCustomization: js.UndefOr[(js.Function1[/* a */ TaskMarkerCustomizationFunctionParams, Unit]) | Null] = js.undefined
}
object FleetEngineDeliveryVehicleLocationProviderOptions {
  
  inline def apply(authTokenFetcher: AuthTokenFetcherOptions => js.Promise[AuthToken], projectId: String): FleetEngineDeliveryVehicleLocationProviderOptions = {
    val __obj = js.Dynamic.literal(authTokenFetcher = js.Any.fromFunction1(authTokenFetcher), projectId = projectId.asInstanceOf[js.Any], deliveryVehicleId = null, pollingIntervalMillis = null, shouldShowOutcomeLocations = null, shouldShowTasks = null, staleLocationThresholdMillis = null, taskFilterOptions = null)
    __obj.asInstanceOf[FleetEngineDeliveryVehicleLocationProviderOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FleetEngineDeliveryVehicleLocationProviderOptions] (val x: Self) extends AnyVal {
    
    inline def setAuthTokenFetcher(value: AuthTokenFetcherOptions => js.Promise[AuthToken]): Self = StObject.set(x, "authTokenFetcher", js.Any.fromFunction1(value))
    
    inline def setDeliveryVehicleId(value: String): Self = StObject.set(x, "deliveryVehicleId", value.asInstanceOf[js.Any])
    
    inline def setDeliveryVehicleIdNull: Self = StObject.set(x, "deliveryVehicleId", null)
    
    inline def setDeliveryVehicleMarkerCustomization(
      value: (js.Function1[/* a */ DeliveryVehicleMarkerCustomizationFunctionParams, Unit]) | MarkerOptions
    ): Self = StObject.set(x, "deliveryVehicleMarkerCustomization", value.asInstanceOf[js.Any])
    
    inline def setDeliveryVehicleMarkerCustomizationFunction1(value: /* a */ DeliveryVehicleMarkerCustomizationFunctionParams => Unit): Self = StObject.set(x, "deliveryVehicleMarkerCustomization", js.Any.fromFunction1(value))
    
    inline def setDeliveryVehicleMarkerCustomizationNull: Self = StObject.set(x, "deliveryVehicleMarkerCustomization", null)
    
    inline def setDeliveryVehicleMarkerCustomizationUndefined: Self = StObject.set(x, "deliveryVehicleMarkerCustomization", js.undefined)
    
    inline def setPlannedStopMarkerCustomization(value: (js.Function1[/* a */ PlannedStopMarkerCustomizationFunctionParams, Unit]) | MarkerOptions): Self = StObject.set(x, "plannedStopMarkerCustomization", value.asInstanceOf[js.Any])
    
    inline def setPlannedStopMarkerCustomizationFunction1(value: /* a */ PlannedStopMarkerCustomizationFunctionParams => Unit): Self = StObject.set(x, "plannedStopMarkerCustomization", js.Any.fromFunction1(value))
    
    inline def setPlannedStopMarkerCustomizationNull: Self = StObject.set(x, "plannedStopMarkerCustomization", null)
    
    inline def setPlannedStopMarkerCustomizationUndefined: Self = StObject.set(x, "plannedStopMarkerCustomization", js.undefined)
    
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
    
    inline def setTaskMarkerCustomization(value: (js.Function1[/* a */ TaskMarkerCustomizationFunctionParams, Unit]) | MarkerOptions): Self = StObject.set(x, "taskMarkerCustomization", value.asInstanceOf[js.Any])
    
    inline def setTaskMarkerCustomizationFunction1(value: /* a */ TaskMarkerCustomizationFunctionParams => Unit): Self = StObject.set(x, "taskMarkerCustomization", js.Any.fromFunction1(value))
    
    inline def setTaskMarkerCustomizationNull: Self = StObject.set(x, "taskMarkerCustomization", null)
    
    inline def setTaskMarkerCustomizationUndefined: Self = StObject.set(x, "taskMarkerCustomization", js.undefined)
    
    inline def setTaskOutcomeMarkerCustomization(value: /* a */ TaskMarkerCustomizationFunctionParams => Unit): Self = StObject.set(x, "taskOutcomeMarkerCustomization", js.Any.fromFunction1(value))
    
    inline def setTaskOutcomeMarkerCustomizationNull: Self = StObject.set(x, "taskOutcomeMarkerCustomization", null)
    
    inline def setTaskOutcomeMarkerCustomizationUndefined: Self = StObject.set(x, "taskOutcomeMarkerCustomization", js.undefined)
  }
}
