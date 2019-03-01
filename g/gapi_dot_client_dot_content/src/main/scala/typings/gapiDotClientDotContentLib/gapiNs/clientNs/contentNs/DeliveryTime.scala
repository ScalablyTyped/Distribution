package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryTime extends js.Object {
  /**
    * Maximum number of business days that is spent in transit. 0 means same day delivery, 1 means next day delivery. Must be greater than or equal to
    * minTransitTimeInDays. Required.
    */
  var maxTransitTimeInDays: js.UndefOr[scala.Double] = js.undefined
  /** Minimum number of business days that is spent in transit. 0 means same day delivery, 1 means next day delivery. Required. */
  var minTransitTimeInDays: js.UndefOr[scala.Double] = js.undefined
}

object DeliveryTime {
  @scala.inline
  def apply(
    maxTransitTimeInDays: scala.Int | scala.Double = null,
    minTransitTimeInDays: scala.Int | scala.Double = null
  ): DeliveryTime = {
    val __obj = js.Dynamic.literal()
    if (maxTransitTimeInDays != null) __obj.updateDynamic("maxTransitTimeInDays")(maxTransitTimeInDays.asInstanceOf[js.Any])
    if (minTransitTimeInDays != null) __obj.updateDynamic("minTransitTimeInDays")(minTransitTimeInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryTime]
  }
}

