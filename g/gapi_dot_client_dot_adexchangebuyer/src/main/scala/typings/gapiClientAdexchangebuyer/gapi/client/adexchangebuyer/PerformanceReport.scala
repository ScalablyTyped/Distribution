package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceReport extends js.Object {
  /** The number of bid responses with an ad. */
  var bidRate: js.UndefOr[Double] = js.undefined
  /** The number of bid requests sent to your bidder. */
  var bidRequestRate: js.UndefOr[Double] = js.undefined
  /** Rate of various prefiltering statuses per match. Please refer to the callout-status-codes.txt file for different statuses. */
  var calloutStatusRate: js.UndefOr[js.Array[_]] = js.undefined
  /** Average QPS for cookie matcher operations. */
  var cookieMatcherStatusRate: js.UndefOr[js.Array[_]] = js.undefined
  /** Rate of ads with a given status. Please refer to the creative-status-codes.txt file for different statuses. */
  var creativeStatusRate: js.UndefOr[js.Array[_]] = js.undefined
  /** The number of bid responses that were filtered due to a policy violation or other errors. */
  var filteredBidRate: js.UndefOr[Double] = js.undefined
  /** Average QPS for hosted match operations. */
  var hostedMatchStatusRate: js.UndefOr[js.Array[_]] = js.undefined
  /** The number of potential queries based on your pretargeting settings. */
  var inventoryMatchRate: js.UndefOr[Double] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /** The 50th percentile round trip latency(ms) as perceived from Google servers for the duration period covered by the report. */
  var latency50thPercentile: js.UndefOr[Double] = js.undefined
  /** The 85th percentile round trip latency(ms) as perceived from Google servers for the duration period covered by the report. */
  var latency85thPercentile: js.UndefOr[Double] = js.undefined
  /** The 95th percentile round trip latency(ms) as perceived from Google servers for the duration period covered by the report. */
  var latency95thPercentile: js.UndefOr[Double] = js.undefined
  /** Rate of various quota account statuses per quota check. */
  var noQuotaInRegion: js.UndefOr[Double] = js.undefined
  /** Rate of various quota account statuses per quota check. */
  var outOfQuota: js.UndefOr[Double] = js.undefined
  /** Average QPS for pixel match requests from clients. */
  var pixelMatchRequests: js.UndefOr[Double] = js.undefined
  /** Average QPS for pixel match responses from clients. */
  var pixelMatchResponses: js.UndefOr[Double] = js.undefined
  /** The configured quota limits for this account. */
  var quotaConfiguredLimit: js.UndefOr[Double] = js.undefined
  /** The throttled quota limits for this account. */
  var quotaThrottledLimit: js.UndefOr[Double] = js.undefined
  /** The trading location of this data. */
  var region: js.UndefOr[String] = js.undefined
  /** The number of properly formed bid responses received by our servers within the deadline. */
  var successfulRequestRate: js.UndefOr[Double] = js.undefined
  /** The unix timestamp of the starting time of this performance data. */
  var timestamp: js.UndefOr[String] = js.undefined
  /** The number of bid responses that were unsuccessful due to timeouts, incorrect formatting, etc. */
  var unsuccessfulRequestRate: js.UndefOr[Double] = js.undefined
}

object PerformanceReport {
  @scala.inline
  def apply(
    bidRate: Int | Double = null,
    bidRequestRate: Int | Double = null,
    calloutStatusRate: js.Array[_] = null,
    cookieMatcherStatusRate: js.Array[_] = null,
    creativeStatusRate: js.Array[_] = null,
    filteredBidRate: Int | Double = null,
    hostedMatchStatusRate: js.Array[_] = null,
    inventoryMatchRate: Int | Double = null,
    kind: String = null,
    latency50thPercentile: Int | Double = null,
    latency85thPercentile: Int | Double = null,
    latency95thPercentile: Int | Double = null,
    noQuotaInRegion: Int | Double = null,
    outOfQuota: Int | Double = null,
    pixelMatchRequests: Int | Double = null,
    pixelMatchResponses: Int | Double = null,
    quotaConfiguredLimit: Int | Double = null,
    quotaThrottledLimit: Int | Double = null,
    region: String = null,
    successfulRequestRate: Int | Double = null,
    timestamp: String = null,
    unsuccessfulRequestRate: Int | Double = null
  ): PerformanceReport = {
    val __obj = js.Dynamic.literal()
    if (bidRate != null) __obj.updateDynamic("bidRate")(bidRate.asInstanceOf[js.Any])
    if (bidRequestRate != null) __obj.updateDynamic("bidRequestRate")(bidRequestRate.asInstanceOf[js.Any])
    if (calloutStatusRate != null) __obj.updateDynamic("calloutStatusRate")(calloutStatusRate.asInstanceOf[js.Any])
    if (cookieMatcherStatusRate != null) __obj.updateDynamic("cookieMatcherStatusRate")(cookieMatcherStatusRate.asInstanceOf[js.Any])
    if (creativeStatusRate != null) __obj.updateDynamic("creativeStatusRate")(creativeStatusRate.asInstanceOf[js.Any])
    if (filteredBidRate != null) __obj.updateDynamic("filteredBidRate")(filteredBidRate.asInstanceOf[js.Any])
    if (hostedMatchStatusRate != null) __obj.updateDynamic("hostedMatchStatusRate")(hostedMatchStatusRate.asInstanceOf[js.Any])
    if (inventoryMatchRate != null) __obj.updateDynamic("inventoryMatchRate")(inventoryMatchRate.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (latency50thPercentile != null) __obj.updateDynamic("latency50thPercentile")(latency50thPercentile.asInstanceOf[js.Any])
    if (latency85thPercentile != null) __obj.updateDynamic("latency85thPercentile")(latency85thPercentile.asInstanceOf[js.Any])
    if (latency95thPercentile != null) __obj.updateDynamic("latency95thPercentile")(latency95thPercentile.asInstanceOf[js.Any])
    if (noQuotaInRegion != null) __obj.updateDynamic("noQuotaInRegion")(noQuotaInRegion.asInstanceOf[js.Any])
    if (outOfQuota != null) __obj.updateDynamic("outOfQuota")(outOfQuota.asInstanceOf[js.Any])
    if (pixelMatchRequests != null) __obj.updateDynamic("pixelMatchRequests")(pixelMatchRequests.asInstanceOf[js.Any])
    if (pixelMatchResponses != null) __obj.updateDynamic("pixelMatchResponses")(pixelMatchResponses.asInstanceOf[js.Any])
    if (quotaConfiguredLimit != null) __obj.updateDynamic("quotaConfiguredLimit")(quotaConfiguredLimit.asInstanceOf[js.Any])
    if (quotaThrottledLimit != null) __obj.updateDynamic("quotaThrottledLimit")(quotaThrottledLimit.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (successfulRequestRate != null) __obj.updateDynamic("successfulRequestRate")(successfulRequestRate.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (unsuccessfulRequestRate != null) __obj.updateDynamic("unsuccessfulRequestRate")(unsuccessfulRequestRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceReport]
  }
}

