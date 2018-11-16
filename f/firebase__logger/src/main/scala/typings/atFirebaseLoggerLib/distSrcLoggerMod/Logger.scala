package typings
package atFirebaseLoggerLib.distSrcLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/logger/dist/src/logger", "Logger")
@js.native
class Logger protected () extends js.Object {
  /**
       * Gives you an instance of a Logger to capture messages according to
       * Firebase's logging scheme.
       *
       * @param name The name that the logs will be associated with
       */
  def this(name: java.lang.String) = this()
  /**
       * The log handler for the Logger instance.
       */
  var _logHandler: js.Any = js.native
  /**
       * The log level of the given Logger instance.
       */
  var _logLevel: js.Any = js.native
  @JSName("logHandler")
  var logHandler_Original: LogHandler = js.native
  var logLevel: LogLevel = js.native
  var name: java.lang.String = js.native
  /**
       * The functions below are all based on the `console` interface
       */
  def debug(args: js.Any*): scala.Unit = js.native
  def error(args: js.Any*): scala.Unit = js.native
  def info(args: js.Any*): scala.Unit = js.native
  def log(args: js.Any*): scala.Unit = js.native
  def logHandler(loggerInstance: Logger, logType: LogLevel, args: js.Any*): scala.Unit = js.native
  def warn(args: js.Any*): scala.Unit = js.native
}

