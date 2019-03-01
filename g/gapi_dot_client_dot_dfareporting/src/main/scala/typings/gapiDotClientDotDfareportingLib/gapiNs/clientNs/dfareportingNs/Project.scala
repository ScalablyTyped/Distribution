package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Project extends js.Object {
  /** Account ID of this project. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Advertiser ID of this project. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** Audience age group of this project. */
  var audienceAgeGroup: js.UndefOr[java.lang.String] = js.undefined
  /** Audience gender of this project. */
  var audienceGender: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Budget of this project in the currency specified by the current account. The value stored in this field represents only the non-fractional amount. For
    * example, for USD, the smallest value that can be represented by this field is 1 US dollar.
    */
  var budget: js.UndefOr[java.lang.String] = js.undefined
  /** Client billing code of this project. */
  var clientBillingCode: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the project client. */
  var clientName: js.UndefOr[java.lang.String] = js.undefined
  /** End date of the project. */
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  /** ID of this project. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#project". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Information about the most recent modification of this project. */
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /** Name of this project. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Overview of this project. */
  var overview: js.UndefOr[java.lang.String] = js.undefined
  /** Start date of the project. */
  var startDate: js.UndefOr[java.lang.String] = js.undefined
  /** Subaccount ID of this project. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  /** Number of clicks that the advertiser is targeting. */
  var targetClicks: js.UndefOr[java.lang.String] = js.undefined
  /** Number of conversions that the advertiser is targeting. */
  var targetConversions: js.UndefOr[java.lang.String] = js.undefined
  /** CPA that the advertiser is targeting. */
  var targetCpaNanos: js.UndefOr[java.lang.String] = js.undefined
  /** CPC that the advertiser is targeting. */
  var targetCpcNanos: js.UndefOr[java.lang.String] = js.undefined
  /** vCPM from Active View that the advertiser is targeting. */
  var targetCpmActiveViewNanos: js.UndefOr[java.lang.String] = js.undefined
  /** CPM that the advertiser is targeting. */
  var targetCpmNanos: js.UndefOr[java.lang.String] = js.undefined
  /** Number of impressions that the advertiser is targeting. */
  var targetImpressions: js.UndefOr[java.lang.String] = js.undefined
}

object Project {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    advertiserId: java.lang.String = null,
    audienceAgeGroup: java.lang.String = null,
    audienceGender: java.lang.String = null,
    budget: java.lang.String = null,
    clientBillingCode: java.lang.String = null,
    clientName: java.lang.String = null,
    endDate: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    lastModifiedInfo: LastModifiedInfo = null,
    name: java.lang.String = null,
    overview: java.lang.String = null,
    startDate: java.lang.String = null,
    subaccountId: java.lang.String = null,
    targetClicks: java.lang.String = null,
    targetConversions: java.lang.String = null,
    targetCpaNanos: java.lang.String = null,
    targetCpcNanos: java.lang.String = null,
    targetCpmActiveViewNanos: java.lang.String = null,
    targetCpmNanos: java.lang.String = null,
    targetImpressions: java.lang.String = null
  ): Project = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (audienceAgeGroup != null) __obj.updateDynamic("audienceAgeGroup")(audienceAgeGroup)
    if (audienceGender != null) __obj.updateDynamic("audienceGender")(audienceGender)
    if (budget != null) __obj.updateDynamic("budget")(budget)
    if (clientBillingCode != null) __obj.updateDynamic("clientBillingCode")(clientBillingCode)
    if (clientName != null) __obj.updateDynamic("clientName")(clientName)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo)
    if (name != null) __obj.updateDynamic("name")(name)
    if (overview != null) __obj.updateDynamic("overview")(overview)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (targetClicks != null) __obj.updateDynamic("targetClicks")(targetClicks)
    if (targetConversions != null) __obj.updateDynamic("targetConversions")(targetConversions)
    if (targetCpaNanos != null) __obj.updateDynamic("targetCpaNanos")(targetCpaNanos)
    if (targetCpcNanos != null) __obj.updateDynamic("targetCpcNanos")(targetCpcNanos)
    if (targetCpmActiveViewNanos != null) __obj.updateDynamic("targetCpmActiveViewNanos")(targetCpmActiveViewNanos)
    if (targetCpmNanos != null) __obj.updateDynamic("targetCpmNanos")(targetCpmNanos)
    if (targetImpressions != null) __obj.updateDynamic("targetImpressions")(targetImpressions)
    __obj.asInstanceOf[Project]
  }
}

