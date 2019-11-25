package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryControl extends js.Object {
  var creativeBlockingLevel: js.UndefOr[String] = js.undefined
  var deliveryRateType: js.UndefOr[String] = js.undefined
  var frequencyCaps: js.UndefOr[js.Array[DeliveryControlFrequencyCap]] = js.undefined
}

object DeliveryControl {
  @scala.inline
  def apply(
    creativeBlockingLevel: String = null,
    deliveryRateType: String = null,
    frequencyCaps: js.Array[DeliveryControlFrequencyCap] = null
  ): DeliveryControl = {
    val __obj = js.Dynamic.literal()
    if (creativeBlockingLevel != null) __obj.updateDynamic("creativeBlockingLevel")(creativeBlockingLevel.asInstanceOf[js.Any])
    if (deliveryRateType != null) __obj.updateDynamic("deliveryRateType")(deliveryRateType.asInstanceOf[js.Any])
    if (frequencyCaps != null) __obj.updateDynamic("frequencyCaps")(frequencyCaps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryControl]
  }
}

