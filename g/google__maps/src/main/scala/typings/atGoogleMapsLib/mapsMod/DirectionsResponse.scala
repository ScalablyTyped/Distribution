package typings
package atGoogleMapsLib.mapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DirectionsResponse extends js.Object {
  /**
       * contains an array of available travel modes. This field is returned when a request specifies a travel `mode` and gets no results.
       * The array contains the available travel modes in the countries of the given set of waypoints.
       * This field is not returned if one or more of the waypoints are `via:` waypoints.
       */
  var available_travel_modes: js.Array[java.lang.String]
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

