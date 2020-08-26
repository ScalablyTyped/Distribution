package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliveryControlFrequencyCap extends js.Object {
  var maxImpressions: js.UndefOr[Double] = js.native
  var numTimeUnits: js.UndefOr[Double] = js.native
  var timeUnitType: js.UndefOr[String] = js.native
}

object DeliveryControlFrequencyCap {
  @scala.inline
  def apply(): DeliveryControlFrequencyCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryControlFrequencyCap]
  }
  @scala.inline
  implicit class DeliveryControlFrequencyCapOps[Self <: DeliveryControlFrequencyCap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxImpressions(value: Double): Self = this.set("maxImpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxImpressions: Self = this.set("maxImpressions", js.undefined)
    @scala.inline
    def setNumTimeUnits(value: Double): Self = this.set("numTimeUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumTimeUnits: Self = this.set("numTimeUnits", js.undefined)
    @scala.inline
    def setTimeUnitType(value: String): Self = this.set("timeUnitType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeUnitType: Self = this.set("timeUnitType", js.undefined)
  }
  
}

