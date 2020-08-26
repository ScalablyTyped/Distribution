package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Project extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var advertiserId: js.UndefOr[String] = js.native
  var audienceAgeGroup: js.UndefOr[String] = js.native
  var audienceGender: js.UndefOr[String] = js.native
  var budget: js.UndefOr[String] = js.native
  var clientBillingCode: js.UndefOr[String] = js.native
  var clientName: js.UndefOr[String] = js.native
  var endDate: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.native
  var name: js.UndefOr[String] = js.native
  var overview: js.UndefOr[String] = js.native
  var startDate: js.UndefOr[String] = js.native
  var subaccountId: js.UndefOr[String] = js.native
  var targetClicks: js.UndefOr[String] = js.native
  var targetConversions: js.UndefOr[String] = js.native
  var targetCpaNanos: js.UndefOr[String] = js.native
  var targetCpcNanos: js.UndefOr[String] = js.native
  var targetCpmActiveViewNanos: js.UndefOr[String] = js.native
  var targetCpmNanos: js.UndefOr[String] = js.native
  var targetImpressions: js.UndefOr[String] = js.native
}

object Project {
  @scala.inline
  def apply(): Project = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Project]
  }
  @scala.inline
  implicit class ProjectOps[Self <: Project] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    @scala.inline
    def setAudienceAgeGroup(value: String): Self = this.set("audienceAgeGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudienceAgeGroup: Self = this.set("audienceAgeGroup", js.undefined)
    @scala.inline
    def setAudienceGender(value: String): Self = this.set("audienceGender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudienceGender: Self = this.set("audienceGender", js.undefined)
    @scala.inline
    def setBudget(value: String): Self = this.set("budget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBudget: Self = this.set("budget", js.undefined)
    @scala.inline
    def setClientBillingCode(value: String): Self = this.set("clientBillingCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientBillingCode: Self = this.set("clientBillingCode", js.undefined)
    @scala.inline
    def setClientName(value: String): Self = this.set("clientName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientName: Self = this.set("clientName", js.undefined)
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastModifiedInfo(value: LastModifiedInfo): Self = this.set("lastModifiedInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedInfo: Self = this.set("lastModifiedInfo", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOverview(value: String): Self = this.set("overview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverview: Self = this.set("overview", js.undefined)
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    @scala.inline
    def setTargetClicks(value: String): Self = this.set("targetClicks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetClicks: Self = this.set("targetClicks", js.undefined)
    @scala.inline
    def setTargetConversions(value: String): Self = this.set("targetConversions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetConversions: Self = this.set("targetConversions", js.undefined)
    @scala.inline
    def setTargetCpaNanos(value: String): Self = this.set("targetCpaNanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetCpaNanos: Self = this.set("targetCpaNanos", js.undefined)
    @scala.inline
    def setTargetCpcNanos(value: String): Self = this.set("targetCpcNanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetCpcNanos: Self = this.set("targetCpcNanos", js.undefined)
    @scala.inline
    def setTargetCpmActiveViewNanos(value: String): Self = this.set("targetCpmActiveViewNanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetCpmActiveViewNanos: Self = this.set("targetCpmActiveViewNanos", js.undefined)
    @scala.inline
    def setTargetCpmNanos(value: String): Self = this.set("targetCpmNanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetCpmNanos: Self = this.set("targetCpmNanos", js.undefined)
    @scala.inline
    def setTargetImpressions(value: String): Self = this.set("targetImpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetImpressions: Self = this.set("targetImpressions", js.undefined)
  }
  
}

