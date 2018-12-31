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

