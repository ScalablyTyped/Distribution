package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsSummary extends js.Object {
  /**
    * Aggregated number of times users contacted the `Company`
    * for given date range.
    */
  var contactsCount: js.UndefOr[Double] = js.undefined
  /** Aggregated number of profile views for the `Company` for given date range. */
  var profileViewsCount: js.UndefOr[Double] = js.undefined
  /**
    * Aggregated number of times users saw the `Company`
    * in Google Partners Search results for given date range.
    */
  var searchViewsCount: js.UndefOr[Double] = js.undefined
}

object AnalyticsSummary {
  @scala.inline
  def apply(
    contactsCount: Int | Double = null,
    profileViewsCount: Int | Double = null,
    searchViewsCount: Int | Double = null
  ): AnalyticsSummary = {
    val __obj = js.Dynamic.literal()
    if (contactsCount != null) __obj.updateDynamic("contactsCount")(contactsCount.asInstanceOf[js.Any])
    if (profileViewsCount != null) __obj.updateDynamic("profileViewsCount")(profileViewsCount.asInstanceOf[js.Any])
    if (searchViewsCount != null) __obj.updateDynamic("searchViewsCount")(searchViewsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsSummary]
  }
}

