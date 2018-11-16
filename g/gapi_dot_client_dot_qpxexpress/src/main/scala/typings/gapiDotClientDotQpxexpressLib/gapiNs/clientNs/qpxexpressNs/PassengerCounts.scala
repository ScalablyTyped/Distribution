package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PassengerCounts extends js.Object {
  /** The number of passengers that are adults. */
  var adultCount: js.UndefOr[scala.Double] = js.undefined
  /** The number of passengers that are children. */
  var childCount: js.UndefOr[scala.Double] = js.undefined
  /** The number of passengers that are infants travelling in the lap of an adult. */
  var infantInLapCount: js.UndefOr[scala.Double] = js.undefined
  /** The number of passengers that are infants each assigned a seat. */
  var infantInSeatCount: js.UndefOr[scala.Double] = js.undefined
  /** Identifies this as a passenger count object, representing the number of passengers. Value: the fixed string qpxexpress#passengerCounts. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The number of passengers that are senior citizens. */
  var seniorCount: js.UndefOr[scala.Double] = js.undefined
}

