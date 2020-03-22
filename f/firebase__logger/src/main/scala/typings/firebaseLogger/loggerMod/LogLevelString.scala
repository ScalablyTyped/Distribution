package typings.firebaseLogger.loggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseLogger.firebaseLoggerStrings.debug
  - typings.firebaseLogger.firebaseLoggerStrings.verbose
  - typings.firebaseLogger.firebaseLoggerStrings.info
  - typings.firebaseLogger.firebaseLoggerStrings.warn
  - typings.firebaseLogger.firebaseLoggerStrings.error
  - typings.firebaseLogger.firebaseLoggerStrings.silent
*/
trait LogLevelString extends js.Object

object LogLevelString {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.firebaseLogger.firebaseLoggerStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.firebaseLogger.firebaseLoggerStrings.error = this.cast("error")
  @scala.inline
  def info: typings.firebaseLogger.firebaseLoggerStrings.info = this.cast("info")
  @scala.inline
  def silent: typings.firebaseLogger.firebaseLoggerStrings.silent = this.cast("silent")
  @scala.inline
  def verbose: typings.firebaseLogger.firebaseLoggerStrings.verbose = this.cast("verbose")
  @scala.inline
  def warn: typings.firebaseLogger.firebaseLoggerStrings.warn = this.cast("warn")
}

