package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  /**
    * A list of API interfaces exported by this service. Only the `name` field
    * of the google.protobuf.Api needs to be provided by the configuration
    * author, as the remaining fields will be derived from the IDL during the
    * normalization process. It is an error to specify an API interface here
    * which cannot be resolved against the associated IDL files.
    */
  var apis: js.UndefOr[js.Array[Api]] = js.undefined
  /** Auth configuration. */
  var authentication: js.UndefOr[Authentication] = js.undefined
  /** API backend configuration. */
  var backend: js.UndefOr[Backend] = js.undefined
  /** Billing configuration. */
  var billing: js.UndefOr[Billing] = js.undefined
  /**
    * The semantic version of the service configuration. The config version
    * affects the interpretation of the service configuration. For example,
    * certain features are enabled by default for certain config versions.
    * The latest config version is `3`.
    */
  var configVersion: js.UndefOr[Double] = js.undefined
  /** Context configuration. */
  var context: js.UndefOr[Context] = js.undefined
  /** Configuration for the service control plane. */
  var control: js.UndefOr[Control] = js.undefined
  /** Custom error configuration. */
  var customError: js.UndefOr[CustomError] = js.undefined
  /** Additional API documentation. */
  var documentation: js.UndefOr[Documentation] = js.undefined
  /**
    * Configuration for network endpoints.  If this is empty, then an endpoint
    * with the same name as the service is automatically generated to service all
    * defined APIs.
    */
  var endpoints: js.UndefOr[js.Array[Endpoint]] = js.undefined
  /**
    * A list of all enum types included in this API service.  Enums
    * referenced directly or indirectly by the `apis` are automatically
    * included.  Enums which are not referenced but shall be included
    * should be listed here by name. Example:
    *
    * enums:
    * - name: google.someapi.v1.SomeEnum
    */
  var enums: js.UndefOr[js.Array[Enum]] = js.undefined
  /** Experimental configuration. */
  var experimental: js.UndefOr[Experimental] = js.undefined
  /** HTTP configuration. */
  var http: js.UndefOr[Http] = js.undefined
  /**
    * A unique ID for a specific instance of this message, typically assigned
    * by the client for tracking purpose. If empty, the server may choose to
    * generate one instead.
    */
  var id: js.UndefOr[String] = js.undefined
  /** Logging configuration. */
  var logging: js.UndefOr[Logging] = js.undefined
  /** Defines the logs used by this service. */
  var logs: js.UndefOr[js.Array[LogDescriptor]] = js.undefined
  /** Defines the metrics used by this service. */
  var metrics: js.UndefOr[js.Array[MetricDescriptor]] = js.undefined
  /**
    * Defines the monitored resources used by this service. This is required
    * by the Service.monitoring and Service.logging configurations.
    */
  var monitoredResources: js.UndefOr[js.Array[MonitoredResourceDescriptor]] = js.undefined
  /** Monitoring configuration. */
  var monitoring: js.UndefOr[Monitoring] = js.undefined
  /**
    * The DNS address at which this service is available,
    * e.g. `calendar.googleapis.com`.
    */
  var name: js.UndefOr[String] = js.undefined
  /** The Google project that owns this service. */
  var producerProjectId: js.UndefOr[String] = js.undefined
  /** Quota configuration. */
  var quota: js.UndefOr[Quota] = js.undefined
  /** Output only. The source information for this configuration if available. */
  var sourceInfo: js.UndefOr[SourceInfo] = js.undefined
  /** System parameter configuration. */
  var systemParameters: js.UndefOr[SystemParameters] = js.undefined
  /**
    * A list of all proto message types included in this API service.
    * It serves similar purpose as [google.api.Service.types], except that
    * these types are not needed by user-defined APIs. Therefore, they will not
    * show up in the generated discovery doc. This field should only be used
    * to define system APIs in ESF.
    */
  var systemTypes: js.UndefOr[js.Array[Type]] = js.undefined
  /** The product title for this service. */
  var title: js.UndefOr[String] = js.undefined
  /**
    * A list of all proto message types included in this API service.
    * Types referenced directly or indirectly by the `apis` are
    * automatically included.  Messages which are not referenced but
    * shall be included, such as types used by the `google.protobuf.Any` type,
    * should be listed here by name. Example:
    *
    * types:
    * - name: google.protobuf.Int32
    */
  var types: js.UndefOr[js.Array[Type]] = js.undefined
  /** Configuration controlling usage of this service. */
  var usage: js.UndefOr[Usage] = js.undefined
  /** API visibility configuration. */
  var visibility: js.UndefOr[Visibility] = js.undefined
}

object Service {
  @scala.inline
  def apply(
    apis: js.Array[Api] = null,
    authentication: Authentication = null,
    backend: Backend = null,
    billing: Billing = null,
    configVersion: js.UndefOr[Double] = js.undefined,
    context: Context = null,
    control: Control = null,
    customError: CustomError = null,
    documentation: Documentation = null,
    endpoints: js.Array[Endpoint] = null,
    enums: js.Array[Enum] = null,
    experimental: Experimental = null,
    http: Http = null,
    id: String = null,
    logging: Logging = null,
    logs: js.Array[LogDescriptor] = null,
    metrics: js.Array[MetricDescriptor] = null,
    monitoredResources: js.Array[MonitoredResourceDescriptor] = null,
    monitoring: Monitoring = null,
    name: String = null,
    producerProjectId: String = null,
    quota: Quota = null,
    sourceInfo: SourceInfo = null,
    systemParameters: SystemParameters = null,
    systemTypes: js.Array[Type] = null,
    title: String = null,
    types: js.Array[Type] = null,
    usage: Usage = null,
    visibility: Visibility = null
  ): Service = {
    val __obj = js.Dynamic.literal()
    if (apis != null) __obj.updateDynamic("apis")(apis.asInstanceOf[js.Any])
    if (authentication != null) __obj.updateDynamic("authentication")(authentication.asInstanceOf[js.Any])
    if (backend != null) __obj.updateDynamic("backend")(backend.asInstanceOf[js.Any])
    if (billing != null) __obj.updateDynamic("billing")(billing.asInstanceOf[js.Any])
    if (!js.isUndefined(configVersion)) __obj.updateDynamic("configVersion")(configVersion.get.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control.asInstanceOf[js.Any])
    if (customError != null) __obj.updateDynamic("customError")(customError.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints.asInstanceOf[js.Any])
    if (enums != null) __obj.updateDynamic("enums")(enums.asInstanceOf[js.Any])
    if (experimental != null) __obj.updateDynamic("experimental")(experimental.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (logs != null) __obj.updateDynamic("logs")(logs.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (monitoredResources != null) __obj.updateDynamic("monitoredResources")(monitoredResources.asInstanceOf[js.Any])
    if (monitoring != null) __obj.updateDynamic("monitoring")(monitoring.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (producerProjectId != null) __obj.updateDynamic("producerProjectId")(producerProjectId.asInstanceOf[js.Any])
    if (quota != null) __obj.updateDynamic("quota")(quota.asInstanceOf[js.Any])
    if (sourceInfo != null) __obj.updateDynamic("sourceInfo")(sourceInfo.asInstanceOf[js.Any])
    if (systemParameters != null) __obj.updateDynamic("systemParameters")(systemParameters.asInstanceOf[js.Any])
    if (systemTypes != null) __obj.updateDynamic("systemTypes")(systemTypes.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
}

