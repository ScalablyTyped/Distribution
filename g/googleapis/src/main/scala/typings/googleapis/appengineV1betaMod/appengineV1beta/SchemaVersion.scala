package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVersion extends StObject {
  
  /**
    * Serving configuration for Google Cloud Endpoints (https://cloud.google.com/appengine/docs/python/endpoints/).Only returned in GET requests if view=FULL is set.
    */
  var apiConfig: js.UndefOr[SchemaApiConfigHandler] = js.undefined
  
  /**
    * Allows App Engine second generation runtimes to access the legacy bundled services.
    */
  var appEngineApis: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Automatic scaling is based on request rate, response latencies, and other application metrics. Instances are dynamically created and destroyed as needed in order to handle traffic.
    */
  var automaticScaling: js.UndefOr[SchemaAutomaticScaling] = js.undefined
  
  /**
    * A service with basic scaling will create an instance when the application receives a request. The instance will be turned down when the app becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
    */
  var basicScaling: js.UndefOr[SchemaBasicScaling] = js.undefined
  
  /**
    * Metadata settings that are supplied to this version to enable beta runtime features.
    */
  var betaSettings: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Environment variables available to the build environment.Only returned in GET requests if view=FULL is set.
    */
  var buildEnvVariables: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Time that this version was created.@OutputOnly
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Email address of the user who created this version.@OutputOnly
    */
  var createdBy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Duration that static files should be cached by web proxies and browsers. Only applicable if the corresponding StaticFilesHandler (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1beta/apps.services.versions#StaticFilesHandler) does not specify its own expiration time.Only returned in GET requests if view=FULL is set.
    */
  var defaultExpiration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Code and application artifacts that make up this version.Only returned in GET requests if view=FULL is set.
    */
  var deployment: js.UndefOr[SchemaDeployment] = js.undefined
  
  /**
    * Total size in bytes of all the files that are included in this version and currently hosted on the App Engine disk.@OutputOnly
    */
  var diskUsageBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cloud Endpoints configuration.If endpoints_api_service is set, the Cloud Endpoints Extensible Service Proxy will be provided to serve the API implemented by the app.
    */
  var endpointsApiService: js.UndefOr[SchemaEndpointsApiService] = js.undefined
  
  /**
    * The entrypoint for the application.
    */
  var entrypoint: js.UndefOr[SchemaEntrypoint] = js.undefined
  
  /**
    * App Engine execution environment for this version.Defaults to standard.
    */
  var env: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Environment variables available to the application.Only returned in GET requests if view=FULL is set.
    */
  var envVariables: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Custom static error pages. Limited to 10KB per page.Only returned in GET requests if view=FULL is set.
    */
  var errorHandlers: js.UndefOr[js.Array[SchemaErrorHandler]] = js.undefined
  
  /**
    * An ordered list of URL-matching patterns that should be applied to incoming requests. The first matching URL handles the request and other request handlers are not attempted.Only returned in GET requests if view=FULL is set.
    */
  var handlers: js.UndefOr[js.Array[SchemaUrlMap]] = js.undefined
  
  /**
    * Configures health checking for instances. Unhealthy instances are stopped and replaced with new instances. Only applicable in the App Engine flexible environment.Only returned in GET requests if view=FULL is set.
    */
  var healthCheck: js.UndefOr[SchemaHealthCheck] = js.undefined
  
  /**
    * Relative name of the version within the service. Example: v1. Version names can contain only lowercase letters, numbers, or hyphens. Reserved names: "default", "latest", and any name with the prefix "ah-".
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Before an application can receive email or XMPP messages, the application must be configured to enable the service.
    */
  var inboundServices: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Instance class that is used to run this version. Valid values are: AutomaticScaling: F1, F2, F4, F4_1G ManualScaling or BasicScaling: B1, B2, B4, B8, B4_1GDefaults to F1 for AutomaticScaling and B1 for ManualScaling or BasicScaling.
    */
  var instanceClass: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration for third-party Python runtime libraries that are required by the application.Only returned in GET requests if view=FULL is set.
    */
  var libraries: js.UndefOr[js.Array[SchemaLibrary]] = js.undefined
  
  /**
    * Configures liveness health checking for instances. Unhealthy instances are stopped and replaced with new instancesOnly returned in GET requests if view=FULL is set.
    */
  var livenessCheck: js.UndefOr[SchemaLivenessCheck] = js.undefined
  
  /**
    * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time. Manually scaled versions are sometimes referred to as "backends".
    */
  var manualScaling: js.UndefOr[SchemaManualScaling] = js.undefined
  
  /**
    * Full path to the Version resource in the API. Example: apps/myapp/services/default/versions/v1.@OutputOnly
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Extra network settings. Only applicable in the App Engine flexible environment.
    */
  var network: js.UndefOr[SchemaNetwork] = js.undefined
  
  /**
    * Files that match this pattern will not be built into this version. Only applicable for Go runtimes.Only returned in GET requests if view=FULL is set.
    */
  var nobuildFilesRegex: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configures readiness health checking for instances. Unhealthy instances are not put into the backend traffic rotation.Only returned in GET requests if view=FULL is set.
    */
  var readinessCheck: js.UndefOr[SchemaReadinessCheck] = js.undefined
  
  /**
    * Machine resources for this version. Only applicable in the App Engine flexible environment.
    */
  var resources: js.UndefOr[SchemaResources] = js.undefined
  
  /**
    * Desired runtime. Example: python27.
    */
  var runtime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version of the API in the given runtime environment. Please see the app.yaml reference for valid values at https://cloud.google.com/appengine/docs/standard//config/appref
    */
  var runtimeApiVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The channel of the runtime to use. Only available for some runtimes. Defaults to the default channel.
    */
  var runtimeChannel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The path or name of the app's main executable.
    */
  var runtimeMainExecutablePath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The identity that the deployed version will run as. Admin API will use the App Engine Appspot service account as default if this field is neither provided in app.yaml file nor through CLI flag.
    */
  var serviceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Current serving status of this version. Only the versions with a SERVING status create instances and can be billed.SERVING_STATUS_UNSPECIFIED is an invalid value. Defaults to SERVING.
    */
  var servingStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether multiple requests can be dispatched to this version at once.
    */
  var threadsafe: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Serving URL for this version. Example: "https://myversion-dot-myservice-dot-myapp.appspot.com"@OutputOnly
    */
  var versionUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to deploy this version in a container on a virtual machine.
    */
  var vm: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Enables VPC connectivity for standard apps.
    */
  var vpcAccessConnector: js.UndefOr[SchemaVpcAccessConnector] = js.undefined
  
  /**
    * The Google Compute Engine zones that are supported by this version in the App Engine flexible environment. Deprecated.
    */
  var zones: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaVersion {
  
  inline def apply(): SchemaVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVersion]
  }
  
  extension [Self <: SchemaVersion](x: Self) {
    
    inline def setApiConfig(value: SchemaApiConfigHandler): Self = StObject.set(x, "apiConfig", value.asInstanceOf[js.Any])
    
    inline def setApiConfigUndefined: Self = StObject.set(x, "apiConfig", js.undefined)
    
    inline def setAppEngineApis(value: Boolean): Self = StObject.set(x, "appEngineApis", value.asInstanceOf[js.Any])
    
    inline def setAppEngineApisNull: Self = StObject.set(x, "appEngineApis", null)
    
    inline def setAppEngineApisUndefined: Self = StObject.set(x, "appEngineApis", js.undefined)
    
    inline def setAutomaticScaling(value: SchemaAutomaticScaling): Self = StObject.set(x, "automaticScaling", value.asInstanceOf[js.Any])
    
    inline def setAutomaticScalingUndefined: Self = StObject.set(x, "automaticScaling", js.undefined)
    
    inline def setBasicScaling(value: SchemaBasicScaling): Self = StObject.set(x, "basicScaling", value.asInstanceOf[js.Any])
    
    inline def setBasicScalingUndefined: Self = StObject.set(x, "basicScaling", js.undefined)
    
    inline def setBetaSettings(value: StringDictionary[String]): Self = StObject.set(x, "betaSettings", value.asInstanceOf[js.Any])
    
    inline def setBetaSettingsNull: Self = StObject.set(x, "betaSettings", null)
    
    inline def setBetaSettingsUndefined: Self = StObject.set(x, "betaSettings", js.undefined)
    
    inline def setBuildEnvVariables(value: StringDictionary[String]): Self = StObject.set(x, "buildEnvVariables", value.asInstanceOf[js.Any])
    
    inline def setBuildEnvVariablesNull: Self = StObject.set(x, "buildEnvVariables", null)
    
    inline def setBuildEnvVariablesUndefined: Self = StObject.set(x, "buildEnvVariables", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setDefaultExpiration(value: String): Self = StObject.set(x, "defaultExpiration", value.asInstanceOf[js.Any])
    
    inline def setDefaultExpirationNull: Self = StObject.set(x, "defaultExpiration", null)
    
    inline def setDefaultExpirationUndefined: Self = StObject.set(x, "defaultExpiration", js.undefined)
    
    inline def setDeployment(value: SchemaDeployment): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    inline def setDiskUsageBytes(value: String): Self = StObject.set(x, "diskUsageBytes", value.asInstanceOf[js.Any])
    
    inline def setDiskUsageBytesNull: Self = StObject.set(x, "diskUsageBytes", null)
    
    inline def setDiskUsageBytesUndefined: Self = StObject.set(x, "diskUsageBytes", js.undefined)
    
    inline def setEndpointsApiService(value: SchemaEndpointsApiService): Self = StObject.set(x, "endpointsApiService", value.asInstanceOf[js.Any])
    
    inline def setEndpointsApiServiceUndefined: Self = StObject.set(x, "endpointsApiService", js.undefined)
    
    inline def setEntrypoint(value: SchemaEntrypoint): Self = StObject.set(x, "entrypoint", value.asInstanceOf[js.Any])
    
    inline def setEntrypointUndefined: Self = StObject.set(x, "entrypoint", js.undefined)
    
    inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvNull: Self = StObject.set(x, "env", null)
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setEnvVariables(value: StringDictionary[String]): Self = StObject.set(x, "envVariables", value.asInstanceOf[js.Any])
    
    inline def setEnvVariablesNull: Self = StObject.set(x, "envVariables", null)
    
    inline def setEnvVariablesUndefined: Self = StObject.set(x, "envVariables", js.undefined)
    
    inline def setErrorHandlers(value: js.Array[SchemaErrorHandler]): Self = StObject.set(x, "errorHandlers", value.asInstanceOf[js.Any])
    
    inline def setErrorHandlersUndefined: Self = StObject.set(x, "errorHandlers", js.undefined)
    
    inline def setErrorHandlersVarargs(value: SchemaErrorHandler*): Self = StObject.set(x, "errorHandlers", js.Array(value*))
    
    inline def setHandlers(value: js.Array[SchemaUrlMap]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    
    inline def setHandlersVarargs(value: SchemaUrlMap*): Self = StObject.set(x, "handlers", js.Array(value*))
    
    inline def setHealthCheck(value: SchemaHealthCheck): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInboundServices(value: js.Array[String]): Self = StObject.set(x, "inboundServices", value.asInstanceOf[js.Any])
    
    inline def setInboundServicesNull: Self = StObject.set(x, "inboundServices", null)
    
    inline def setInboundServicesUndefined: Self = StObject.set(x, "inboundServices", js.undefined)
    
    inline def setInboundServicesVarargs(value: String*): Self = StObject.set(x, "inboundServices", js.Array(value*))
    
    inline def setInstanceClass(value: String): Self = StObject.set(x, "instanceClass", value.asInstanceOf[js.Any])
    
    inline def setInstanceClassNull: Self = StObject.set(x, "instanceClass", null)
    
    inline def setInstanceClassUndefined: Self = StObject.set(x, "instanceClass", js.undefined)
    
    inline def setLibraries(value: js.Array[SchemaLibrary]): Self = StObject.set(x, "libraries", value.asInstanceOf[js.Any])
    
    inline def setLibrariesUndefined: Self = StObject.set(x, "libraries", js.undefined)
    
    inline def setLibrariesVarargs(value: SchemaLibrary*): Self = StObject.set(x, "libraries", js.Array(value*))
    
    inline def setLivenessCheck(value: SchemaLivenessCheck): Self = StObject.set(x, "livenessCheck", value.asInstanceOf[js.Any])
    
    inline def setLivenessCheckUndefined: Self = StObject.set(x, "livenessCheck", js.undefined)
    
    inline def setManualScaling(value: SchemaManualScaling): Self = StObject.set(x, "manualScaling", value.asInstanceOf[js.Any])
    
    inline def setManualScalingUndefined: Self = StObject.set(x, "manualScaling", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetwork(value: SchemaNetwork): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNobuildFilesRegex(value: String): Self = StObject.set(x, "nobuildFilesRegex", value.asInstanceOf[js.Any])
    
    inline def setNobuildFilesRegexNull: Self = StObject.set(x, "nobuildFilesRegex", null)
    
    inline def setNobuildFilesRegexUndefined: Self = StObject.set(x, "nobuildFilesRegex", js.undefined)
    
    inline def setReadinessCheck(value: SchemaReadinessCheck): Self = StObject.set(x, "readinessCheck", value.asInstanceOf[js.Any])
    
    inline def setReadinessCheckUndefined: Self = StObject.set(x, "readinessCheck", js.undefined)
    
    inline def setResources(value: SchemaResources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeApiVersion(value: String): Self = StObject.set(x, "runtimeApiVersion", value.asInstanceOf[js.Any])
    
    inline def setRuntimeApiVersionNull: Self = StObject.set(x, "runtimeApiVersion", null)
    
    inline def setRuntimeApiVersionUndefined: Self = StObject.set(x, "runtimeApiVersion", js.undefined)
    
    inline def setRuntimeChannel(value: String): Self = StObject.set(x, "runtimeChannel", value.asInstanceOf[js.Any])
    
    inline def setRuntimeChannelNull: Self = StObject.set(x, "runtimeChannel", null)
    
    inline def setRuntimeChannelUndefined: Self = StObject.set(x, "runtimeChannel", js.undefined)
    
    inline def setRuntimeMainExecutablePath(value: String): Self = StObject.set(x, "runtimeMainExecutablePath", value.asInstanceOf[js.Any])
    
    inline def setRuntimeMainExecutablePathNull: Self = StObject.set(x, "runtimeMainExecutablePath", null)
    
    inline def setRuntimeMainExecutablePathUndefined: Self = StObject.set(x, "runtimeMainExecutablePath", js.undefined)
    
    inline def setRuntimeNull: Self = StObject.set(x, "runtime", null)
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountNull: Self = StObject.set(x, "serviceAccount", null)
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setServingStatus(value: String): Self = StObject.set(x, "servingStatus", value.asInstanceOf[js.Any])
    
    inline def setServingStatusNull: Self = StObject.set(x, "servingStatus", null)
    
    inline def setServingStatusUndefined: Self = StObject.set(x, "servingStatus", js.undefined)
    
    inline def setThreadsafe(value: Boolean): Self = StObject.set(x, "threadsafe", value.asInstanceOf[js.Any])
    
    inline def setThreadsafeNull: Self = StObject.set(x, "threadsafe", null)
    
    inline def setThreadsafeUndefined: Self = StObject.set(x, "threadsafe", js.undefined)
    
    inline def setVersionUrl(value: String): Self = StObject.set(x, "versionUrl", value.asInstanceOf[js.Any])
    
    inline def setVersionUrlNull: Self = StObject.set(x, "versionUrl", null)
    
    inline def setVersionUrlUndefined: Self = StObject.set(x, "versionUrl", js.undefined)
    
    inline def setVm(value: Boolean): Self = StObject.set(x, "vm", value.asInstanceOf[js.Any])
    
    inline def setVmNull: Self = StObject.set(x, "vm", null)
    
    inline def setVmUndefined: Self = StObject.set(x, "vm", js.undefined)
    
    inline def setVpcAccessConnector(value: SchemaVpcAccessConnector): Self = StObject.set(x, "vpcAccessConnector", value.asInstanceOf[js.Any])
    
    inline def setVpcAccessConnectorUndefined: Self = StObject.set(x, "vpcAccessConnector", js.undefined)
    
    inline def setZones(value: js.Array[String]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    inline def setZonesNull: Self = StObject.set(x, "zones", null)
    
    inline def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    inline def setZonesVarargs(value: String*): Self = StObject.set(x, "zones", js.Array(value*))
  }
}
