package typings.googleapis.adexperiencereportV1Mod.adexperiencereportV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for GetSiteSummary.
  */
@js.native
trait SchemaSiteSummaryResponse extends js.Object {
  /**
    * Summary for the desktop review of the site.
    */
  var desktopSummary: js.UndefOr[SchemaPlatformSummary] = js.native
  /**
    * Summary for the mobile review of the site.
    */
  var mobileSummary: js.UndefOr[SchemaPlatformSummary] = js.native
  /**
    * The name of the site reviewed.
    */
  var reviewedSite: js.UndefOr[String] = js.native
}

object SchemaSiteSummaryResponse {
  @scala.inline
  def apply(
    desktopSummary: SchemaPlatformSummary = null,
    mobileSummary: SchemaPlatformSummary = null,
    reviewedSite: String = null
  ): SchemaSiteSummaryResponse = {
    val __obj = js.Dynamic.literal()
    if (desktopSummary != null) __obj.updateDynamic("desktopSummary")(desktopSummary.asInstanceOf[js.Any])
    if (mobileSummary != null) __obj.updateDynamic("mobileSummary")(mobileSummary.asInstanceOf[js.Any])
    if (reviewedSite != null) __obj.updateDynamic("reviewedSite")(reviewedSite.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSiteSummaryResponse]
  }
}

