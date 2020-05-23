package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PassengerCounts extends js.Object {
  /** The number of passengers that are adults. */
  var adultCount: js.UndefOr[Double] = js.undefined
  /** The number of passengers that are children. */
  var childCount: js.UndefOr[Double] = js.undefined
  /** The number of passengers that are infants travelling in the lap of an adult. */
  var infantInLapCount: js.UndefOr[Double] = js.undefined
  /** The number of passengers that are infants each assigned a seat. */
  var infantInSeatCount: js.UndefOr[Double] = js.undefined
  /** Identifies this as a passenger count object, representing the number of passengers. Value: the fixed string qpxexpress#passengerCounts. */
  var kind: js.UndefOr[String] = js.undefined
  /** The number of passengers that are senior citizens. */
  var seniorCount: js.UndefOr[Double] = js.undefined
}

object PassengerCounts {
  @scala.inline
  def apply(
    adultCount: js.UndefOr[Double] = js.undefined,
    childCount: js.UndefOr[Double] = js.undefined,
    infantInLapCount: js.UndefOr[Double] = js.undefined,
    infantInSeatCount: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    seniorCount: js.UndefOr[Double] = js.undefined
  ): PassengerCounts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adultCount)) __obj.updateDynamic("adultCount")(adultCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(childCount)) __obj.updateDynamic("childCount")(childCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(infantInLapCount)) __obj.updateDynamic("infantInLapCount")(infantInLapCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(infantInSeatCount)) __obj.updateDynamic("infantInSeatCount")(infantInSeatCount.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(seniorCount)) __obj.updateDynamic("seniorCount")(seniorCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassengerCounts]
  }
}

