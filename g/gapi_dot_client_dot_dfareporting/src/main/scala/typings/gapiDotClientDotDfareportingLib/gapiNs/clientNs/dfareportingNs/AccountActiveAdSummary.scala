package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AccountActiveAdSummary extends js.Object {
  /** ID of the account. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Ads that have been activated for the account */
  var activeAds: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of active ads allowed for the account. */
  var activeAdsLimitTier: js.UndefOr[java.lang.String] = js.undefined
  /** Ads that can be activated for the account. */
  var availableAds: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountActiveAdSummary". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

