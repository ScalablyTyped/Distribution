package typings.gapiClientServicecontrol.gapi.client.servicecontrol

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuotaOperation extends js.Object {
  /**
    * Identity of the consumer for whom this quota operation is being performed.
    *
    * This can be in one of the following formats:
    * project:<project_id>,
    * project_number:<project_number>,
    * api_key:<api_key>.
    */
  var consumerId: js.UndefOr[String] = js.undefined
  /** Labels describing the operation. */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * Fully qualified name of the API method for which this quota operation is
    * requested. This name is used for matching quota rules or metric rules and
    * billing status rules defined in service configuration. This field is not
    * required if the quota operation is performed on non-API resources.
    *
    * Example of an RPC method name:
    * google.example.library.v1.LibraryService.CreateShelf
    */
  var methodName: js.UndefOr[String] = js.undefined
  /**
    * Identity of the operation. This is expected to be unique within the scope
    * of the service that generated the operation, and guarantees idempotency in
    * case of retries.
    *
    * UUID version 4 is recommended, though not required. In scenarios where an
    * operation is computed from existing information and an idempotent id is
    * desirable for deduplication purpose, UUID version 5 is recommended. See
    * RFC 4122 for details.
    */
  var operationId: js.UndefOr[String] = js.undefined
  /**
    * Represents information about this operation. Each MetricValueSet
    * corresponds to a metric defined in the service configuration.
    * The data type used in the MetricValueSet must agree with
    * the data type specified in the metric definition.
    *
    * Within a single operation, it is not allowed to have more than one
    * MetricValue instances that have the same metric names and identical
    * label value combinations. If a request has such duplicated MetricValue
    * instances, the entire request is rejected with
    * an invalid argument error.
    */
  var quotaMetrics: js.UndefOr[js.Array[MetricValueSet]] = js.undefined
  /** Quota mode for this operation. */
  var quotaMode: js.UndefOr[String] = js.undefined
}

object QuotaOperation {
  @scala.inline
  def apply(
    consumerId: String = null,
    labels: Record[String, String] = null,
    methodName: String = null,
    operationId: String = null,
    quotaMetrics: js.Array[MetricValueSet] = null,
    quotaMode: String = null
  ): QuotaOperation = {
    val __obj = js.Dynamic.literal()
    if (consumerId != null) __obj.updateDynamic("consumerId")(consumerId.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (methodName != null) __obj.updateDynamic("methodName")(methodName.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (quotaMetrics != null) __obj.updateDynamic("quotaMetrics")(quotaMetrics.asInstanceOf[js.Any])
    if (quotaMode != null) __obj.updateDynamic("quotaMode")(quotaMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaOperation]
  }
}

