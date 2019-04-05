package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountActiveAdSummary extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var activeAds: js.UndefOr[java.lang.String] = js.undefined
  var activeAdsLimitTier: js.UndefOr[java.lang.String] = js.undefined
  var availableAds: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object AccountActiveAdSummary {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    activeAds: java.lang.String = null,
    activeAdsLimitTier: java.lang.String = null,
    availableAds: java.lang.String = null,
    kind: java.lang.String = null
  ): AccountActiveAdSummary = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (activeAds != null) __obj.updateDynamic("activeAds")(activeAds)
    if (activeAdsLimitTier != null) __obj.updateDynamic("activeAdsLimitTier")(activeAdsLimitTier)
    if (availableAds != null) __obj.updateDynamic("availableAds")(availableAds)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AccountActiveAdSummary]
  }
}

