package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOffersHistoryResponse extends js.Object {
  /** True if the user has the option to show entire company history. */
  var canShowEntireCompany: js.UndefOr[Boolean] = js.undefined
  /** Supply this token in a ListOffersHistoryRequest to retrieve the next page. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Historical offers meeting request. */
  var offers: js.UndefOr[js.Array[HistoricalOffer]] = js.undefined
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.undefined
  /** True if this response is showing entire company history. */
  var showingEntireCompany: js.UndefOr[Boolean] = js.undefined
  /** Number of results across all pages. */
  var totalResults: js.UndefOr[Double] = js.undefined
}

object ListOffersHistoryResponse {
  @scala.inline
  def apply(
    canShowEntireCompany: js.UndefOr[Boolean] = js.undefined,
    nextPageToken: String = null,
    offers: js.Array[HistoricalOffer] = null,
    responseMetadata: ResponseMetadata = null,
    showingEntireCompany: js.UndefOr[Boolean] = js.undefined,
    totalResults: Int | Double = null
  ): ListOffersHistoryResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canShowEntireCompany)) __obj.updateDynamic("canShowEntireCompany")(canShowEntireCompany.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (offers != null) __obj.updateDynamic("offers")(offers.asInstanceOf[js.Any])
    if (responseMetadata != null) __obj.updateDynamic("responseMetadata")(responseMetadata.asInstanceOf[js.Any])
    if (!js.isUndefined(showingEntireCompany)) __obj.updateDynamic("showingEntireCompany")(showingEntireCompany.asInstanceOf[js.Any])
    if (totalResults != null) __obj.updateDynamic("totalResults")(totalResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOffersHistoryResponse]
  }
}

