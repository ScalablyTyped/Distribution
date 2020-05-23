package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryTime extends js.Object {
  /**
    * Maximum number of business days that is spent in transit. 0 means same day delivery, 1 means next day delivery. Must be greater than or equal to
    * minTransitTimeInDays. Required.
    */
  var maxTransitTimeInDays: js.UndefOr[Double] = js.undefined
  /** Minimum number of business days that is spent in transit. 0 means same day delivery, 1 means next day delivery. Required. */
  var minTransitTimeInDays: js.UndefOr[Double] = js.undefined
}

object DeliveryTime {
  @scala.inline
  def apply(
    maxTransitTimeInDays: js.UndefOr[Double] = js.undefined,
    minTransitTimeInDays: js.UndefOr[Double] = js.undefined
  ): DeliveryTime = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxTransitTimeInDays)) __obj.updateDynamic("maxTransitTimeInDays")(maxTransitTimeInDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minTransitTimeInDays)) __obj.updateDynamic("minTransitTimeInDays")(minTransitTimeInDays.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryTime]
  }
}

