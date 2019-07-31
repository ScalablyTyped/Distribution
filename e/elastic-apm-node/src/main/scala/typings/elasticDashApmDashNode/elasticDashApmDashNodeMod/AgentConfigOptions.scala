package typings.elasticDashApmDashNode.elasticDashApmDashNodeMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentConfigOptions extends js.Object {
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
  var kubernetesNamespace: js.UndefOr[String] = js.undefined
  var kubernetesNodeName: js.UndefOr[String] = js.undefined
  var kubernetesPodName: js.UndefOr[String] = js.undefined
  var kubernetesPodUID: js.UndefOr[String] = js.undefined
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var metricsInterval: js.UndefOr[String] = js.undefined
   // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var payloadLogFile: js.UndefOr[String] = js.undefined
  var secretToken: js.UndefOr[String] = js.undefined
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
  @scala.inline
  def apply(
    abortedErrorThreshold: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    addPatch: KeyValueConfig = null,
    apiRequestSize: String = null,
    apiRequestTime: String = null,
    asyncHooks: js.UndefOr[Boolean] = js.undefined,
    captureBody: CaptureBody = null,
    captureErrorLogStackTraces: CaptureErrorLogStackTraces = null,
    captureExceptions: js.UndefOr[Boolean] = js.undefined,
    captureHeaders: js.UndefOr[Boolean] = js.undefined,
    captureSpanStackTraces: js.UndefOr[Boolean] = js.undefined,
    centralConfig: js.UndefOr[Boolean] = js.undefined,
    containerId: String = null,
    disableInstrumentations: String | js.Array[String] = null,
    environment: String = null,
    errorMessageMaxLength: String = null,
    errorOnAbortedRequests: js.UndefOr[Boolean] = js.undefined,
    filterHttpHeaders: js.UndefOr[Boolean] = js.undefined,
    frameworkName: String = null,
    frameworkVersion: String = null,
    globalLabels: KeyValueConfig = null,
    hostname: String = null,
    ignoreUrls: js.Array[String | RegExp] = null,
    ignoreUserAgents: js.Array[String | RegExp] = null,
    instrument: js.UndefOr[Boolean] = js.undefined,
    kubernetesNamespace: String = null,
    kubernetesNodeName: String = null,
    kubernetesPodName: String = null,
    kubernetesPodUID: String = null,
    logLevel: LogLevel = null,
    logger: Logger = null,
    metricsInterval: String = null,
    payloadLogFile: String = null,
    secretToken: String = null,
    serverTimeout: String = null,
    serverUrl: String = null,
    serviceName: String = null,
    serviceVersion: String = null,
    sourceLinesErrorAppFrames: Int | Double = null,
    sourceLinesErrorLibraryFrames: Int | Double = null,
    sourceLinesSpanAppFrames: Int | Double = null,
    sourceLinesSpanLibraryFrames: Int | Double = null,
    stackTraceLimit: Int | Double = null,
    transactionMaxSpans: Int | Double = null,
    transactionSampleRate: Int | Double = null,
    usePathAsTransactionName: js.UndefOr[Boolean] = js.undefined,
    verifyServerCert: js.UndefOr[Boolean] = js.undefined
  ): AgentConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (abortedErrorThreshold != null) __obj.updateDynamic("abortedErrorThreshold")(abortedErrorThreshold)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (addPatch != null) __obj.updateDynamic("addPatch")(addPatch.asInstanceOf[js.Any])
    if (apiRequestSize != null) __obj.updateDynamic("apiRequestSize")(apiRequestSize)
    if (apiRequestTime != null) __obj.updateDynamic("apiRequestTime")(apiRequestTime)
    if (!js.isUndefined(asyncHooks)) __obj.updateDynamic("asyncHooks")(asyncHooks)
    if (captureBody != null) __obj.updateDynamic("captureBody")(captureBody)
    if (captureErrorLogStackTraces != null) __obj.updateDynamic("captureErrorLogStackTraces")(captureErrorLogStackTraces)
    if (!js.isUndefined(captureExceptions)) __obj.updateDynamic("captureExceptions")(captureExceptions)
    if (!js.isUndefined(captureHeaders)) __obj.updateDynamic("captureHeaders")(captureHeaders)
    if (!js.isUndefined(captureSpanStackTraces)) __obj.updateDynamic("captureSpanStackTraces")(captureSpanStackTraces)
    if (!js.isUndefined(centralConfig)) __obj.updateDynamic("centralConfig")(centralConfig)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (disableInstrumentations != null) __obj.updateDynamic("disableInstrumentations")(disableInstrumentations.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (errorMessageMaxLength != null) __obj.updateDynamic("errorMessageMaxLength")(errorMessageMaxLength)
    if (!js.isUndefined(errorOnAbortedRequests)) __obj.updateDynamic("errorOnAbortedRequests")(errorOnAbortedRequests)
    if (!js.isUndefined(filterHttpHeaders)) __obj.updateDynamic("filterHttpHeaders")(filterHttpHeaders)
    if (frameworkName != null) __obj.updateDynamic("frameworkName")(frameworkName)
    if (frameworkVersion != null) __obj.updateDynamic("frameworkVersion")(frameworkVersion)
    if (globalLabels != null) __obj.updateDynamic("globalLabels")(globalLabels.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (ignoreUrls != null) __obj.updateDynamic("ignoreUrls")(ignoreUrls)
    if (ignoreUserAgents != null) __obj.updateDynamic("ignoreUserAgents")(ignoreUserAgents)
    if (!js.isUndefined(instrument)) __obj.updateDynamic("instrument")(instrument)
    if (kubernetesNamespace != null) __obj.updateDynamic("kubernetesNamespace")(kubernetesNamespace)
    if (kubernetesNodeName != null) __obj.updateDynamic("kubernetesNodeName")(kubernetesNodeName)
    if (kubernetesPodName != null) __obj.updateDynamic("kubernetesPodName")(kubernetesPodName)
    if (kubernetesPodUID != null) __obj.updateDynamic("kubernetesPodUID")(kubernetesPodUID)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (metricsInterval != null) __obj.updateDynamic("metricsInterval")(metricsInterval)
    if (payloadLogFile != null) __obj.updateDynamic("payloadLogFile")(payloadLogFile)
    if (secretToken != null) __obj.updateDynamic("secretToken")(secretToken)
    if (serverTimeout != null) __obj.updateDynamic("serverTimeout")(serverTimeout)
    if (serverUrl != null) __obj.updateDynamic("serverUrl")(serverUrl)
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    if (serviceVersion != null) __obj.updateDynamic("serviceVersion")(serviceVersion)
    if (sourceLinesErrorAppFrames != null) __obj.updateDynamic("sourceLinesErrorAppFrames")(sourceLinesErrorAppFrames.asInstanceOf[js.Any])
    if (sourceLinesErrorLibraryFrames != null) __obj.updateDynamic("sourceLinesErrorLibraryFrames")(sourceLinesErrorLibraryFrames.asInstanceOf[js.Any])
    if (sourceLinesSpanAppFrames != null) __obj.updateDynamic("sourceLinesSpanAppFrames")(sourceLinesSpanAppFrames.asInstanceOf[js.Any])
    if (sourceLinesSpanLibraryFrames != null) __obj.updateDynamic("sourceLinesSpanLibraryFrames")(sourceLinesSpanLibraryFrames.asInstanceOf[js.Any])
    if (stackTraceLimit != null) __obj.updateDynamic("stackTraceLimit")(stackTraceLimit.asInstanceOf[js.Any])
    if (transactionMaxSpans != null) __obj.updateDynamic("transactionMaxSpans")(transactionMaxSpans.asInstanceOf[js.Any])
    if (transactionSampleRate != null) __obj.updateDynamic("transactionSampleRate")(transactionSampleRate.asInstanceOf[js.Any])
    if (!js.isUndefined(usePathAsTransactionName)) __obj.updateDynamic("usePathAsTransactionName")(usePathAsTransactionName)
    if (!js.isUndefined(verifyServerCert)) __obj.updateDynamic("verifyServerCert")(verifyServerCert)
    __obj.asInstanceOf[AgentConfigOptions]
  }
}

