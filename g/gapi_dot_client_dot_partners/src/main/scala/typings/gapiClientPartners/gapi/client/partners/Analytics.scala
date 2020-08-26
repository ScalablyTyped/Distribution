package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analytics extends js.Object {
  /**
    * Instances of users contacting the `Company`
    * on the specified date.
    */
  var contacts: js.UndefOr[AnalyticsDataPoint] = js.native
  /** Date on which these events occurred. */
  var eventDate: js.UndefOr[Date] = js.native
  /**
    * Instances of users viewing the `Company` profile
    * on the specified date.
    */
  var profileViews: js.UndefOr[AnalyticsDataPoint] = js.native
  /**
    * Instances of users seeing the `Company` in Google Partners Search results
    * on the specified date.
    */
  var searchViews: js.UndefOr[AnalyticsDataPoint] = js.native
}

object Analytics {
  @scala.inline
  def apply(): Analytics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analytics]
  }
  @scala.inline
  implicit class AnalyticsOps[Self <: Analytics] (val x: Self) extends AnyVal {
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
    def setContacts(value: AnalyticsDataPoint): Self = this.set("contacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContacts: Self = this.set("contacts", js.undefined)
    @scala.inline
    def setEventDate(value: Date): Self = this.set("eventDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventDate: Self = this.set("eventDate", js.undefined)
    @scala.inline
    def setProfileViews(value: AnalyticsDataPoint): Self = this.set("profileViews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileViews: Self = this.set("profileViews", js.undefined)
    @scala.inline
    def setSearchViews(value: AnalyticsDataPoint): Self = this.set("searchViews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchViews: Self = this.set("searchViews", js.undefined)
  }
  
}

