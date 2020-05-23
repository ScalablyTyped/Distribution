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
    bidRate: js.UndefOr[Double] = js.undefined,
    bidRequestRate: js.UndefOr[Double] = js.undefined,
    calloutStatusRate: js.Array[_] = null,
    cookieMatcherStatusRate: js.Array[_] = null,
    creativeStatusRate: js.Array[_] = null,
    filteredBidRate: js.UndefOr[Double] = js.undefined,
    hostedMatchStatusRate: js.Array[_] = null,
    inventoryMatchRate: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    latency50thPercentile: js.UndefOr[Double] = js.undefined,
    latency85thPercentile: js.UndefOr[Double] = js.undefined,
    latency95thPercentile: js.UndefOr[Double] = js.undefined,
    noQuotaInRegion: js.UndefOr[Double] = js.undefined,
    outOfQuota: js.UndefOr[Double] = js.undefined,
    pixelMatchRequests: js.UndefOr[Double] = js.undefined,
    pixelMatchResponses: js.UndefOr[Double] = js.undefined,
    quotaConfiguredLimit: js.UndefOr[Double] = js.undefined,
    quotaThrottledLimit: js.UndefOr[Double] = js.undefined,
    region: String = null,
    successfulRequestRate: js.UndefOr[Double] = js.undefined,
    timestamp: String = null,
    unsuccessfulRequestRate: js.UndefOr[Double] = js.undefined
  ): PerformanceReport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bidRate)) __obj.updateDynamic("bidRate")(bidRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bidRequestRate)) __obj.updateDynamic("bidRequestRate")(bidRequestRate.get.asInstanceOf[js.Any])
    if (calloutStatusRate != null) __obj.updateDynamic("calloutStatusRate")(calloutStatusRate.asInstanceOf[js.Any])
    if (cookieMatcherStatusRate != null) __obj.updateDynamic("cookieMatcherStatusRate")(cookieMatcherStatusRate.asInstanceOf[js.Any])
    if (creativeStatusRate != null) __obj.updateDynamic("creativeStatusRate")(creativeStatusRate.asInstanceOf[js.Any])
    if (!js.isUndefined(filteredBidRate)) __obj.updateDynamic("filteredBidRate")(filteredBidRate.get.asInstanceOf[js.Any])
    if (hostedMatchStatusRate != null) __obj.updateDynamic("hostedMatchStatusRate")(hostedMatchStatusRate.asInstanceOf[js.Any])
    if (!js.isUndefined(inventoryMatchRate)) __obj.updateDynamic("inventoryMatchRate")(inventoryMatchRate.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(latency50thPercentile)) __obj.updateDynamic("latency50thPercentile")(latency50thPercentile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latency85thPercentile)) __obj.updateDynamic("latency85thPercentile")(latency85thPercentile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(latency95thPercentile)) __obj.updateDynamic("latency95thPercentile")(latency95thPercentile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noQuotaInRegion)) __obj.updateDynamic("noQuotaInRegion")(noQuotaInRegion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outOfQuota)) __obj.updateDynamic("outOfQuota")(outOfQuota.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelMatchRequests)) __obj.updateDynamic("pixelMatchRequests")(pixelMatchRequests.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelMatchResponses)) __obj.updateDynamic("pixelMatchResponses")(pixelMatchResponses.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quotaConfiguredLimit)) __obj.updateDynamic("quotaConfiguredLimit")(quotaConfiguredLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quotaThrottledLimit)) __obj.updateDynamic("quotaThrottledLimit")(quotaThrottledLimit.get.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (!js.isUndefined(successfulRequestRate)) __obj.updateDynamic("successfulRequestRate")(successfulRequestRate.get.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(unsuccessfulRequestRate)) __obj.updateDynamic("unsuccessfulRequestRate")(unsuccessfulRequestRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceReport]
  }
}

