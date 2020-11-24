package typings.entropyWinstonElasticsearchApm

import typings.elasticApmNode.anon.Name
import typings.elasticApmNode.anon.Spanid
import typings.elasticApmNode.mod.Agent
import typings.elasticApmNode.mod.AgentConfigOptions
import typings.elasticApmNode.mod.AwsLambda.Handler
import typings.elasticApmNode.mod.CaptureErrorCallback
import typings.elasticApmNode.mod.CaptureErrorOptions
import typings.elasticApmNode.mod.FilterFn
import typings.elasticApmNode.mod.LabelValue
import typings.elasticApmNode.mod.Labels
import typings.elasticApmNode.mod.Logger
import typings.elasticApmNode.mod.ParameterizedMessageObject
import typings.elasticApmNode.mod.PatchHandler
import typings.elasticApmNode.mod.Span
import typings.elasticApmNode.mod.SpanOptions
import typings.elasticApmNode.mod.Transaction
import typings.elasticApmNode.mod.TransactionOptions
import typings.elasticApmNode.mod.UserObject
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  /* Inlined { readonly AwsLambda,  readonly Connect} & elastic-apm-node.elastic-apm-node.Agent */
  @js.native
  trait readonlyAwsLambdareadonly extends js.Object {
    
    // Inlined from @types/aws-lambda - start
    val AwsLambda: js.Any = js.native
    
    // Inlined from @types/connect - start
    val Connect: js.Any = js.native
    
    def addErrorFilter(fn: FilterFn): Unit = js.native
    
    // Transport
    def addFilter(fn: FilterFn): Unit = js.native
    
    def addLabels(labels: Labels): Boolean = js.native
    
    def addPatch(modules: String, handler: String): Unit = js.native
    def addPatch(modules: String, handler: PatchHandler): Unit = js.native
    def addPatch(modules: js.Array[String], handler: String): Unit = js.native
    def addPatch(modules: js.Array[String], handler: PatchHandler): Unit = js.native
    
    def addSpanFilter(fn: FilterFn): Unit = js.native
    
    def addTransactionFilter(fn: FilterFn): Unit = js.native
    
    def captureError(err: String): Unit = js.native
    def captureError(err: String, callback: CaptureErrorCallback): Unit = js.native
    def captureError(err: String, options: js.UndefOr[scala.Nothing], callback: CaptureErrorCallback): Unit = js.native
    def captureError(err: String, options: CaptureErrorOptions): Unit = js.native
    def captureError(err: String, options: CaptureErrorOptions, callback: CaptureErrorCallback): Unit = js.native
    def captureError(err: ParameterizedMessageObject): Unit = js.native
    def captureError(err: ParameterizedMessageObject, callback: CaptureErrorCallback): Unit = js.native
    def captureError(
      err: ParameterizedMessageObject,
      options: js.UndefOr[scala.Nothing],
      callback: CaptureErrorCallback
    ): Unit = js.native
    def captureError(err: ParameterizedMessageObject, options: CaptureErrorOptions): Unit = js.native
    def captureError(err: ParameterizedMessageObject, options: CaptureErrorOptions, callback: CaptureErrorCallback): Unit = js.native
    // Errors
    def captureError(err: Error): Unit = js.native
    def captureError(err: Error, callback: CaptureErrorCallback): Unit = js.native
    def captureError(err: Error, options: js.UndefOr[scala.Nothing], callback: CaptureErrorCallback): Unit = js.native
    def captureError(err: Error, options: CaptureErrorOptions): Unit = js.native
    def captureError(err: Error, options: CaptureErrorOptions, callback: CaptureErrorCallback): Unit = js.native
    
    def clearPatches(modules: String): Unit = js.native
    def clearPatches(modules: js.Array[String]): Unit = js.native
    
    var currentSpan: Span | Null = js.native
    
    var currentTraceIds: Spanid = js.native
    
    // Distributed Tracing
    var currentTraceparent: String | Null = js.native
    
    var currentTransaction: Transaction | Null = js.native
    
    def destroy(): Unit = js.native
    
    def endTransaction(): Unit = js.native
    def endTransaction(result: js.UndefOr[scala.Nothing], endTime: Double): Unit = js.native
    def endTransaction(result: String): Unit = js.native
    def endTransaction(result: String, endTime: Double): Unit = js.native
    def endTransaction(result: Double): Unit = js.native
    def endTransaction(result: Double, endTime: Double): Unit = js.native
    
    def flush(): Unit = js.native
    def flush(callback: js.Function): Unit = js.native
    
    def handleUncaughtExceptions(): Unit = js.native
    def handleUncaughtExceptions(fn: js.Function1[/* err */ Error, Unit]): Unit = js.native
    
    def isStarted(): Boolean = js.native
    
    def lambda(handler: Handler[_, _]): Handler[_, _] = js.native
    def lambda(`type`: String, handler: Handler[_, _]): Handler[_, _] = js.native
    
    // Utils
    var logger: Logger = js.native
    
    // Data collection hooks
    var middleware: typings.elasticApmNode.anon.Connect = js.native
    
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
    
    def setTransactionName(name: String): Unit = js.native
    
    def setUserContext(user: UserObject): Unit = js.native
    
    // Configuration
    def start(): Agent = js.native
    def start(options: AgentConfigOptions): Agent = js.native
    
    // Spans
    def startSpan(): Span | Null = js.native
    def startSpan(name: js.UndefOr[scala.Nothing], options: SpanOptions): Span | Null = js.native
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
    
    // Transactions
    def startTransaction(): Transaction | Null = js.native
    def startTransaction(name: js.UndefOr[scala.Nothing], options: TransactionOptions): Transaction | Null = js.native
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
  }
}
