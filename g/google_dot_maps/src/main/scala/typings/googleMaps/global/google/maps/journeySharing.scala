package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.MapOptions
import typings.googleMaps.google.maps.MapsEventListener
import typings.googleMaps.google.maps.journeySharing.AutomaticViewportMode
import typings.googleMaps.google.maps.journeySharing.DefaultMarkerSetupOptions
import typings.googleMaps.google.maps.journeySharing.DefaultPolylineSetupOptions
import typings.googleMaps.google.maps.journeySharing.FleetEngineDeliveryFleetLocationProviderOptions
import typings.googleMaps.google.maps.journeySharing.FleetEngineDeliveryVehicleLocationProviderOptions
import typings.googleMaps.google.maps.journeySharing.FleetEngineShipmentLocationProviderOptions
import typings.googleMaps.google.maps.journeySharing.FleetEngineTaskFilterOptions
import typings.googleMaps.google.maps.journeySharing.FleetEngineTripLocationProviderOptions
import typings.googleMaps.google.maps.journeySharing.JourneySharingMapViewOptions
import typings.googleMaps.google.maps.journeySharing.MarkerSetupOptions
import typings.googleMaps.google.maps.journeySharing.PolylineSetupOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object journeySharing {
  
  @JSGlobal("google.maps.journeySharing.AutomaticViewportMode")
  @js.native
  object AutomaticViewportMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.journeySharing.AutomaticViewportMode & String] = js.native
    
    /* "FIT_ANTICIPATED_ROUTE" */ val FIT_ANTICIPATED_ROUTE: typings.googleMaps.google.maps.journeySharing.AutomaticViewportMode.FIT_ANTICIPATED_ROUTE & String = js.native
    
    /* "NONE" */ val NONE: typings.googleMaps.google.maps.journeySharing.AutomaticViewportMode.NONE & String = js.native
  }
  
  @JSGlobal("google.maps.journeySharing.DeliveryVehicleStopState")
  @js.native
  object DeliveryVehicleStopState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.journeySharing.DeliveryVehicleStopState & String] = js.native
    
    /* "ARRIVED" */ val ARRIVED: typings.googleMaps.google.maps.journeySharing.DeliveryVehicleStopState.ARRIVED & String = js.native
    
    /* "ENROUTE" */ val ENROUTE: typings.googleMaps.google.maps.journeySharing.DeliveryVehicleStopState.ENROUTE & String = js.native
    
    /* "NEW" */ val NEW: typings.googleMaps.google.maps.journeySharing.DeliveryVehicleStopState.NEW & String = js.native
    
    /* "UNSPECIFIED" */ val UNSPECIFIED: typings.googleMaps.google.maps.journeySharing.DeliveryVehicleStopState.UNSPECIFIED & String = js.native
  }
  
  @JSGlobal("google.maps.journeySharing.FleetEngineDeliveryFleetLocationProvider")
  @js.native
  open class FleetEngineDeliveryFleetLocationProvider protected ()
    extends StObject
       with typings.googleMaps.google.maps.journeySharing.FleetEngineDeliveryFleetLocationProvider {
    /**
      * Delivery Fleet Location Provider.
      *
      * Access by calling `const {FleetEngineDeliveryFleetLocationProvider} =
      * await google.maps.importLibrary("journeySharing")`. See
      * https://developers.google.com/maps/documentation/javascript/libraries.
      * @param options Options to pass to the location provider.
      */
    def this(options: FleetEngineDeliveryFleetLocationProviderOptions) = this()
    
    /**
      * Adds a {@link google.maps.MapsEventListener} for an event fired by this
      * location provider. Returns an identifier for this listener that can be
      * used with {@link google.maps.event.removeListener}.
      * @param eventName The name of the event to listen for.
      * @param handler The event handler.
      */
    /* CompleteClass */
    override def addListener(eventName: String, handler: js.Function): MapsEventListener = js.native
    
    /**
      * True if this location provider is polling. Read only.
      */
    /* CompleteClass */
    var isPolling: Boolean = js.native
    
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
    /* CompleteClass */
    var pollingIntervalMillis: Double = js.native
    
    /**
      * This Field is read-only. Threshold for stale vehicle location. If the
      * last updated location for the vehicle is older than this threshold, the
      * vehicle will not be displayed.
      */
    /* CompleteClass */
    var staleLocationThresholdMillis: Double = js.native
  }
  
  @JSGlobal("google.maps.journeySharing.FleetEngineDeliveryVehicleLocationProvider")
  @js.native
  open class FleetEngineDeliveryVehicleLocationProvider protected ()
    extends StObject
       with typings.googleMaps.google.maps.journeySharing.FleetEngineDeliveryVehicleLocationProvider {
    /**
      * Delivery Vehicle Location Provider.
      *
      * Access by calling `const {FleetEngineDeliveryVehicleLocationProvider} =
      * await google.maps.importLibrary("journeySharing")`. See
      * https://developers.google.com/maps/documentation/javascript/libraries.
      * @param options Options to pass to the location provider.
      */
    def this(options: FleetEngineDeliveryVehicleLocationProviderOptions) = this()
    
    /**
      * Adds a {@link google.maps.MapsEventListener} for an event fired by this
      * location provider. Returns an identifier for this listener that can be
      * used with {@link google.maps.event.removeListener}.
      * @param eventName The name of the event to listen for.
      * @param handler The event handler.
      */
    /* CompleteClass */
    override def addListener(eventName: String, handler: js.Function): MapsEventListener = js.native
    
    /**
      * ID for the vehicle that this location provider observes. Set this field
      * to track a vehicle.
      */
    /* CompleteClass */
    var deliveryVehicleId: String = js.native
    
    /**
      * True if this location provider is polling. Read only.
      */
    /* CompleteClass */
    var isPolling: Boolean = js.native
    
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
    /* CompleteClass */
    var pollingIntervalMillis: Double = js.native
    
    /**
      * Optionally allow users to display the task&#39;s outcome location.
      */
    /* CompleteClass */
    var shouldShowOutcomeLocations: Boolean | Null = js.native
    
    /**
      * Optionally allow users to display fetched tasks.
      */
    /* CompleteClass */
    var shouldShowTasks: Boolean | Null = js.native
    
    /**
      * This Field is read-only. Threshold for stale vehicle location. If the
      * last updated location for the vehicle is older than this threshold, the
      * vehicle will not be displayed.
      */
    /* CompleteClass */
    var staleLocationThresholdMillis: Double = js.native
    
    /**
      * Returns the filter options to apply when fetching tasks.
      */
    /* CompleteClass */
    var taskFilterOptions: FleetEngineTaskFilterOptions = js.native
  }
  
  @JSGlobal("google.maps.journeySharing.FleetEngineServiceType")
  @js.native
  object FleetEngineServiceType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.journeySharing.FleetEngineServiceType & String] = js.native
    
    /* "DELIVERY_VEHICLE_SERVICE" */ val DELIVERY_VEHICLE_SERVICE: typings.googleMaps.google.maps.journeySharing.FleetEngineServiceType.DELIVERY_VEHICLE_SERVICE & String = js.native
    
    /* "TASK_SERVICE" */ val TASK_SERVICE: typings.googleMaps.google.maps.journeySharing.FleetEngineServiceType.TASK_SERVICE & String = js.native
    
    /* "TRIP_SERVICE" */ val TRIP_SERVICE: typings.googleMaps.google.maps.journeySharing.FleetEngineServiceType.TRIP_SERVICE & String = js.native
    
    /* "UNKNOWN_SERVICE" */ val UNKNOWN_SERVICE: typings.googleMaps.google.maps.journeySharing.FleetEngineServiceType.UNKNOWN_SERVICE & String = js.native
  }
  
  @JSGlobal("google.maps.journeySharing.FleetEngineShipmentLocationProvider")
  @js.native
  open class FleetEngineShipmentLocationProvider protected ()
    extends StObject
       with typings.googleMaps.google.maps.journeySharing.FleetEngineShipmentLocationProvider {
    /**
      * Shipment location provider.
      *
      * Access by calling `const {FleetEngineShipmentLocationProvider} = await
      * google.maps.importLibrary("journeySharing")`. See
      * https://developers.google.com/maps/documentation/javascript/libraries.
      * @param options Options for the location provider.
      */
    def this(options: FleetEngineShipmentLocationProviderOptions) = this()
    
    /**
      * Adds a {@link google.maps.MapsEventListener} for an event fired by this
      * location provider. Returns an identifier for this listener that can be
      * used with {@link google.maps.event.removeListener}.
      * @param eventName The name of the event to listen for.
      * @param handler The event handler.
      */
    /* CompleteClass */
    override def addListener(eventName: String, handler: js.Function): MapsEventListener = js.native
    
    /**
      * True if this location provider is polling. Read only.
      */
    /* CompleteClass */
    var isPolling: Boolean = js.native
    
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
    /* CompleteClass */
    var pollingIntervalMillis: Double = js.native
    
    /**
      * Explicitly refreshes the tracked location.
      */
    /* CompleteClass */
    override def refresh(): Unit = js.native
    
    /**
      * The tracking ID for the task that this location provider observes. Set
      * this field to begin tracking.
      */
    /* CompleteClass */
    var trackingId: String = js.native
  }
  
  @JSGlobal("google.maps.journeySharing.FleetEngineTripLocationProvider")
  @js.native
  open class FleetEngineTripLocationProvider protected ()
    extends StObject
       with typings.googleMaps.google.maps.journeySharing.FleetEngineTripLocationProvider {
    /**
      * Trip location provider.
      *
      * Access by calling `const {FleetEngineTripLocationProvider} = await
      * google.maps.importLibrary("journeySharing")`. See
      * https://developers.google.com/maps/documentation/javascript/libraries.
      * @param options Options for the location provider.
      */
    def this(options: FleetEngineTripLocationProviderOptions) = this()
    
    /**
      * Adds a {@link google.maps.MapsEventListener} for an event fired by this
      * location provider. Returns an identifier for this listener that can be
      * used with {@link google.maps.event.removeListener}.
      * @param eventName The name of the event to listen for.
      * @param handler The event handler.
      */
    /* CompleteClass */
    override def addListener(eventName: String, handler: js.Function): MapsEventListener = js.native
    
    /**
      * True if this location provider is polling. Read only.
      */
    /* CompleteClass */
    var isPolling: Boolean = js.native
    
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
    /* CompleteClass */
    var pollingIntervalMillis: Double = js.native
    
    /**
      * Explicitly refreshes the tracked location.
      */
    /* CompleteClass */
    override def refresh(): Unit = js.native
    
    /**
      * The ID for the trip that this location provider observes. Set this field
      * to begin tracking.
      */
    /* CompleteClass */
    var tripId: String = js.native
  }
  
  @JSGlobal("google.maps.journeySharing.JourneySharingMapView")
  @js.native
  open class JourneySharingMapView protected ()
    extends StObject
       with typings.googleMaps.google.maps.journeySharing.JourneySharingMapView {
    /**
      * The map view.
      *
      * Access by calling `const {JourneySharingMapView} = await
      * google.maps.importLibrary("journeySharing")`. See
      * https://developers.google.com/maps/documentation/javascript/libraries.
      * @param options Options for the map view.
      */
    def this(options: JourneySharingMapViewOptions) = this()
    
    /**
      * Configures options for an anticipated route polyline. Invoked whenever a
      * new anticipated route polyline is rendered. <br><br>If specifying a
      * function, the function can and should modify the input&#39;s
      * defaultPolylineOptions field containing a google.maps.PolylineOptions
      * object, and return it as polylineOptions in the output
      * PolylineSetupOptions object. <br><br>Specifying a PolylineSetupOptions
      * object has the same effect as specifying a function that returns that
      * static object. <br><br>Do not reuse the same PolylineSetupOptions object
      * in different PolylineSetup functions or static values, and do not reuse
      * the same google.maps.PolylineOptions object for the polylineOptions key
      * in different PolylineSetupOptions objects. If polylineOptions or visible
      * is unset or null, it will be overwritten with the default. Any values set
      * for polylineOptions.map or polylineOptions.path will be ignored.
      */
    /* CompleteClass */
    var anticipatedRoutePolylineSetup: PolylineSetupOptions | (js.Function1[/* a */ DefaultPolylineSetupOptions, PolylineSetupOptions]) = js.native
    
    /**
      * Returns the anticipated route polylines, if any.
      */
    /* CompleteClass */
    var anticipatedRoutePolylines: js.Array[typings.googleMaps.google.maps.Polyline] = js.native
    
    /**
      * This Field is read-only. Automatic viewport mode.
      */
    /* CompleteClass */
    var automaticViewportMode: AutomaticViewportMode = js.native
    
    /**
      * Configures options for a destination location marker. Invoked whenever a
      * new destination marker is rendered. <br><br>If specifying a function, the
      * function can and should modify the input&#39;s defaultMarkerOptions field
      * containing a google.maps.MarkerOptions object, and return it as
      * markerOptions in the output MarkerSetupOptions object. <br><br>Specifying
      * a MarkerSetupOptions object has the same effect as specifying a function
      * that returns that static object. <br><br>Do not reuse the same
      * MarkerSetupOptions object in different MarkerSetup functions or static
      * values, and do not reuse the same google.maps.MarkerOptions object for
      * the markerOptions key in different MarkerSetupOptions objects. If
      * markerOptions is unset or null, it will be overwritten with the default.
      * Any value set for markerOptions.map or markerOptions.position will be
      * ignored.
      * @deprecated Marker setup is deprecated. Use the
      *     <code>MarkerCustomizationFunction</code> methods for your location
      *     provider instead. This field will be removed in the future.
      */
    /* CompleteClass */
    var destinationMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]) = js.native
    
    /**
      * Returns the destination markers, if any.
      * @deprecated getting a list of markers via the <code>MapView</code> is
      *     deprecated. Use the <code>MarkerCustomizationFunction</code>s for
      *     your location provider to receive callbacks when a marker is added to
      *     the map or updated.
      */
    /* CompleteClass */
    var destinationMarkers: js.Array[typings.googleMaps.google.maps.Marker_] = js.native
    
    /**
      * This Field is read-only. The DOM element backing the view.
      */
    /* CompleteClass */
    var element: Element = js.native
    
    /**
      * Enables or disables the traffic layer.
      */
    /* CompleteClass */
    var enableTraffic: Boolean = js.native
    
    /**
      * This Field is read-only. A source of tracked locations to be shown in the
      * tracking map view.
      */
    /* CompleteClass */
    var locationProvider: typings.googleMaps.google.maps.journeySharing.LocationProvider = js.native
    
    /**
      * This Field is read-only. The map object contained in the map view.
      */
    /* CompleteClass */
    var map: typings.googleMaps.google.maps.Map = js.native
    
    /**
      * This Field is read-only. The map options passed into the map via the map
      * view.
      */
    /* CompleteClass */
    var mapOptions: MapOptions = js.native
    
    /**
      * Configures options for an origin location marker. Invoked whenever a new
      * origin marker is rendered. <br><br>If specifying a function, the function
      * can and should modify the input&#39;s defaultMarkerOptions field
      * containing a google.maps.MarkerOptions object, and return it as
      * markerOptions in the output MarkerSetupOptions object. <br><br>Specifying
      * a MarkerSetupOptions object has the same effect as specifying a function
      * that returns that static object. <br><br>Do not reuse the same
      * MarkerSetupOptions object in different MarkerSetup functions or static
      * values, and do not reuse the same google.maps.MarkerOptions object for
      * the markerOptions key in different MarkerSetupOptions objects. If
      * markerOptions is unset or null, it will be overwritten with the default.
      * Any value set for markerOptions.map or markerOptions.position will be
      * ignored.
      * @deprecated Marker setup is deprecated. Use the
      *     <code>MarkerCustomizationFunction</code> methods for your location
      *     provider instead. This field will be removed in the future.
      */
    /* CompleteClass */
    var originMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]) = js.native
    
    /**
      * Returns the origin markers, if any.
      * @deprecated getting a list of markers via the <code>MapView</code> is
      *     deprecated. Use the <code>MarkerCustomizationFunction</code>s for
      *     your location provider to receive callbacks when a marker is added to
      *     the map or updated.
      */
    /* CompleteClass */
    var originMarkers: js.Array[typings.googleMaps.google.maps.Marker_] = js.native
    
    /**
      * Configures options for a ping location marker. Invoked whenever a new
      * ping marker is rendered. <br><br>If specifying a function, the function
      * can and should modify the input&#39;s defaultMarkerOptions field
      * containing a google.maps.MarkerOptions object, and return it as
      * markerOptions in the output MarkerSetupOptions object. <br><br>Specifying
      * a MarkerSetupOptions object has the same effect as specifying a function
      * that returns that static object. <br><br>Do not reuse the same
      * MarkerSetupOptions object in different MarkerSetup functions or static
      * values, and do not reuse the same google.maps.MarkerOptions object for
      * the markerOptions key in different MarkerSetupOptions objects. If
      * markerOptions is unset or null, it will be overwritten with the default.
      * Any value set for markerOptions.map or markerOptions.position will be
      * ignored.
      * @deprecated Marker setup is deprecated. Use the
      *     <code>MarkerCustomizationFunction</code> methods for your location
      *     provider instead. This field will be removed in the future.
      */
    /* CompleteClass */
    var pingMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]) = js.native
    
    /**
      * Configures options for a successful task location marker. Invoked
      * whenever a new successful task marker is rendered. <br><br>If specifying
      * a function, the function can and should modify the input&#39;s
      * defaultMarkerOptions field containing a google.maps.MarkerOptions object,
      * and return it as markerOptions in the output MarkerSetupOptions object.
      * <br><br>Specifying a MarkerSetupOptions object has the same effect as
      * specifying a function that returns that static object. <br><br>Do not
      * reuse the same MarkerSetupOptions object in different MarkerSetup
      * functions or static values, and do not reuse the same
      * google.maps.MarkerOptions object for the markerOptions key in different
      * MarkerSetupOptions objects. If markerOptions is unset or null, it will be
      * overwritten with the default. Any value set for markerOptions.map or
      * markerOptions.position will be ignored.
      * @deprecated Marker setup is deprecated. Use the
      *     <code>MarkerCustomizationFunction</code> methods for your location
      *     provider instead. This field will be removed in the future.
      */
    /* CompleteClass */
    var successfulTaskMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]) = js.native
    
    /**
      * Returns the successful task markers, if any.
      * @deprecated getting a list of markers via the <code>MapView</code> is
      *     deprecated. Use the <code>MarkerCustomizationFunction</code>s for
      *     your location provider to receive callbacks when a marker is added to
      *     the map or updated.
      */
    /* CompleteClass */
    var successfulTaskMarkers: js.Array[typings.googleMaps.google.maps.Marker_] = js.native
    
    /**
      * Configures options for a taken route polyline. Invoked whenever a new
      * taken route polyline is rendered. <br><br>If specifying a function, the
      * function can and should modify the input&#39;s defaultPolylineOptions
      * field containing a google.maps.PolylineOptions object, and return it as
      * polylineOptions in the output PolylineSetupOptions object.
      * <br><br>Specifying a PolylineSetupOptions object has the same effect as
      * specifying a function that returns that static object. <br><br>Do not
      * reuse the same PolylineSetupOptions object in different PolylineSetup
      * functions or static values, and do not reuse the same
      * google.maps.PolylineOptions object for the polylineOptions key in
      * different PolylineSetupOptions objects. <br><br>Any values set for
      * polylineOptions.map or polylineOptions.path will be ignored. Any unset or
      * null value will be overwritten with the default.
      */
    /* CompleteClass */
    var takenRoutePolylineSetup: PolylineSetupOptions | (js.Function1[/* a */ DefaultPolylineSetupOptions, PolylineSetupOptions]) = js.native
    
    /**
      * Returns the taken route polylines, if any.
      */
    /* CompleteClass */
    var takenRoutePolylines: js.Array[typings.googleMaps.google.maps.Polyline] = js.native
    
    /**
      * Configures options for a task outcome location marker. Invoked whenever a
      * new task outcome location marker is rendered. <br><br>If specifying a
      * function, the function can and should modify the input&#39;s
      * defaultMarkerOptions field containing a google.maps.MarkerOptions object,
      * and return it as markerOptions in the output MarkerSetupOptions object.
      * <br><br>Specifying a MarkerSetupOptions object has the same effect as
      * specifying a function that returns that static object. <br><br>Do not
      * reuse the same MarkerSetupOptions object in different MarkerSetup
      * functions or static values, and do not reuse the same
      * google.maps.MarkerOptions object for the markerOptions key in different
      * MarkerSetupOptions objects. If markerOptions is unset or null, it will be
      * overwritten with the default. Any value set for markerOptions.map or
      * markerOptions.position will be ignored.
      * @deprecated Marker setup is deprecated. Use the
      *     <code>MarkerCustomizationFunction</code> methods for your location
      *     provider instead. This field will be removed in the future.
      */
    /* CompleteClass */
    var taskOutcomeMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]) = js.native
    
    /**
      * Returns the task outcome markers, if any.
      * @deprecated getting a list of markers via the <code>MapView</code> is
      *     deprecated. Use the <code>MarkerCustomizationFunction</code>s for
      *     your location provider to receive callbacks when a marker is added to
      *     the map or updated.
      */
    /* CompleteClass */
    var taskOutcomeMarkers: js.Array[typings.googleMaps.google.maps.Marker_] = js.native
    
    /**
      * Configures options for an unsuccessful task location marker. Invoked
      * whenever a new unsuccessful task marker is rendered. <br><br>If
      * specifying a function, the function can and should modify the input&#39;s
      * defaultMarkerOptions field containing a google.maps.MarkerOptions object,
      * and return it as markerOptions in the output MarkerSetupOptions object.
      * <br><br>Specifying a MarkerSetupOptions object has the same effect as
      * specifying a function that returns that static object. <br><br>Do not
      * reuse the same MarkerSetupOptions object in different MarkerSetup
      * functions or static values, and do not reuse the same
      * google.maps.MarkerOptions object for the markerOptions key in different
      * MarkerSetupOptions objects. If markerOptions is unset or null, it will be
      * overwritten with the default. Any value set for markerOptions.map or
      * markerOptions.position will be ignored.
      * @deprecated Marker setup is deprecated. Use the
      *     <code>MarkerCustomizationFunction</code> methods for your location
      *     provider instead. This field will be removed in the future.
      */
    /* CompleteClass */
    var unsuccessfulTaskMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]) = js.native
    
    /**
      * Returns the unsuccessful task markers, if any.
      * @deprecated getting a list of markers via the <code>MapView</code> is
      *     deprecated. Use the <code>MarkerCustomizationFunction</code>s for
      *     your location provider to receive callbacks when a marker is added to
      *     the map or updated.
      */
    /* CompleteClass */
    var unsuccessfulTaskMarkers: js.Array[typings.googleMaps.google.maps.Marker_] = js.native
    
    /**
      * Configures options for a vehicle location marker. Invoked whenever a new
      * vehicle marker is rendered. <br><br>If specifying a function, the
      * function can and should modify the input&#39;s defaultMarkerOptions field
      * containing a google.maps.MarkerOptions object, and return it as
      * markerOptions in the output MarkerSetupOptions object. <br><br>Specifying
      * a MarkerSetupOptions object has the same effect as specifying a function
      * that returns that static object. <br><br>Do not reuse the same
      * MarkerSetupOptions object in different MarkerSetup functions or static
      * values, and do not reuse the same google.maps.MarkerOptions object for
      * the markerOptions key in different MarkerSetupOptions objects. If
      * markerOptions is unset or null, it will be overwritten with the default.
      * Any value set for markerOptions.map or markerOptions.position will be
      * ignored.
      * @deprecated Marker setup is deprecated. Use the
      *     <code>MarkerCustomizationFunction</code> methods for your location
      *     provider instead. This field will be removed in the future.
      */
    /* CompleteClass */
    var vehicleMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]) = js.native
    
    /**
      * Returns the vehicle markers, if any.
      * @deprecated getting a list of markers via the <code>MapView</code> is
      *     deprecated. Use the <code>MarkerCustomizationFunction</code>s for
      *     your location provider to receive callbacks when a marker is added to
      *     the map or updated.
      */
    /* CompleteClass */
    var vehicleMarkers: js.Array[typings.googleMaps.google.maps.Marker_] = js.native
    
    /**
      * Configures options for a waypoint location marker. Invoked whenever a new
      * waypoint marker is rendered. <br><br>If specifying a function, the
      * function can and should modify the input&#39;s defaultMarkerOptions field
      * containing a google.maps.MarkerOptions object, and return it as
      * markerOptions in the output MarkerSetupOptions object. <br><br>Specifying
      * a MarkerSetupOptions object has the same effect as specifying a function
      * that returns that static object. <br><br>Do not reuse the same
      * MarkerSetupOptions object in different MarkerSetup functions or static
      * values, and do not reuse the same google.maps.MarkerOptions object for
      * the markerOptions key in different MarkerSetupOptions objects. If
      * markerOptions is unset or null, it will be overwritten with the default.
      * Any value set for markerOptions.map or markerOptions.position will be
      * ignored.
      * @deprecated Marker setup is deprecated. Use the
      *     <code>MarkerCustomizationFunction</code> methods for your location
      *     provider instead. This field will be removed in the future.
      */
    /* CompleteClass */
    var waypointMarkerSetup: MarkerSetupOptions | (js.Function1[/* a */ DefaultMarkerSetupOptions, MarkerSetupOptions]) = js.native
    
    /**
      * Returns the waypoint markers, if any.
      * @deprecated getting a list of markers via the <code>MapView</code> is
      *     deprecated. Use the <code>MarkerCustomizationFunction</code>s for
      *     your location provider to receive callbacks when a marker is added to
      *     the map or updated.
      */
    /* CompleteClass */
    var waypointMarkers: js.Array[typings.googleMaps.google.maps.Marker_] = js.native
  }
  
  /* note: abstract class */ @JSGlobal("google.maps.journeySharing.LocationProvider")
  @js.native
  open class LocationProvider ()
    extends StObject
       with typings.googleMaps.google.maps.journeySharing.LocationProvider {
    
    /**
      * Adds a {@link google.maps.MapsEventListener} for an event fired by this
      * location provider. Returns an identifier for this listener that can be
      * used with {@link google.maps.event.removeListener}.
      * @param eventName The name of the event to listen for.
      * @param handler The event handler.
      */
    /* CompleteClass */
    override def addListener(eventName: String, handler: js.Function): MapsEventListener = js.native
  }
  
  /* note: abstract class */ @JSGlobal("google.maps.journeySharing.PollingLocationProvider")
  @js.native
  open class PollingLocationProvider ()
    extends StObject
       with typings.googleMaps.google.maps.journeySharing.PollingLocationProvider {
    
    /**
      * Adds a {@link google.maps.MapsEventListener} for an event fired by this
      * location provider. Returns an identifier for this listener that can be
      * used with {@link google.maps.event.removeListener}.
      * @param eventName The name of the event to listen for.
      * @param handler The event handler.
      */
    /* CompleteClass */
    override def addListener(eventName: String, handler: js.Function): MapsEventListener = js.native
    
    /**
      * True if this location provider is polling. Read only.
      */
    /* CompleteClass */
    var isPolling: Boolean = js.native
    
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
    /* CompleteClass */
    var pollingIntervalMillis: Double = js.native
  }
}
