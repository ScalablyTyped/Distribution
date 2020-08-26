package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestOrderCustomerMarketingRightsInfo extends js.Object {
  var explicitMarketingPreference: js.UndefOr[String] = js.native
  var lastUpdatedTimestamp: js.UndefOr[String] = js.native
}

object TestOrderCustomerMarketingRightsInfo {
  @scala.inline
  def apply(): TestOrderCustomerMarketingRightsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrderCustomerMarketingRightsInfo]
  }
  @scala.inline
  implicit class TestOrderCustomerMarketingRightsInfoOps[Self <: TestOrderCustomerMarketingRightsInfo] (val x: Self) extends AnyVal {
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
    def setExplicitMarketingPreference(value: String): Self = this.set("explicitMarketingPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplicitMarketingPreference: Self = this.set("explicitMarketingPreference", js.undefined)
    @scala.inline
    def setLastUpdatedTimestamp(value: String): Self = this.set("lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTimestamp: Self = this.set("lastUpdatedTimestamp", js.undefined)
  }
  
}

