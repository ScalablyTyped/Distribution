package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteLeg extends js.Object {
  
  /** contains the estimated time of arrival for this leg. This property is only returned for transit directions. */
  var arrival_time: Time = js.native
  
  /**
    * contains the estimated time of departure for this leg, specified as a `Time` object.
    * The `departure_time` is only available for transit directions.
    */
  var departure_time: Time = js.native
  
  /**
    * indicates the total distance covered by this leg, as a field with the following elements.
    *
    * This field may be absent if the distance is unknown.
    */
  var distance: Distance = js.native
  
  /**
    * indicates the total duration of this leg.
    *
    * This field may be absent if the duration is unknown.
    */
  var duration: Duration = js.native
  
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
  var duration_in_traffic: Duration = js.native
  
  /** contains the human-readable address (typically a street address) from reverse geocoding the `end_location` of this leg. */
  var end_address: String = js.native
  
  /**
    * contains the latitude/longitude coordinates of the given destination of this leg.
    * Because the Directions API calculates directions between locations by using the nearest transportation option (usually a road)
    * at the start and end points, `end_location` may be different than the provided destination of this leg if, for example,
    * a road is not near the destination.
    */
  var end_location: LatLngLiteral = js.native
  
  /** contains the human-readable address (typically a street address) resulting from reverse geocoding the `start_location` of this leg. */
  var start_address: String = js.native
  
  /**
    * contains the latitude/longitude coordinates of the origin of this leg.
    * Because the Directions API calculates directions between locations by using the nearest transportation option (usually a road)
    * at the start and end points, `start_location` may be different than the provided origin of this leg if, for example,
    * a road is not near the origin.
    */
  var start_location: LatLngLiteral = js.native
  
  /** contains an array of steps denoting information about each separate step of the leg of the journey. */
  var steps: js.Array[DirectionsStep] = js.native
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
    val __obj = js.Dynamic.literal(arrival_time = arrival_time.asInstanceOf[js.Any], departure_time = departure_time.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], duration_in_traffic = duration_in_traffic.asInstanceOf[js.Any], end_address = end_address.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], start_address = start_address.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLeg]
  }
  
  @scala.inline
  implicit class RouteLegOps[Self <: RouteLeg] (val x: Self) extends AnyVal {
    
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
    def setArrival_time(value: Time): Self = this.set("arrival_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeparture_time(value: Time): Self = this.set("departure_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Distance): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Duration): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration_in_traffic(value: Duration): Self = this.set("duration_in_traffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_address(value: String): Self = this.set("end_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_location(value: LatLngLiteral): Self = this.set("end_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_address(value: String): Self = this.set("start_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_location(value: LatLngLiteral): Self = this.set("start_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: DirectionsStep*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[DirectionsStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
  }
}
