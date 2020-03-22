package typings.firebaseLogger.loggerMod

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
  def this(name: String) = this()
  /**
    * The main (internal) log handler for the Logger instance.
    * Can be set to a new function in internal package code but not by user.
    */
  var _logHandler: js.Any = js.native
  /**
    * The log level of the given Logger instance.
    */
  var _logLevel: js.Any = js.native
  /**
    * The optional, additional, user-defined log handler for the Logger instance.
    */
  var _userLogHandler: js.Any = js.native
  var name: String = js.native
  /**
    * The functions below are all based on the `console` interface
    */
  def debug(args: js.Any*): Unit = js.native
  def error(args: js.Any*): Unit = js.native
  def info(args: js.Any*): Unit = js.native
  def log(args: js.Any*): Unit = js.native
  def logHandler(): LogHandler = js.native
  def logHandler(`val`: LogHandler): js.Any = js.native
  def logLevel(): LogLevel = js.native
  def logLevel(`val`: LogLevel): js.Any = js.native
  def userLogHandler(): js.Any = js.native
  def userLogHandler(`val`: LogHandler): js.Any = js.native
  @JSName("userLogHandler")
  def userLogHandler_Union(): LogHandler | Null = js.native
  def warn(args: js.Any*): Unit = js.native
}

