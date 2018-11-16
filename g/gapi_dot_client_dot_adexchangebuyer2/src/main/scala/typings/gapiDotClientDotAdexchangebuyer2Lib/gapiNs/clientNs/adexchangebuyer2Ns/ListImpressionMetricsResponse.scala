package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

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
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

