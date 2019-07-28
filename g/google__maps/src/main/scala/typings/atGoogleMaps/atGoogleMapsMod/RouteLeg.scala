package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteLeg extends js.Object {
  /** contains the estimated time of arrival for this leg. This property is only returned for transit directions. */
  var arrival_time: Time
  /**
    * contains the estimated time of departure for this leg, specified as a `Time` object.
    * The `departure_time` is only available for transit directions.
    */
  var departure_time: Time
  /**
    * indicates the total distance covered by this leg, as a field with the following elements.
    *
    * This field may be absent if the distance is unknown.
    */
  var distance: Distance
  /**
    * indicates the total duration of this leg.
    *
    * This field may be absent if the duration is unknown.
    */
  var duration: Duration
  /**
    * indicates the total duration of this leg.
    * This value is an estimate of the time in traffic based on current and historical traffic conditions.
    * See the `traffic_model` request parameter for the options you can use to request that the returned value is optimistic, pessimistic,
    * or a best-guess estimate. The duration in traffic is returned only if all of the following are true:
    *
    *  - The request includes a valid API key, or a valid Google Maps APIs Premium Plan client ID and signature.
    *  - The request does not include stopover waypoints. If the request includes waypoints, they must be prefixed with `via:`
    *    to avoid stopovers.
    *  - The request is specifically for driving directions—the `mode` parameter is set to `driving`.
    *  - The request includes a `departure_time` parameter.
    *  - Traffic conditions are available for the requested route.
    */
  var duration_in_traffic: Duration
  /** contains the human-readable address (typically a street address) from reverse geocoding the `end_location` of this leg. */
  var end_address: String
  /**
    * contains the latitude/longitude coordinates of the given destination of this leg.
    * Because the Directions API calculates directions between locations by using the nearest transportation option (usually a road)
    * at the start and end points, `end_location` may be different than the provided destination of this leg if, for example,
    * a road is not near the destination.
    */
  var end_location: LatLngLiteral
  /** contains the human-readable address (typically a street address) resulting from reverse geocoding the `start_location` of this leg. */
  var start_address: String
  /**
    * contains the latitude/longitude coordinates of the origin of this leg.
    * Because the Directions API calculates directions between locations by using the nearest transportation option (usually a road)
    * at the start and end points, `start_location` may be different than the provided origin of this leg if, for example,
    * a road is not near the origin.
    */
  var start_location: LatLngLiteral
  /** contains an array of steps denoting information about each separate step of the leg of the journey. */
  var steps: js.Array[DirectionsStep]
}

object RouteLeg {
  @scala.inline
  def apply(
    arrival_time: Time,
    departure_time: Time,
    distance: Distance,
    duration: Duration,
    duration_in_traffic: Duration,
    end_address: String,
    end_location: LatLngLiteral,
    start_address: String,
    start_location: LatLngLiteral,
    steps: js.Array[DirectionsStep]
  ): RouteLeg = {
    val __obj = js.Dynamic.literal(arrival_time = arrival_time, departure_time = departure_time, distance = distance, duration = duration, duration_in_traffic = duration_in_traffic, end_address = end_address, end_location = end_location, start_address = start_address, start_location = start_location, steps = steps)
  
    __obj.asInstanceOf[RouteLeg]
  }
}

