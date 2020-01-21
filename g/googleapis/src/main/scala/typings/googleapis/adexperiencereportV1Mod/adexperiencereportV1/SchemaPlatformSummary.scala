package typings.googleapis.adexperiencereportV1Mod.adexperiencereportV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Summary of the ad experience rating of a site for a specific platform.
  */
@js.native
trait SchemaPlatformSummary extends js.Object {
  /**
    * The status of the site reviewed for the Better Ads Standards.
    */
  var betterAdsStatus: js.UndefOr[String] = js.native
  /**
    * The date on which ad filtering begins.
    */
  var enforcementTime: js.UndefOr[String] = js.native
  /**
    * The ad filtering status of the site.
    */
  var filterStatus: js.UndefOr[String] = js.native
  /**
    * The last time that the site changed status.
    */
  var lastChangeTime: js.UndefOr[String] = js.native
  /**
    * The assigned regions for the site and platform.
    */
  var region: js.UndefOr[js.Array[String]] = js.native
  /**
    * A link that leads to a full ad experience report.
    */
  var reportUrl: js.UndefOr[String] = js.native
  /**
    * Whether the site is currently under review.
    */
  var underReview: js.UndefOr[Boolean] = js.native
}

object SchemaPlatformSummary {
  @scala.inline
  def apply(
    betterAdsStatus: String = null,
    enforcementTime: String = null,
    filterStatus: String = null,
    lastChangeTime: String = null,
    region: js.Array[String] = null,
    reportUrl: String = null,
    underReview: js.UndefOr[Boolean] = js.undefined
  ): SchemaPlatformSummary = {
    val __obj = js.Dynamic.literal()
    if (betterAdsStatus != null) __obj.updateDynamic("betterAdsStatus")(betterAdsStatus.asInstanceOf[js.Any])
    if (enforcementTime != null) __obj.updateDynamic("enforcementTime")(enforcementTime.asInstanceOf[js.Any])
    if (filterStatus != null) __obj.updateDynamic("filterStatus")(filterStatus.asInstanceOf[js.Any])
    if (lastChangeTime != null) __obj.updateDynamic("lastChangeTime")(lastChangeTime.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (reportUrl != null) __obj.updateDynamic("reportUrl")(reportUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(underReview)) __obj.updateDynamic("underReview")(underReview.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlatformSummary]
  }
}

