package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Version resource is a specific set of source code and configuration files
  * that are deployed into a service.
  */
@js.native
trait Schema$Version extends js.Object {
  /**
    * Serving configuration for Google Cloud Endpoints
    * (https://cloud.google.com/appengine/docs/python/endpoints/).Only returned
    * in GET requests if view=FULL is set.
    */
  var apiConfig: js.UndefOr[Schema$ApiConfigHandler] = js.native
  /**
    * Automatic scaling is based on request rate, response latencies, and other
    * application metrics.
    */
  var automaticScaling: js.UndefOr[Schema$AutomaticScaling] = js.native
  /**
    * A service with basic scaling will create an instance when the application
    * receives a request. The instance will be turned down when the app becomes
    * idle. Basic scaling is ideal for work that is intermittent or driven by
    * user activity.
    */
  var basicScaling: js.UndefOr[Schema$BasicScaling] = js.native
  /**
    * Metadata settings that are supplied to this version to enable beta
    * runtime features.
    */
  var betaSettings: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Time that this version was created.@OutputOnly
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Email address of the user who created this version.@OutputOnly
    */
  var createdBy: js.UndefOr[String] = js.native
  /**
    * Duration that static files should be cached by web proxies and browsers.
    * Only applicable if the corresponding StaticFilesHandler
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#StaticFilesHandler)
    * does not specify its own expiration time.Only returned in GET requests if
    * view=FULL is set.
    */
  var defaultExpiration: js.UndefOr[String] = js.native
  /**
    * Code and application artifacts that make up this version.Only returned in
    * GET requests if view=FULL is set.
    */
  var deployment: js.UndefOr[Schema$Deployment] = js.native
  /**
    * Total size in bytes of all the files that are included in this version
    * and currently hosted on the App Engine disk.@OutputOnly
    */
  var diskUsageBytes: js.UndefOr[String] = js.native
  /**
    * Cloud Endpoints configuration.If endpoints_api_service is set, the Cloud
    * Endpoints Extensible Service Proxy will be provided to serve the API
    * implemented by the app.
    */
  var endpointsApiService: js.UndefOr[Schema$EndpointsApiService] = js.native
  /**
    * The entrypoint for the application.
    */
  var entrypoint: js.UndefOr[Schema$Entrypoint] = js.native
  /**
    * App Engine execution environment for this version.Defaults to standard.
    */
  var env: js.UndefOr[String] = js.native
  /**
    * Environment variables available to the application.Only returned in GET
    * requests if view=FULL is set.
    */
  var envVariables: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Custom static error pages. Limited to 10KB per page.Only returned in GET
    * requests if view=FULL is set.
    */
  var errorHandlers: js.UndefOr[js.Array[Schema$ErrorHandler]] = js.native
  /**
    * An ordered list of URL-matching patterns that should be applied to
    * incoming requests. The first matching URL handles the request and other
    * request handlers are not attempted.Only returned in GET requests if
    * view=FULL is set.
    */
  var handlers: js.UndefOr[js.Array[Schema$UrlMap]] = js.native
  /**
    * Configures health checking for instances. Unhealthy instances are stopped
    * and replaced with new instances. Only applicable in the App Engine
    * flexible environment.Only returned in GET requests if view=FULL is set.
    */
  var healthCheck: js.UndefOr[Schema$HealthCheck] = js.native
  /**
    * Relative name of the version within the service. Example: v1. Version
    * names can contain only lowercase letters, numbers, or hyphens. Reserved
    * names: &quot;default&quot;, &quot;latest&quot;, and any name with the
    * prefix &quot;ah-&quot;.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Before an application can receive email or XMPP messages, the application
    * must be configured to enable the service.
    */
  var inboundServices: js.UndefOr[js.Array[String]] = js.native
  /**
    * Instance class that is used to run this version. Valid values are:
    * AutomaticScaling: F1, F2, F4, F4_1G ManualScaling or BasicScaling: B1,
    * B2, B4, B8, B4_1GDefaults to F1 for AutomaticScaling and B1 for
    * ManualScaling or BasicScaling.
    */
  var instanceClass: js.UndefOr[String] = js.native
  /**
    * Configuration for third-party Python runtime libraries that are required
    * by the application.Only returned in GET requests if view=FULL is set.
    */
  var libraries: js.UndefOr[js.Array[Schema$Library]] = js.native
  /**
    * Configures liveness health checking for instances. Unhealthy instances
    * are stopped and replaced with new instancesOnly returned in GET requests
    * if view=FULL is set.
    */
  var livenessCheck: js.UndefOr[Schema$LivenessCheck] = js.native
  /**
    * A service with manual scaling runs continuously, allowing you to perform
    * complex initialization and rely on the state of its memory over time.
    */
  var manualScaling: js.UndefOr[Schema$ManualScaling] = js.native
  /**
    * Full path to the Version resource in the API. Example:
    * apps/myapp/services/default/versions/v1.@OutputOnly
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Extra network settings. Only applicable in the App Engine flexible
    * environment.
    */
  var network: js.UndefOr[Schema$Network] = js.native
  /**
    * Files that match this pattern will not be built into this version. Only
    * applicable for Go runtimes.Only returned in GET requests if view=FULL is
    * set.
    */
  var nobuildFilesRegex: js.UndefOr[String] = js.native
  /**
    * Configures readiness health checking for instances. Unhealthy instances
    * are not put into the backend traffic rotation.Only returned in GET
    * requests if view=FULL is set.
    */
  var readinessCheck: js.UndefOr[Schema$ReadinessCheck] = js.native
  /**
    * Machine resources for this version. Only applicable in the App Engine
    * flexible environment.
    */
  var resources: js.UndefOr[Schema$Resources] = js.native
  /**
    * Desired runtime. Example: python27.
    */
  var runtime: js.UndefOr[String] = js.native
  /**
    * The version of the API in the given runtime environment. Please see the
    * app.yaml reference for valid values at
    * https://cloud.google.com/appengine/docs/standard/&lt;language&gt;/config/appref
    */
  var runtimeApiVersion: js.UndefOr[String] = js.native
  /**
    * The channel of the runtime to use. Only available for some runtimes.
    * Defaults to the default channel.
    */
  var runtimeChannel: js.UndefOr[String] = js.native
  /**
    * The path or name of the app&#39;s main executable.
    */
  var runtimeMainExecutablePath: js.UndefOr[String] = js.native
  /**
    * Current serving status of this version. Only the versions with a SERVING
    * status create instances and can be billed.SERVING_STATUS_UNSPECIFIED is
    * an invalid value. Defaults to SERVING.
    */
  var servingStatus: js.UndefOr[String] = js.native
  /**
    * Whether multiple requests can be dispatched to this version at once.
    */
  var threadsafe: js.UndefOr[Boolean] = js.native
  /**
    * Serving URL for this version. Example:
    * &quot;https://myversion-dot-myservice-dot-myapp.appspot.com&quot;@OutputOnly
    */
  var versionUrl: js.UndefOr[String] = js.native
  /**
    * Whether to deploy this version in a container on a virtual machine.
    */
  var vm: js.UndefOr[Boolean] = js.native
  /**
    * Enables VPC connectivity for standard apps.
    */
  var vpcAccessConnector: js.UndefOr[Schema$VpcAccessConnector] = js.native
  /**
    * The Google Compute Engine zones that are supported by this version in the
    * App Engine flexible environment. Deprecated.
    */
  var zones: js.UndefOr[js.Array[String]] = js.native
}

object Schema$Version {
  @scala.inline
  def apply(
    apiConfig: Schema$ApiConfigHandler = null,
    automaticScaling: Schema$AutomaticScaling = null,
    basicScaling: Schema$BasicScaling = null,
    betaSettings: StringDictionary[String] = null,
    createTime: String = null,
    createdBy: String = null,
    defaultExpiration: String = null,
    deployment: Schema$Deployment = null,
    diskUsageBytes: String = null,
    endpointsApiService: Schema$EndpointsApiService = null,
    entrypoint: Schema$Entrypoint = null,
    env: String = null,
    envVariables: StringDictionary[String] = null,
    errorHandlers: js.Array[Schema$ErrorHandler] = null,
    handlers: js.Array[Schema$UrlMap] = null,
    healthCheck: Schema$HealthCheck = null,
    id: String = null,
    inboundServices: js.Array[String] = null,
    instanceClass: String = null,
    libraries: js.Array[Schema$Library] = null,
    livenessCheck: Schema$LivenessCheck = null,
    manualScaling: Schema$ManualScaling = null,
    name: String = null,
    network: Schema$Network = null,
    nobuildFilesRegex: String = null,
    readinessCheck: Schema$ReadinessCheck = null,
    resources: Schema$Resources = null,
    runtime: String = null,
    runtimeApiVersion: String = null,
    runtimeChannel: String = null,
    runtimeMainExecutablePath: String = null,
    servingStatus: String = null,
    threadsafe: js.UndefOr[Boolean] = js.undefined,
    versionUrl: String = null,
    vm: js.UndefOr[Boolean] = js.undefined,
    vpcAccessConnector: Schema$VpcAccessConnector = null,
    zones: js.Array[String] = null
  ): Schema$Version = {
    val __obj = js.Dynamic.literal()
    if (apiConfig != null) __obj.updateDynamic("apiConfig")(apiConfig.asInstanceOf[js.Any])
    if (automaticScaling != null) __obj.updateDynamic("automaticScaling")(automaticScaling.asInstanceOf[js.Any])
    if (basicScaling != null) __obj.updateDynamic("basicScaling")(basicScaling.asInstanceOf[js.Any])
    if (betaSettings != null) __obj.updateDynamic("betaSettings")(betaSettings.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (defaultExpiration != null) __obj.updateDynamic("defaultExpiration")(defaultExpiration.asInstanceOf[js.Any])
    if (deployment != null) __obj.updateDynamic("deployment")(deployment.asInstanceOf[js.Any])
    if (diskUsageBytes != null) __obj.updateDynamic("diskUsageBytes")(diskUsageBytes.asInstanceOf[js.Any])
    if (endpointsApiService != null) __obj.updateDynamic("endpointsApiService")(endpointsApiService.asInstanceOf[js.Any])
    if (entrypoint != null) __obj.updateDynamic("entrypoint")(entrypoint.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (envVariables != null) __obj.updateDynamic("envVariables")(envVariables.asInstanceOf[js.Any])
    if (errorHandlers != null) __obj.updateDynamic("errorHandlers")(errorHandlers.asInstanceOf[js.Any])
    if (handlers != null) __obj.updateDynamic("handlers")(handlers.asInstanceOf[js.Any])
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inboundServices != null) __obj.updateDynamic("inboundServices")(inboundServices.asInstanceOf[js.Any])
    if (instanceClass != null) __obj.updateDynamic("instanceClass")(instanceClass.asInstanceOf[js.Any])
    if (libraries != null) __obj.updateDynamic("libraries")(libraries.asInstanceOf[js.Any])
    if (livenessCheck != null) __obj.updateDynamic("livenessCheck")(livenessCheck.asInstanceOf[js.Any])
    if (manualScaling != null) __obj.updateDynamic("manualScaling")(manualScaling.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (nobuildFilesRegex != null) __obj.updateDynamic("nobuildFilesRegex")(nobuildFilesRegex.asInstanceOf[js.Any])
    if (readinessCheck != null) __obj.updateDynamic("readinessCheck")(readinessCheck.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    if (runtimeApiVersion != null) __obj.updateDynamic("runtimeApiVersion")(runtimeApiVersion.asInstanceOf[js.Any])
    if (runtimeChannel != null) __obj.updateDynamic("runtimeChannel")(runtimeChannel.asInstanceOf[js.Any])
    if (runtimeMainExecutablePath != null) __obj.updateDynamic("runtimeMainExecutablePath")(runtimeMainExecutablePath.asInstanceOf[js.Any])
    if (servingStatus != null) __obj.updateDynamic("servingStatus")(servingStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(threadsafe)) __obj.updateDynamic("threadsafe")(threadsafe.asInstanceOf[js.Any])
    if (versionUrl != null) __obj.updateDynamic("versionUrl")(versionUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(vm)) __obj.updateDynamic("vm")(vm.asInstanceOf[js.Any])
    if (vpcAccessConnector != null) __obj.updateDynamic("vpcAccessConnector")(vpcAccessConnector.asInstanceOf[js.Any])
    if (zones != null) __obj.updateDynamic("zones")(zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Version]
  }
}

