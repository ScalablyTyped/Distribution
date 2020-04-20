package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceMatrixRowElement extends js.Object {
  /**
    * The total distance of this route, expressed in meters (`value`) and as `text`.
    * The textual value uses the `unit` system specified with the unit parameter of the original request, or the origin's region.
    */
  var distance: Distance
  /**
    * The length of time it takes to travel this route, expressed in seconds (the `value` field) and as `text`.
    * The textual representation is localized according to the query's `language` parameter.
    */
  var duration: Duration
  /**
    * The length of time it takes to travel this route, based on current and historical traffic conditions.
    * See the `traffic_model` request parameter for the options you can use to request that the returned value is
    * `optimistic`, `pessimistic`, or a `best-guess` estimate. The duration is expressed in seconds (the `value` field) and as `text`.
    * The textual representation is localized according to the query's `language` parameter.
    * The duration in traffic is returned only if all of the following are true:
    *  - The request includes a `departure_time` parameter.
    *  - The request includes a valid API key, or a valid Google Maps APIs Premium Plan client ID and signature.
    *  - Traffic conditions are available for the requested route.
    *  - The `mode` parameter is set to `driving`.
    */
  var duration_in_traffic: Duration
  /**
    * If present, contains the total fare (that is, the total ticket costs) on this route.
    * This property is only returned for transit requests and only for transit providers where fare information is available.
    */
  var fare: TransitFare
  /** possible status codes  */
  var status: DistanceMatrixResponseElementLevelStatus
}

object DistanceMatrixRowElement {
  @scala.inline
  def apply(
    distance: Distance,
    duration: Duration,
    duration_in_traffic: Duration,
    fare: TransitFare,
    status: DistanceMatrixResponseElementLevelStatus
  ): DistanceMatrixRowElement = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], duration_in_traffic = duration_in_traffic.asInstanceOf[js.Any], fare = fare.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixRowElement]
  }
}

