package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Project extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var advertiserId: js.UndefOr[String] = js.undefined
  var audienceAgeGroup: js.UndefOr[String] = js.undefined
  var audienceGender: js.UndefOr[String] = js.undefined
  var budget: js.UndefOr[String] = js.undefined
  var clientBillingCode: js.UndefOr[String] = js.undefined
  var clientName: js.UndefOr[String] = js.undefined
  var endDate: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var overview: js.UndefOr[String] = js.undefined
  var startDate: js.UndefOr[String] = js.undefined
  var subaccountId: js.UndefOr[String] = js.undefined
  var targetClicks: js.UndefOr[String] = js.undefined
  var targetConversions: js.UndefOr[String] = js.undefined
  var targetCpaNanos: js.UndefOr[String] = js.undefined
  var targetCpcNanos: js.UndefOr[String] = js.undefined
  var targetCpmActiveViewNanos: js.UndefOr[String] = js.undefined
  var targetCpmNanos: js.UndefOr[String] = js.undefined
  var targetImpressions: js.UndefOr[String] = js.undefined
}

object Project {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserId: String = null,
    audienceAgeGroup: String = null,
    audienceGender: String = null,
    budget: String = null,
    clientBillingCode: String = null,
    clientName: String = null,
    endDate: String = null,
    id: String = null,
    kind: String = null,
    lastModifiedInfo: LastModifiedInfo = null,
    name: String = null,
    overview: String = null,
    startDate: String = null,
    subaccountId: String = null,
    targetClicks: String = null,
    targetConversions: String = null,
    targetCpaNanos: String = null,
    targetCpcNanos: String = null,
    targetCpmActiveViewNanos: String = null,
    targetCpmNanos: String = null,
    targetImpressions: String = null
  ): Project = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (audienceAgeGroup != null) __obj.updateDynamic("audienceAgeGroup")(audienceAgeGroup.asInstanceOf[js.Any])
    if (audienceGender != null) __obj.updateDynamic("audienceGender")(audienceGender.asInstanceOf[js.Any])
    if (budget != null) __obj.updateDynamic("budget")(budget.asInstanceOf[js.Any])
    if (clientBillingCode != null) __obj.updateDynamic("clientBillingCode")(clientBillingCode.asInstanceOf[js.Any])
    if (clientName != null) __obj.updateDynamic("clientName")(clientName.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (targetClicks != null) __obj.updateDynamic("targetClicks")(targetClicks.asInstanceOf[js.Any])
    if (targetConversions != null) __obj.updateDynamic("targetConversions")(targetConversions.asInstanceOf[js.Any])
    if (targetCpaNanos != null) __obj.updateDynamic("targetCpaNanos")(targetCpaNanos.asInstanceOf[js.Any])
    if (targetCpcNanos != null) __obj.updateDynamic("targetCpcNanos")(targetCpcNanos.asInstanceOf[js.Any])
    if (targetCpmActiveViewNanos != null) __obj.updateDynamic("targetCpmActiveViewNanos")(targetCpmActiveViewNanos.asInstanceOf[js.Any])
    if (targetCpmNanos != null) __obj.updateDynamic("targetCpmNanos")(targetCpmNanos.asInstanceOf[js.Any])
    if (targetImpressions != null) __obj.updateDynamic("targetImpressions")(targetImpressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
}

