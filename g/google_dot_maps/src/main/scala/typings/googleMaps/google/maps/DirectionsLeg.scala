package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single leg consisting of a set of steps in a <code><a
  * href="#DirectionsResult">DirectionsResult</a></code>. Some fields in the
  * leg may not be returned for all requests. Note that though this result is
  * &quot;JSON-like,&quot; it is not strictly JSON, as it directly and
  * indirectly includes <code>LatLng</code> objects.
  */
trait DirectionsLeg extends StObject {
  
  /**
    * An estimated arrival time for this leg. Only applicable for TRANSIT
    * requests.
    */
  var arrival_time: js.UndefOr[Time] = js.undefined
  
  /**
    * An estimated departure time for this leg. Only applicable for TRANSIT
    * requests.
    */
  var departure_time: js.UndefOr[Time] = js.undefined
  
  /**
    * The total distance covered by this leg. This property may be undefined as
    * the distance may be unknown.
    */
  var distance: js.UndefOr[Distance] = js.undefined
  
  /**
    * The total duration of this leg. This property may be
    * <code>undefined</code> as the duration may be unknown.
    */
  var duration: js.UndefOr[Duration] = js.undefined
  
  /**
    * The total duration of this leg, taking into account the traffic
    * conditions indicated by the <code>trafficModel</code> property. This
    * property may be <code>undefined</code> as the duration may be unknown.
    */
  var duration_in_traffic: js.UndefOr[Duration] = js.undefined
  
  /**
    * The address of the destination of this leg. This content is meant to be
    * read as-is. Do not programmatically parse the formatted address.
    */
  var end_address: String
  
  /**
    * The <code>DirectionsService</code> calculates directions between
    * locations by using the nearest transportation option (usually a road) at
    * the start and end locations. <code>end_location</code> indicates the
    * actual geocoded destination, which may be different than the
    * <code>end_location</code> of the last step if, for example, the road is
    * not near the destination of this leg.
    */
  var end_location: LatLng
  
  /**
    * The address of the origin of this leg. This content is meant to be read
    * as-is. Do not programmatically parse the formatted address.
    */
  var start_address: String
  
  /**
    * The <code>DirectionsService</code> calculates directions between
    * locations by using the nearest transportation option (usually a road) at
    * the start and end locations. <code>start_location</code> indicates the
    * actual geocoded origin, which may be different than the
    * <code>start_location</code> of the first step if, for example, the road
    * is not near the origin of this leg.
    */
  var start_location: LatLng
  
  /**
    * An array of <code>DirectionsStep</code>s, each of which contains
    * information about the individual steps in this leg.
    */
  var steps: js.Array[DirectionsStep]
  
  /**
    * Information about traffic speed along the leg.
    * @deprecated This array will always be empty.
    */
  var traffic_speed_entry: js.Array[Any]
  
  /**
    * An array of non-stopover waypoints along this leg, which were specified
    * in the original request. <p> <strong>Deprecated in alternative
    * routes</strong>. Version 3.27 will be the last version of the API that
    * adds extra <code>via_waypoints</code> in alternative routes. <p> When
    * using the Directions Service to implement draggable directions, it is
    * recommended to disable dragging of alternative routes. Only the main
    * route should be draggable. Users can drag the main route until it matches
    * an alternative route.
    */
  var via_waypoints: js.Array[LatLng]
}
object DirectionsLeg {
  
  inline def apply(
    end_address: String,
    end_location: LatLng,
    start_address: String,
    start_location: LatLng,
    steps: js.Array[DirectionsStep],
    traffic_speed_entry: js.Array[Any],
    via_waypoints: js.Array[LatLng]
  ): DirectionsLeg = {
    val __obj = js.Dynamic.literal(end_address = end_address.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], start_address = start_address.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], traffic_speed_entry = traffic_speed_entry.asInstanceOf[js.Any], via_waypoints = via_waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsLeg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsLeg] (val x: Self) extends AnyVal {
    
    inline def setArrival_time(value: Time): Self = StObject.set(x, "arrival_time", value.asInstanceOf[js.Any])
    
    inline def setArrival_timeUndefined: Self = StObject.set(x, "arrival_time", js.undefined)
    
    inline def setDeparture_time(value: Time): Self = StObject.set(x, "departure_time", value.asInstanceOf[js.Any])
    
    inline def setDeparture_timeUndefined: Self = StObject.set(x, "departure_time", js.undefined)
    
    inline def setDistance(value: Distance): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setDuration_in_traffic(value: Duration): Self = StObject.set(x, "duration_in_traffic", value.asInstanceOf[js.Any])
    
    inline def setDuration_in_trafficUndefined: Self = StObject.set(x, "duration_in_traffic", js.undefined)
    
    inline def setEnd_address(value: String): Self = StObject.set(x, "end_address", value.asInstanceOf[js.Any])
    
    inline def setEnd_location(value: LatLng): Self = StObject.set(x, "end_location", value.asInstanceOf[js.Any])
    
    inline def setStart_address(value: String): Self = StObject.set(x, "start_address", value.asInstanceOf[js.Any])
    
    inline def setStart_location(value: LatLng): Self = StObject.set(x, "start_location", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[DirectionsStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: DirectionsStep*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setTraffic_speed_entry(value: js.Array[Any]): Self = StObject.set(x, "traffic_speed_entry", value.asInstanceOf[js.Any])
    
    inline def setTraffic_speed_entryVarargs(value: Any*): Self = StObject.set(x, "traffic_speed_entry", js.Array(value*))
    
    inline def setVia_waypoints(value: js.Array[LatLng]): Self = StObject.set(x, "via_waypoints", value.asInstanceOf[js.Any])
    
    inline def setVia_waypointsVarargs(value: LatLng*): Self = StObject.set(x, "via_waypoints", js.Array(value*))
  }
}
