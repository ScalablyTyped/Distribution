package typings.elasticApmNode.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentConfigOptions extends js.Object {
  
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
  implicit class AgentConfigOptionsOps[Self <: AgentConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setAbortedErrorThreshold(value: String): Self = this.set("abortedErrorThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortedErrorThreshold: Self = this.set("abortedErrorThreshold", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAddPatchVarargs(value: js.Array[LabelValue]*): Self = this.set("addPatch", js.Array(value :_*))
    
    @scala.inline
    def setAddPatch(value: KeyValueConfig): Self = this.set("addPatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddPatch: Self = this.set("addPatch", js.undefined)
    
    @scala.inline
    def setApiRequestSize(value: String): Self = this.set("apiRequestSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiRequestSize: Self = this.set("apiRequestSize", js.undefined)
    
    @scala.inline
    def setApiRequestTime(value: String): Self = this.set("apiRequestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiRequestTime: Self = this.set("apiRequestTime", js.undefined)
    
    @scala.inline
    def setAsyncHooks(value: Boolean): Self = this.set("asyncHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncHooks: Self = this.set("asyncHooks", js.undefined)
    
    @scala.inline
    def setCaptureBody(value: CaptureBody): Self = this.set("captureBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureBody: Self = this.set("captureBody", js.undefined)
    
    @scala.inline
    def setCaptureErrorLogStackTraces(value: CaptureErrorLogStackTraces): Self = this.set("captureErrorLogStackTraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureErrorLogStackTraces: Self = this.set("captureErrorLogStackTraces", js.undefined)
    
    @scala.inline
    def setCaptureExceptions(value: Boolean): Self = this.set("captureExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureExceptions: Self = this.set("captureExceptions", js.undefined)
    
    @scala.inline
    def setCaptureHeaders(value: Boolean): Self = this.set("captureHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureHeaders: Self = this.set("captureHeaders", js.undefined)
    
    @scala.inline
    def setCaptureSpanStackTraces(value: Boolean): Self = this.set("captureSpanStackTraces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureSpanStackTraces: Self = this.set("captureSpanStackTraces", js.undefined)
    
    @scala.inline
    def setCentralConfig(value: Boolean): Self = this.set("centralConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCentralConfig: Self = this.set("centralConfig", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setDisableInstrumentationsVarargs(value: String*): Self = this.set("disableInstrumentations", js.Array(value :_*))
    
    @scala.inline
    def setDisableInstrumentations(value: String | js.Array[String]): Self = this.set("disableInstrumentations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableInstrumentations: Self = this.set("disableInstrumentations", js.undefined)
    
    @scala.inline
    def setEnvironment(value: String): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    
    @scala.inline
    def setErrorMessageMaxLength(value: String): Self = this.set("errorMessageMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessageMaxLength: Self = this.set("errorMessageMaxLength", js.undefined)
    
    @scala.inline
    def setErrorOnAbortedRequests(value: Boolean): Self = this.set("errorOnAbortedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorOnAbortedRequests: Self = this.set("errorOnAbortedRequests", js.undefined)
    
    @scala.inline
    def setFilterHttpHeaders(value: Boolean): Self = this.set("filterHttpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterHttpHeaders: Self = this.set("filterHttpHeaders", js.undefined)
    
    @scala.inline
    def setFrameworkName(value: String): Self = this.set("frameworkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameworkName: Self = this.set("frameworkName", js.undefined)
    
    @scala.inline
    def setFrameworkVersion(value: String): Self = this.set("frameworkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameworkVersion: Self = this.set("frameworkVersion", js.undefined)
    
    @scala.inline
    def setGlobalLabelsVarargs(value: js.Array[LabelValue]*): Self = this.set("globalLabels", js.Array(value :_*))
    
    @scala.inline
    def setGlobalLabels(value: KeyValueConfig): Self = this.set("globalLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalLabels: Self = this.set("globalLabels", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setIgnoreUrlsVarargs(value: (String | RegExp)*): Self = this.set("ignoreUrls", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreUrls(value: js.Array[String | RegExp]): Self = this.set("ignoreUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUrls: Self = this.set("ignoreUrls", js.undefined)
    
    @scala.inline
    def setIgnoreUserAgentsVarargs(value: (String | RegExp)*): Self = this.set("ignoreUserAgents", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreUserAgents(value: js.Array[String | RegExp]): Self = this.set("ignoreUserAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUserAgents: Self = this.set("ignoreUserAgents", js.undefined)
    
    @scala.inline
    def setInstrument(value: Boolean): Self = this.set("instrument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstrument: Self = this.set("instrument", js.undefined)
    
    @scala.inline
    def setInstrumentIncomingHTTPRequests(value: Boolean): Self = this.set("instrumentIncomingHTTPRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstrumentIncomingHTTPRequests: Self = this.set("instrumentIncomingHTTPRequests", js.undefined)
    
    @scala.inline
    def setKubernetesNamespace(value: String): Self = this.set("kubernetesNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKubernetesNamespace: Self = this.set("kubernetesNamespace", js.undefined)
    
    @scala.inline
    def setKubernetesNodeName(value: String): Self = this.set("kubernetesNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKubernetesNodeName: Self = this.set("kubernetesNodeName", js.undefined)
    
    @scala.inline
    def setKubernetesPodName(value: String): Self = this.set("kubernetesPodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKubernetesPodName: Self = this.set("kubernetesPodName", js.undefined)
    
    @scala.inline
    def setKubernetesPodUID(value: String): Self = this.set("kubernetesPodUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKubernetesPodUID: Self = this.set("kubernetesPodUID", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setLogUncaughtExceptions(value: Boolean): Self = this.set("logUncaughtExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogUncaughtExceptions: Self = this.set("logUncaughtExceptions", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setMetricsInterval(value: String): Self = this.set("metricsInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricsInterval: Self = this.set("metricsInterval", js.undefined)
    
    @scala.inline
    def setPayloadLogFile(value: String): Self = this.set("payloadLogFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadLogFile: Self = this.set("payloadLogFile", js.undefined)
    
    @scala.inline
    def setSecretToken(value: String): Self = this.set("secretToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretToken: Self = this.set("secretToken", js.undefined)
    
    @scala.inline
    def setServerCaCertFile(value: String): Self = this.set("serverCaCertFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerCaCertFile: Self = this.set("serverCaCertFile", js.undefined)
    
    @scala.inline
    def setServerTimeout(value: String): Self = this.set("serverTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerTimeout: Self = this.set("serverTimeout", js.undefined)
    
    @scala.inline
    def setServerUrl(value: String): Self = this.set("serverUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerUrl: Self = this.set("serverUrl", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
    
    @scala.inline
    def setServiceVersion(value: String): Self = this.set("serviceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceVersion: Self = this.set("serviceVersion", js.undefined)
    
    @scala.inline
    def setSourceLinesErrorAppFrames(value: Double): Self = this.set("sourceLinesErrorAppFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLinesErrorAppFrames: Self = this.set("sourceLinesErrorAppFrames", js.undefined)
    
    @scala.inline
    def setSourceLinesErrorLibraryFrames(value: Double): Self = this.set("sourceLinesErrorLibraryFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLinesErrorLibraryFrames: Self = this.set("sourceLinesErrorLibraryFrames", js.undefined)
    
    @scala.inline
    def setSourceLinesSpanAppFrames(value: Double): Self = this.set("sourceLinesSpanAppFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLinesSpanAppFrames: Self = this.set("sourceLinesSpanAppFrames", js.undefined)
    
    @scala.inline
    def setSourceLinesSpanLibraryFrames(value: Double): Self = this.set("sourceLinesSpanLibraryFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceLinesSpanLibraryFrames: Self = this.set("sourceLinesSpanLibraryFrames", js.undefined)
    
    @scala.inline
    def setStackTraceLimit(value: Double): Self = this.set("stackTraceLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackTraceLimit: Self = this.set("stackTraceLimit", js.undefined)
    
    @scala.inline
    def setTransactionMaxSpans(value: Double): Self = this.set("transactionMaxSpans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionMaxSpans: Self = this.set("transactionMaxSpans", js.undefined)
    
    @scala.inline
    def setTransactionSampleRate(value: Double): Self = this.set("transactionSampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionSampleRate: Self = this.set("transactionSampleRate", js.undefined)
    
    @scala.inline
    def setUsePathAsTransactionName(value: Boolean): Self = this.set("usePathAsTransactionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePathAsTransactionName: Self = this.set("usePathAsTransactionName", js.undefined)
    
    @scala.inline
    def setVerifyServerCert(value: Boolean): Self = this.set("verifyServerCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifyServerCert: Self = this.set("verifyServerCert", js.undefined)
  }
}
