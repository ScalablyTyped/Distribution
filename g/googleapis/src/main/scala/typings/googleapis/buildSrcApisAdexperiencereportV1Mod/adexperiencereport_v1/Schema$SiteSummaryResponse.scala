package typings.googleapis.buildSrcApisAdexperiencereportV1Mod.adexperiencereport_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for GetSiteSummary.
  */
@js.native
trait Schema$SiteSummaryResponse extends js.Object {
  /**
    * Summary for the desktop review of the site.
    */
  var desktopSummary: js.UndefOr[Schema$PlatformSummary] = js.native
  /**
    * Summary for the mobile review of the site.
    */
  var mobileSummary: js.UndefOr[Schema$PlatformSummary] = js.native
  /**
    * The name of the site reviewed.
    */
  var reviewedSite: js.UndefOr[String] = js.native
}

object Schema$SiteSummaryResponse {
  @scala.inline
  def apply(
    desktopSummary: Schema$PlatformSummary = null,
    mobileSummary: Schema$PlatformSummary = null,
    reviewedSite: String = null
  ): Schema$SiteSummaryResponse = {
    val __obj = js.Dynamic.literal()
    if (desktopSummary != null) __obj.updateDynamic("desktopSummary")(desktopSummary.asInstanceOf[js.Any])
    if (mobileSummary != null) __obj.updateDynamic("mobileSummary")(mobileSummary.asInstanceOf[js.Any])
    if (reviewedSite != null) __obj.updateDynamic("reviewedSite")(reviewedSite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SiteSummaryResponse]
  }
}

