package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryControl extends js.Object {
  var creativeBlockingLevel: js.UndefOr[java.lang.String] = js.undefined
  var deliveryRateType: js.UndefOr[java.lang.String] = js.undefined
  var frequencyCaps: js.UndefOr[js.Array[DeliveryControlFrequencyCap]] = js.undefined
}

object DeliveryControl {
  @scala.inline
  def apply(
    creativeBlockingLevel: java.lang.String = null,
    deliveryRateType: java.lang.String = null,
    frequencyCaps: js.Array[DeliveryControlFrequencyCap] = null
  ): DeliveryControl = {
    val __obj = js.Dynamic.literal()
    if (creativeBlockingLevel != null) __obj.updateDynamic("creativeBlockingLevel")(creativeBlockingLevel)
    if (deliveryRateType != null) __obj.updateDynamic("deliveryRateType")(deliveryRateType)
    if (frequencyCaps != null) __obj.updateDynamic("frequencyCaps")(frequencyCaps)
    __obj.asInstanceOf[DeliveryControl]
  }
}

