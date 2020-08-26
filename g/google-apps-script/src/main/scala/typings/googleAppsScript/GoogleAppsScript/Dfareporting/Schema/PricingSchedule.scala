package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PricingSchedule extends js.Object {
  var capCostOption: js.UndefOr[String] = js.native
  var disregardOverdelivery: js.UndefOr[Boolean] = js.native
  var endDate: js.UndefOr[String] = js.native
  var flighted: js.UndefOr[Boolean] = js.native
  var floodlightActivityId: js.UndefOr[String] = js.native
  var pricingPeriods: js.UndefOr[js.Array[PricingSchedulePricingPeriod]] = js.native
  var pricingType: js.UndefOr[String] = js.native
  var startDate: js.UndefOr[String] = js.native
  var testingStartDate: js.UndefOr[String] = js.native
}

object PricingSchedule {
  @scala.inline
  def apply(): PricingSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PricingSchedule]
  }
  @scala.inline
  implicit class PricingScheduleOps[Self <: PricingSchedule] (val x: Self) extends AnyVal {
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
    def setCapCostOption(value: String): Self = this.set("capCostOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapCostOption: Self = this.set("capCostOption", js.undefined)
    @scala.inline
    def setDisregardOverdelivery(value: Boolean): Self = this.set("disregardOverdelivery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisregardOverdelivery: Self = this.set("disregardOverdelivery", js.undefined)
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setFlighted(value: Boolean): Self = this.set("flighted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlighted: Self = this.set("flighted", js.undefined)
    @scala.inline
    def setFloodlightActivityId(value: String): Self = this.set("floodlightActivityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightActivityId: Self = this.set("floodlightActivityId", js.undefined)
    @scala.inline
    def setPricingPeriodsVarargs(value: PricingSchedulePricingPeriod*): Self = this.set("pricingPeriods", js.Array(value :_*))
    @scala.inline
    def setPricingPeriods(value: js.Array[PricingSchedulePricingPeriod]): Self = this.set("pricingPeriods", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePricingPeriods: Self = this.set("pricingPeriods", js.undefined)
    @scala.inline
    def setPricingType(value: String): Self = this.set("pricingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePricingType: Self = this.set("pricingType", js.undefined)
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setTestingStartDate(value: String): Self = this.set("testingStartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestingStartDate: Self = this.set("testingStartDate", js.undefined)
  }
  
}

