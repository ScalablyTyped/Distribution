package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuotaInfo extends js.Object {
  /**
    * Quota Metrics that have exceeded quota limits.
    * For QuotaGroup-based quota, this is QuotaGroup.name
    * For QuotaLimit-based quota, this is QuotaLimit.name
    * See: google.api.Quota
    * Deprecated: Use quota_metrics to get per quota group limit exceeded status.
    */
  var limitExceeded: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Map of quota group name to the actual number of tokens consumed. If the
    * quota check was not successful, then this will not be populated due to no
    * quota consumption.
    *
    * We are not merging this field with 'quota_metrics' field because of the
    * complexity of scaling in Chemist client code base. For simplicity, we will
    * keep this field for Castor (that scales quota usage) and 'quota_metrics'
    * for SuperQuota (that doesn't scale quota usage).
    */
  var quotaConsumed: js.UndefOr[Record[String, Double]] = js.undefined
  /**
    * Quota metrics to indicate the usage. Depending on the check request, one or
    * more of the following metrics will be included:
    *
    * 1. For rate quota, per quota group or per quota metric incremental usage
    * will be specified using the following delta metric:
    * "serviceruntime.googleapis.com/api/consumer/quota_used_count"
    *
    * 2. For allocation quota, per quota metric total usage will be specified
    * using the following gauge metric:
    * "serviceruntime.googleapis.com/allocation/consumer/quota_used_count"
    *
    * 3. For both rate quota and allocation quota, the quota limit reached
    * condition will be specified using the following boolean metric:
    * "serviceruntime.googleapis.com/quota/exceeded"
    */
  var quotaMetrics: js.UndefOr[js.Array[MetricValueSet]] = js.undefined
}

object QuotaInfo {
  @scala.inline
  def apply(
    limitExceeded: js.Array[String] = null,
    quotaConsumed: Record[String, Double] = null,
    quotaMetrics: js.Array[MetricValueSet] = null
  ): QuotaInfo = {
    val __obj = js.Dynamic.literal()
    if (limitExceeded != null) __obj.updateDynamic("limitExceeded")(limitExceeded.asInstanceOf[js.Any])
    if (quotaConsumed != null) __obj.updateDynamic("quotaConsumed")(quotaConsumed.asInstanceOf[js.Any])
    if (quotaMetrics != null) __obj.updateDynamic("quotaMetrics")(quotaMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaInfo]
  }
}

