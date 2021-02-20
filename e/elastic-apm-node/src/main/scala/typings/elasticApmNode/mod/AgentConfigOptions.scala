package typings.elasticApmNode.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentConfigOptions extends StObject {
  
  var abortedErrorThreshold: js.UndefOr[String] = js.native
  
  // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var active: js.UndefOr[Boolean] = js.native
  
  var addPatch: js.UndefOr[KeyValueConfig] = js.native
  
  var apiRequestSize: js.UndefOr[String] = js.native
  
  // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var apiRequestTime: js.UndefOr[String] = js.native
  
  // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var asyncHooks: js.UndefOr[Boolean] = js.native
  
  var captureBody: js.UndefOr[CaptureBody] = js.native
  
  var captureErrorLogStackTraces: js.UndefOr[CaptureErrorLogStackTraces] = js.native
  
  var captureExceptions: js.UndefOr[Boolean] = js.native
  
  var captureHeaders: js.UndefOr[Boolean] = js.native
  
  var captureSpanStackTraces: js.UndefOr[Boolean] = js.native
  
  var centralConfig: js.UndefOr[Boolean] = js.native
  
  var containerId: js.UndefOr[String] = js.native
  
  var disableInstrumentations: js.UndefOr[String | js.Array[String]] = js.native
  
  var environment: js.UndefOr[String] = js.native
  
  var errorMessageMaxLength: js.UndefOr[String] = js.native
  
  // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var errorOnAbortedRequests: js.UndefOr[Boolean] = js.native
  
  var filterHttpHeaders: js.UndefOr[Boolean] = js.native
  
  var frameworkName: js.UndefOr[String] = js.native
  
  var frameworkVersion: js.UndefOr[String] = js.native
  
  var globalLabels: js.UndefOr[KeyValueConfig] = js.native
  
  var hostname: js.UndefOr[String] = js.native
  
  var ignoreUrls: js.UndefOr[js.Array[String | RegExp]] = js.native
  
  var ignoreUserAgents: js.UndefOr[js.Array[String | RegExp]] = js.native
  
  var instrument: js.UndefOr[Boolean] = js.native
  
  var instrumentIncomingHTTPRequests: js.UndefOr[Boolean] = js.native
  
  var kubernetesNamespace: js.UndefOr[String] = js.native
  
  var kubernetesNodeName: js.UndefOr[String] = js.native
  
  var kubernetesPodName: js.UndefOr[String] = js.native
  
  var kubernetesPodUID: js.UndefOr[String] = js.native
  
  var logLevel: js.UndefOr[LogLevel] = js.native
  
  var logUncaughtExceptions: js.UndefOr[Boolean] = js.native
  
  var logger: js.UndefOr[Logger] = js.native
  
  var metricsInterval: js.UndefOr[String] = js.native
  
  // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var payloadLogFile: js.UndefOr[String] = js.native
  
  var secretToken: js.UndefOr[String] = js.native
  
  var serverCaCertFile: js.UndefOr[String] = js.native
  
  var serverTimeout: js.UndefOr[String] = js.native
  
  // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var serverUrl: js.UndefOr[String] = js.native
  
  var serviceName: js.UndefOr[String] = js.native
  
  var serviceVersion: js.UndefOr[String] = js.native
  
  var sourceLinesErrorAppFrames: js.UndefOr[Double] = js.native
  
  var sourceLinesErrorLibraryFrames: js.UndefOr[Double] = js.native
  
  var sourceLinesSpanAppFrames: js.UndefOr[Double] = js.native
  
  var sourceLinesSpanLibraryFrames: js.UndefOr[Double] = js.native
  
  var stackTraceLimit: js.UndefOr[Double] = js.native
  
  var transactionMaxSpans: js.UndefOr[Double] = js.native
  
  var transactionSampleRate: js.UndefOr[Double] = js.native
  
  var usePathAsTransactionName: js.UndefOr[Boolean] = js.native
  
  var verifyServerCert: js.UndefOr[Boolean] = js.native
}
object AgentConfigOptions {
  
  @scala.inline
  def apply(): AgentConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentConfigOptions]
  }
  
  @scala.inline
  implicit class AgentConfigOptionsMutableBuilder[Self <: AgentConfigOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortedErrorThreshold(value: String): Self = StObject.set(x, "abortedErrorThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortedErrorThresholdUndefined: Self = StObject.set(x, "abortedErrorThreshold", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAddPatch(value: KeyValueConfig): Self = StObject.set(x, "addPatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddPatchUndefined: Self = StObject.set(x, "addPatch", js.undefined)
    
    @scala.inline
    def setAddPatchVarargs(value: js.Array[LabelValue]*): Self = StObject.set(x, "addPatch", js.Array(value :_*))
    
    @scala.inline
    def setApiRequestSize(value: String): Self = StObject.set(x, "apiRequestSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiRequestSizeUndefined: Self = StObject.set(x, "apiRequestSize", js.undefined)
    
    @scala.inline
    def setApiRequestTime(value: String): Self = StObject.set(x, "apiRequestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiRequestTimeUndefined: Self = StObject.set(x, "apiRequestTime", js.undefined)
    
    @scala.inline
    def setAsyncHooks(value: Boolean): Self = StObject.set(x, "asyncHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncHooksUndefined: Self = StObject.set(x, "asyncHooks", js.undefined)
    
    @scala.inline
    def setCaptureBody(value: CaptureBody): Self = StObject.set(x, "captureBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureBodyUndefined: Self = StObject.set(x, "captureBody", js.undefined)
    
    @scala.inline
    def setCaptureErrorLogStackTraces(value: CaptureErrorLogStackTraces): Self = StObject.set(x, "captureErrorLogStackTraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureErrorLogStackTracesUndefined: Self = StObject.set(x, "captureErrorLogStackTraces", js.undefined)
    
    @scala.inline
    def setCaptureExceptions(value: Boolean): Self = StObject.set(x, "captureExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureExceptionsUndefined: Self = StObject.set(x, "captureExceptions", js.undefined)
    
    @scala.inline
    def setCaptureHeaders(value: Boolean): Self = StObject.set(x, "captureHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureHeadersUndefined: Self = StObject.set(x, "captureHeaders", js.undefined)
    
    @scala.inline
    def setCaptureSpanStackTraces(value: Boolean): Self = StObject.set(x, "captureSpanStackTraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureSpanStackTracesUndefined: Self = StObject.set(x, "captureSpanStackTraces", js.undefined)
    
    @scala.inline
    def setCentralConfig(value: Boolean): Self = StObject.set(x, "centralConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCentralConfigUndefined: Self = StObject.set(x, "centralConfig", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setDisableInstrumentations(value: String | js.Array[String]): Self = StObject.set(x, "disableInstrumentations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableInstrumentationsUndefined: Self = StObject.set(x, "disableInstrumentations", js.undefined)
    
    @scala.inline
    def setDisableInstrumentationsVarargs(value: String*): Self = StObject.set(x, "disableInstrumentations", js.Array(value :_*))
    
    @scala.inline
    def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setErrorMessageMaxLength(value: String): Self = StObject.set(x, "errorMessageMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageMaxLengthUndefined: Self = StObject.set(x, "errorMessageMaxLength", js.undefined)
    
    @scala.inline
    def setErrorOnAbortedRequests(value: Boolean): Self = StObject.set(x, "errorOnAbortedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorOnAbortedRequestsUndefined: Self = StObject.set(x, "errorOnAbortedRequests", js.undefined)
    
    @scala.inline
    def setFilterHttpHeaders(value: Boolean): Self = StObject.set(x, "filterHttpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterHttpHeadersUndefined: Self = StObject.set(x, "filterHttpHeaders", js.undefined)
    
    @scala.inline
    def setFrameworkName(value: String): Self = StObject.set(x, "frameworkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameworkNameUndefined: Self = StObject.set(x, "frameworkName", js.undefined)
    
    @scala.inline
    def setFrameworkVersion(value: String): Self = StObject.set(x, "frameworkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameworkVersionUndefined: Self = StObject.set(x, "frameworkVersion", js.undefined)
    
    @scala.inline
    def setGlobalLabels(value: KeyValueConfig): Self = StObject.set(x, "globalLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalLabelsUndefined: Self = StObject.set(x, "globalLabels", js.undefined)
    
    @scala.inline
    def setGlobalLabelsVarargs(value: js.Array[LabelValue]*): Self = StObject.set(x, "globalLabels", js.Array(value :_*))
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    @scala.inline
    def setIgnoreUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "ignoreUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUrlsUndefined: Self = StObject.set(x, "ignoreUrls", js.undefined)
    
    @scala.inline
    def setIgnoreUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "ignoreUrls", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreUserAgents(value: js.Array[String | RegExp]): Self = StObject.set(x, "ignoreUserAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUserAgentsUndefined: Self = StObject.set(x, "ignoreUserAgents", js.undefined)
    
    @scala.inline
    def setIgnoreUserAgentsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "ignoreUserAgents", js.Array(value :_*))
    
    @scala.inline
    def setInstrument(value: Boolean): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstrumentIncomingHTTPRequests(value: Boolean): Self = StObject.set(x, "instrumentIncomingHTTPRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstrumentIncomingHTTPRequestsUndefined: Self = StObject.set(x, "instrumentIncomingHTTPRequests", js.undefined)
    
    @scala.inline
    def setInstrumentUndefined: Self = StObject.set(x, "instrument", js.undefined)
    
    @scala.inline
    def setKubernetesNamespace(value: String): Self = StObject.set(x, "kubernetesNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKubernetesNamespaceUndefined: Self = StObject.set(x, "kubernetesNamespace", js.undefined)
    
    @scala.inline
    def setKubernetesNodeName(value: String): Self = StObject.set(x, "kubernetesNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKubernetesNodeNameUndefined: Self = StObject.set(x, "kubernetesNodeName", js.undefined)
    
    @scala.inline
    def setKubernetesPodName(value: String): Self = StObject.set(x, "kubernetesPodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKubernetesPodNameUndefined: Self = StObject.set(x, "kubernetesPodName", js.undefined)
    
    @scala.inline
    def setKubernetesPodUID(value: String): Self = StObject.set(x, "kubernetesPodUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKubernetesPodUIDUndefined: Self = StObject.set(x, "kubernetesPodUID", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setLogUncaughtExceptions(value: Boolean): Self = StObject.set(x, "logUncaughtExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUncaughtExceptionsUndefined: Self = StObject.set(x, "logUncaughtExceptions", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    @scala.inline
    def setMetricsInterval(value: String): Self = StObject.set(x, "metricsInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsIntervalUndefined: Self = StObject.set(x, "metricsInterval", js.undefined)
    
    @scala.inline
    def setPayloadLogFile(value: String): Self = StObject.set(x, "payloadLogFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadLogFileUndefined: Self = StObject.set(x, "payloadLogFile", js.undefined)
    
    @scala.inline
    def setSecretToken(value: String): Self = StObject.set(x, "secretToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretTokenUndefined: Self = StObject.set(x, "secretToken", js.undefined)
    
    @scala.inline
    def setServerCaCertFile(value: String): Self = StObject.set(x, "serverCaCertFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCaCertFileUndefined: Self = StObject.set(x, "serverCaCertFile", js.undefined)
    
    @scala.inline
    def setServerTimeout(value: String): Self = StObject.set(x, "serverTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerTimeoutUndefined: Self = StObject.set(x, "serverTimeout", js.undefined)
    
    @scala.inline
    def setServerUrl(value: String): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUrlUndefined: Self = StObject.set(x, "serverUrl", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    @scala.inline
    def setServiceVersion(value: String): Self = StObject.set(x, "serviceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceVersionUndefined: Self = StObject.set(x, "serviceVersion", js.undefined)
    
    @scala.inline
    def setSourceLinesErrorAppFrames(value: Double): Self = StObject.set(x, "sourceLinesErrorAppFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLinesErrorAppFramesUndefined: Self = StObject.set(x, "sourceLinesErrorAppFrames", js.undefined)
    
    @scala.inline
    def setSourceLinesErrorLibraryFrames(value: Double): Self = StObject.set(x, "sourceLinesErrorLibraryFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLinesErrorLibraryFramesUndefined: Self = StObject.set(x, "sourceLinesErrorLibraryFrames", js.undefined)
    
    @scala.inline
    def setSourceLinesSpanAppFrames(value: Double): Self = StObject.set(x, "sourceLinesSpanAppFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLinesSpanAppFramesUndefined: Self = StObject.set(x, "sourceLinesSpanAppFrames", js.undefined)
    
    @scala.inline
    def setSourceLinesSpanLibraryFrames(value: Double): Self = StObject.set(x, "sourceLinesSpanLibraryFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLinesSpanLibraryFramesUndefined: Self = StObject.set(x, "sourceLinesSpanLibraryFrames", js.undefined)
    
    @scala.inline
    def setStackTraceLimit(value: Double): Self = StObject.set(x, "stackTraceLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTraceLimitUndefined: Self = StObject.set(x, "stackTraceLimit", js.undefined)
    
    @scala.inline
    def setTransactionMaxSpans(value: Double): Self = StObject.set(x, "transactionMaxSpans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionMaxSpansUndefined: Self = StObject.set(x, "transactionMaxSpans", js.undefined)
    
    @scala.inline
    def setTransactionSampleRate(value: Double): Self = StObject.set(x, "transactionSampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionSampleRateUndefined: Self = StObject.set(x, "transactionSampleRate", js.undefined)
    
    @scala.inline
    def setUsePathAsTransactionName(value: Boolean): Self = StObject.set(x, "usePathAsTransactionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePathAsTransactionNameUndefined: Self = StObject.set(x, "usePathAsTransactionName", js.undefined)
    
    @scala.inline
    def setVerifyServerCert(value: Boolean): Self = StObject.set(x, "verifyServerCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyServerCertUndefined: Self = StObject.set(x, "verifyServerCert", js.undefined)
  }
}
