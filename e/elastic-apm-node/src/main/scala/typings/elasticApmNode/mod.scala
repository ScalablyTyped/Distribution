package typings.elasticApmNode

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.elasticApmNode.anon.Connect
import typings.elasticApmNode.anon.Name
import typings.elasticApmNode.anon.Spanid
import typings.elasticApmNode.anon.SpanidTraceid
import typings.elasticApmNode.anon.Traceid
import typings.elasticApmNode.awsLambdaMod.AwsLambda.Handler
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("elastic-apm-node", JSImport.Namespace)
  @js.native
  val ^ : Agent = js.native
  
  @js.native
  trait Agent extends StObject {
    
    def addErrorFilter(fn: FilterFn): Unit = js.native
    
    // Transport
    def addFilter(fn: FilterFn): Unit = js.native
    
    def addLabels(labels: Labels): Boolean = js.native
    def addLabels(labels: Labels, stringify: Boolean): Boolean = js.native
    
    def addMetadataFilter(fn: FilterFn): Unit = js.native
    
    def addPatch(modules: String, handler: String): Unit = js.native
    def addPatch(modules: String, handler: PatchHandler): Unit = js.native
    def addPatch(modules: js.Array[String], handler: String): Unit = js.native
    def addPatch(modules: js.Array[String], handler: PatchHandler): Unit = js.native
    
    def addSpanFilter(fn: FilterFn): Unit = js.native
    
    def addTransactionFilter(fn: FilterFn): Unit = js.native
    
    def captureError(err: String): Unit = js.native
    def captureError(err: String, callback: CaptureErrorCallback): Unit = js.native
    def captureError(err: String, options: Unit, callback: CaptureErrorCallback): Unit = js.native
    def captureError(err: String, options: CaptureErrorOptions): Unit = js.native
    def captureError(err: String, options: CaptureErrorOptions, callback: CaptureErrorCallback): Unit = js.native
    // Errors
    def captureError(err: js.Error): Unit = js.native
    def captureError(err: js.Error, callback: CaptureErrorCallback): Unit = js.native
    def captureError(err: js.Error, options: Unit, callback: CaptureErrorCallback): Unit = js.native
    def captureError(err: js.Error, options: CaptureErrorOptions): Unit = js.native
    def captureError(err: js.Error, options: CaptureErrorOptions, callback: CaptureErrorCallback): Unit = js.native
    def captureError(err: ParameterizedMessageObject): Unit = js.native
    def captureError(err: ParameterizedMessageObject, callback: CaptureErrorCallback): Unit = js.native
    def captureError(err: ParameterizedMessageObject, options: Unit, callback: CaptureErrorCallback): Unit = js.native
    def captureError(err: ParameterizedMessageObject, options: CaptureErrorOptions): Unit = js.native
    def captureError(err: ParameterizedMessageObject, options: CaptureErrorOptions, callback: CaptureErrorCallback): Unit = js.native
    
    def clearPatches(modules: String): Unit = js.native
    def clearPatches(modules: js.Array[String]): Unit = js.native
    
    var currentSpan: Span | Null = js.native
    
    var currentTraceIds: Spanid = js.native
    
    // Distributed Tracing
    var currentTraceparent: String | Null = js.native
    
    var currentTransaction: Transaction | Null = js.native
    
    def destroy(): Unit = js.native
    
    def endTransaction(): Unit = js.native
    def endTransaction(result: String): Unit = js.native
    def endTransaction(result: String, endTime: Double): Unit = js.native
    def endTransaction(result: Double): Unit = js.native
    def endTransaction(result: Double, endTime: Double): Unit = js.native
    def endTransaction(result: Unit, endTime: Double): Unit = js.native
    
    def flush(): Unit = js.native
    def flush(callback: js.Function): Unit = js.native
    
    def getServiceName(): js.UndefOr[String] = js.native
    
    def handleUncaughtExceptions(): Unit = js.native
    def handleUncaughtExceptions(fn: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
    
    def isStarted(): Boolean = js.native
    
    def lambda(handler: Handler[Any, Any]): Handler[Any, Any] = js.native
    def lambda(`type`: String, handler: Handler[Any, Any]): Handler[Any, Any] = js.native
    
    // Utils
    var logger: Logger = js.native
    
    // Data collection hooks
    var middleware: Connect = js.native
    
    // Custom metrics
    def registerMetric(name: String, callback: js.Function): Unit = js.native
    def registerMetric(name: String, labels: Labels, callback: js.Function): Unit = js.native
    
    def removePatch(modules: String, handler: String): Unit = js.native
    def removePatch(modules: String, handler: PatchHandler): Unit = js.native
    def removePatch(modules: js.Array[String], handler: String): Unit = js.native
    def removePatch(modules: js.Array[String], handler: PatchHandler): Unit = js.native
    
    def setCustomContext(custom: js.Object): Unit = js.native
    
    def setFramework(options: Name): Unit = js.native
    
    // Context
    def setLabel(name: String, value: LabelValue): Boolean = js.native
    def setLabel(name: String, value: LabelValue, stringify: Boolean): Boolean = js.native
    
    def setSpanOutcome(outcome: Outcome): Unit = js.native
    
    def setTransactionName(name: String): Unit = js.native
    
    def setTransactionOutcome(outcome: Outcome): Unit = js.native
    
    def setUserContext(user: UserObject): Unit = js.native
    
    // Configuration
    def start(): Agent = js.native
    def start(options: AgentConfigOptions): Agent = js.native
    
    // Spans
    def startSpan(): Span | Null = js.native
    def startSpan(name: String): Span | Null = js.native
    def startSpan(name: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: String): Span | Null = js.native
    def startSpan(name: String, `type`: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: String): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: String, action: String): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: String, action: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: String, action: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: Null, action: String): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: Null, action: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: Null, action: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: String): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: String, action: String): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: String, action: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: String, action: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: Null, action: String): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: Null, action: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: Null, action: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: String): Span | Null = js.native
    def startSpan(name: Null, `type`: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: String): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: String, action: String): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: String, action: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: String, action: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: Null, action: String): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: Null, action: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: Null, action: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: String): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: String, action: String): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: String, action: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: String, action: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: Null, action: String): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: Null, action: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: Null, action: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Unit, options: SpanOptions): Span | Null = js.native
    
    // Transactions
    def startTransaction(): Transaction | Null = js.native
    def startTransaction(name: String): Transaction | Null = js.native
    def startTransaction(name: String, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: String, `type`: String): Transaction | Null = js.native
    def startTransaction(name: String, `type`: String, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: String, `type`: String, subtype: String): Transaction | Null = js.native
    def startTransaction(name: String, `type`: String, subtype: String, action: String): Transaction | Null = js.native
    def startTransaction(name: String, `type`: String, subtype: String, action: String, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: String, `type`: String, subtype: String, action: Null, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: String, `type`: String, subtype: String, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: String, `type`: String, subtype: Null, action: String): Transaction | Null = js.native
    def startTransaction(name: String, `type`: String, subtype: Null, action: String, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: String, `type`: String, subtype: Null, action: Null, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: String, `type`: String, subtype: Null, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: String, `type`: Null, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: String, `type`: Null, subtype: String): Transaction | Null = js.native
    def startTransaction(name: String, `type`: Null, subtype: String, action: String): Transaction | Null = js.native
    def startTransaction(name: String, `type`: Null, subtype: String, action: String, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: String, `type`: Null, subtype: String, action: Null, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: String, `type`: Null, subtype: String, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: String, `type`: Null, subtype: Null, action: String): Transaction | Null = js.native
    def startTransaction(name: String, `type`: Null, subtype: Null, action: String, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: String, `type`: Null, subtype: Null, action: Null, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: String, `type`: Null, subtype: Null, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: Null, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: String): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: String, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: String, subtype: String): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: String, subtype: String, action: String): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: String, subtype: String, action: String, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: String, subtype: String, action: Null, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: String, subtype: String, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: String, subtype: Null, action: String): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: String, subtype: Null, action: String, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: String, subtype: Null, action: Null, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: String, subtype: Null, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: Null, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: Null, subtype: String): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: Null, subtype: String, action: String): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: Null, subtype: String, action: String, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: Null, subtype: String, action: Null, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: Null, subtype: String, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: Null, subtype: Null, action: String): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: Null, subtype: Null, action: String, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: Null, subtype: Null, action: Null, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: Null, `type`: Null, subtype: Null, options: TransactionOptions): Transaction | Null = js.native
    def startTransaction(name: Unit, options: TransactionOptions): Transaction | Null = js.native
  }
  
  trait AgentConfigOptions extends StObject {
    
    var abortedErrorThreshold: js.UndefOr[String] = js.undefined
    
    // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
    var active: js.UndefOr[Boolean] = js.undefined
    
    var addPatch: js.UndefOr[KeyValueConfig] = js.undefined
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var apiRequestSize: js.UndefOr[String] = js.undefined
    
    // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
    var apiRequestTime: js.UndefOr[String] = js.undefined
    
    // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
    var asyncHooks: js.UndefOr[Boolean] = js.undefined
    
    var breakdownMetrics: js.UndefOr[Boolean] = js.undefined
    
    var captureBody: js.UndefOr[CaptureBody] = js.undefined
    
    var captureErrorLogStackTraces: js.UndefOr[CaptureErrorLogStackTraces] = js.undefined
    
    var captureExceptions: js.UndefOr[Boolean] = js.undefined
    
    var captureHeaders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated Use `spanStackTraceMinDuration`.
      */
    var captureSpanStackTraces: js.UndefOr[Boolean] = js.undefined
    
    var centralConfig: js.UndefOr[Boolean] = js.undefined
    
    var cloudProvider: js.UndefOr[String] = js.undefined
    
    var configFile: js.UndefOr[String] = js.undefined
    
    var containerId: js.UndefOr[String] = js.undefined
    
    var contextPropagationOnly: js.UndefOr[Boolean] = js.undefined
    
    var disableInstrumentations: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var disableSend: js.UndefOr[Boolean] = js.undefined
    
    var environment: js.UndefOr[String] = js.undefined
    
    var errorMessageMaxLength: js.UndefOr[String] = js.undefined
    
    // DEPRECATED: use `longFieldMaxLength`.
    var errorOnAbortedRequests: js.UndefOr[Boolean] = js.undefined
    
    var exitSpanMinDuration: js.UndefOr[String] = js.undefined
    
    var filterHttpHeaders: js.UndefOr[Boolean] = js.undefined
    
    var frameworkName: js.UndefOr[String] = js.undefined
    
    var frameworkVersion: js.UndefOr[String] = js.undefined
    
    var globalLabels: js.UndefOr[KeyValueConfig] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var ignoreMessageQueues: js.UndefOr[js.Array[String]] = js.undefined
    
    var ignoreUrls: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    var ignoreUserAgents: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
    
    var instrument: js.UndefOr[Boolean] = js.undefined
    
    var instrumentIncomingHTTPRequests: js.UndefOr[Boolean] = js.undefined
    
    var kubernetesNamespace: js.UndefOr[String] = js.undefined
    
    var kubernetesNodeName: js.UndefOr[String] = js.undefined
    
    var kubernetesPodName: js.UndefOr[String] = js.undefined
    
    var kubernetesPodUID: js.UndefOr[String] = js.undefined
    
    var logLevel: js.UndefOr[LogLevel] = js.undefined
    
    var logUncaughtExceptions: js.UndefOr[Boolean] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    // Notably this Logger interface matches the Pino Logger.
    var longFieldMaxLength: js.UndefOr[Double] = js.undefined
    
    var maxQueueSize: js.UndefOr[Double] = js.undefined
    
    var metricsInterval: js.UndefOr[String] = js.undefined
    
    // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
    var metricsLimit: js.UndefOr[Double] = js.undefined
    
    var payloadLogFile: js.UndefOr[String] = js.undefined
    
    var sanitizeFieldNames: js.UndefOr[js.Array[String]] = js.undefined
    
    var secretToken: js.UndefOr[String] = js.undefined
    
    var serverCaCertFile: js.UndefOr[String] = js.undefined
    
    var serverTimeout: js.UndefOr[String] = js.undefined
    
    // Also support `number`, but as we're removing this functionality soon, there's no need to advertise it
    var serverUrl: js.UndefOr[String] = js.undefined
    
    var serviceName: js.UndefOr[String] = js.undefined
    
    var serviceNodeName: js.UndefOr[String] = js.undefined
    
    var serviceVersion: js.UndefOr[String] = js.undefined
    
    var sourceLinesErrorAppFrames: js.UndefOr[Double] = js.undefined
    
    var sourceLinesErrorLibraryFrames: js.UndefOr[Double] = js.undefined
    
    var sourceLinesSpanAppFrames: js.UndefOr[Double] = js.undefined
    
    var sourceLinesSpanLibraryFrames: js.UndefOr[Double] = js.undefined
    
    var spanCompressionEnabled: js.UndefOr[Boolean] = js.undefined
    
    var spanCompressionExactMatchMaxDuration: js.UndefOr[String] = js.undefined
    
    var spanCompressionSameKindMaxDuration: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated Use `spanStackTraceMinDuration`.
      */
    var spanFramesMinDuration: js.UndefOr[String] = js.undefined
    
    var spanStackTraceMinDuration: js.UndefOr[String] = js.undefined
    
    var stackTraceLimit: js.UndefOr[Double] = js.undefined
    
    var traceContinuationStrategy: js.UndefOr[TraceContinuationStrategy] = js.undefined
    
    var transactionIgnoreUrls: js.UndefOr[js.Array[String]] = js.undefined
    
    var transactionMaxSpans: js.UndefOr[Double] = js.undefined
    
    var transactionSampleRate: js.UndefOr[Double] = js.undefined
    
    var useElasticTraceparentHeader: js.UndefOr[Boolean] = js.undefined
    
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
      
      inline def setAddPatchVarargs(value: js.Array[LabelValue]*): Self = StObject.set(x, "addPatch", js.Array(value*))
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setApiRequestSize(value: String): Self = StObject.set(x, "apiRequestSize", value.asInstanceOf[js.Any])
      
      inline def setApiRequestSizeUndefined: Self = StObject.set(x, "apiRequestSize", js.undefined)
      
      inline def setApiRequestTime(value: String): Self = StObject.set(x, "apiRequestTime", value.asInstanceOf[js.Any])
      
      inline def setApiRequestTimeUndefined: Self = StObject.set(x, "apiRequestTime", js.undefined)
      
      inline def setAsyncHooks(value: Boolean): Self = StObject.set(x, "asyncHooks", value.asInstanceOf[js.Any])
      
      inline def setAsyncHooksUndefined: Self = StObject.set(x, "asyncHooks", js.undefined)
      
      inline def setBreakdownMetrics(value: Boolean): Self = StObject.set(x, "breakdownMetrics", value.asInstanceOf[js.Any])
      
      inline def setBreakdownMetricsUndefined: Self = StObject.set(x, "breakdownMetrics", js.undefined)
      
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
      
      inline def setCloudProvider(value: String): Self = StObject.set(x, "cloudProvider", value.asInstanceOf[js.Any])
      
      inline def setCloudProviderUndefined: Self = StObject.set(x, "cloudProvider", js.undefined)
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
      
      inline def setContextPropagationOnly(value: Boolean): Self = StObject.set(x, "contextPropagationOnly", value.asInstanceOf[js.Any])
      
      inline def setContextPropagationOnlyUndefined: Self = StObject.set(x, "contextPropagationOnly", js.undefined)
      
      inline def setDisableInstrumentations(value: String | js.Array[String]): Self = StObject.set(x, "disableInstrumentations", value.asInstanceOf[js.Any])
      
      inline def setDisableInstrumentationsUndefined: Self = StObject.set(x, "disableInstrumentations", js.undefined)
      
      inline def setDisableInstrumentationsVarargs(value: String*): Self = StObject.set(x, "disableInstrumentations", js.Array(value*))
      
      inline def setDisableSend(value: Boolean): Self = StObject.set(x, "disableSend", value.asInstanceOf[js.Any])
      
      inline def setDisableSendUndefined: Self = StObject.set(x, "disableSend", js.undefined)
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setErrorMessageMaxLength(value: String): Self = StObject.set(x, "errorMessageMaxLength", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageMaxLengthUndefined: Self = StObject.set(x, "errorMessageMaxLength", js.undefined)
      
      inline def setErrorOnAbortedRequests(value: Boolean): Self = StObject.set(x, "errorOnAbortedRequests", value.asInstanceOf[js.Any])
      
      inline def setErrorOnAbortedRequestsUndefined: Self = StObject.set(x, "errorOnAbortedRequests", js.undefined)
      
      inline def setExitSpanMinDuration(value: String): Self = StObject.set(x, "exitSpanMinDuration", value.asInstanceOf[js.Any])
      
      inline def setExitSpanMinDurationUndefined: Self = StObject.set(x, "exitSpanMinDuration", js.undefined)
      
      inline def setFilterHttpHeaders(value: Boolean): Self = StObject.set(x, "filterHttpHeaders", value.asInstanceOf[js.Any])
      
      inline def setFilterHttpHeadersUndefined: Self = StObject.set(x, "filterHttpHeaders", js.undefined)
      
      inline def setFrameworkName(value: String): Self = StObject.set(x, "frameworkName", value.asInstanceOf[js.Any])
      
      inline def setFrameworkNameUndefined: Self = StObject.set(x, "frameworkName", js.undefined)
      
      inline def setFrameworkVersion(value: String): Self = StObject.set(x, "frameworkVersion", value.asInstanceOf[js.Any])
      
      inline def setFrameworkVersionUndefined: Self = StObject.set(x, "frameworkVersion", js.undefined)
      
      inline def setGlobalLabels(value: KeyValueConfig): Self = StObject.set(x, "globalLabels", value.asInstanceOf[js.Any])
      
      inline def setGlobalLabelsUndefined: Self = StObject.set(x, "globalLabels", js.undefined)
      
      inline def setGlobalLabelsVarargs(value: js.Array[LabelValue]*): Self = StObject.set(x, "globalLabels", js.Array(value*))
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setIgnoreMessageQueues(value: js.Array[String]): Self = StObject.set(x, "ignoreMessageQueues", value.asInstanceOf[js.Any])
      
      inline def setIgnoreMessageQueuesUndefined: Self = StObject.set(x, "ignoreMessageQueues", js.undefined)
      
      inline def setIgnoreMessageQueuesVarargs(value: String*): Self = StObject.set(x, "ignoreMessageQueues", js.Array(value*))
      
      inline def setIgnoreUrls(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "ignoreUrls", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUrlsUndefined: Self = StObject.set(x, "ignoreUrls", js.undefined)
      
      inline def setIgnoreUrlsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ignoreUrls", js.Array(value*))
      
      inline def setIgnoreUserAgents(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "ignoreUserAgents", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUserAgentsUndefined: Self = StObject.set(x, "ignoreUserAgents", js.undefined)
      
      inline def setIgnoreUserAgentsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ignoreUserAgents", js.Array(value*))
      
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
      
      inline def setLongFieldMaxLength(value: Double): Self = StObject.set(x, "longFieldMaxLength", value.asInstanceOf[js.Any])
      
      inline def setLongFieldMaxLengthUndefined: Self = StObject.set(x, "longFieldMaxLength", js.undefined)
      
      inline def setMaxQueueSize(value: Double): Self = StObject.set(x, "maxQueueSize", value.asInstanceOf[js.Any])
      
      inline def setMaxQueueSizeUndefined: Self = StObject.set(x, "maxQueueSize", js.undefined)
      
      inline def setMetricsInterval(value: String): Self = StObject.set(x, "metricsInterval", value.asInstanceOf[js.Any])
      
      inline def setMetricsIntervalUndefined: Self = StObject.set(x, "metricsInterval", js.undefined)
      
      inline def setMetricsLimit(value: Double): Self = StObject.set(x, "metricsLimit", value.asInstanceOf[js.Any])
      
      inline def setMetricsLimitUndefined: Self = StObject.set(x, "metricsLimit", js.undefined)
      
      inline def setPayloadLogFile(value: String): Self = StObject.set(x, "payloadLogFile", value.asInstanceOf[js.Any])
      
      inline def setPayloadLogFileUndefined: Self = StObject.set(x, "payloadLogFile", js.undefined)
      
      inline def setSanitizeFieldNames(value: js.Array[String]): Self = StObject.set(x, "sanitizeFieldNames", value.asInstanceOf[js.Any])
      
      inline def setSanitizeFieldNamesUndefined: Self = StObject.set(x, "sanitizeFieldNames", js.undefined)
      
      inline def setSanitizeFieldNamesVarargs(value: String*): Self = StObject.set(x, "sanitizeFieldNames", js.Array(value*))
      
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
      
      inline def setServiceNodeName(value: String): Self = StObject.set(x, "serviceNodeName", value.asInstanceOf[js.Any])
      
      inline def setServiceNodeNameUndefined: Self = StObject.set(x, "serviceNodeName", js.undefined)
      
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
      
      inline def setSpanCompressionEnabled(value: Boolean): Self = StObject.set(x, "spanCompressionEnabled", value.asInstanceOf[js.Any])
      
      inline def setSpanCompressionEnabledUndefined: Self = StObject.set(x, "spanCompressionEnabled", js.undefined)
      
      inline def setSpanCompressionExactMatchMaxDuration(value: String): Self = StObject.set(x, "spanCompressionExactMatchMaxDuration", value.asInstanceOf[js.Any])
      
      inline def setSpanCompressionExactMatchMaxDurationUndefined: Self = StObject.set(x, "spanCompressionExactMatchMaxDuration", js.undefined)
      
      inline def setSpanCompressionSameKindMaxDuration(value: String): Self = StObject.set(x, "spanCompressionSameKindMaxDuration", value.asInstanceOf[js.Any])
      
      inline def setSpanCompressionSameKindMaxDurationUndefined: Self = StObject.set(x, "spanCompressionSameKindMaxDuration", js.undefined)
      
      inline def setSpanFramesMinDuration(value: String): Self = StObject.set(x, "spanFramesMinDuration", value.asInstanceOf[js.Any])
      
      inline def setSpanFramesMinDurationUndefined: Self = StObject.set(x, "spanFramesMinDuration", js.undefined)
      
      inline def setSpanStackTraceMinDuration(value: String): Self = StObject.set(x, "spanStackTraceMinDuration", value.asInstanceOf[js.Any])
      
      inline def setSpanStackTraceMinDurationUndefined: Self = StObject.set(x, "spanStackTraceMinDuration", js.undefined)
      
      inline def setStackTraceLimit(value: Double): Self = StObject.set(x, "stackTraceLimit", value.asInstanceOf[js.Any])
      
      inline def setStackTraceLimitUndefined: Self = StObject.set(x, "stackTraceLimit", js.undefined)
      
      inline def setTraceContinuationStrategy(value: TraceContinuationStrategy): Self = StObject.set(x, "traceContinuationStrategy", value.asInstanceOf[js.Any])
      
      inline def setTraceContinuationStrategyUndefined: Self = StObject.set(x, "traceContinuationStrategy", js.undefined)
      
      inline def setTransactionIgnoreUrls(value: js.Array[String]): Self = StObject.set(x, "transactionIgnoreUrls", value.asInstanceOf[js.Any])
      
      inline def setTransactionIgnoreUrlsUndefined: Self = StObject.set(x, "transactionIgnoreUrls", js.undefined)
      
      inline def setTransactionIgnoreUrlsVarargs(value: String*): Self = StObject.set(x, "transactionIgnoreUrls", js.Array(value*))
      
      inline def setTransactionMaxSpans(value: Double): Self = StObject.set(x, "transactionMaxSpans", value.asInstanceOf[js.Any])
      
      inline def setTransactionMaxSpansUndefined: Self = StObject.set(x, "transactionMaxSpans", js.undefined)
      
      inline def setTransactionSampleRate(value: Double): Self = StObject.set(x, "transactionSampleRate", value.asInstanceOf[js.Any])
      
      inline def setTransactionSampleRateUndefined: Self = StObject.set(x, "transactionSampleRate", js.undefined)
      
      inline def setUseElasticTraceparentHeader(value: Boolean): Self = StObject.set(x, "useElasticTraceparentHeader", value.asInstanceOf[js.Any])
      
      inline def setUseElasticTraceparentHeaderUndefined: Self = StObject.set(x, "useElasticTraceparentHeader", js.undefined)
      
      inline def setUsePathAsTransactionName(value: Boolean): Self = StObject.set(x, "usePathAsTransactionName", value.asInstanceOf[js.Any])
      
      inline def setUsePathAsTransactionNameUndefined: Self = StObject.set(x, "usePathAsTransactionName", js.undefined)
      
      inline def setVerifyServerCert(value: Boolean): Self = StObject.set(x, "verifyServerCert", value.asInstanceOf[js.Any])
      
      inline def setVerifyServerCertUndefined: Self = StObject.set(x, "verifyServerCert", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.elasticApmNode.elasticApmNodeStrings.off
    - typings.elasticApmNode.elasticApmNodeStrings.errors
    - typings.elasticApmNode.elasticApmNodeStrings.transactions
    - typings.elasticApmNode.elasticApmNodeStrings.all
  */
  trait CaptureBody extends StObject
  object CaptureBody {
    
    inline def all: typings.elasticApmNode.elasticApmNodeStrings.all = "all".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.all]
    
    inline def errors: typings.elasticApmNode.elasticApmNodeStrings.errors = "errors".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.errors]
    
    inline def off: typings.elasticApmNode.elasticApmNodeStrings.off = "off".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.off]
    
    inline def transactions: typings.elasticApmNode.elasticApmNodeStrings.transactions = "transactions".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.transactions]
  }
  
  type CaptureErrorCallback = js.Function2[/* err */ js.Error | Null, /* id */ String, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.elasticApmNode.elasticApmNodeStrings.never
    - typings.elasticApmNode.elasticApmNodeStrings.messages
    - typings.elasticApmNode.elasticApmNodeStrings.always
  */
  trait CaptureErrorLogStackTraces extends StObject
  object CaptureErrorLogStackTraces {
    
    inline def always: typings.elasticApmNode.elasticApmNodeStrings.always = "always".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.always]
    
    inline def messages: typings.elasticApmNode.elasticApmNodeStrings.messages = "messages".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.messages]
    
    inline def never: typings.elasticApmNode.elasticApmNodeStrings.never = "never".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.never]
  }
  
  trait CaptureErrorOptions extends StObject {
    
    var captureAttributes: js.UndefOr[Boolean] = js.undefined
    
    var custom: js.UndefOr[js.Object] = js.undefined
    
    var handled: js.UndefOr[Boolean] = js.undefined
    
    var labels: js.UndefOr[Labels] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var request: js.UndefOr[IncomingMessage] = js.undefined
    
    var response: js.UndefOr[ServerResponse[IncomingMessage]] = js.undefined
    
    var skipOutcome: js.UndefOr[Boolean] = js.undefined
    
    var tags: js.UndefOr[Labels] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
    
    var user: js.UndefOr[UserObject] = js.undefined
  }
  object CaptureErrorOptions {
    
    inline def apply(): CaptureErrorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptureErrorOptions]
    }
    
    extension [Self <: CaptureErrorOptions](x: Self) {
      
      inline def setCaptureAttributes(value: Boolean): Self = StObject.set(x, "captureAttributes", value.asInstanceOf[js.Any])
      
      inline def setCaptureAttributesUndefined: Self = StObject.set(x, "captureAttributes", js.undefined)
      
      inline def setCustom(value: js.Object): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
      
      inline def setHandledUndefined: Self = StObject.set(x, "handled", js.undefined)
      
      inline def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setRequest(value: IncomingMessage): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setResponse(value: ServerResponse[IncomingMessage]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
      
      inline def setSkipOutcome(value: Boolean): Self = StObject.set(x, "skipOutcome", value.asInstanceOf[js.Any])
      
      inline def setSkipOutcomeUndefined: Self = StObject.set(x, "skipOutcome", js.undefined)
      
      inline def setTags(value: Labels): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setUser(value: UserObject): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  type FilterFn = js.Function1[/* payload */ Payload, Payload | Boolean | Unit]
  
  type KeyValueConfig = String | Labels | js.Array[js.Array[LabelValue]]
  
  type LabelValue = js.UndefOr[String | Double | Boolean | Null]
  
  type Labels = StringDictionary[LabelValue]
  
  trait Link extends StObject {
    
    /** A W3C trace-context 'traceparent' string, Transaction, or Span. */
    var context: Transaction | Span | String
  }
  object Link {
    
    inline def apply(context: Transaction | Span | String): Link = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setContext(value: Transaction | Span | String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.elasticApmNode.elasticApmNodeStrings.trace
    - typings.elasticApmNode.elasticApmNodeStrings.debug
    - typings.elasticApmNode.elasticApmNodeStrings.info
    - typings.elasticApmNode.elasticApmNodeStrings.warn
    - typings.elasticApmNode.elasticApmNodeStrings.warning
    - typings.elasticApmNode.elasticApmNodeStrings.error
    - typings.elasticApmNode.elasticApmNodeStrings.fatal
    - typings.elasticApmNode.elasticApmNodeStrings.critical
    - typings.elasticApmNode.elasticApmNodeStrings.off
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def critical: typings.elasticApmNode.elasticApmNodeStrings.critical = "critical".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.critical]
    
    inline def debug: typings.elasticApmNode.elasticApmNodeStrings.debug = "debug".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.debug]
    
    inline def error: typings.elasticApmNode.elasticApmNodeStrings.error = "error".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.error]
    
    inline def fatal: typings.elasticApmNode.elasticApmNodeStrings.fatal = "fatal".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.fatal]
    
    inline def info: typings.elasticApmNode.elasticApmNodeStrings.info = "info".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.info]
    
    inline def off: typings.elasticApmNode.elasticApmNodeStrings.off = "off".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.off]
    
    inline def trace: typings.elasticApmNode.elasticApmNodeStrings.trace = "trace".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.trace]
    
    inline def warn: typings.elasticApmNode.elasticApmNodeStrings.warn = "warn".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.warn]
    
    inline def warning: typings.elasticApmNode.elasticApmNodeStrings.warning = "warning".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.warning]
  }
  
  @js.native
  trait Logger
    extends StObject
       with // Allow a passed in Logger that has other properties, as a Pino logger
  // does. Discussion:
  // https://github.com/elastic/apm-agent-nodejs/pull/926/files#r266239656
  /* propName */ StringDictionary[Any] {
    
    def debug(msg: String, args: Any*): Unit = js.native
    def debug(obj: js.Object, msg: String, args: Any*): Unit = js.native
    def debug(obj: js.Object, msg: Unit, args: Any*): Unit = js.native
    
    def error(msg: String, args: Any*): Unit = js.native
    def error(obj: js.Object, msg: String, args: Any*): Unit = js.native
    def error(obj: js.Object, msg: Unit, args: Any*): Unit = js.native
    
    // Defining overloaded methods rather than a separate `interface LogFn`
    // as @types/pino does, because the IDE completion shows these as *methods*
    // rather than as properties, which is slightly nicer.
    def fatal(msg: String, args: Any*): Unit = js.native
    def fatal(obj: js.Object, msg: String, args: Any*): Unit = js.native
    def fatal(obj: js.Object, msg: Unit, args: Any*): Unit = js.native
    
    def info(msg: String, args: Any*): Unit = js.native
    def info(obj: js.Object, msg: String, args: Any*): Unit = js.native
    def info(obj: js.Object, msg: Unit, args: Any*): Unit = js.native
    
    def trace(msg: String, args: Any*): Unit = js.native
    def trace(obj: js.Object, msg: String, args: Any*): Unit = js.native
    def trace(obj: js.Object, msg: Unit, args: Any*): Unit = js.native
    
    def warn(msg: String, args: Any*): Unit = js.native
    def warn(obj: js.Object, msg: String, args: Any*): Unit = js.native
    def warn(obj: js.Object, msg: Unit, args: Any*): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.elasticApmNode.elasticApmNodeStrings.unknown
    - typings.elasticApmNode.elasticApmNodeStrings.success
    - typings.elasticApmNode.elasticApmNodeStrings.failure
  */
  trait Outcome extends StObject
  object Outcome {
    
    inline def failure: typings.elasticApmNode.elasticApmNodeStrings.failure = "failure".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.failure]
    
    inline def success: typings.elasticApmNode.elasticApmNodeStrings.success = "success".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.success]
    
    inline def unknown: typings.elasticApmNode.elasticApmNodeStrings.unknown = "unknown".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.unknown]
  }
  
  trait ParameterizedMessageObject extends StObject {
    
    var message: String
    
    var params: js.Array[Any]
  }
  object ParameterizedMessageObject {
    
    inline def apply(message: String, params: js.Array[Any]): ParameterizedMessageObject = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParameterizedMessageObject]
    }
    
    extension [Self <: ParameterizedMessageObject](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
    }
  }
  
  type PatchHandler = js.Function3[/* exports */ Any, /* agent */ Agent, /* options */ PatchOptions, Any]
  
  trait PatchOptions extends StObject {
    
    var enabled: Boolean
    
    var version: js.UndefOr[String] = js.undefined
  }
  object PatchOptions {
    
    inline def apply(enabled: Boolean): PatchOptions = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[PatchOptions]
    }
    
    extension [Self <: PatchOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type Payload = StringDictionary[Any]
  
  @js.native
  trait Span extends StObject {
    
    var action: String | Null = js.native
    
    def addLabels(labels: Labels): Boolean = js.native
    def addLabels(labels: Labels, stringify: Boolean): Boolean = js.native
    
    def end(): Unit = js.native
    def end(endTime: Double): Unit = js.native
    
    var ids: SpanidTraceid = js.native
    
    var name: String = js.native
    
    var outcome: Outcome = js.native
    
    def setLabel(name: String, value: LabelValue): Boolean = js.native
    def setLabel(name: String, value: LabelValue, stringify: Boolean): Boolean = js.native
    
    def setOutcome(outcome: Outcome): Unit = js.native
    
    def setType(): Unit = js.native
    def setType(`type`: String): Unit = js.native
    def setType(`type`: String, subtype: String): Unit = js.native
    def setType(`type`: String, subtype: String, action: String): Unit = js.native
    def setType(`type`: String, subtype: Null, action: String): Unit = js.native
    def setType(`type`: String, subtype: Unit, action: String): Unit = js.native
    def setType(`type`: Null, subtype: String): Unit = js.native
    def setType(`type`: Null, subtype: String, action: String): Unit = js.native
    def setType(`type`: Null, subtype: Null, action: String): Unit = js.native
    def setType(`type`: Null, subtype: Unit, action: String): Unit = js.native
    def setType(`type`: Unit, subtype: String): Unit = js.native
    def setType(`type`: Unit, subtype: String, action: String): Unit = js.native
    def setType(`type`: Unit, subtype: Null, action: String): Unit = js.native
    def setType(`type`: Unit, subtype: Unit, action: String): Unit = js.native
    
    var subtype: String | Null = js.native
    
    var traceparent: String = js.native
    
    // The following properties and methods are currently not documented as their API isn't considered official:
    // - timestamp, ended, id, traceId, parentId, sampled, duration()
    // - customStackTrace(), setDbContext()
    var transaction: Transaction = js.native
    
    var `type`: String | Null = js.native
  }
  
  trait SpanOptions extends StObject {
    
    var childOf: js.UndefOr[Transaction | Span | String] = js.undefined
    
    var exitSpan: js.UndefOr[Boolean] = js.undefined
    
    var links: js.UndefOr[js.Array[Link]] = js.undefined
    
    var startTime: js.UndefOr[Double] = js.undefined
  }
  object SpanOptions {
    
    inline def apply(): SpanOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpanOptions]
    }
    
    extension [Self <: SpanOptions](x: Self) {
      
      inline def setChildOf(value: Transaction | Span | String): Self = StObject.set(x, "childOf", value.asInstanceOf[js.Any])
      
      inline def setChildOfUndefined: Self = StObject.set(x, "childOf", js.undefined)
      
      inline def setExitSpan(value: Boolean): Self = StObject.set(x, "exitSpan", value.asInstanceOf[js.Any])
      
      inline def setExitSpanUndefined: Self = StObject.set(x, "exitSpan", js.undefined)
      
      inline def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.elasticApmNode.elasticApmNodeStrings.continue
    - typings.elasticApmNode.elasticApmNodeStrings.restart
    - typings.elasticApmNode.elasticApmNodeStrings.restart_external
  */
  trait TraceContinuationStrategy extends StObject
  object TraceContinuationStrategy {
    
    inline def continue: typings.elasticApmNode.elasticApmNodeStrings.continue = "continue".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.continue]
    
    inline def restart: typings.elasticApmNode.elasticApmNodeStrings.restart = "restart".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.restart]
    
    inline def restart_external: typings.elasticApmNode.elasticApmNodeStrings.restart_external = "restart_external".asInstanceOf[typings.elasticApmNode.elasticApmNodeStrings.restart_external]
  }
  
  @js.native
  trait Transaction extends StObject {
    
    /**
      * @deprecated Transaction 'action' is not used.
      */
    var action: String | Null = js.native
    
    def addLabels(labels: Labels): Boolean = js.native
    def addLabels(labels: Labels, stringify: Boolean): Boolean = js.native
    
    def end(): Unit = js.native
    def end(result: String): Unit = js.native
    def end(result: String, endTime: Double): Unit = js.native
    def end(result: Double): Unit = js.native
    def end(result: Double, endTime: Double): Unit = js.native
    def end(result: Null, endTime: Double): Unit = js.native
    def end(result: Unit, endTime: Double): Unit = js.native
    
    def ensureParentId(): String = js.native
    
    var ids: Traceid = js.native
    
    // The following properties and methods are currently not documented as their API isn't considered official:
    // - timestamp, ended, id, traceId, parentId, sampled, duration()
    // - setUserContext(), setCustomContext(), toJSON(), setDefaultName(), setDefaultNameFromRequest()
    var name: String = js.native
    
    var outcome: Outcome = js.native
    
    var result: String | Double = js.native
    
    def setLabel(name: String, value: LabelValue): Boolean = js.native
    def setLabel(name: String, value: LabelValue, stringify: Boolean): Boolean = js.native
    
    def setOutcome(outcome: Outcome): Unit = js.native
    
    def setType(): Unit = js.native
    def setType(`type`: String): Unit = js.native
    def setType(`type`: String, subtype: String): Unit = js.native
    def setType(`type`: String, subtype: String, action: String): Unit = js.native
    def setType(`type`: String, subtype: Null, action: String): Unit = js.native
    def setType(`type`: String, subtype: Unit, action: String): Unit = js.native
    def setType(`type`: Null, subtype: String): Unit = js.native
    def setType(`type`: Null, subtype: String, action: String): Unit = js.native
    def setType(`type`: Null, subtype: Null, action: String): Unit = js.native
    def setType(`type`: Null, subtype: Unit, action: String): Unit = js.native
    def setType(`type`: Unit, subtype: String): Unit = js.native
    def setType(`type`: Unit, subtype: String, action: String): Unit = js.native
    def setType(`type`: Unit, subtype: Null, action: String): Unit = js.native
    def setType(`type`: Unit, subtype: Unit, action: String): Unit = js.native
    
    def startSpan(): Span | Null = js.native
    def startSpan(name: String): Span | Null = js.native
    def startSpan(name: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: String): Span | Null = js.native
    def startSpan(name: String, `type`: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: String): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: String, action: String): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: String, action: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: String, action: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: Null, action: String): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: Null, action: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: Null, action: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: String, subtype: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: String): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: String, action: String): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: String, action: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: String, action: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: Null, action: String): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: Null, action: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: Null, action: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: String, `type`: Null, subtype: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: String): Span | Null = js.native
    def startSpan(name: Null, `type`: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: String): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: String, action: String): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: String, action: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: String, action: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: Null, action: String): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: Null, action: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: Null, action: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: String, subtype: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: String): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: String, action: String): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: String, action: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: String, action: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: Null, action: String): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: Null, action: String, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: Null, action: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Null, `type`: Null, subtype: Null, options: SpanOptions): Span | Null = js.native
    def startSpan(name: Unit, options: SpanOptions): Span | Null = js.native
    
    /**
      * @deprecated Transaction 'subtype' is not used.
      */
    var subtype: String | Null = js.native
    
    var traceparent: String = js.native
    
    var `type`: String | Null = js.native
  }
  
  trait TransactionOptions extends StObject {
    
    var childOf: js.UndefOr[Transaction | Span | String] = js.undefined
    
    var links: js.UndefOr[js.Array[Link]] = js.undefined
    
    var startTime: js.UndefOr[Double] = js.undefined
  }
  object TransactionOptions {
    
    inline def apply(): TransactionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactionOptions]
    }
    
    extension [Self <: TransactionOptions](x: Self) {
      
      inline def setChildOf(value: Transaction | Span | String): Self = StObject.set(x, "childOf", value.asInstanceOf[js.Any])
      
      inline def setChildOfUndefined: Self = StObject.set(x, "childOf", js.undefined)
      
      inline def setLinks(value: js.Array[Link]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
      
      inline def setLinksVarargs(value: Link*): Self = StObject.set(x, "links", js.Array(value*))
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    }
  }
  
  trait UserObject extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String | Double] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object UserObject {
    
    inline def apply(): UserObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserObject]
    }
    
    extension [Self <: UserObject](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  type _To = Agent
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Agent = ^
}
