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

object PassengerCounts {
  @scala.inline
  def apply(
    adultCount: scala.Int | scala.Double = null,
    childCount: scala.Int | scala.Double = null,
    infantInLapCount: scala.Int | scala.Double = null,
    infantInSeatCount: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    seniorCount: scala.Int | scala.Double = null
  ): PassengerCounts = {
    val __obj = js.Dynamic.literal()
    if (adultCount != null) __obj.updateDynamic("adultCount")(adultCount.asInstanceOf[js.Any])
    if (childCount != null) __obj.updateDynamic("childCount")(childCount.asInstanceOf[js.Any])
    if (infantInLapCount != null) __obj.updateDynamic("infantInLapCount")(infantInLapCount.asInstanceOf[js.Any])
    if (infantInSeatCount != null) __obj.updateDynamic("infantInSeatCount")(infantInSeatCount.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (seniorCount != null) __obj.updateDynamic("seniorCount")(seniorCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassengerCounts]
  }
}

