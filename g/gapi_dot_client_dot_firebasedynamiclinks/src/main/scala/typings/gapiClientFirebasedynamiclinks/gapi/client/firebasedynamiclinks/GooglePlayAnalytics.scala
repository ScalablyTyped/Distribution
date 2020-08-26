package typings.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePlayAnalytics extends js.Object {
  /**
    * [AdWords autotagging parameter](https://support.google.com/analytics/answer/1033981?hl=en);
    * used to measure Google AdWords ads. This value is generated dynamically
    * and should never be modified.
    */
  var gclid: js.UndefOr[String] = js.native
  /**
    * Campaign name; used for keyword analysis to identify a specific product
    * promotion or strategic campaign.
    */
  var utmCampaign: js.UndefOr[String] = js.native
  /**
    * Campaign content; used for A/B testing and content-targeted ads to
    * differentiate ads or links that point to the same URL.
    */
  var utmContent: js.UndefOr[String] = js.native
  /** Campaign medium; used to identify a medium such as email or cost-per-click. */
  var utmMedium: js.UndefOr[String] = js.native
  /**
    * Campaign source; used to identify a search engine, newsletter, or other
    * source.
    */
  var utmSource: js.UndefOr[String] = js.native
  /** Campaign term; used with paid search to supply the keywords for ads. */
  var utmTerm: js.UndefOr[String] = js.native
}

object GooglePlayAnalytics {
  @scala.inline
  def apply(): GooglePlayAnalytics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePlayAnalytics]
  }
  @scala.inline
  implicit class GooglePlayAnalyticsOps[Self <: GooglePlayAnalytics] (val x: Self) extends AnyVal {
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
    def setGclid(value: String): Self = this.set("gclid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGclid: Self = this.set("gclid", js.undefined)
    @scala.inline
    def setUtmCampaign(value: String): Self = this.set("utmCampaign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtmCampaign: Self = this.set("utmCampaign", js.undefined)
    @scala.inline
    def setUtmContent(value: String): Self = this.set("utmContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtmContent: Self = this.set("utmContent", js.undefined)
    @scala.inline
    def setUtmMedium(value: String): Self = this.set("utmMedium", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtmMedium: Self = this.set("utmMedium", js.undefined)
    @scala.inline
    def setUtmSource(value: String): Self = this.set("utmSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtmSource: Self = this.set("utmSource", js.undefined)
    @scala.inline
    def setUtmTerm(value: String): Self = this.set("utmTerm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUtmTerm: Self = this.set("utmTerm", js.undefined)
  }
  
}

