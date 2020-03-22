package typings.firebase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The JS SDK supports 5 log levels and also allows a user the ability to
  * silence the logs altogether.
  *
  * The order is as follows:
  * silent < debug < verbose < info < warn < error
  */
/* Rewritten from type alias, can be one of: 
  - typings.firebase.firebaseStrings.debug
  - typings.firebase.firebaseStrings.verbose
  - typings.firebase.firebaseStrings.info
  - typings.firebase.firebaseStrings.warn
  - typings.firebase.firebaseStrings.error
  - typings.firebase.firebaseStrings.silent
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.firebase.firebaseStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.firebase.firebaseStrings.error = this.cast("error")
  @scala.inline
  def info: typings.firebase.firebaseStrings.info = this.cast("info")
  @scala.inline
  def silent: typings.firebase.firebaseStrings.silent = this.cast("silent")
  @scala.inline
  def verbose: typings.firebase.firebaseStrings.verbose = this.cast("verbose")
  @scala.inline
  def warn: typings.firebase.firebaseStrings.warn = this.cast("warn")
}

