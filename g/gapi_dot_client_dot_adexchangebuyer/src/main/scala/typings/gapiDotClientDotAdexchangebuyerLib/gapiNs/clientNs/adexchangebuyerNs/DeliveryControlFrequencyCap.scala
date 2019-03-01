package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryControlFrequencyCap extends js.Object {
  var maxImpressions: js.UndefOr[scala.Double] = js.undefined
  var numTimeUnits: js.UndefOr[scala.Double] = js.undefined
  var timeUnitType: js.UndefOr[java.lang.String] = js.undefined
}

object DeliveryControlFrequencyCap {
  @scala.inline
  def apply(
    maxImpressions: scala.Int | scala.Double = null,
    numTimeUnits: scala.Int | scala.Double = null,
    timeUnitType: java.lang.String = null
  ): DeliveryControlFrequencyCap = {
    val __obj = js.Dynamic.literal()
    if (maxImpressions != null) __obj.updateDynamic("maxImpressions")(maxImpressions.asInstanceOf[js.Any])
    if (numTimeUnits != null) __obj.updateDynamic("numTimeUnits")(numTimeUnits.asInstanceOf[js.Any])
    if (timeUnitType != null) __obj.updateDynamic("timeUnitType")(timeUnitType)
    __obj.asInstanceOf[DeliveryControlFrequencyCap]
  }
}

