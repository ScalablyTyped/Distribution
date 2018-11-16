package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Operation extends js.Object {
  /**
               * Identity of the consumer who is using the service.
               * This field should be filled in for the operations initiated by a
               * consumer, but not for service-initiated operations that are
               * not related to a specific consumer.
               *
               * This can be in one of the following formats:
               * project:<project_id>,
               * project_number:<project_number>,
               * api_key:<api_key>.
               */
  var consumerId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * End time of the operation.
               * Required when the operation is used in ServiceController.Report,
               * but optional when the operation is used in ServiceController.Check.
               */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** DO NOT USE. This is an experimental field. */
  var importance: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Labels describing the operation. Only the following labels are allowed:
               *
               * - Labels describing monitored resources as defined in
               * the service configuration.
               * - Default labels of metric values. When specified, labels defined in the
               * metric value override these default.
               * - The following labels defined by Google Cloud Platform:
               * - `cloud.googleapis.com/location` describing the location where the
               * operation happened,
               * - `servicecontrol.googleapis.com/user_agent` describing the user agent
               * of the API request,
               * - `servicecontrol.googleapis.com/service_agent` describing the service
               * used to handle the API request (e.g. ESP),
               * - `servicecontrol.googleapis.com/platform` describing the platform
               * where the API is served (e.g. GAE, GCE, GKE).
               */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** Represents information to be logged. */
  var logEntries: js.UndefOr[js.Array[LogEntry]] = js.undefined
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
  var metricValueSets: js.UndefOr[js.Array[MetricValueSet]] = js.undefined
  /**
               * Identity of the operation. This must be unique within the scope of the
               * service that generated the operation. If the service calls
               * Check() and Report() on the same operation, the two calls should carry
               * the same id.
               *
               * UUID version 4 is recommended, though not required.
               * In scenarios where an operation is computed from existing information
               * and an idempotent id is desirable for deduplication purpose, UUID version 5
               * is recommended. See RFC 4122 for details.
               */
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  /** Fully qualified name of the operation. Reserved for future use. */
  var operationName: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Represents the properties needed for quota check. Applicable only if this
               * operation is for a quota check request. If this is not specified, no quota
               * check will be performed.
               */
  var quotaProperties: js.UndefOr[QuotaProperties] = js.undefined
  /**
               * DO NOT USE. This field is deprecated, use "resources" field instead.
               * The resource name of the parent of a resource in the resource hierarchy.
               *
               * This can be in one of the following formats:
               * - “projects/<project-id or project-number>”
               * - “folders/<folder-id>”
               * - “organizations/<organization-id>”
               */
  var resourceContainer: js.UndefOr[java.lang.String] = js.undefined
  /** The resources that are involved in the operation. */
  var resources: js.UndefOr[js.Array[ResourceInfo]] = js.undefined
  /** Required. Start time of the operation. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * User defined labels for the resource that this operation is associated
               * with. Only a combination of 1000 user labels per consumer project are
               * allowed.
               */
  var userLabels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

