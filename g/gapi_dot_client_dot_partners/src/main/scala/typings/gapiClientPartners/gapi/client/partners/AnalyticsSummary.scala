package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsSummary extends js.Object {
  /**
    * Aggregated number of times users contacted the `Company`
    * for given date range.
    */
  var contactsCount: js.UndefOr[Double] = js.native
  /** Aggregated number of profile views for the `Company` for given date range. */
  var profileViewsCount: js.UndefOr[Double] = js.native
  /**
    * Aggregated number of times users saw the `Company`
    * in Google Partners Search results for given date range.
    */
  var searchViewsCount: js.UndefOr[Double] = js.native
}

object AnalyticsSummary {
  @scala.inline
  def apply(): AnalyticsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsSummary]
  }
  @scala.inline
  implicit class AnalyticsSummaryOps[Self <: AnalyticsSummary] (val x: Self) extends AnyVal {
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
    def setContactsCount(value: Double): Self = this.set("contactsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactsCount: Self = this.set("contactsCount", js.undefined)
    @scala.inline
    def setProfileViewsCount(value: Double): Self = this.set("profileViewsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileViewsCount: Self = this.set("profileViewsCount", js.undefined)
    @scala.inline
    def setSearchViewsCount(value: Double): Self = this.set("searchViewsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchViewsCount: Self = this.set("searchViewsCount", js.undefined)
  }
  
}

