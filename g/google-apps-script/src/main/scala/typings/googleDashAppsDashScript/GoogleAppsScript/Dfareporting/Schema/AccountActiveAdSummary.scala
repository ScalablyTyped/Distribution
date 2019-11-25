package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountActiveAdSummary extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var activeAds: js.UndefOr[String] = js.undefined
  var activeAdsLimitTier: js.UndefOr[String] = js.undefined
  var availableAds: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object AccountActiveAdSummary {
  @scala.inline
  def apply(
    accountId: String = null,
    activeAds: String = null,
    activeAdsLimitTier: String = null,
    availableAds: String = null,
    kind: String = null
  ): AccountActiveAdSummary = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (activeAds != null) __obj.updateDynamic("activeAds")(activeAds.asInstanceOf[js.Any])
    if (activeAdsLimitTier != null) __obj.updateDynamic("activeAdsLimitTier")(activeAdsLimitTier.asInstanceOf[js.Any])
    if (availableAds != null) __obj.updateDynamic("availableAds")(availableAds.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountActiveAdSummary]
  }
}

