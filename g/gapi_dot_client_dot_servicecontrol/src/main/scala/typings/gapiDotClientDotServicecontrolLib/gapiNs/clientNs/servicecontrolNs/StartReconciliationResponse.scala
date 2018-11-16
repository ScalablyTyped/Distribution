package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StartReconciliationResponse extends js.Object {
  /**
               * The same operation_id value used in the StartReconciliationRequest. Used
               * for logging and diagnostics purposes.
               */
  var operationId: js.UndefOr[java.lang.String] = js.undefined
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
  var serviceConfigId: js.UndefOr[java.lang.String] = js.undefined
}

