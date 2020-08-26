package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsResponse extends js.Object {
  /**
    * contains an array of available travel modes. This field is returned when a request specifies a travel `mode` and gets no results.
    * The array contains the available travel modes in the countries of the given set of waypoints.
    * This field is not returned if one or more of the waypoints are `via:` waypoints.
    */
  var available_travel_modes: js.Array[String] = js.native
  /**
    * contains an array with details about the geocoding of origin, destination and waypoints.
    *
    * These details will not be present for waypoints specified as textual latitude/longitude values if the service returns no results.
    * This is because such waypoints are only reverse geocoded to obtain their representative address after a route has been found.
    * An empty JSON object will occupy the corresponding places in the `geocoded_waypoints` array.
    */
  var geocoded_waypoints: js.Array[GeocodedWaypoint] = js.native
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
  var routes: js.Array[DirectionsRoute] = js.native
  /** contains metadata on the request. */
  var status: DirectionsReponseStatus = js.native
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
  implicit class DirectionsResponseOps[Self <: DirectionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailable_travel_modesVarargs(value: String*): Self = this.set("available_travel_modes", js.Array(value :_*))
    @scala.inline
    def setAvailable_travel_modes(value: js.Array[String]): Self = this.set("available_travel_modes", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeocoded_waypointsVarargs(value: GeocodedWaypoint*): Self = this.set("geocoded_waypoints", js.Array(value :_*))
    @scala.inline
    def setGeocoded_waypoints(value: js.Array[GeocodedWaypoint]): Self = this.set("geocoded_waypoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutesVarargs(value: DirectionsRoute*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[DirectionsRoute]): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: DirectionsReponseStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

