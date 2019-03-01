package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegInfo extends js.Object {
  /** The aircraft (or bus, ferry, railcar, etc) travelling between the two points of this leg. */
  var aircraft: js.UndefOr[java.lang.String] = js.undefined
  /** The scheduled time of arrival at the destination of the leg, local to the point of arrival. */
  var arrivalTime: js.UndefOr[java.lang.String] = js.undefined
  /** Whether you have to change planes following this leg. Only applies to the next leg. */
  var changePlane: js.UndefOr[scala.Boolean] = js.undefined
  /** Duration of a connection following this leg, in minutes. */
  var connectionDuration: js.UndefOr[scala.Double] = js.undefined
  /** The scheduled departure time of the leg, local to the point of departure. */
  var departureTime: js.UndefOr[java.lang.String] = js.undefined
  /** The leg destination as a city and airport. */
  var destination: js.UndefOr[java.lang.String] = js.undefined
  /** The terminal the flight is scheduled to arrive at. */
  var destinationTerminal: js.UndefOr[java.lang.String] = js.undefined
  /** The scheduled travelling time from the origin to the destination. */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /** An identifier that uniquely identifies this leg in the solution. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identifies this as a leg object. A leg is the smallest unit of travel, in the case of a flight a takeoff immediately followed by a landing at two set
    * points on a particular carrier with a particular flight number. Value: the fixed string qpxexpress#legInfo.
    */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** A simple, general description of the meal(s) served on the flight, for example: "Hot meal". */
  var meal: js.UndefOr[java.lang.String] = js.undefined
  /** The number of miles in this leg. */
  var mileage: js.UndefOr[scala.Double] = js.undefined
  /** In percent, the published on time performance on this leg. */
  var onTimePerformance: js.UndefOr[scala.Double] = js.undefined
  /**
    * Department of Transportation disclosure information on the actual operator of a flight in a code share. (A code share refers to a marketing agreement
    * between two carriers, where one carrier will list in its schedules (and take bookings for) flights that are actually operated by another carrier.)
    */
  var operatingDisclosure: js.UndefOr[java.lang.String] = js.undefined
  /** The leg origin as a city and airport. */
  var origin: js.UndefOr[java.lang.String] = js.undefined
  /** The terminal the flight is scheduled to depart from. */
  var originTerminal: js.UndefOr[java.lang.String] = js.undefined
  /** Whether passenger information must be furnished to the United States Transportation Security Administration (TSA) prior to departure. */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

object LegInfo {
  @scala.inline
  def apply(
    aircraft: java.lang.String = null,
    arrivalTime: java.lang.String = null,
    changePlane: js.UndefOr[scala.Boolean] = js.undefined,
    connectionDuration: scala.Int | scala.Double = null,
    departureTime: java.lang.String = null,
    destination: java.lang.String = null,
    destinationTerminal: java.lang.String = null,
    duration: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    meal: java.lang.String = null,
    mileage: scala.Int | scala.Double = null,
    onTimePerformance: scala.Int | scala.Double = null,
    operatingDisclosure: java.lang.String = null,
    origin: java.lang.String = null,
    originTerminal: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): LegInfo = {
    val __obj = js.Dynamic.literal()
    if (aircraft != null) __obj.updateDynamic("aircraft")(aircraft)
    if (arrivalTime != null) __obj.updateDynamic("arrivalTime")(arrivalTime)
    if (!js.isUndefined(changePlane)) __obj.updateDynamic("changePlane")(changePlane)
    if (connectionDuration != null) __obj.updateDynamic("connectionDuration")(connectionDuration.asInstanceOf[js.Any])
    if (departureTime != null) __obj.updateDynamic("departureTime")(departureTime)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (destinationTerminal != null) __obj.updateDynamic("destinationTerminal")(destinationTerminal)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (meal != null) __obj.updateDynamic("meal")(meal)
    if (mileage != null) __obj.updateDynamic("mileage")(mileage.asInstanceOf[js.Any])
    if (onTimePerformance != null) __obj.updateDynamic("onTimePerformance")(onTimePerformance.asInstanceOf[js.Any])
    if (operatingDisclosure != null) __obj.updateDynamic("operatingDisclosure")(operatingDisclosure)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (originTerminal != null) __obj.updateDynamic("originTerminal")(originTerminal)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[LegInfo]
  }
}

