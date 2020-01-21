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
    maxImpressions: Int | Double = null,
    numTimeUnits: Int | Double = null,
    timeUnitType: String = null
  ): DeliveryControlFrequencyCap = {
    val __obj = js.Dynamic.literal()
    if (maxImpressions != null) __obj.updateDynamic("maxImpressions")(maxImpressions.asInstanceOf[js.Any])
    if (numTimeUnits != null) __obj.updateDynamic("numTimeUnits")(numTimeUnits.asInstanceOf[js.Any])
    if (timeUnitType != null) __obj.updateDynamic("timeUnitType")(timeUnitType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliveryControlFrequencyCap]
  }
}

