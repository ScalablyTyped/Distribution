package typings.elasticApmNode.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentConfigOptions extends StObject {
  
  var abortedErrorThreshold: js.UndefOr[String] = js.undefined
  
  // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var active: js.UndefOr[Boolean] = js.undefined
  
  var addPatch: js.UndefOr[KeyValueConfig] = js.undefined
  
  var apiRequestSize: js.UndefOr[String] = js.undefined
  
  // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var apiRequestTime: js.UndefOr[String] = js.undefined
  
  // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var asyncHooks: js.UndefOr[Boolean] = js.undefined
  
  var captureBody: js.UndefOr[CaptureBody] = js.undefined
  
  var captureErrorLogStackTraces: js.UndefOr[CaptureErrorLogStackTraces] = js.undefined
  
  var captureExceptions: js.UndefOr[Boolean] = js.undefined
  
  var captureHeaders: js.UndefOr[Boolean] = js.undefined
  
  var captureSpanStackTraces: js.UndefOr[Boolean] = js.undefined
  
  var centralConfig: js.UndefOr[Boolean] = js.undefined
  
  var containerId: js.UndefOr[String] = js.undefined
  
  var disableInstrumentations: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var environment: js.UndefOr[String] = js.undefined
  
  var errorMessageMaxLength: js.UndefOr[String] = js.undefined
  
  // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var errorOnAbortedRequests: js.UndefOr[Boolean] = js.undefined
  
  var filterHttpHeaders: js.UndefOr[Boolean] = js.undefined
  
  var frameworkName: js.UndefOr[String] = js.undefined
  
  var frameworkVersion: js.UndefOr[String] = js.undefined
  
  var globalLabels: js.UndefOr[KeyValueConfig] = js.undefined
  
  var hostname: js.UndefOr[String] = js.undefined
  
  var ignoreUrls: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  
  var ignoreUserAgents: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  
  var instrument: js.UndefOr[Boolean] = js.undefined
  
  var instrumentIncomingHTTPRequests: js.UndefOr[Boolean] = js.undefined
  
  var kubernetesNamespace: js.UndefOr[String] = js.undefined
  
  var kubernetesNodeName: js.UndefOr[String] = js.undefined
  
  var kubernetesPodName: js.UndefOr[String] = js.undefined
  
  var kubernetesPodUID: js.UndefOr[String] = js.undefined
  
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  
  var logUncaughtExceptions: js.UndefOr[Boolean] = js.undefined
  
  var logger: js.UndefOr[Logger] = js.undefined
  
  var metricsInterval: js.UndefOr[String] = js.undefined
  
  // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var payloadLogFile: js.UndefOr[String] = js.undefined
  
  var secretToken: js.UndefOr[String] = js.undefined
  
  var serverCaCertFile: js.UndefOr[String] = js.undefined
  
  var serverTimeout: js.UndefOr[String] = js.undefined
  
  // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var serverUrl: js.UndefOr[String] = js.undefined
  
  var serviceName: js.UndefOr[String] = js.undefined
  
  var serviceVersion: js.UndefOr[String] = js.undefined
  
  var sourceLinesErrorAppFrames: js.UndefOr[Double] = js.undefined
  
  var sourceLinesErrorLibraryFrames: js.UndefOr[Double] = js.undefined
  
  var sourceLinesSpanAppFrames: js.UndefOr[Double] = js.undefined
  
  var sourceLinesSpanLibraryFrames: js.UndefOr[Double] = js.undefined
  
  var stackTraceLimit: js.UndefOr[Double] = js.undefined
  
  var transactionMaxSpans: js.UndefOr[Double] = js.undefined
  
  var transactionSampleRate: js.UndefOr[Double] = js.undefined
  
  var usePathAsTransactionName: js.UndefOr[Boolean] = js.undefined
  
  var verifyServerCert: js.UndefOr[Boolean] = js.undefined
}
object AgentConfigOptions {
  
  inline def apply(): AgentConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentConfigOptions]
  }
  
  extension [Self <: AgentConfigOptions](x: Self) {
    
    inline def setAbortedErrorThreshold(value: String): Self = StObject.set(x, "abortedErrorThreshold", value.asInstanceOf[js.Any])
    
    inline def setAbortedErrorThresholdUndefined: Self = StObject.set(x, "abortedErrorThreshold", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAddPatch(value: KeyValueConfig): Self = StObject.set(x, "addPatch", value.asInstanceOf[js.Any])
    
    inline def setAddPatchUndefined: Self = StObject.set(x, "addPatch", js.undefined)
    
    inline def setAddPatchVarargs(value: js.Array[LabelValue]*): Self = StObject.set(x, "addPatch", js.Array(value :_*))
    
    inline def setApiRequestSize(value: String): Self = StObject.set(x, "apiRequestSize", value.asInstanceOf[js.Any])
    
    inline def setApiRequestSizeUndefined: Self = StObject.set(x, "apiRequestSize", js.undefined)
    
    inline def setApiRequestTime(value: String): Self = StObject.set(x, "apiRequestTime", value.asInstanceOf[js.Any])
    
    inline def setApiRequestTimeUndefined: Self = StObject.set(x, "apiRequestTime", js.undefined)
    
    inline def setAsyncHooks(value: Boolean): Self = StObject.set(x, "asyncHooks", value.asInstanceOf[js.Any])
    
    inline def setAsyncHooksUndefined: Self = StObject.set(x, "asyncHooks", js.undefined)
    
    inline def setCaptureBody(value: CaptureBody): Self = StObject.set(x, "captureBody", value.asInstanceOf[js.Any])
    
    inline def setCaptureBodyUndefined: Self = StObject.set(x, "captureBody", js.undefined)
    
    inline def setCaptureErrorLogStackTraces(value: CaptureErrorLogStackTraces): Self = StObject.set(x, "captureErrorLogStackTraces", value.asInstanceOf[js.Any])
    
    inline def setCaptureErrorLogStackTracesUndefined: Self = StObject.set(x, "captureErrorLogStackTraces", js.undefined)
    
    inline def setCaptureExceptions(value: Boolean): Self = StObject.set(x, "captureExceptions", value.asInstanceOf[js.Any])
    
    inline def setCaptureExceptionsUndefined: Self = StObject.set(x, "captureExceptions", js.undefined)
    
    inline def setCaptureHeaders(value: Boolean): Self = StObject.set(x, "captureHeaders", value.asInstanceOf[js.Any])
    
    inline def setCaptureHeadersUndefined: Self = StObject.set(x, "captureHeaders", js.undefined)
    
    inline def setCaptureSpanStackTraces(value: Boolean): Self = StObject.set(x, "captureSpanStackTraces", value.asInstanceOf[js.Any])
    
    inline def setCaptureSpanStackTracesUndefined: Self = StObject.set(x, "captureSpanStackTraces", js.undefined)
    
    inline def setCentralConfig(value: Boolean): Self = StObject.set(x, "centralConfig", value.asInstanceOf[js.Any])
    
    inline def setCentralConfigUndefined: Self = StObject.set(x, "centralConfig", js.undefined)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setDisableInstrumentations(value: String | js.Array[String]): Self = StObject.set(x, "disableInstrumentations", value.asInstanceOf[js.Any])
    
    inline def setDisableInstrumentationsUndefined: Self = StObject.set(x, "disableInstrumentations", js.undefined)
    
    inline def setDisableInstrumentationsVarargs(value: String*): Self = StObject.set(x, "disableInstrumentations", js.Array(value :_*))
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setErrorMessageMaxLength(value: String): Self = StObject.set(x, "errorMessageMaxLength", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageMaxLengthUndefined: Self = StObject.set(x, "errorMessageMaxLength", js.undefined)
    
    inline def setErrorOnAbortedRequests(value: Boolean): Self = StObject.set(x, "errorOnAbortedRequests", value.asInstanceOf[js.Any])
    
    inline def setErrorOnAbortedRequestsUndefined: Self = StObject.set(x, "errorOnAbortedRequests", js.undefined)
    
    inline def setFilterHttpHeaders(value: Boolean): Self = StObject.set(x, "filterHttpHeaders", value.asInstanceOf[js.Any])
    
    inline def setFilterHttpHeadersUndefined: Self = StObject.set(x, "filterHttpHeaders", js.undefined)
    
    inline def setFrameworkName(value: String): Self = StObject.set(x, "frameworkName", value.asInstanceOf[js.Any])
    
    inline def setFrameworkNameUndefined: Self = StObject.set(x, "frameworkName", js.undefined)
    
    inline def setFrameworkVersion(value: String): Self = StObject.set(x, "frameworkVersion", value.asInstanceOf[js.Any])
    
    inline def setFrameworkVersionUndefined: Self = StObject.set(x, "frameworkVersion", js.undefined)
    
    inline def setGlobalLabels(value: KeyValueConfig): Self = StObject.set(x, "globalLabels", value.asInstanceOf[js.Any])
    
    inline def setGlobalLabelsUndefined: Self = StObject.set(x, "globalLabels", js.undefined)
    
    inline def setGlobalLabelsVarargs(value: js.Array[LabelValue]*): Self = StObject.set(x, "globalLabels", js.Array(value :_*))
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setIgnoreUrls(value: js.Array[String | RegExp]): Self = StObject.set(x, "ignoreUrls", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUrlsUndefined: Self = StObject.set(x, "ignoreUrls", js.undefined)
    
    inline def setIgnoreUrlsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "ignoreUrls", js.Array(value :_*))
    
    inline def setIgnoreUserAgents(value: js.Array[String | RegExp]): Self = StObject.set(x, "ignoreUserAgents", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUserAgentsUndefined: Self = StObject.set(x, "ignoreUserAgents", js.undefined)
    
    inline def setIgnoreUserAgentsVarargs(value: (String | RegExp)*): Self = StObject.set(x, "ignoreUserAgents", js.Array(value :_*))
    
    inline def setInstrument(value: Boolean): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
    
    inline def setInstrumentIncomingHTTPRequests(value: Boolean): Self = StObject.set(x, "instrumentIncomingHTTPRequests", value.asInstanceOf[js.Any])
    
    inline def setInstrumentIncomingHTTPRequestsUndefined: Self = StObject.set(x, "instrumentIncomingHTTPRequests", js.undefined)
    
    inline def setInstrumentUndefined: Self = StObject.set(x, "instrument", js.undefined)
    
    inline def setKubernetesNamespace(value: String): Self = StObject.set(x, "kubernetesNamespace", value.asInstanceOf[js.Any])
    
    inline def setKubernetesNamespaceUndefined: Self = StObject.set(x, "kubernetesNamespace", js.undefined)
    
    inline def setKubernetesNodeName(value: String): Self = StObject.set(x, "kubernetesNodeName", value.asInstanceOf[js.Any])
    
    inline def setKubernetesNodeNameUndefined: Self = StObject.set(x, "kubernetesNodeName", js.undefined)
    
    inline def setKubernetesPodName(value: String): Self = StObject.set(x, "kubernetesPodName", value.asInstanceOf[js.Any])
    
    inline def setKubernetesPodNameUndefined: Self = StObject.set(x, "kubernetesPodName", js.undefined)
    
    inline def setKubernetesPodUID(value: String): Self = StObject.set(x, "kubernetesPodUID", value.asInstanceOf[js.Any])
    
    inline def setKubernetesPodUIDUndefined: Self = StObject.set(x, "kubernetesPodUID", js.undefined)
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLogUncaughtExceptions(value: Boolean): Self = StObject.set(x, "logUncaughtExceptions", value.asInstanceOf[js.Any])
    
    inline def setLogUncaughtExceptionsUndefined: Self = StObject.set(x, "logUncaughtExceptions", js.undefined)
    
    inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setMetricsInterval(value: String): Self = StObject.set(x, "metricsInterval", value.asInstanceOf[js.Any])
    
    inline def setMetricsIntervalUndefined: Self = StObject.set(x, "metricsInterval", js.undefined)
    
    inline def setPayloadLogFile(value: String): Self = StObject.set(x, "payloadLogFile", value.asInstanceOf[js.Any])
    
    inline def setPayloadLogFileUndefined: Self = StObject.set(x, "payloadLogFile", js.undefined)
    
    inline def setSecretToken(value: String): Self = StObject.set(x, "secretToken", value.asInstanceOf[js.Any])
    
    inline def setSecretTokenUndefined: Self = StObject.set(x, "secretToken", js.undefined)
    
    inline def setServerCaCertFile(value: String): Self = StObject.set(x, "serverCaCertFile", value.asInstanceOf[js.Any])
    
    inline def setServerCaCertFileUndefined: Self = StObject.set(x, "serverCaCertFile", js.undefined)
    
    inline def setServerTimeout(value: String): Self = StObject.set(x, "serverTimeout", value.asInstanceOf[js.Any])
    
    inline def setServerTimeoutUndefined: Self = StObject.set(x, "serverTimeout", js.undefined)
    
    inline def setServerUrl(value: String): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
    
    inline def setServerUrlUndefined: Self = StObject.set(x, "serverUrl", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setServiceVersion(value: String): Self = StObject.set(x, "serviceVersion", value.asInstanceOf[js.Any])
    
    inline def setServiceVersionUndefined: Self = StObject.set(x, "serviceVersion", js.undefined)
    
    inline def setSourceLinesErrorAppFrames(value: Double): Self = StObject.set(x, "sourceLinesErrorAppFrames", value.asInstanceOf[js.Any])
    
    inline def setSourceLinesErrorAppFramesUndefined: Self = StObject.set(x, "sourceLinesErrorAppFrames", js.undefined)
    
    inline def setSourceLinesErrorLibraryFrames(value: Double): Self = StObject.set(x, "sourceLinesErrorLibraryFrames", value.asInstanceOf[js.Any])
    
    inline def setSourceLinesErrorLibraryFramesUndefined: Self = StObject.set(x, "sourceLinesErrorLibraryFrames", js.undefined)
    
    inline def setSourceLinesSpanAppFrames(value: Double): Self = StObject.set(x, "sourceLinesSpanAppFrames", value.asInstanceOf[js.Any])
    
    inline def setSourceLinesSpanAppFramesUndefined: Self = StObject.set(x, "sourceLinesSpanAppFrames", js.undefined)
    
    inline def setSourceLinesSpanLibraryFrames(value: Double): Self = StObject.set(x, "sourceLinesSpanLibraryFrames", value.asInstanceOf[js.Any])
    
    inline def setSourceLinesSpanLibraryFramesUndefined: Self = StObject.set(x, "sourceLinesSpanLibraryFrames", js.undefined)
    
    inline def setStackTraceLimit(value: Double): Self = StObject.set(x, "stackTraceLimit", value.asInstanceOf[js.Any])
    
    inline def setStackTraceLimitUndefined: Self = StObject.set(x, "stackTraceLimit", js.undefined)
    
    inline def setTransactionMaxSpans(value: Double): Self = StObject.set(x, "transactionMaxSpans", value.asInstanceOf[js.Any])
    
    inline def setTransactionMaxSpansUndefined: Self = StObject.set(x, "transactionMaxSpans", js.undefined)
    
    inline def setTransactionSampleRate(value: Double): Self = StObject.set(x, "transactionSampleRate", value.asInstanceOf[js.Any])
    
    inline def setTransactionSampleRateUndefined: Self = StObject.set(x, "transactionSampleRate", js.undefined)
    
    inline def setUsePathAsTransactionName(value: Boolean): Self = StObject.set(x, "usePathAsTransactionName", value.asInstanceOf[js.Any])
    
    inline def setUsePathAsTransactionNameUndefined: Self = StObject.set(x, "usePathAsTransactionName", js.undefined)
    
    inline def setVerifyServerCert(value: Boolean): Self = StObject.set(x, "verifyServerCert", value.asInstanceOf[js.Any])
    
    inline def setVerifyServerCertUndefined: Self = StObject.set(x, "verifyServerCert", js.undefined)
  }
}
