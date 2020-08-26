package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuotaInfo extends js.Object {
  /**
    * Quota Metrics that have exceeded quota limits.
    * For QuotaGroup-based quota, this is QuotaGroup.name
    * For QuotaLimit-based quota, this is QuotaLimit.name
    * See: google.api.Quota
    * Deprecated: Use quota_metrics to get per quota group limit exceeded status.
    */
  var limitExceeded: js.UndefOr[js.Array[String]] = js.native
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
  var quotaConsumed: js.UndefOr[Record[String, Double]] = js.native
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
  var quotaMetrics: js.UndefOr[js.Array[MetricValueSet]] = js.native
}

object QuotaInfo {
  @scala.inline
  def apply(): QuotaInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuotaInfo]
  }
  @scala.inline
  implicit class QuotaInfoOps[Self <: QuotaInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLimitExceededVarargs(value: String*): Self = this.set("limitExceeded", js.Array(value :_*))
    @scala.inline
    def setLimitExceeded(value: js.Array[String]): Self = this.set("limitExceeded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitExceeded: Self = this.set("limitExceeded", js.undefined)
    @scala.inline
    def setQuotaConsumed(value: Record[String, Double]): Self = this.set("quotaConsumed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaConsumed: Self = this.set("quotaConsumed", js.undefined)
    @scala.inline
    def setQuotaMetricsVarargs(value: MetricValueSet*): Self = this.set("quotaMetrics", js.Array(value :_*))
    @scala.inline
    def setQuotaMetrics(value: js.Array[MetricValueSet]): Self = this.set("quotaMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaMetrics: Self = this.set("quotaMetrics", js.undefined)
  }
  
}

