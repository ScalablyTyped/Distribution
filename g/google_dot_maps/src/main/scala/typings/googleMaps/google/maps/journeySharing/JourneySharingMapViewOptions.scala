package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MapOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Options for the map view.
  */
trait JourneySharingMapViewOptions extends StObject {
  
  /**
    * Configures options for an anticipated route polyline. Invoked whenever a
    * new anticipated route polyline is rendered. <p>If specifying a function,
    * the function can and should modify the input&#39;s defaultPolylineOptions
    * field containing a google.maps.PolylineOptions object, and return it as
    * polylineOptions in the output PolylineSetupOptions object. <p>Specifying
    * a PolylineSetupOptions object has the same effect as specifying a
    * function that returns that static object. <p>Do not reuse the same
    * PolylineSetupOptions object in different PolylineSetup functions or
    * static values, and do not reuse the same google.maps.PolylineOptions
    * object for the polylineOptions key in different PolylineSetupOptions
    * objects. If polylineOptions or visible is unset or null, it will be
    * overwritten with the default. Any values set for polylineOptions.map or
    * polylineOptions.path will be ignored.
    */
  var anticipatedRoutePolylineSetup: js.UndefOr[
    PolylineSetupOptions | (js.Function1[/* a */ DefaultPolylineSetupOptions, PolylineSetupOptions]) | Null
  ] = js.undefined
  
  /**
    * Automatic viewport mode. Default value is FIT_ANTICIPATED_ROUTE, which
    * enables the map view to automatically adjust the viewport to fit vehicle
    * markers, location markers, and any visible anticipated route polylines.
    * Set this to NONE to turn off automatic fitting.
    */
  var automaticViewportMode: js.UndefOr[AutomaticViewportMode | Null] = js.undefined
  
  /**
    * Configures options for a destination location marker. Invoked whenever a
    * new destination marker is rendered. <p>If specifying a function, the
    * function can and should modify the input&#39;s defaultMarkerOptions field
    * containing a google.maps.MarkerOptions object, and return it as
    * markerOptions in the output MarkerSetupOptions object. <p>Specifying a
    * MarkerSetupOptions object has the same effect as specifying a function
    * that returns that static object. <p>Do not reuse the same
    * MarkerSetupOptions object in different MarkerSetup functions or static
    * values, and do not reuse the same google.maps.MarkerOptions object for
    * the markerOptions key in different MarkerSetupOptions objects. If
    * markerOptions is unset or null, it will be overwritten with the default.
    * Any value set for markerOptions.map or markerOptions.position will be
    * ignored.
    */
  var destinationMarkerSetup: js.UndefOr[
    MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]) | Null
  ] = js.undefined
  
  /**
    * The DOM element backing the view. Required.
    */
  var element: Element
  
  /**
    * A source of tracked locations to be shown in the tracking map view.
    * Required.
    */
  var locationProvider: LocationProvider
  
  /**
    * Map options passed into the google.maps.Map constructor.
    */
  var mapOptions: js.UndefOr[MapOptions | Null] = js.undefined
  
  /**
    * Configures options for an origin location marker. Invoked whenever a new
    * origin marker is rendered. <p>If specifying a function, the function can
    * and should modify the input&#39;s defaultMarkerOptions field containing a
    * google.maps.MarkerOptions object, and return it as markerOptions in the
    * output MarkerSetupOptions object. <p>Specifying a MarkerSetupOptions
    * object has the same effect as specifying a function that returns that
    * static object. <p>Do not reuse the same MarkerSetupOptions object in
    * different MarkerSetup functions or static values, and do not reuse the
    * same google.maps.MarkerOptions object for the markerOptions key in
    * different MarkerSetupOptions objects. If markerOptions is unset or null,
    * it will be overwritten with the default. Any value set for
    * markerOptions.map or markerOptions.position will be ignored.
    */
  var originMarkerSetup: js.UndefOr[
    MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]) | Null
  ] = js.undefined
  
  /**
    * Configures options for a ping location marker. Invoked whenever a new
    * ping marker is rendered. <p>If specifying a function, the function can
    * and should modify the input&#39;s defaultMarkerOptions field containing a
    * google.maps.MarkerOptions object, and return it as markerOptions in the
    * output MarkerSetupOptions object. <p>Specifying a MarkerSetupOptions
    * object has the same effect as specifying a function that returns that
    * static object. <p>Do not reuse the same MarkerSetupOptions object in
    * different MarkerSetup functions or static values, and do not reuse the
    * same google.maps.MarkerOptions object for the markerOptions key in
    * different MarkerSetupOptions objects. If markerOptions is unset or null,
    * it will be overwritten with the default. Any value set for
    * markerOptions.map or markerOptions.position will be ignored.
    */
  var pingMarkerSetup: js.UndefOr[
    MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]) | Null
  ] = js.undefined
  
  /**
    * Configures options for a successful task location marker. Invoked
    * whenever a new successful task marker is rendered. <p>If specifying a
    * function, the function can and should modify the input&#39;s
    * defaultMarkerOptions field containing a google.maps.MarkerOptions object,
    * and return it as markerOptions in the output MarkerSetupOptions object.
    * <p>Specifying a MarkerSetupOptions object has the same effect as
    * specifying a function that returns that static object. <p>Do not reuse
    * the same MarkerSetupOptions object in different MarkerSetup functions or
    * static values, and do not reuse the same google.maps.MarkerOptions object
    * for the markerOptions key in different MarkerSetupOptions objects. If
    * markerOptions is unset or null, it will be overwritten with the default.
    * Any value set for markerOptions.map or markerOptions.position will be
    * ignored.
    */
  var successfulTaskMarkerSetup: js.UndefOr[
    MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]) | Null
  ] = js.undefined
  
  /**
    * Configures options for a taken route polyline. Invoked whenever a new
    * taken route polyline is rendered. <p>If specifying a function, the
    * function can and should modify the input&#39;s defaultPolylineOptions
    * field containing a google.maps.PolylineOptions object, and return it as
    * polylineOptions in the output PolylineSetupOptions object. <p>Specifying
    * a PolylineSetupOptions object has the same effect as specifying a
    * function that returns that static object. <p>Do not reuse the same
    * PolylineSetupOptions object in different PolylineSetup functions or
    * static values, and do not reuse the same google.maps.PolylineOptions
    * object for the polylineOptions key in different PolylineSetupOptions
    * objects. <p>Any values set for polylineOptions.map or
    * polylineOptions.path will be ignored. Any unset or null value will be
    * overwritten with the default.
    */
  var takenRoutePolylineSetup: js.UndefOr[
    PolylineSetupOptions | (js.Function1[/* a */ DefaultPolylineSetupOptions, PolylineSetupOptions]) | Null
  ] = js.undefined
  
  /**
    * Configures options for a task outcome location marker. Invoked whenever a
    * new task outcome location marker is rendered. <p>If specifying a
    * function, the function can and should modify the input&#39;s
    * defaultMarkerOptions field containing a google.maps.MarkerOptions object,
    * and return it as markerOptions in the output MarkerSetupOptions object.
    * <p>Specifying a MarkerSetupOptions object has the same effect as
    * specifying a function that returns that static object. <p>Do not reuse
    * the same MarkerSetupOptions object in different MarkerSetup functions or
    * static values, and do not reuse the same google.maps.MarkerOptions object
    * for the markerOptions key in different MarkerSetupOptions objects. If
    * markerOptions is unset or null, it will be overwritten with the default.
    * Any value set for markerOptions.map or markerOptions.position will be
    * ignored.
    */
  var taskOutcomeMarkerSetup: js.UndefOr[
    MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]) | Null
  ] = js.undefined
  
  /**
    * Configures options for an unsuccessful task location marker. Invoked
    * whenever a new unsuccessful task marker is rendered. <p>If specifying a
    * function, the function can and should modify the input&#39;s
    * defaultMarkerOptions field containing a google.maps.MarkerOptions object,
    * and return it as markerOptions in the output MarkerSetupOptions object.
    * <p>Specifying a MarkerSetupOptions object has the same effect as
    * specifying a function that returns that static object. <p>Do not reuse
    * the same MarkerSetupOptions object in different MarkerSetup functions or
    * static values, and do not reuse the same google.maps.MarkerOptions object
    * for the markerOptions key in different MarkerSetupOptions objects. If
    * markerOptions is unset or null, it will be overwritten with the default.
    * Any value set for markerOptions.map or markerOptions.position will be
    * ignored.
    */
  var unsuccessfulTaskMarkerSetup: js.UndefOr[
    MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]) | Null
  ] = js.undefined
  
  /**
    * Configures options for a vehicle location marker. Invoked whenever a new
    * vehicle marker is rendered. <p>If specifying a function, the function can
    * and should modify the input&#39;s defaultMarkerOptions field containing a
    * google.maps.MarkerOptions object, and return it as markerOptions in the
    * output MarkerSetupOptions object. <p>Specifying a MarkerSetupOptions
    * object has the same effect as specifying a function that returns that
    * static object. <p>Do not reuse the same MarkerSetupOptions object in
    * different MarkerSetup functions or static values, and do not reuse the
    * same google.maps.MarkerOptions object for the markerOptions key in
    * different MarkerSetupOptions objects. If markerOptions is unset or null,
    * it will be overwritten with the default. Any value set for
    * markerOptions.map or markerOptions.position will be ignored.
    */
  var vehicleMarkerSetup: js.UndefOr[
    MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]) | Null
  ] = js.undefined
  
  /**
    * Configures options for a waypoint location marker. Invoked whenever a new
    * waypoint marker is rendered. <p>If specifying a function, the function
    * can and should modify the input&#39;s defaultMarkerOptions field
    * containing a google.maps.MarkerOptions object, and return it as
    * markerOptions in the output MarkerSetupOptions object. <p>Specifying a
    * MarkerSetupOptions object has the same effect as specifying a function
    * that returns that static object. <p>Do not reuse the same
    * MarkerSetupOptions object in different MarkerSetup functions or static
    * values, and do not reuse the same google.maps.MarkerOptions object for
    * the markerOptions key in different MarkerSetupOptions objects. If
    * markerOptions is unset or null, it will be overwritten with the default.
    * Any value set for markerOptions.map or markerOptions.position will be
    * ignored.
    */
  var waypointMarkerSetup: js.UndefOr[
    MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]) | Null
  ] = js.undefined
}
object JourneySharingMapViewOptions {
  
  inline def apply(element: Element, locationProvider: LocationProvider): JourneySharingMapViewOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], locationProvider = locationProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneySharingMapViewOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JourneySharingMapViewOptions] (val x: Self) extends AnyVal {
    
    inline def setAnticipatedRoutePolylineSetup(
      value: PolylineSetupOptions | (js.Function1[/* a */ DefaultPolylineSetupOptions, PolylineSetupOptions])
    ): Self = StObject.set(x, "anticipatedRoutePolylineSetup", value.asInstanceOf[js.Any])
    
    inline def setAnticipatedRoutePolylineSetupFunction1(value: /* a */ DefaultPolylineSetupOptions => PolylineSetupOptions): Self = StObject.set(x, "anticipatedRoutePolylineSetup", js.Any.fromFunction1(value))
    
    inline def setAnticipatedRoutePolylineSetupNull: Self = StObject.set(x, "anticipatedRoutePolylineSetup", null)
    
    inline def setAnticipatedRoutePolylineSetupUndefined: Self = StObject.set(x, "anticipatedRoutePolylineSetup", js.undefined)
    
    inline def setAutomaticViewportMode(value: AutomaticViewportMode): Self = StObject.set(x, "automaticViewportMode", value.asInstanceOf[js.Any])
    
    inline def setAutomaticViewportModeNull: Self = StObject.set(x, "automaticViewportMode", null)
    
    inline def setAutomaticViewportModeUndefined: Self = StObject.set(x, "automaticViewportMode", js.undefined)
    
    inline def setDestinationMarkerSetup(value: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])): Self = StObject.set(x, "destinationMarkerSetup", value.asInstanceOf[js.Any])
    
    inline def setDestinationMarkerSetupFunction1(value: /* a */ DefaultMarkerSetupOptions => MarkerSetupOptions): Self = StObject.set(x, "destinationMarkerSetup", js.Any.fromFunction1(value))
    
    inline def setDestinationMarkerSetupNull: Self = StObject.set(x, "destinationMarkerSetup", null)
    
    inline def setDestinationMarkerSetupUndefined: Self = StObject.set(x, "destinationMarkerSetup", js.undefined)
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setLocationProvider(value: LocationProvider): Self = StObject.set(x, "locationProvider", value.asInstanceOf[js.Any])
    
    inline def setMapOptions(value: MapOptions): Self = StObject.set(x, "mapOptions", value.asInstanceOf[js.Any])
    
    inline def setMapOptionsNull: Self = StObject.set(x, "mapOptions", null)
    
    inline def setMapOptionsUndefined: Self = StObject.set(x, "mapOptions", js.undefined)
    
    inline def setOriginMarkerSetup(value: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])): Self = StObject.set(x, "originMarkerSetup", value.asInstanceOf[js.Any])
    
    inline def setOriginMarkerSetupFunction1(value: /* a */ DefaultMarkerSetupOptions => MarkerSetupOptions): Self = StObject.set(x, "originMarkerSetup", js.Any.fromFunction1(value))
    
    inline def setOriginMarkerSetupNull: Self = StObject.set(x, "originMarkerSetup", null)
    
    inline def setOriginMarkerSetupUndefined: Self = StObject.set(x, "originMarkerSetup", js.undefined)
    
    inline def setPingMarkerSetup(value: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])): Self = StObject.set(x, "pingMarkerSetup", value.asInstanceOf[js.Any])
    
    inline def setPingMarkerSetupFunction1(value: /* a */ DefaultMarkerSetupOptions => MarkerSetupOptions): Self = StObject.set(x, "pingMarkerSetup", js.Any.fromFunction1(value))
    
    inline def setPingMarkerSetupNull: Self = StObject.set(x, "pingMarkerSetup", null)
    
    inline def setPingMarkerSetupUndefined: Self = StObject.set(x, "pingMarkerSetup", js.undefined)
    
    inline def setSuccessfulTaskMarkerSetup(value: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])): Self = StObject.set(x, "successfulTaskMarkerSetup", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulTaskMarkerSetupFunction1(value: /* a */ DefaultMarkerSetupOptions => MarkerSetupOptions): Self = StObject.set(x, "successfulTaskMarkerSetup", js.Any.fromFunction1(value))
    
    inline def setSuccessfulTaskMarkerSetupNull: Self = StObject.set(x, "successfulTaskMarkerSetup", null)
    
    inline def setSuccessfulTaskMarkerSetupUndefined: Self = StObject.set(x, "successfulTaskMarkerSetup", js.undefined)
    
    inline def setTakenRoutePolylineSetup(
      value: PolylineSetupOptions | (js.Function1[/* a */ DefaultPolylineSetupOptions, PolylineSetupOptions])
    ): Self = StObject.set(x, "takenRoutePolylineSetup", value.asInstanceOf[js.Any])
    
    inline def setTakenRoutePolylineSetupFunction1(value: /* a */ DefaultPolylineSetupOptions => PolylineSetupOptions): Self = StObject.set(x, "takenRoutePolylineSetup", js.Any.fromFunction1(value))
    
    inline def setTakenRoutePolylineSetupNull: Self = StObject.set(x, "takenRoutePolylineSetup", null)
    
    inline def setTakenRoutePolylineSetupUndefined: Self = StObject.set(x, "takenRoutePolylineSetup", js.undefined)
    
    inline def setTaskOutcomeMarkerSetup(value: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])): Self = StObject.set(x, "taskOutcomeMarkerSetup", value.asInstanceOf[js.Any])
    
    inline def setTaskOutcomeMarkerSetupFunction1(value: /* a */ DefaultMarkerSetupOptions => MarkerSetupOptions): Self = StObject.set(x, "taskOutcomeMarkerSetup", js.Any.fromFunction1(value))
    
    inline def setTaskOutcomeMarkerSetupNull: Self = StObject.set(x, "taskOutcomeMarkerSetup", null)
    
    inline def setTaskOutcomeMarkerSetupUndefined: Self = StObject.set(x, "taskOutcomeMarkerSetup", js.undefined)
    
    inline def setUnsuccessfulTaskMarkerSetup(value: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])): Self = StObject.set(x, "unsuccessfulTaskMarkerSetup", value.asInstanceOf[js.Any])
    
    inline def setUnsuccessfulTaskMarkerSetupFunction1(value: /* a */ DefaultMarkerSetupOptions => MarkerSetupOptions): Self = StObject.set(x, "unsuccessfulTaskMarkerSetup", js.Any.fromFunction1(value))
    
    inline def setUnsuccessfulTaskMarkerSetupNull: Self = StObject.set(x, "unsuccessfulTaskMarkerSetup", null)
    
    inline def setUnsuccessfulTaskMarkerSetupUndefined: Self = StObject.set(x, "unsuccessfulTaskMarkerSetup", js.undefined)
    
    inline def setVehicleMarkerSetup(value: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])): Self = StObject.set(x, "vehicleMarkerSetup", value.asInstanceOf[js.Any])
    
    inline def setVehicleMarkerSetupFunction1(value: /* a */ DefaultMarkerSetupOptions => MarkerSetupOptions): Self = StObject.set(x, "vehicleMarkerSetup", js.Any.fromFunction1(value))
    
    inline def setVehicleMarkerSetupNull: Self = StObject.set(x, "vehicleMarkerSetup", null)
    
    inline def setVehicleMarkerSetupUndefined: Self = StObject.set(x, "vehicleMarkerSetup", js.undefined)
    
    inline def setWaypointMarkerSetup(value: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])): Self = StObject.set(x, "waypointMarkerSetup", value.asInstanceOf[js.Any])
    
    inline def setWaypointMarkerSetupFunction1(value: /* a */ DefaultMarkerSetupOptions => MarkerSetupOptions): Self = StObject.set(x, "waypointMarkerSetup", js.Any.fromFunction1(value))
    
    inline def setWaypointMarkerSetupNull: Self = StObject.set(x, "waypointMarkerSetup", null)
    
    inline def setWaypointMarkerSetupUndefined: Self = StObject.set(x, "waypointMarkerSetup", js.undefined)
  }
}
