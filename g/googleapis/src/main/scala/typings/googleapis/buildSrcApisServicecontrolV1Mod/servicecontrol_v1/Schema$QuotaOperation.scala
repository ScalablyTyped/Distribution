package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents information regarding a quota operation.
  */
@js.native
trait Schema$QuotaOperation extends js.Object {
  /**
    * Identity of the consumer for whom this quota operation is being
    * performed.  This can be in one of the following formats:
    * project:&lt;project_id&gt;,   project_number:&lt;project_number&gt;,
    * api_key:&lt;api_key&gt;.
    */
  var consumerId: js.UndefOr[String] = js.native
  /**
    * Labels describing the operation.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Fully qualified name of the API method for which this quota operation is
    * requested. This name is used for matching quota rules or metric rules and
    * billing status rules defined in service configuration.  This field should
    * not be set if any of the following is true: (1) the quota operation is
    * performed on non-API resources. (2) quota_metrics is set because the
    * caller is doing quota override.  Example of an RPC method name:
    * google.example.library.v1.LibraryService.CreateShelf
    */
  var methodName: js.UndefOr[String] = js.native
  /**
    * Identity of the operation. This is expected to be unique within the scope
    * of the service that generated the operation, and guarantees idempotency
    * in case of retries.  UUID version 4 is recommended, though not required.
    * In scenarios where an operation is computed from existing information and
    * an idempotent id is desirable for deduplication purpose, UUID version 5
    * is recommended. See RFC 4122 for details.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * Represents information about this operation. Each MetricValueSet
    * corresponds to a metric defined in the service configuration. The data
    * type used in the MetricValueSet must agree with the data type specified
    * in the metric definition.  Within a single operation, it is not allowed
    * to have more than one MetricValue instances that have the same metric
    * names and identical label value combinations. If a request has such
    * duplicated MetricValue instances, the entire request is rejected with an
    * invalid argument error.  This field is mutually exclusive with
    * method_name.
    */
  var quotaMetrics: js.UndefOr[js.Array[Schema$MetricValueSet]] = js.native
  /**
    * Quota mode for this operation.
    */
  var quotaMode: js.UndefOr[String] = js.native
}

object Schema$QuotaOperation {
  @scala.inline
  def apply(
    consumerId: String = null,
    labels: StringDictionary[String] = null,
    methodName: String = null,
    operationId: String = null,
    quotaMetrics: js.Array[Schema$MetricValueSet] = null,
    quotaMode: String = null
  ): Schema$QuotaOperation = {
    val __obj = js.Dynamic.literal()
    if (consumerId != null) __obj.updateDynamic("consumerId")(consumerId.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (methodName != null) __obj.updateDynamic("methodName")(methodName.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (quotaMetrics != null) __obj.updateDynamic("quotaMetrics")(quotaMetrics.asInstanceOf[js.Any])
    if (quotaMode != null) __obj.updateDynamic("quotaMode")(quotaMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QuotaOperation]
  }
}

