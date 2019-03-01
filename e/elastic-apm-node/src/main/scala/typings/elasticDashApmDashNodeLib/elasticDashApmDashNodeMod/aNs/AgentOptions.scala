package typings
package elasticDashApmDashNodeLib.elasticDashApmDashNodeMod.aNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentOptions extends js.Object {
  var abortedErrorThreshold: js.UndefOr[scala.Double] = js.undefined
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var asyncHooks: js.UndefOr[scala.Boolean] = js.undefined
  var captureBody: js.UndefOr[java.lang.String] = js.undefined
  var captureErrorLogStackTraces: js.UndefOr[java.lang.String] = js.undefined
  var captureExceptions: js.UndefOr[scala.Boolean] = js.undefined
  var captureSpanStackTraces: js.UndefOr[scala.Boolean] = js.undefined
  var disableInstrumentations: js.UndefOr[java.lang.String] = js.undefined
  var errorMessageMaxLength: js.UndefOr[scala.Double] = js.undefined
  var errorOnAbortedRequests: js.UndefOr[scala.Boolean] = js.undefined
  var filterHttpHeaders: js.UndefOr[scala.Boolean] = js.undefined
  var flushInterval: js.UndefOr[scala.Double] = js.undefined
  var frameworkName: js.UndefOr[java.lang.String] = js.undefined
  var frameworkVersion: js.UndefOr[java.lang.String] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var ignoreUrls: js.UndefOr[js.Array[stdLib.RegExp | java.lang.String]] = js.undefined
  var ignoreUserAgents: js.UndefOr[js.Array[stdLib.RegExp | java.lang.String]] = js.undefined
  var instrument: js.UndefOr[scala.Boolean] = js.undefined
  var logLevel: js.UndefOr[java.lang.String] = js.undefined
  var logger: js.UndefOr[js.Any] = js.undefined
  var maxQueueSize: js.UndefOr[scala.Double] = js.undefined
  var secretToken: js.UndefOr[java.lang.String] = js.undefined
  var serverTimeout: js.UndefOr[scala.Double] = js.undefined
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

object AgentOptions {
  @scala.inline
  def apply(
    abortedErrorThreshold: scala.Int | scala.Double = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    asyncHooks: js.UndefOr[scala.Boolean] = js.undefined,
    captureBody: java.lang.String = null,
    captureErrorLogStackTraces: java.lang.String = null,
    captureExceptions: js.UndefOr[scala.Boolean] = js.undefined,
    captureSpanStackTraces: js.UndefOr[scala.Boolean] = js.undefined,
    disableInstrumentations: java.lang.String = null,
    errorMessageMaxLength: scala.Int | scala.Double = null,
    errorOnAbortedRequests: js.UndefOr[scala.Boolean] = js.undefined,
    filterHttpHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    flushInterval: scala.Int | scala.Double = null,
    frameworkName: java.lang.String = null,
    frameworkVersion: java.lang.String = null,
    hostname: java.lang.String = null,
    ignoreUrls: js.Array[stdLib.RegExp | java.lang.String] = null,
    ignoreUserAgents: js.Array[stdLib.RegExp | java.lang.String] = null,
    instrument: js.UndefOr[scala.Boolean] = js.undefined,
    logLevel: java.lang.String = null,
    logger: js.Any = null,
    maxQueueSize: scala.Int | scala.Double = null,
    secretToken: java.lang.String = null,
    serverTimeout: scala.Int | scala.Double = null,
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
  ): AgentOptions = {
    val __obj = js.Dynamic.literal()
    if (abortedErrorThreshold != null) __obj.updateDynamic("abortedErrorThreshold")(abortedErrorThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(asyncHooks)) __obj.updateDynamic("asyncHooks")(asyncHooks)
    if (captureBody != null) __obj.updateDynamic("captureBody")(captureBody)
    if (captureErrorLogStackTraces != null) __obj.updateDynamic("captureErrorLogStackTraces")(captureErrorLogStackTraces)
    if (!js.isUndefined(captureExceptions)) __obj.updateDynamic("captureExceptions")(captureExceptions)
    if (!js.isUndefined(captureSpanStackTraces)) __obj.updateDynamic("captureSpanStackTraces")(captureSpanStackTraces)
    if (disableInstrumentations != null) __obj.updateDynamic("disableInstrumentations")(disableInstrumentations)
    if (errorMessageMaxLength != null) __obj.updateDynamic("errorMessageMaxLength")(errorMessageMaxLength.asInstanceOf[js.Any])
    if (!js.isUndefined(errorOnAbortedRequests)) __obj.updateDynamic("errorOnAbortedRequests")(errorOnAbortedRequests)
    if (!js.isUndefined(filterHttpHeaders)) __obj.updateDynamic("filterHttpHeaders")(filterHttpHeaders)
    if (flushInterval != null) __obj.updateDynamic("flushInterval")(flushInterval.asInstanceOf[js.Any])
    if (frameworkName != null) __obj.updateDynamic("frameworkName")(frameworkName)
    if (frameworkVersion != null) __obj.updateDynamic("frameworkVersion")(frameworkVersion)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (ignoreUrls != null) __obj.updateDynamic("ignoreUrls")(ignoreUrls)
    if (ignoreUserAgents != null) __obj.updateDynamic("ignoreUserAgents")(ignoreUserAgents)
    if (!js.isUndefined(instrument)) __obj.updateDynamic("instrument")(instrument)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (maxQueueSize != null) __obj.updateDynamic("maxQueueSize")(maxQueueSize.asInstanceOf[js.Any])
    if (secretToken != null) __obj.updateDynamic("secretToken")(secretToken)
    if (serverTimeout != null) __obj.updateDynamic("serverTimeout")(serverTimeout.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[AgentOptions]
  }
}

