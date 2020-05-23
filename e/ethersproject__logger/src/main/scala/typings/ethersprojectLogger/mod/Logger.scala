package typings.ethersprojectLogger.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/logger", "Logger")
@js.native
class Logger protected () extends js.Object {
  def this(version: String) = this()
  val version: String = js.native
  def _log(logLevel: LogLevel, args: js.Array[_]): Unit = js.native
  def checkAbstract(target: js.Any, kind: js.Any): Unit = js.native
  def checkArgumentCount(count: Double, expectedCount: Double): Unit = js.native
  def checkArgumentCount(count: Double, expectedCount: Double, message: String): Unit = js.native
  def checkNew(target: js.Any, kind: js.Any): Unit = js.native
  def checkNormalize(): Unit = js.native
  def checkNormalize(message: String): Unit = js.native
  def checkSafeUint53(value: Double): Unit = js.native
  def checkSafeUint53(value: Double, message: String): Unit = js.native
  def debug(args: js.Any*): Unit = js.native
  def info(args: js.Any*): Unit = js.native
  def makeError(message: String): Error = js.native
  def makeError(message: String, code: ErrorCode): Error = js.native
  def makeError(message: String, code: ErrorCode, params: js.Any): Error = js.native
  def throwArgumentError(message: String, name: String, value: js.Any): scala.Nothing = js.native
  def throwError(message: String): scala.Nothing = js.native
  def throwError(message: String, code: ErrorCode): scala.Nothing = js.native
  def throwError(message: String, code: ErrorCode, params: js.Any): scala.Nothing = js.native
  def warn(args: js.Any*): Unit = js.native
}

/* static members */
@JSImport("@ethersproject/logger", "Logger")
@js.native
object Logger extends js.Object {
  var errors: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCode */ js.Any = js.native
  var levels: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LogLevel */ js.Any = js.native
  def globalLogger(): Logger = js.native
  def setCensorship(censorship: Boolean): Unit = js.native
  def setCensorship(censorship: Boolean, permanent: Boolean): Unit = js.native
  def setLogLevel(logLevel: LogLevel): Unit = js.native
}

