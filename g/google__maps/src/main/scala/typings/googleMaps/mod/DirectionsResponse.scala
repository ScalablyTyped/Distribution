package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsResponse extends StObject {
  
  /**
    * contains an array of available travel modes. This field is returned when a request specifies a travel `mode` and gets no results.
    * The array contains the available travel modes in the countries of the given set of waypoints.
    * This field is not returned if one or more of the waypoints are `via:` waypoints.
    */
  var available_travel_modes: js.Array[String]
  
  /**
    * contains an array with details about the geocoding of origin, destination and waypoints.
    *
    * These details will not be present for waypoints specified as textual latitude/longitude values if the service returns no results.
    * This is because such waypoints are only reverse geocoded to obtain their representative address after a route has been found.
    * An empty JSON object will occupy the corresponding places in the `geocoded_waypoints` array.
    */
  var geocoded_waypoints: js.Array[GeocodedWaypoint]
  
  /**
    * contains an array of routes from the origin to the destination.
    *
    * When the Directions API returns results, it places them within a (JSON) `routes` array. Even if the service returns no results
    * (such as if the origin and/or destination doesn't exist) it still returns an empty `routes` array.
    * (XML responses consist of zero or more `<route>` elements.)
    *
    * Each element of the `routes` array contains a single result from the specified origin and destination.
    * This route may consist of one or more `legs` depending on whether any waypoints were specified.
    * As well, the route also contains copyright and warning information which must be displayed to the user in addition to the
    * routing information.
    */
  var routes: js.Array[DirectionsRoute]
  
  /** contains metadata on the request. */
  var status: DirectionsReponseStatus
}
object DirectionsResponse {
  
  @scala.inline
  def apply(
    available_travel_modes: js.Array[String],
    geocoded_waypoints: js.Array[GeocodedWaypoint],
    routes: js.Array[DirectionsRoute],
    status: DirectionsReponseStatus
  ): DirectionsResponse = {
    val __obj = js.Dynamic.literal(available_travel_modes = available_travel_modes.asInstanceOf[js.Any], geocoded_waypoints = geocoded_waypoints.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsResponse]
  }
  
  @scala.inline
  implicit class DirectionsResponseMutableBuilder[Self <: DirectionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable_travel_modes(value: js.Array[String]): Self = StObject.set(x, "available_travel_modes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailable_travel_modesVarargs(value: String*): Self = StObject.set(x, "available_travel_modes", js.Array(value :_*))
    
    @scala.inline
    def setGeocoded_waypoints(value: js.Array[GeocodedWaypoint]): Self = StObject.set(x, "geocoded_waypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeocoded_waypointsVarargs(value: GeocodedWaypoint*): Self = StObject.set(x, "geocoded_waypoints", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[DirectionsRoute]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: DirectionsRoute*): Self = StObject.set(x, "routes", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: DirectionsReponseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
