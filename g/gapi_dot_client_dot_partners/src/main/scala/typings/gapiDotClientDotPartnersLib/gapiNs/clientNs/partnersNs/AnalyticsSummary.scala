package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsSummary extends js.Object {
  /**
    * Aggregated number of times users contacted the `Company`
    * for given date range.
    */
  var contactsCount: js.UndefOr[scala.Double] = js.undefined
  /** Aggregated number of profile views for the `Company` for given date range. */
  var profileViewsCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Aggregated number of times users saw the `Company`
    * in Google Partners Search results for given date range.
    */
  var searchViewsCount: js.UndefOr[scala.Double] = js.undefined
}

object AnalyticsSummary {
  @scala.inline
  def apply(
    contactsCount: scala.Int | scala.Double = null,
    profileViewsCount: scala.Int | scala.Double = null,
    searchViewsCount: scala.Int | scala.Double = null
  ): AnalyticsSummary = {
    val __obj = js.Dynamic.literal()
    if (contactsCount != null) __obj.updateDynamic("contactsCount")(contactsCount.asInstanceOf[js.Any])
    if (profileViewsCount != null) __obj.updateDynamic("profileViewsCount")(profileViewsCount.asInstanceOf[js.Any])
    if (searchViewsCount != null) __obj.updateDynamic("searchViewsCount")(searchViewsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsSummary]
  }
}

