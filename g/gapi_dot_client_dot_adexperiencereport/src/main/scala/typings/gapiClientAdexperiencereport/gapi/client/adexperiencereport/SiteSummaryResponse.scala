package typings.gapiClientAdexperiencereport.gapi.client.adexperiencereport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteSummaryResponse extends js.Object {
  /** Summary for the desktop review of the site. */
  var desktopSummary: js.UndefOr[PlatformSummary] = js.undefined
  /** Summary for the mobile review of the site. */
  var mobileSummary: js.UndefOr[PlatformSummary] = js.undefined
  /** The name of the site reviewed. */
  var reviewedSite: js.UndefOr[String] = js.undefined
}

object SiteSummaryResponse {
  @scala.inline
  def apply(
    desktopSummary: PlatformSummary = null,
    mobileSummary: PlatformSummary = null,
    reviewedSite: String = null
  ): SiteSummaryResponse = {
    val __obj = js.Dynamic.literal()
    if (desktopSummary != null) __obj.updateDynamic("desktopSummary")(desktopSummary.asInstanceOf[js.Any])
    if (mobileSummary != null) __obj.updateDynamic("mobileSummary")(mobileSummary.asInstanceOf[js.Any])
    if (reviewedSite != null) __obj.updateDynamic("reviewedSite")(reviewedSite.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteSummaryResponse]
  }
}

