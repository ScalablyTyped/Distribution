package typings.expo.remoteLoggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.expo.expoStrings.debug
  - typings.expo.expoStrings.info
  - typings.expo.expoStrings.warn
  - typings.expo.expoStrings.error
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.expo.expoStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.expo.expoStrings.error = this.cast("error")
  @scala.inline
  def info: typings.expo.expoStrings.info = this.cast("info")
  @scala.inline
  def warn: typings.expo.expoStrings.warn = this.cast("warn")
}

