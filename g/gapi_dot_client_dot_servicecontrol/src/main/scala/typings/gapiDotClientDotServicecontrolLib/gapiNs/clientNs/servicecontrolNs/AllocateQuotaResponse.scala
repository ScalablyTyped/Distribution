package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AllocateQuotaResponse extends js.Object {
  /** Indicates the decision of the allocate. */
  var allocateErrors: js.UndefOr[js.Array[QuotaError]] = js.undefined
  /** WARNING: DO NOT use this field until this warning message is removed. */
  var allocateInfo: js.UndefOr[AllocateInfo] = js.undefined
  /**
               * The same operation_id value used in the AllocateQuotaRequest. Used for
               * logging and diagnostics purposes.
               */
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Quota metrics to indicate the result of allocation. Depending on the
               * request, one or more of the following metrics will be included:
               *
               * 1. Per quota group or per quota metric incremental usage will be specified
               * using the following delta metric :
               * "serviceruntime.googleapis.com/api/consumer/quota_used_count"
               *
               * 2. The quota limit reached condition will be specified using the following
               * boolean metric :
               * "serviceruntime.googleapis.com/quota/exceeded"
               */
  var quotaMetrics: js.UndefOr[js.Array[MetricValueSet]] = js.undefined
  /** ID of the actual config used to process the request. */
  var serviceConfigId: js.UndefOr[java.lang.String] = js.undefined
}

