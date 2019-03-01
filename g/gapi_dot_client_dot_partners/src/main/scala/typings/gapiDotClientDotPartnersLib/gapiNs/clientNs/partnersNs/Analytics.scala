package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Analytics extends js.Object {
  /**
    * Instances of users contacting the `Company`
    * on the specified date.
    */
  var contacts: js.UndefOr[AnalyticsDataPoint] = js.undefined
  /** Date on which these events occurred. */
  var eventDate: js.UndefOr[Date] = js.undefined
  /**
    * Instances of users viewing the `Company` profile
    * on the specified date.
    */
  var profileViews: js.UndefOr[AnalyticsDataPoint] = js.undefined
  /**
    * Instances of users seeing the `Company` in Google Partners Search results
    * on the specified date.
    */
  var searchViews: js.UndefOr[AnalyticsDataPoint] = js.undefined
}

object Analytics {
  @scala.inline
  def apply(
    contacts: AnalyticsDataPoint = null,
    eventDate: Date = null,
    profileViews: AnalyticsDataPoint = null,
    searchViews: AnalyticsDataPoint = null
  ): Analytics = {
    val __obj = js.Dynamic.literal()
    if (contacts != null) __obj.updateDynamic("contacts")(contacts)
    if (eventDate != null) __obj.updateDynamic("eventDate")(eventDate)
    if (profileViews != null) __obj.updateDynamic("profileViews")(profileViews)
    if (searchViews != null) __obj.updateDynamic("searchViews")(searchViews)
    __obj.asInstanceOf[Analytics]
  }
}

