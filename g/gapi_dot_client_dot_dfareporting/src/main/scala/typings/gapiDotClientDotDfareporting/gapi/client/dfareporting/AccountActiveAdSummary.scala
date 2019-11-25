package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountActiveAdSummary extends js.Object {
  /** ID of the account. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Ads that have been activated for the account */
  var activeAds: js.UndefOr[String] = js.undefined
  /** Maximum number of active ads allowed for the account. */
  var activeAdsLimitTier: js.UndefOr[String] = js.undefined
  /** Ads that can be activated for the account. */
  var availableAds: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountActiveAdSummary". */
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

