package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseQuotaResponse extends js.Object {
  /**
    * The same operation_id value used in the ReleaseQuotaRequest. Used for
    * logging and diagnostics purposes.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Quota metrics to indicate the result of release. Depending on the
    * request, one or more of the following metrics will be included:
    *
    * 1. For rate quota, per quota group or per quota metric released amount
    * will be specified using the following delta metric:
    * "serviceruntime.googleapis.com/api/consumer/quota_refund_count"
    *
    * 2. For allocation quota, per quota metric total usage will be specified
    * using the following gauge metric:
    * "serviceruntime.googleapis.com/allocation/consumer/quota_used_count"
    *
    * 3. For allocation quota, value for each quota limit associated with
    * the metrics will be specified using the following gauge metric:
    * "serviceruntime.googleapis.com/quota/limit"
    */
  var quotaMetrics: js.UndefOr[js.Array[MetricValueSet]] = js.native
  /** Indicates the decision of the release. */
  var releaseErrors: js.UndefOr[js.Array[QuotaError]] = js.native
  /** ID of the actual config used to process the request. */
  var serviceConfigId: js.UndefOr[String] = js.native
}

object ReleaseQuotaResponse {
  @scala.inline
  def apply(): ReleaseQuotaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseQuotaResponse]
  }
  @scala.inline
  implicit class ReleaseQuotaResponseOps[Self <: ReleaseQuotaResponse] (val x: Self) extends AnyVal {
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
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setQuotaMetricsVarargs(value: MetricValueSet*): Self = this.set("quotaMetrics", js.Array(value :_*))
    @scala.inline
    def setQuotaMetrics(value: js.Array[MetricValueSet]): Self = this.set("quotaMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaMetrics: Self = this.set("quotaMetrics", js.undefined)
    @scala.inline
    def setReleaseErrorsVarargs(value: QuotaError*): Self = this.set("releaseErrors", js.Array(value :_*))
    @scala.inline
    def setReleaseErrors(value: js.Array[QuotaError]): Self = this.set("releaseErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseErrors: Self = this.set("releaseErrors", js.undefined)
    @scala.inline
    def setServiceConfigId(value: String): Self = this.set("serviceConfigId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceConfigId: Self = this.set("serviceConfigId", js.undefined)
  }
  
}

