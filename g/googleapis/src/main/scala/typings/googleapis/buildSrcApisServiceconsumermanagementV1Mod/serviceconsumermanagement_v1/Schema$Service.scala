package typings.googleapis.buildSrcApisServiceconsumermanagementV1Mod.serviceconsumermanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Service` is the root object of Google service configuration schema. It
  * describes basic information about a service, such as the name and the
  * title, and delegates other aspects to sub-sections. Each sub-section is
  * either a proto message or a repeated proto message that configures a
  * specific aspect, such as auth. See each proto message definition for
  * details.  Example:      type: google.api.Service     config_version: 3
  * name: calendar.googleapis.com     title: Google Calendar API     apis: -
  * name: google.calendar.v3.Calendar     authentication:       providers: -
  * id: google_calendar_auth         jwks_uri:
  * https://www.googleapis.com/oauth2/v1/certs         issuer:
  * https://securetoken.google.com       rules:       - selector: &quot;*&quot;
  * requirements:           provider_id: google_calendar_auth
  */
@js.native
trait Schema$Service extends js.Object {
  /**
    * A list of API interfaces exported by this service. Only the `name` field
    * of the google.protobuf.Api needs to be provided by the configuration
    * author, as the remaining fields will be derived from the IDL during the
    * normalization process. It is an error to specify an API interface here
    * which cannot be resolved against the associated IDL files.
    */
  var apis: js.UndefOr[js.Array[Schema$Api]] = js.native
  /**
    * Auth configuration.
    */
  var authentication: js.UndefOr[Schema$Authentication] = js.native
  /**
    * API backend configuration.
    */
  var backend: js.UndefOr[Schema$Backend] = js.native
  /**
    * Billing configuration.
    */
  var billing: js.UndefOr[Schema$Billing] = js.native
  /**
    * The semantic version of the service configuration. The config version
    * affects the interpretation of the service configuration. For example,
    * certain features are enabled by default for certain config versions. The
    * latest config version is `3`.
    */
  var configVersion: js.UndefOr[Double] = js.native
  /**
    * Context configuration.
    */
  var context: js.UndefOr[Schema$Context] = js.native
  /**
    * Configuration for the service control plane.
    */
  var control: js.UndefOr[Schema$Control] = js.native
  /**
    * Custom error configuration.
    */
  var customError: js.UndefOr[Schema$CustomError] = js.native
  /**
    * Additional API documentation.
    */
  var documentation: js.UndefOr[Schema$Documentation] = js.native
  /**
    * Configuration for network endpoints.  If this is empty, then an endpoint
    * with the same name as the service is automatically generated to service
    * all defined APIs.
    */
  var endpoints: js.UndefOr[js.Array[Schema$Endpoint]] = js.native
  /**
    * A list of all enum types included in this API service.  Enums referenced
    * directly or indirectly by the `apis` are automatically included.  Enums
    * which are not referenced but shall be included should be listed here by
    * name. Example:      enums:     - name: google.someapi.v1.SomeEnum
    */
  var enums: js.UndefOr[js.Array[Schema$Enum]] = js.native
  /**
    * Experimental configuration.
    */
  var experimental: js.UndefOr[Schema$Experimental] = js.native
  /**
    * HTTP configuration.
    */
  var http: js.UndefOr[Schema$Http] = js.native
  /**
    * A unique ID for a specific instance of this message, typically assigned
    * by the client for tracking purpose. If empty, the server may choose to
    * generate one instead. Must be no longer than 60 characters.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Logging configuration.
    */
  var logging: js.UndefOr[Schema$Logging] = js.native
  /**
    * Defines the logs used by this service.
    */
  var logs: js.UndefOr[js.Array[Schema$LogDescriptor]] = js.native
  /**
    * Defines the metrics used by this service.
    */
  var metrics: js.UndefOr[js.Array[Schema$MetricDescriptor]] = js.native
  /**
    * Defines the monitored resources used by this service. This is required by
    * the Service.monitoring and Service.logging configurations.
    */
  var monitoredResources: js.UndefOr[js.Array[Schema$MonitoredResourceDescriptor]] = js.native
  /**
    * Monitoring configuration.
    */
  var monitoring: js.UndefOr[Schema$Monitoring] = js.native
  /**
    * The service name, which is a DNS-like logical identifier for the service,
    * such as `calendar.googleapis.com`. The service name typically goes
    * through DNS verification to make sure the owner of the service also owns
    * the DNS name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The Google project that owns this service.
    */
  var producerProjectId: js.UndefOr[String] = js.native
  /**
    * Quota configuration.
    */
  var quota: js.UndefOr[Schema$Quota] = js.native
  /**
    * Output only. The source information for this configuration if available.
    */
  var sourceInfo: js.UndefOr[Schema$SourceInfo] = js.native
  /**
    * System parameter configuration.
    */
  var systemParameters: js.UndefOr[Schema$SystemParameters] = js.native
  /**
    * A list of all proto message types included in this API service. It serves
    * similar purpose as [google.api.Service.types], except that these types
    * are not needed by user-defined APIs. Therefore, they will not show up in
    * the generated discovery doc. This field should only be used to define
    * system APIs in ESF.
    */
  var systemTypes: js.UndefOr[js.Array[Schema$Type]] = js.native
  /**
    * The product title for this service.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * A list of all proto message types included in this API service. Types
    * referenced directly or indirectly by the `apis` are automatically
    * included.  Messages which are not referenced but shall be included, such
    * as types used by the `google.protobuf.Any` type, should be listed here by
    * name. Example:      types:     - name: google.protobuf.Int32
    */
  var types: js.UndefOr[js.Array[Schema$Type]] = js.native
  /**
    * Configuration controlling usage of this service.
    */
  var usage: js.UndefOr[Schema$Usage] = js.native
}

object Schema$Service {
  @scala.inline
  def apply(
    apis: js.Array[Schema$Api] = null,
    authentication: Schema$Authentication = null,
    backend: Schema$Backend = null,
    billing: Schema$Billing = null,
    configVersion: Int | Double = null,
    context: Schema$Context = null,
    control: Schema$Control = null,
    customError: Schema$CustomError = null,
    documentation: Schema$Documentation = null,
    endpoints: js.Array[Schema$Endpoint] = null,
    enums: js.Array[Schema$Enum] = null,
    experimental: Schema$Experimental = null,
    http: Schema$Http = null,
    id: String = null,
    logging: Schema$Logging = null,
    logs: js.Array[Schema$LogDescriptor] = null,
    metrics: js.Array[Schema$MetricDescriptor] = null,
    monitoredResources: js.Array[Schema$MonitoredResourceDescriptor] = null,
    monitoring: Schema$Monitoring = null,
    name: String = null,
    producerProjectId: String = null,
    quota: Schema$Quota = null,
    sourceInfo: Schema$SourceInfo = null,
    systemParameters: Schema$SystemParameters = null,
    systemTypes: js.Array[Schema$Type] = null,
    title: String = null,
    types: js.Array[Schema$Type] = null,
    usage: Schema$Usage = null
  ): Schema$Service = {
    val __obj = js.Dynamic.literal()
    if (apis != null) __obj.updateDynamic("apis")(apis.asInstanceOf[js.Any])
    if (authentication != null) __obj.updateDynamic("authentication")(authentication.asInstanceOf[js.Any])
    if (backend != null) __obj.updateDynamic("backend")(backend.asInstanceOf[js.Any])
    if (billing != null) __obj.updateDynamic("billing")(billing.asInstanceOf[js.Any])
    if (configVersion != null) __obj.updateDynamic("configVersion")(configVersion.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[Schema$Service]
  }
}

