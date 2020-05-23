package typings.gapiClientPartners.gapi.client.partners

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
    contactsCount: js.UndefOr[Double] = js.undefined,
    profileViewsCount: js.UndefOr[Double] = js.undefined,
    searchViewsCount: js.UndefOr[Double] = js.undefined
  ): AnalyticsSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contactsCount)) __obj.updateDynamic("contactsCount")(contactsCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(profileViewsCount)) __obj.updateDynamic("profileViewsCount")(profileViewsCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(searchViewsCount)) __obj.updateDynamic("searchViewsCount")(searchViewsCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsSummary]
  }
}

