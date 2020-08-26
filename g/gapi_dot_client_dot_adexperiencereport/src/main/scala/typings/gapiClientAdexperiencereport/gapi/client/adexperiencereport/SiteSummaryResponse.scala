package typings.gapiClientAdexperiencereport.gapi.client.adexperiencereport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SiteSummaryResponse extends js.Object {
  /** Summary for the desktop review of the site. */
  var desktopSummary: js.UndefOr[PlatformSummary] = js.native
  /** Summary for the mobile review of the site. */
  var mobileSummary: js.UndefOr[PlatformSummary] = js.native
  /** The name of the site reviewed. */
  var reviewedSite: js.UndefOr[String] = js.native
}

object SiteSummaryResponse {
  @scala.inline
  def apply(): SiteSummaryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteSummaryResponse]
  }
  @scala.inline
  implicit class SiteSummaryResponseOps[Self <: SiteSummaryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDesktopSummary(value: PlatformSummary): Self = this.set("desktopSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktopSummary: Self = this.set("desktopSummary", js.undefined)
    @scala.inline
    def setMobileSummary(value: PlatformSummary): Self = this.set("mobileSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileSummary: Self = this.set("mobileSummary", js.undefined)
    @scala.inline
    def setReviewedSite(value: String): Self = this.set("reviewedSite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReviewedSite: Self = this.set("reviewedSite", js.undefined)
  }
  
}

