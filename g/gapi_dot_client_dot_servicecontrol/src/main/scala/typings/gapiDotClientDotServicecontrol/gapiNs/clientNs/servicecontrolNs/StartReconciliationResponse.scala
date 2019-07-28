package typings.gapiDotClientDotServicecontrol.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartReconciliationResponse extends js.Object {
  /**
    * The same operation_id value used in the StartReconciliationRequest. Used
    * for logging and diagnostics purposes.
    */
  var operationId: js.UndefOr[String] = js.undefined
  /**
    * Metric values as tracked by One Platform before the start of
    * reconciliation. The following metrics will be included:
    *
    * 1. Per quota metric total usage will be specified using the following gauge
    * metric:
    * "serviceruntime.googleapis.com/allocation/consumer/quota_used_count"
    *
    * 2. Value for each quota limit associated with the metrics will be specified
    * using the following gauge metric:
    * "serviceruntime.googleapis.com/quota/limit"
    */
  var quotaMetrics: js.UndefOr[js.Array[MetricValueSet]] = js.undefined
  /** Indicates the decision of the reconciliation start. */
  var reconciliationErrors: js.UndefOr[js.Array[QuotaError]] = js.undefined
  /** ID of the actual config used to process the request. */
  var serviceConfigId: js.UndefOr[String] = js.undefined
}

object StartReconciliationResponse {
  @scala.inline
  def apply(
    operationId: String = null,
    quotaMetrics: js.Array[MetricValueSet] = null,
    reconciliationErrors: js.Array[QuotaError] = null,
    serviceConfigId: String = null
  ): StartReconciliationResponse = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (quotaMetrics != null) __obj.updateDynamic("quotaMetrics")(quotaMetrics)
    if (reconciliationErrors != null) __obj.updateDynamic("reconciliationErrors")(reconciliationErrors)
    if (serviceConfigId != null) __obj.updateDynamic("serviceConfigId")(serviceConfigId)
    __obj.asInstanceOf[StartReconciliationResponse]
  }
}

