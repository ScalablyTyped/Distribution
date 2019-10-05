package typings.gapiDotClientDotAdexperiencereport.gapi.client.adexperiencereport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformSummary extends js.Object {
  /** The status of the site reviewed for the Better Ads Standards. */
  var betterAdsStatus: js.UndefOr[String] = js.undefined
  /** The date on which ad filtering begins. */
  var enforcementTime: js.UndefOr[String] = js.undefined
  /** The ad filtering status of the site. */
  var filterStatus: js.UndefOr[String] = js.undefined
  /** The last time that the site changed status. */
  var lastChangeTime: js.UndefOr[String] = js.undefined
  /** The assigned regions for the site and platform. */
  var region: js.UndefOr[js.Array[String]] = js.undefined
  /** A link that leads to a full ad experience report. */
  var reportUrl: js.UndefOr[String] = js.undefined
  /** Whether the site is currently under review. */
  var underReview: js.UndefOr[Boolean] = js.undefined
}

object PlatformSummary {
  @scala.inline
  def apply(
    betterAdsStatus: String = null,
    enforcementTime: String = null,
    filterStatus: String = null,
    lastChangeTime: String = null,
    region: js.Array[String] = null,
    reportUrl: String = null,
    underReview: js.UndefOr[Boolean] = js.undefined
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

