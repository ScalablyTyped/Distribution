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

object PerformanceReport {
  @scala.inline
  def apply(
    bidRate: scala.Int | scala.Double = null,
    bidRequestRate: scala.Int | scala.Double = null,
    calloutStatusRate: js.Array[_] = null,
    cookieMatcherStatusRate: js.Array[_] = null,
    creativeStatusRate: js.Array[_] = null,
    filteredBidRate: scala.Int | scala.Double = null,
    hostedMatchStatusRate: js.Array[_] = null,
    inventoryMatchRate: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    latency50thPercentile: scala.Int | scala.Double = null,
    latency85thPercentile: scala.Int | scala.Double = null,
    latency95thPercentile: scala.Int | scala.Double = null,
    noQuotaInRegion: scala.Int | scala.Double = null,
    outOfQuota: scala.Int | scala.Double = null,
    pixelMatchRequests: scala.Int | scala.Double = null,
    pixelMatchResponses: scala.Int | scala.Double = null,
    quotaConfiguredLimit: scala.Int | scala.Double = null,
    quotaThrottledLimit: scala.Int | scala.Double = null,
    region: java.lang.String = null,
    successfulRequestRate: scala.Int | scala.Double = null,
    timestamp: java.lang.String = null,
    unsuccessfulRequestRate: scala.Int | scala.Double = null
  ): PerformanceReport = {
    val __obj = js.Dynamic.literal()
    if (bidRate != null) __obj.updateDynamic("bidRate")(bidRate.asInstanceOf[js.Any])
    if (bidRequestRate != null) __obj.updateDynamic("bidRequestRate")(bidRequestRate.asInstanceOf[js.Any])
    if (calloutStatusRate != null) __obj.updateDynamic("calloutStatusRate")(calloutStatusRate)
    if (cookieMatcherStatusRate != null) __obj.updateDynamic("cookieMatcherStatusRate")(cookieMatcherStatusRate)
    if (creativeStatusRate != null) __obj.updateDynamic("creativeStatusRate")(creativeStatusRate)
    if (filteredBidRate != null) __obj.updateDynamic("filteredBidRate")(filteredBidRate.asInstanceOf[js.Any])
    if (hostedMatchStatusRate != null) __obj.updateDynamic("hostedMatchStatusRate")(hostedMatchStatusRate)
    if (inventoryMatchRate != null) __obj.updateDynamic("inventoryMatchRate")(inventoryMatchRate.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (latency50thPercentile != null) __obj.updateDynamic("latency50thPercentile")(latency50thPercentile.asInstanceOf[js.Any])
    if (latency85thPercentile != null) __obj.updateDynamic("latency85thPercentile")(latency85thPercentile.asInstanceOf[js.Any])
    if (latency95thPercentile != null) __obj.updateDynamic("latency95thPercentile")(latency95thPercentile.asInstanceOf[js.Any])
    if (noQuotaInRegion != null) __obj.updateDynamic("noQuotaInRegion")(noQuotaInRegion.asInstanceOf[js.Any])
    if (outOfQuota != null) __obj.updateDynamic("outOfQuota")(outOfQuota.asInstanceOf[js.Any])
    if (pixelMatchRequests != null) __obj.updateDynamic("pixelMatchRequests")(pixelMatchRequests.asInstanceOf[js.Any])
    if (pixelMatchResponses != null) __obj.updateDynamic("pixelMatchResponses")(pixelMatchResponses.asInstanceOf[js.Any])
    if (quotaConfiguredLimit != null) __obj.updateDynamic("quotaConfiguredLimit")(quotaConfiguredLimit.asInstanceOf[js.Any])
    if (quotaThrottledLimit != null) __obj.updateDynamic("quotaThrottledLimit")(quotaThrottledLimit.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region)
    if (successfulRequestRate != null) __obj.updateDynamic("successfulRequestRate")(successfulRequestRate.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    if (unsuccessfulRequestRate != null) __obj.updateDynamic("unsuccessfulRequestRate")(unsuccessfulRequestRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceReport]
  }
}

