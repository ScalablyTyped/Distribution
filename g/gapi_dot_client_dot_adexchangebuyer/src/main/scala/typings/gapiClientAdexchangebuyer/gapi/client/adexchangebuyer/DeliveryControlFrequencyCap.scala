package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliveryControlFrequencyCap extends js.Object {
  var maxImpressions: js.UndefOr[Double] = js.undefined
  var numTimeUnits: js.UndefOr[Double] = js.undefined
  var timeUnitType: js.UndefOr[String] = js.undefined
}

object DeliveryControlFrequencyCap {
  @scala.inline
  def apply(
    maxImpressions: js.UndefOr[Double] = js.undefined,
    numTimeUnits: js.UndefOr[Double] = js.undefined,
    timeUnitType: String = null
  ): DeliveryControlFrequencyCap = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxImpressions)) __obj.updateDynamic("maxImpressions")(maxImpressions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numTimeUnits)) __obj.updateDynamic("numTimeUnits")(numTimeUnits.get.asInstanceOf[js.Any])
    if (timeUnitType != null) __obj.updateDynamic("timeUnitType")(timeUnitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryControlFrequencyCap]
  }
}

