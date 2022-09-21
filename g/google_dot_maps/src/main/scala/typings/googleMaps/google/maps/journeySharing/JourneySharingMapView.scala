package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.Map
import typings.googleMaps.google.maps.MapOptions
import typings.googleMaps.google.maps.Marker
import typings.googleMaps.google.maps.Polyline
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * The map view.
  */
trait JourneySharingMapView extends StObject {
  
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
  var anticipatedRoutePolylineSetup: PolylineSetupOptions | (js.Function1[/* a */ DefaultPolylineSetupOptions, PolylineSetupOptions])
  
  /**
    * Returns the anticipated route polylines, if any.
    */
  var anticipatedRoutePolylines: js.Array[Polyline]
  
  /**
    * This Field is read-only. Automatic viewport mode.
    */
  var automaticViewportMode: AutomaticViewportMode
  
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
  var destinationMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])
  
  /**
    * Returns the destination markers, if any.
    */
  var destinationMarkers: js.Array[Marker]
  
  /**
    * This Field is read-only. The DOM element backing the view.
    */
  var element: Element
  
  /**
    * Enables or disables the traffic layer.
    */
  var enableTraffic: Boolean
  
  /**
    * This Field is read-only. A source of tracked locations to be shown in the
    * tracking map view.
    */
  var locationProvider: LocationProvider
  
  /**
    * The map object contained in the map view.
    */
  var map: Map
  
  /**
    * The map options passed into the map via the map view.
    */
  var mapOptions: MapOptions
  
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
  var originMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])
  
  /**
    * Returns the origin markers, if any.
    */
  var originMarkers: js.Array[Marker]
  
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
  var pingMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])
  
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
  var successfulTaskMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])
  
  /**
    * Returns the successful task markers, if any.
    */
  var successfulTaskMarkers: js.Array[Marker]
  
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
  var takenRoutePolylineSetup: PolylineSetupOptions | (js.Function1[/* a */ DefaultPolylineSetupOptions, PolylineSetupOptions])
  
  /**
    * Returns the taken route polylines, if any.
    */
  var takenRoutePolylines: js.Array[Polyline]
  
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
  var taskOutcomeMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])
  
  /**
    * Returns the task outcome markers, if any.
    */
  var taskOutcomeMarkers: js.Array[Marker]
  
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
  var unsuccessfulTaskMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])
  
  /**
    * Returns the unsuccessful task markers, if any.
    */
  var unsuccessfulTaskMarkers: js.Array[Marker]
  
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
  var vehicleMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])
  
  /**
    * Returns the vehicle markers, if any.
    */
  var vehicleMarkers: js.Array[Marker]
  
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
  var waypointMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])
  
  /**
    * Returns the waypoint markers, if any.
    */
  var waypointMarkers: js.Array[Marker]
}
object JourneySharingMapView {
  
  inline def apply(
    anticipatedRoutePolylineSetup: PolylineSetupOptions | (js.Function1[/* a */ DefaultPolylineSetupOptions, PolylineSetupOptions]),
    anticipatedRoutePolylines: js.Array[Polyline],
    automaticViewportMode: AutomaticViewportMode,
    destinationMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]),
    destinationMarkers: js.Array[Marker],
    element: Element,
    enableTraffic: Boolean,
    locationProvider: LocationProvider,
    map: Map,
    mapOptions: MapOptions,
    originMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]),
    originMarkers: js.Array[Marker],
    pingMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]),
    successfulTaskMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]),
    successfulTaskMarkers: js.Array[Marker],
    takenRoutePolylineSetup: PolylineSetupOptions | (js.Function1[/* a */ DefaultPolylineSetupOptions, PolylineSetupOptions]),
    takenRoutePolylines: js.Array[Polyline],
    taskOutcomeMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]),
    taskOutcomeMarkers: js.Array[Marker],
    unsuccessfulTaskMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]),
    unsuccessfulTaskMarkers: js.Array[Marker],
    vehicleMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]),
    vehicleMarkers: js.Array[Marker],
    waypointMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]),
    waypointMarkers: js.Array[Marker]
  ): JourneySharingMapView = {
    val __obj = js.Dynamic.literal(anticipatedRoutePolylineSetup = anticipatedRoutePolylineSetup.asInstanceOf[js.Any], anticipatedRoutePolylines = anticipatedRoutePolylines.asInstanceOf[js.Any], automaticViewportMode = automaticViewportMode.asInstanceOf[js.Any], destinationMarkerSetup = destinationMarkerSetup.asInstanceOf[js.Any], destinationMarkers = destinationMarkers.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], enableTraffic = enableTraffic.asInstanceOf[js.Any], locationProvider = locationProvider.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mapOptions = mapOptions.asInstanceOf[js.Any], originMarkerSetup = originMarkerSetup.asInstanceOf[js.Any], originMarkers = originMarkers.asInstanceOf[js.Any], pingMarkerSetup = pingMarkerSetup.asInstanceOf[js.Any], successfulTaskMarkerSetup = successfulTaskMarkerSetup.asInstanceOf[js.Any], successfulTaskMarkers = successfulTaskMarkers.asInstanceOf[js.Any], takenRoutePolylineSetup = takenRoutePolylineSetup.asInstanceOf[js.Any], takenRoutePolylines = takenRoutePolylines.asInstanceOf[js.Any], taskOutcomeMarkerSetup = taskOutcomeMarkerSetup.asInstanceOf[js.Any], taskOutcomeMarkers = taskOutcomeMarkers.asInstanceOf[js.Any], unsuccessfulTaskMarkerSetup = unsuccessfulTaskMarkerSetup.asInstanceOf[js.Any], unsuccessfulTaskMarkers = unsuccessfulTaskMarkers.asInstanceOf[js.Any], vehicleMarkerSetup = vehicleMarkerSetup.asInstanceOf[js.Any], vehicleMarkers = vehicleMarkers.asInstanceOf[js.Any], waypointMarkerSetup = waypointMarkerSetup.asInstanceOf[js.Any], waypointMarkers = waypointMarkers.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneySharingMapView]
  }
  
  extension [Self <: JourneySharingMapView](x: Self) {
    
    inline def setAnticipatedRoutePolylineSetup(
      value: PolylineSetupOptions | (js.Function1[/* a */ DefaultPolylineSetupOptions, PolylineSetupOptions])
    ): Self = StObject.set(x, "anticipatedRoutePolylineSetup", value.asInstanceOf[js.Any])
    
    inline def setAnticipatedRoutePolylineSetupFunction1(value: /* a */ DefaultPolylineSetupOptions => PolylineSetupOptions): Self = StObject.set(x, "anticipatedRoutePolylineSetup", js.Any.fromFunction1(value))
    
    inline def setAnticipatedRoutePolylines(value: js.Array[Polyline]): Self = StObject.set(x, "anticipatedRoutePolylines", value.asInstanceOf[js.Any])
    
    inline def setAnticipatedRoutePolylinesVarargs(value: Polyline*): Self = StObject.set(x, "anticipatedRoutePolylines", js.Array(value*))
    
    inline def setAutomaticViewportMode(value: AutomaticViewportMode): Self = StObject.set(x, "automaticViewportMode", value.asInstanceOf[js.Any])
    
    inline def setDestinationMarkerSetup(value: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])): Self = StObject.set(x, "destinationMarkerSetup", value.asInstanceOf[js.Any])
    
    inline def setDestinationMarkerSetupFunction1(value: /* a */ DefaultMarkerSetupOptions => MarkerSetupOptions): Self = StObject.set(x, "destinationMarkerSetup", js.Any.fromFunction1(value))
    
    inline def setDestinationMarkers(value: js.Array[Marker]): Self = StObject.set(x, "destinationMarkers", value.asInstanceOf[js.Any])
    
    inline def setDestinationMarkersVarargs(value: Marker*): Self = StObject.set(x, "destinationMarkers", js.Array(value*))
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setEnableTraffic(value: Boolean): Self = StObject.set(x, "enableTraffic", value.asInstanceOf[js.Any])
    
    inline def setLocationProvider(value: LocationProvider): Self = StObject.set(x, "locationProvider", value.asInstanceOf[js.Any])
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapOptions(value: MapOptions): Self = StObject.set(x, "mapOptions", value.asInstanceOf[js.Any])
    
    inline def setOriginMarkerSetup(value: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])): Self = StObject.set(x, "originMarkerSetup", value.asInstanceOf[js.Any])
    
    inline def setOriginMarkerSetupFunction1(value: /* a */ DefaultMarkerSetupOptions => MarkerSetupOptions): Self = StObject.set(x, "originMarkerSetup", js.Any.fromFunction1(value))
    
    inline def setOriginMarkers(value: js.Array[Marker]): Self = StObject.set(x, "originMarkers", value.asInstanceOf[js.Any])
    
    inline def setOriginMarkersVarargs(value: Marker*): Self = StObject.set(x, "originMarkers", js.Array(value*))
    
    inline def setPingMarkerSetup(value: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])): Self = StObject.set(x, "pingMarkerSetup", value.asInstanceOf[js.Any])
    
    inline def setPingMarkerSetupFunction1(value: /* a */ DefaultMarkerSetupOptions => MarkerSetupOptions): Self = StObject.set(x, "pingMarkerSetup", js.Any.fromFunction1(value))
    
    inline def setSuccessfulTaskMarkerSetup(value: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])): Self = StObject.set(x, "successfulTaskMarkerSetup", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulTaskMarkerSetupFunction1(value: /* a */ DefaultMarkerSetupOptions => MarkerSetupOptions): Self = StObject.set(x, "successfulTaskMarkerSetup", js.Any.fromFunction1(value))
    
    inline def setSuccessfulTaskMarkers(value: js.Array[Marker]): Self = StObject.set(x, "successfulTaskMarkers", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulTaskMarkersVarargs(value: Marker*): Self = StObject.set(x, "successfulTaskMarkers", js.Array(value*))
    
    inline def setTakenRoutePolylineSetup(
      value: PolylineSetupOptions | (js.Function1[/* a */ DefaultPolylineSetupOptions, PolylineSetupOptions])
    ): Self = StObject.set(x, "takenRoutePolylineSetup", value.asInstanceOf[js.Any])
    
    inline def setTakenRoutePolylineSetupFunction1(value: /* a */ DefaultPolylineSetupOptions => PolylineSetupOptions): Self = StObject.set(x, "takenRoutePolylineSetup", js.Any.fromFunction1(value))
    
    inline def setTakenRoutePolylines(value: js.Array[Polyline]): Self = StObject.set(x, "takenRoutePolylines", value.asInstanceOf[js.Any])
    
    inline def setTakenRoutePolylinesVarargs(value: Polyline*): Self = StObject.set(x, "takenRoutePolylines", js.Array(value*))
    
    inline def setTaskOutcomeMarkerSetup(value: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])): Self = StObject.set(x, "taskOutcomeMarkerSetup", value.asInstanceOf[js.Any])
    
    inline def setTaskOutcomeMarkerSetupFunction1(value: /* a */ DefaultMarkerSetupOptions => MarkerSetupOptions): Self = StObject.set(x, "taskOutcomeMarkerSetup", js.Any.fromFunction1(value))
    
    inline def setTaskOutcomeMarkers(value: js.Array[Marker]): Self = StObject.set(x, "taskOutcomeMarkers", value.asInstanceOf[js.Any])
    
    inline def setTaskOutcomeMarkersVarargs(value: Marker*): Self = StObject.set(x, "taskOutcomeMarkers", js.Array(value*))
    
    inline def setUnsuccessfulTaskMarkerSetup(value: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])): Self = StObject.set(x, "unsuccessfulTaskMarkerSetup", value.asInstanceOf[js.Any])
    
    inline def setUnsuccessfulTaskMarkerSetupFunction1(value: /* a */ DefaultMarkerSetupOptions => MarkerSetupOptions): Self = StObject.set(x, "unsuccessfulTaskMarkerSetup", js.Any.fromFunction1(value))
    
    inline def setUnsuccessfulTaskMarkers(value: js.Array[Marker]): Self = StObject.set(x, "unsuccessfulTaskMarkers", value.asInstanceOf[js.Any])
    
    inline def setUnsuccessfulTaskMarkersVarargs(value: Marker*): Self = StObject.set(x, "unsuccessfulTaskMarkers", js.Array(value*))
    
    inline def setVehicleMarkerSetup(value: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])): Self = StObject.set(x, "vehicleMarkerSetup", value.asInstanceOf[js.Any])
    
    inline def setVehicleMarkerSetupFunction1(value: /* a */ DefaultMarkerSetupOptions => MarkerSetupOptions): Self = StObject.set(x, "vehicleMarkerSetup", js.Any.fromFunction1(value))
    
    inline def setVehicleMarkers(value: js.Array[Marker]): Self = StObject.set(x, "vehicleMarkers", value.asInstanceOf[js.Any])
    
    inline def setVehicleMarkersVarargs(value: Marker*): Self = StObject.set(x, "vehicleMarkers", js.Array(value*))
    
    inline def setWaypointMarkerSetup(value: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions])): Self = StObject.set(x, "waypointMarkerSetup", value.asInstanceOf[js.Any])
    
    inline def setWaypointMarkerSetupFunction1(value: /* a */ DefaultMarkerSetupOptions => MarkerSetupOptions): Self = StObject.set(x, "waypointMarkerSetup", js.Any.fromFunction1(value))
    
    inline def setWaypointMarkers(value: js.Array[Marker]): Self = StObject.set(x, "waypointMarkers", value.asInstanceOf[js.Any])
    
    inline def setWaypointMarkersVarargs(value: Marker*): Self = StObject.set(x, "waypointMarkers", js.Array(value*))
  }
}
