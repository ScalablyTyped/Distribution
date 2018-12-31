package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOffersHistoryResponse extends js.Object {
  /** True if the user has the option to show entire company history. */
  var canShowEntireCompany: js.UndefOr[scala.Boolean] = js.undefined
  /** Supply this token in a ListOffersHistoryRequest to retrieve the next page. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Historical offers meeting request. */
  var offers: js.UndefOr[js.Array[HistoricalOffer]] = js.undefined
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.undefined
  /** True if this response is showing entire company history. */
  var showingEntireCompany: js.UndefOr[scala.Boolean] = js.undefined
  /** Number of results across all pages. */
  var totalResults: js.UndefOr[scala.Double] = js.undefined
}

