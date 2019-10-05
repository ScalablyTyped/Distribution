package typings.gapiDotClientDotServicecontrol.gapi.client.servicecontrol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndReconciliationResponse extends js.Object {
  /**
    * The same operation_id value used in the EndReconciliationRequest. Used for
    * logging and diagnostics purposes.
    */
  var operationId: js.UndefOr[String] = js.undefined
  /**
    * Metric values as tracked by One Platform before the adjustment was made.
    * The following metrics will be included:
    *
    * 1. Per quota metric total usage will be specified using the following gauge
    * metric:
    * "serviceruntime.googleapis.com/allocation/consumer/quota_used_count"
    *
    * 2. Value for each quota limit associated with the metrics will be specified
    * using the following gauge metric:
    * "serviceruntime.googleapis.com/quota/limit"
    *
    * 3. Delta value of the usage after the reconciliation for limits associated
    * with the metrics will be specified using the following metric:
    * "serviceruntime.googleapis.com/allocation/reconciliation_delta"
    * The delta value is defined as:
    * new_usage_from_client - existing_value_in_spanner.
    * This metric is not defined in serviceruntime.yaml or in Cloud Monarch.
    * This metric is meant for callers' use only. Since this metric is not
    * defined in the monitoring backend, reporting on this metric will result in
    * an error.
    */
  var quotaMetrics: js.UndefOr[js.Array[MetricValueSet]] = js.undefined
  /** Indicates the decision of the reconciliation end. */
  var reconciliationErrors: js.UndefOr[js.Array[QuotaError]] = js.undefined
  /** ID of the actual config used to process the request. */
  var serviceConfigId: js.UndefOr[String] = js.undefined
}

object EndReconciliationResponse {
  @scala.inline
  def apply(
    operationId: String = null,
    quotaMetrics: js.Array[MetricValueSet] = null,
    reconciliationErrors: js.Array[QuotaError] = null,
    serviceConfigId: String = null
  ): EndReconciliationResponse = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (quotaMetrics != null) __obj.updateDynamic("quotaMetrics")(quotaMetrics)
    if (reconciliationErrors != null) __obj.updateDynamic("reconciliationErrors")(reconciliationErrors)
    if (serviceConfigId != null) __obj.updateDynamic("serviceConfigId")(serviceConfigId)
    __obj.asInstanceOf[EndReconciliationResponse]
  }
}

