package typings
package gapiDotClientDotAdexperiencereportLib.gapiNs.clientNs.adexperiencereportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformSummary extends js.Object {
  /** The status of the site reviewed for the Better Ads Standards. */
  var betterAdsStatus: js.UndefOr[java.lang.String] = js.undefined
  /** The date on which ad filtering begins. */
  var enforcementTime: js.UndefOr[java.lang.String] = js.undefined
  /** The ad filtering status of the site. */
  var filterStatus: js.UndefOr[java.lang.String] = js.undefined
  /** The last time that the site changed status. */
  var lastChangeTime: js.UndefOr[java.lang.String] = js.undefined
  /** The assigned regions for the site and platform. */
  var region: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** A link that leads to a full ad experience report. */
  var reportUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the site is currently under review. */
  var underReview: js.UndefOr[scala.Boolean] = js.undefined
}

object PlatformSummary {
  @scala.inline
  def apply(
    betterAdsStatus: java.lang.String = null,
    enforcementTime: java.lang.String = null,
    filterStatus: java.lang.String = null,
    lastChangeTime: java.lang.String = null,
    region: js.Array[java.lang.String] = null,
    reportUrl: java.lang.String = null,
    underReview: js.UndefOr[scala.Boolean] = js.undefined
  ): PlatformSummary = {
    val __obj = js.Dynamic.literal()
    if (betterAdsStatus != null) __obj.updateDynamic("betterAdsStatus")(betterAdsStatus)
    if (enforcementTime != null) __obj.updateDynamic("enforcementTime")(enforcementTime)
    if (filterStatus != null) __obj.updateDynamic("filterStatus")(filterStatus)
    if (lastChangeTime != null) __obj.updateDynamic("lastChangeTime")(lastChangeTime)
    if (region != null) __obj.updateDynamic("region")(region)
    if (reportUrl != null) __obj.updateDynamic("reportUrl")(reportUrl)
    if (!js.isUndefined(underReview)) __obj.updateDynamic("underReview")(underReview)
    __obj.asInstanceOf[PlatformSummary]
  }
}

