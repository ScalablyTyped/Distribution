package typings
package elasticDashApmDashNodeLib.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentConfigOptions extends js.Object {
  var abortedErrorThreshold: js.UndefOr[java.lang.String] = js.undefined
   // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var apiRequestSize: js.UndefOr[java.lang.String] = js.undefined
   // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var apiRequestTime: js.UndefOr[java.lang.String] = js.undefined
   // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var asyncHooks: js.UndefOr[scala.Boolean] = js.undefined
  var captureBody: js.UndefOr[elasticDashApmDashNodeLib.CaptureBody] = js.undefined
  var captureErrorLogStackTraces: js.UndefOr[elasticDashApmDashNodeLib.CaptureErrorLogStackTraces] = js.undefined
  var captureExceptions: js.UndefOr[scala.Boolean] = js.undefined
  var captureHeaders: js.UndefOr[scala.Boolean] = js.undefined
  var captureSpanStackTraces: js.UndefOr[scala.Boolean] = js.undefined
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  var disableInstrumentations: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var errorMessageMaxLength: js.UndefOr[java.lang.String] = js.undefined
   // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var errorOnAbortedRequests: js.UndefOr[scala.Boolean] = js.undefined
  var filterHttpHeaders: js.UndefOr[scala.Boolean] = js.undefined
  var frameworkName: js.UndefOr[java.lang.String] = js.undefined
  var frameworkVersion: js.UndefOr[java.lang.String] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var ignoreUrls: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  var ignoreUserAgents: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  var instrument: js.UndefOr[scala.Boolean] = js.undefined
  var kubernetesNamespace: js.UndefOr[java.lang.String] = js.undefined
  var kubernetesNodeName: js.UndefOr[java.lang.String] = js.undefined
  var kubernetesPodName: js.UndefOr[java.lang.String] = js.undefined
  var kubernetesPodUID: js.UndefOr[java.lang.String] = js.undefined
  var logLevel: js.UndefOr[elasticDashApmDashNodeLib.LogLevel] = js.undefined
  var logger: js.UndefOr[Logger] = js.undefined
  var metricsInterval: js.UndefOr[java.lang.String] = js.undefined
   // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var payloadLogFile: js.UndefOr[java.lang.String] = js.undefined
  var secretToken: js.UndefOr[java.lang.String] = js.undefined
  var serverTimeout: js.UndefOr[java.lang.String] = js.undefined
   // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
  var serverUrl: js.UndefOr[java.lang.String] = js.undefined
  var serviceName: js.UndefOr[java.lang.String] = js.undefined
  var serviceVersion: js.UndefOr[java.lang.String] = js.undefined
  var sourceLinesErrorAppFrames: js.UndefOr[scala.Double] = js.undefined
  var sourceLinesErrorLibraryFrames: js.UndefOr[scala.Double] = js.undefined
  var sourceLinesSpanAppFrames: js.UndefOr[scala.Double] = js.undefined
  var sourceLinesSpanLibraryFrames: js.UndefOr[scala.Double] = js.undefined
  var stackTraceLimit: js.UndefOr[scala.Double] = js.undefined
  var transactionMaxSpans: js.UndefOr[scala.Double] = js.undefined
  var transactionSampleRate: js.UndefOr[scala.Double] = js.undefined
  var verifyServerCert: js.UndefOr[scala.Boolean] = js.undefined
}

object AgentConfigOptions {
  @scala.inline
  def apply(
    abortedErrorThreshold: java.lang.String = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    apiRequestSize: java.lang.String = null,
    apiRequestTime: java.lang.String = null,
    asyncHooks: js.UndefOr[scala.Boolean] = js.undefined,
    captureBody: elasticDashApmDashNodeLib.CaptureBody = null,
    captureErrorLogStackTraces: elasticDashApmDashNodeLib.CaptureErrorLogStackTraces = null,
    captureExceptions: js.UndefOr[scala.Boolean] = js.undefined,
    captureHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    captureSpanStackTraces: js.UndefOr[scala.Boolean] = js.undefined,
    containerId: java.lang.String = null,
    disableInstrumentations: java.lang.String | js.Array[java.lang.String] = null,
    errorMessageMaxLength: java.lang.String = null,
    errorOnAbortedRequests: js.UndefOr[scala.Boolean] = js.undefined,
    filterHttpHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    frameworkName: java.lang.String = null,
    frameworkVersion: java.lang.String = null,
    hostname: java.lang.String = null,
    ignoreUrls: js.Array[java.lang.String | stdLib.RegExp] = null,
    ignoreUserAgents: js.Array[java.lang.String | stdLib.RegExp] = null,
    instrument: js.UndefOr[scala.Boolean] = js.undefined,
    kubernetesNamespace: java.lang.String = null,
    kubernetesNodeName: java.lang.String = null,
    kubernetesPodName: java.lang.String = null,
    kubernetesPodUID: java.lang.String = null,
    logLevel: elasticDashApmDashNodeLib.LogLevel = null,
    logger: Logger = null,
    metricsInterval: java.lang.String = null,
    payloadLogFile: java.lang.String = null,
    secretToken: java.lang.String = null,
    serverTimeout: java.lang.String = null,
    serverUrl: java.lang.String = null,
    serviceName: java.lang.String = null,
    serviceVersion: java.lang.String = null,
    sourceLinesErrorAppFrames: scala.Int | scala.Double = null,
    sourceLinesErrorLibraryFrames: scala.Int | scala.Double = null,
    sourceLinesSpanAppFrames: scala.Int | scala.Double = null,
    sourceLinesSpanLibraryFrames: scala.Int | scala.Double = null,
    stackTraceLimit: scala.Int | scala.Double = null,
    transactionMaxSpans: scala.Int | scala.Double = null,
    transactionSampleRate: scala.Int | scala.Double = null,
    verifyServerCert: js.UndefOr[scala.Boolean] = js.undefined
  ): AgentConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (abortedErrorThreshold != null) __obj.updateDynamic("abortedErrorThreshold")(abortedErrorThreshold)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (apiRequestSize != null) __obj.updateDynamic("apiRequestSize")(apiRequestSize)
    if (apiRequestTime != null) __obj.updateDynamic("apiRequestTime")(apiRequestTime)
    if (!js.isUndefined(asyncHooks)) __obj.updateDynamic("asyncHooks")(asyncHooks)
    if (captureBody != null) __obj.updateDynamic("captureBody")(captureBody)
    if (captureErrorLogStackTraces != null) __obj.updateDynamic("captureErrorLogStackTraces")(captureErrorLogStackTraces)
    if (!js.isUndefined(captureExceptions)) __obj.updateDynamic("captureExceptions")(captureExceptions)
    if (!js.isUndefined(captureHeaders)) __obj.updateDynamic("captureHeaders")(captureHeaders)
    if (!js.isUndefined(captureSpanStackTraces)) __obj.updateDynamic("captureSpanStackTraces")(captureSpanStackTraces)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (disableInstrumentations != null) __obj.updateDynamic("disableInstrumentations")(disableInstrumentations.asInstanceOf[js.Any])
    if (errorMessageMaxLength != null) __obj.updateDynamic("errorMessageMaxLength")(errorMessageMaxLength)
    if (!js.isUndefined(errorOnAbortedRequests)) __obj.updateDynamic("errorOnAbortedRequests")(errorOnAbortedRequests)
    if (!js.isUndefined(filterHttpHeaders)) __obj.updateDynamic("filterHttpHeaders")(filterHttpHeaders)
    if (frameworkName != null) __obj.updateDynamic("frameworkName")(frameworkName)
    if (frameworkVersion != null) __obj.updateDynamic("frameworkVersion")(frameworkVersion)
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
    if (!js.isUndefined(verifyServerCert)) __obj.updateDynamic("verifyServerCert")(verifyServerCert)
    __obj.asInstanceOf[AgentConfigOptions]
  }
}

