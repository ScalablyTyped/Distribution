package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceReport extends js.Object {
  /** The number of bid responses with an ad. */
  var bidRate: js.UndefOr[scala.Double] = js.undefined
  /** The number of bid requests sent to your bidder. */
  var bidRequestRate: js.UndefOr[scala.Double] = js.undefined
  /** Rate of various prefiltering statuses per match. Please refer to the callout-status-codes.txt file for different statuses. */
  var calloutStatusRate: js.UndefOr[js.Array[_]] = js.undefined
  /** Average QPS for cookie matcher operations. */
  var cookieMatcherStatusRate: js.UndefOr[js.Array[_]] = js.undefined
  /** Rate of ads with a given status. Please refer to the creative-status-codes.txt file for different statuses. */
  var creativeStatusRate: js.UndefOr[js.Array[_]] = js.undefined
  /** The number of bid responses that were filtered due to a policy violation or other errors. */
  var filteredBidRate: js.UndefOr[scala.Double] = js.undefined
  /** Average QPS for hosted match operations. */
  var hostedMatchStatusRate: js.UndefOr[js.Array[_]] = js.undefined
  /** The number of potential queries based on your pretargeting settings. */
  var inventoryMatchRate: js.UndefOr[scala.Double] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The 50th percentile round trip latency(ms) as perceived from Google servers for the duration period covered by the report. */
  var latency50thPercentile: js.UndefOr[scala.Double] = js.undefined
  /** The 85th percentile round trip latency(ms) as perceived from Google servers for the duration period covered by the report. */
  var latency85thPercentile: js.UndefOr[scala.Double] = js.undefined
  /** The 95th percentile round trip latency(ms) as perceived from Google servers for the duration period covered by the report. */
  var latency95thPercentile: js.UndefOr[scala.Double] = js.undefined
  /** Rate of various quota account statuses per quota check. */
  var noQuotaInRegion: js.UndefOr[scala.Double] = js.undefined
  /** Rate of various quota account statuses per quota check. */
  var outOfQuota: js.UndefOr[scala.Double] = js.undefined
  /** Average QPS for pixel match requests from clients. */
  var pixelMatchRequests: js.UndefOr[scala.Double] = js.undefined
  /** Average QPS for pixel match responses from clients. */
  var pixelMatchResponses: js.UndefOr[scala.Double] = js.undefined
  /** The configured quota limits for this account. */
  var quotaConfiguredLimit: js.UndefOr[scala.Double] = js.undefined
  /** The throttled quota limits for this account. */
  var quotaThrottledLimit: js.UndefOr[scala.Double] = js.undefined
  /** The trading location of this data. */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /** The number of properly formed bid responses received by our servers within the deadline. */
  var successfulRequestRate: js.UndefOr[scala.Double] = js.undefined
  /** The unix timestamp of the starting time of this performance data. */
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
  /** The number of bid responses that were unsuccessful due to timeouts, incorrect formatting, etc. */
  var unsuccessfulRequestRate: js.UndefOr[scala.Double] = js.undefined
}

