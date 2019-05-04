package typings
package elasticDashApmDashNodeLib.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Agent
  extends Taggable
     with StartSpanFn {
  var currentSpan: Span | scala.Null = js.native
  // Distributed Tracing
  var currentTraceparent: java.lang.String | scala.Null = js.native
  var currentTransaction: Transaction | scala.Null = js.native
  // Utils
  var logger: Logger = js.native
  // Data collection hooks
  var middleware: elasticDashApmDashNodeLib.Anon_Connect = js.native
  def addErrorFilter(fn: FilterFn): scala.Unit = js.native
  // Transport
  def addFilter(fn: FilterFn): scala.Unit = js.native
  def addPatch(name: java.lang.String, handler: PatchHandler): scala.Unit = js.native
  def addPatch(name: java.lang.String, handler: java.lang.String): scala.Unit = js.native
  def addSpanFilter(fn: FilterFn): scala.Unit = js.native
  def addTransactionFilter(fn: FilterFn): scala.Unit = js.native
  def captureError(err: ParameterizedMessageObject): scala.Unit = js.native
  def captureError(err: ParameterizedMessageObject, callback: CaptureErrorCallback): scala.Unit = js.native
  def captureError(err: ParameterizedMessageObject, options: CaptureErrorOptions): scala.Unit = js.native
  def captureError(err: ParameterizedMessageObject, options: CaptureErrorOptions, callback: CaptureErrorCallback): scala.Unit = js.native
  def captureError(err: java.lang.String): scala.Unit = js.native
  def captureError(err: java.lang.String, callback: CaptureErrorCallback): scala.Unit = js.native
  def captureError(err: java.lang.String, options: CaptureErrorOptions): scala.Unit = js.native
  def captureError(err: java.lang.String, options: CaptureErrorOptions, callback: CaptureErrorCallback): scala.Unit = js.native
  // Errors
  def captureError(err: stdLib.Error): scala.Unit = js.native
  def captureError(err: stdLib.Error, callback: CaptureErrorCallback): scala.Unit = js.native
  def captureError(err: stdLib.Error, options: CaptureErrorOptions): scala.Unit = js.native
  def captureError(err: stdLib.Error, options: CaptureErrorOptions, callback: CaptureErrorCallback): scala.Unit = js.native
  def clearPatches(name: java.lang.String): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def endTransaction(): scala.Unit = js.native
  def endTransaction(result: java.lang.String): scala.Unit = js.native
  def endTransaction(result: java.lang.String, endTime: scala.Double): scala.Unit = js.native
  def endTransaction(result: scala.Double): scala.Unit = js.native
  def endTransaction(result: scala.Double, endTime: scala.Double): scala.Unit = js.native
  def flush(): scala.Unit = js.native
  def flush(callback: js.Function): scala.Unit = js.native
  def handleUncaughtExceptions(): scala.Unit = js.native
  def handleUncaughtExceptions(fn: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def isStarted(): scala.Boolean = js.native
  def lambda(handler: elasticDashApmDashNodeLib.elasticDashApmDashNodeMod.AwsLambdaNs.Handler[_, _]): elasticDashApmDashNodeLib.elasticDashApmDashNodeMod.AwsLambdaNs.Handler[_, _] = js.native
  def lambda(
    `type`: java.lang.String,
    handler: elasticDashApmDashNodeLib.elasticDashApmDashNodeMod.AwsLambdaNs.Handler[_, _]
  ): elasticDashApmDashNodeLib.elasticDashApmDashNodeMod.AwsLambdaNs.Handler[_, _] = js.native
  def removePatch(name: java.lang.String, handler: PatchHandler): scala.Unit = js.native
  def removePatch(name: java.lang.String, handler: java.lang.String): scala.Unit = js.native
  def setCustomContext(custom: js.Object): scala.Unit = js.native
  def setFramework(options: elasticDashApmDashNodeLib.Anon_Name): scala.Unit = js.native
  def setTransactionName(name: java.lang.String): scala.Unit = js.native
   // Deprecated
  def setUserContext(user: UserObject): scala.Unit = js.native
  // Configuration
  def start(): Agent = js.native
  def start(options: AgentConfigOptions): Agent = js.native
  // Transactions
  def startTransaction(): Transaction | scala.Null = js.native
  def startTransaction(name: java.lang.String): Transaction | scala.Null = js.native
  def startTransaction(name: java.lang.String, `type`: java.lang.String): Transaction | scala.Null = js.native
  def startTransaction(name: java.lang.String, `type`: java.lang.String, options: TransactionOptions): Transaction | scala.Null = js.native
}

