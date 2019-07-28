package typings.gapiDotClientDotAdexchangebuyer2.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListImpressionMetricsResponse extends js.Object {
  /** List of rows, each containing a set of impression metrics. */
  var impressionMetricsRows: js.UndefOr[js.Array[ImpressionMetricsRow]] = js.undefined
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListImpressionMetricsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.impressionMetrics.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListImpressionMetricsResponse {
  @scala.inline
  def apply(impressionMetricsRows: js.Array[ImpressionMetricsRow] = null, nextPageToken: String = null): ListImpressionMetricsResponse = {
    val __obj = js.Dynamic.literal()
    if (impressionMetricsRows != null) __obj.updateDynamic("impressionMetricsRows")(impressionMetricsRows)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListImpressionMetricsResponse]
  }
}

