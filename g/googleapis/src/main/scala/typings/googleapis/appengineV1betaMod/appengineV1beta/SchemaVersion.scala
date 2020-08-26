package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Version resource is a specific set of source code and configuration files
  * that are deployed into a service.
  */
@js.native
trait SchemaVersion extends js.Object {
  /**
    * Serving configuration for Google Cloud Endpoints
    * (https://cloud.google.com/appengine/docs/python/endpoints/).Only returned
    * in GET requests if view=FULL is set.
    */
  var apiConfig: js.UndefOr[SchemaApiConfigHandler] = js.native
  /**
    * Automatic scaling is based on request rate, response latencies, and other
    * application metrics.
    */
  var automaticScaling: js.UndefOr[SchemaAutomaticScaling] = js.native
  /**
    * A service with basic scaling will create an instance when the application
    * receives a request. The instance will be turned down when the app becomes
    * idle. Basic scaling is ideal for work that is intermittent or driven by
    * user activity.
    */
  var basicScaling: js.UndefOr[SchemaBasicScaling] = js.native
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
    * (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#StaticFilesHandler)
    * does not specify its own expiration time.Only returned in GET requests if
    * view=FULL is set.
    */
  var defaultExpiration: js.UndefOr[String] = js.native
  /**
    * Code and application artifacts that make up this version.Only returned in
    * GET requests if view=FULL is set.
    */
  var deployment: js.UndefOr[SchemaDeployment] = js.native
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
  var endpointsApiService: js.UndefOr[SchemaEndpointsApiService] = js.native
  /**
    * The entrypoint for the application.
    */
  var entrypoint: js.UndefOr[SchemaEntrypoint] = js.native
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
  var errorHandlers: js.UndefOr[js.Array[SchemaErrorHandler]] = js.native
  /**
    * An ordered list of URL-matching patterns that should be applied to
    * incoming requests. The first matching URL handles the request and other
    * request handlers are not attempted.Only returned in GET requests if
    * view=FULL is set.
    */
  var handlers: js.UndefOr[js.Array[SchemaUrlMap]] = js.native
  /**
    * Configures health checking for instances. Unhealthy instances are stopped
    * and replaced with new instances. Only applicable in the App Engine
    * flexible environment.Only returned in GET requests if view=FULL is set.
    */
  var healthCheck: js.UndefOr[SchemaHealthCheck] = js.native
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
  var libraries: js.UndefOr[js.Array[SchemaLibrary]] = js.native
  /**
    * Configures liveness health checking for instances. Unhealthy instances
    * are stopped and replaced with new instancesOnly returned in GET requests
    * if view=FULL is set.
    */
  var livenessCheck: js.UndefOr[SchemaLivenessCheck] = js.native
  /**
    * A service with manual scaling runs continuously, allowing you to perform
    * complex initialization and rely on the state of its memory over time.
    */
  var manualScaling: js.UndefOr[SchemaManualScaling] = js.native
  /**
    * Full path to the Version resource in the API. Example:
    * apps/myapp/services/default/versions/v1.@OutputOnly
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Extra network settings. Only applicable in the App Engine flexible
    * environment.
    */
  var network: js.UndefOr[SchemaNetwork] = js.native
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
  var readinessCheck: js.UndefOr[SchemaReadinessCheck] = js.native
  /**
    * Machine resources for this version. Only applicable in the App Engine
    * flexible environment.
    */
  var resources: js.UndefOr[SchemaResources] = js.native
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
  var vpcAccessConnector: js.UndefOr[SchemaVpcAccessConnector] = js.native
  /**
    * The Google Compute Engine zones that are supported by this version in the
    * App Engine flexible environment. Deprecated.
    */
  var zones: js.UndefOr[js.Array[String]] = js.native
}

object SchemaVersion {
  @scala.inline
  def apply(): SchemaVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersion]
  }
  @scala.inline
  implicit class SchemaVersionOps[Self <: SchemaVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiConfig(value: SchemaApiConfigHandler): Self = this.set("apiConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiConfig: Self = this.set("apiConfig", js.undefined)
    @scala.inline
    def setAutomaticScaling(value: SchemaAutomaticScaling): Self = this.set("automaticScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticScaling: Self = this.set("automaticScaling", js.undefined)
    @scala.inline
    def setBasicScaling(value: SchemaBasicScaling): Self = this.set("basicScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasicScaling: Self = this.set("basicScaling", js.undefined)
    @scala.inline
    def setBetaSettings(value: StringDictionary[String]): Self = this.set("betaSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBetaSettings: Self = this.set("betaSettings", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setCreatedBy(value: String): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    @scala.inline
    def setDefaultExpiration(value: String): Self = this.set("defaultExpiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultExpiration: Self = this.set("defaultExpiration", js.undefined)
    @scala.inline
    def setDeployment(value: SchemaDeployment): Self = this.set("deployment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeployment: Self = this.set("deployment", js.undefined)
    @scala.inline
    def setDiskUsageBytes(value: String): Self = this.set("diskUsageBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskUsageBytes: Self = this.set("diskUsageBytes", js.undefined)
    @scala.inline
    def setEndpointsApiService(value: SchemaEndpointsApiService): Self = this.set("endpointsApiService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointsApiService: Self = this.set("endpointsApiService", js.undefined)
    @scala.inline
    def setEntrypoint(value: SchemaEntrypoint): Self = this.set("entrypoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntrypoint: Self = this.set("entrypoint", js.undefined)
    @scala.inline
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setEnvVariables(value: StringDictionary[String]): Self = this.set("envVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvVariables: Self = this.set("envVariables", js.undefined)
    @scala.inline
    def setErrorHandlersVarargs(value: SchemaErrorHandler*): Self = this.set("errorHandlers", js.Array(value :_*))
    @scala.inline
    def setErrorHandlers(value: js.Array[SchemaErrorHandler]): Self = this.set("errorHandlers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorHandlers: Self = this.set("errorHandlers", js.undefined)
    @scala.inline
    def setHandlersVarargs(value: SchemaUrlMap*): Self = this.set("handlers", js.Array(value :_*))
    @scala.inline
    def setHandlers(value: js.Array[SchemaUrlMap]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
    @scala.inline
    def setHealthCheck(value: SchemaHealthCheck): Self = this.set("healthCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthCheck: Self = this.set("healthCheck", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInboundServicesVarargs(value: String*): Self = this.set("inboundServices", js.Array(value :_*))
    @scala.inline
    def setInboundServices(value: js.Array[String]): Self = this.set("inboundServices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInboundServices: Self = this.set("inboundServices", js.undefined)
    @scala.inline
    def setInstanceClass(value: String): Self = this.set("instanceClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceClass: Self = this.set("instanceClass", js.undefined)
    @scala.inline
    def setLibrariesVarargs(value: SchemaLibrary*): Self = this.set("libraries", js.Array(value :_*))
    @scala.inline
    def setLibraries(value: js.Array[SchemaLibrary]): Self = this.set("libraries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLibraries: Self = this.set("libraries", js.undefined)
    @scala.inline
    def setLivenessCheck(value: SchemaLivenessCheck): Self = this.set("livenessCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLivenessCheck: Self = this.set("livenessCheck", js.undefined)
    @scala.inline
    def setManualScaling(value: SchemaManualScaling): Self = this.set("manualScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualScaling: Self = this.set("manualScaling", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetwork(value: SchemaNetwork): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setNobuildFilesRegex(value: String): Self = this.set("nobuildFilesRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNobuildFilesRegex: Self = this.set("nobuildFilesRegex", js.undefined)
    @scala.inline
    def setReadinessCheck(value: SchemaReadinessCheck): Self = this.set("readinessCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadinessCheck: Self = this.set("readinessCheck", js.undefined)
    @scala.inline
    def setResources(value: SchemaResources): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setRuntime(value: String): Self = this.set("runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntime: Self = this.set("runtime", js.undefined)
    @scala.inline
    def setRuntimeApiVersion(value: String): Self = this.set("runtimeApiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeApiVersion: Self = this.set("runtimeApiVersion", js.undefined)
    @scala.inline
    def setRuntimeChannel(value: String): Self = this.set("runtimeChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeChannel: Self = this.set("runtimeChannel", js.undefined)
    @scala.inline
    def setRuntimeMainExecutablePath(value: String): Self = this.set("runtimeMainExecutablePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeMainExecutablePath: Self = this.set("runtimeMainExecutablePath", js.undefined)
    @scala.inline
    def setServingStatus(value: String): Self = this.set("servingStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServingStatus: Self = this.set("servingStatus", js.undefined)
    @scala.inline
    def setThreadsafe(value: Boolean): Self = this.set("threadsafe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreadsafe: Self = this.set("threadsafe", js.undefined)
    @scala.inline
    def setVersionUrl(value: String): Self = this.set("versionUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionUrl: Self = this.set("versionUrl", js.undefined)
    @scala.inline
    def setVm(value: Boolean): Self = this.set("vm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVm: Self = this.set("vm", js.undefined)
    @scala.inline
    def setVpcAccessConnector(value: SchemaVpcAccessConnector): Self = this.set("vpcAccessConnector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcAccessConnector: Self = this.set("vpcAccessConnector", js.undefined)
    @scala.inline
    def setZonesVarargs(value: String*): Self = this.set("zones", js.Array(value :_*))
    @scala.inline
    def setZones(value: js.Array[String]): Self = this.set("zones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZones: Self = this.set("zones", js.undefined)
  }
  
}

