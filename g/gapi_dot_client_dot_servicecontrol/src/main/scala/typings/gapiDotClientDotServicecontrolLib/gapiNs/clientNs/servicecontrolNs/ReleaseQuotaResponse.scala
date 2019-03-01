package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseQuotaResponse extends js.Object {
  /**
    * The same operation_id value used in the ReleaseQuotaRequest. Used for
    * logging and diagnostics purposes.
    */
  var operationId: js.UndefOr[java.lang.String] = js.undefined
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
  var quotaMetrics: js.UndefOr[js.Array[MetricValueSet]] = js.undefined
  /** Indicates the decision of the release. */
  var releaseErrors: js.UndefOr[js.Array[QuotaError]] = js.undefined
  /** ID of the actual config used to process the request. */
  var serviceConfigId: js.UndefOr[java.lang.String] = js.undefined
}

object ReleaseQuotaResponse {
  @scala.inline
  def apply(
    operationId: java.lang.String = null,
    quotaMetrics: js.Array[MetricValueSet] = null,
    releaseErrors: js.Array[QuotaError] = null,
    serviceConfigId: java.lang.String = null
  ): ReleaseQuotaResponse = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (quotaMetrics != null) __obj.updateDynamic("quotaMetrics")(quotaMetrics)
    if (releaseErrors != null) __obj.updateDynamic("releaseErrors")(releaseErrors)
    if (serviceConfigId != null) __obj.updateDynamic("serviceConfigId")(serviceConfigId)
    __obj.asInstanceOf[ReleaseQuotaResponse]
  }
}

