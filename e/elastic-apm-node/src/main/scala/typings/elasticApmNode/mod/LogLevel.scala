package typings.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.elasticApmNode.elasticApmNodeStrings.trace
  - typings.elasticApmNode.elasticApmNodeStrings.debug
  - typings.elasticApmNode.elasticApmNodeStrings.info
  - typings.elasticApmNode.elasticApmNodeStrings.warn
  - typings.elasticApmNode.elasticApmNodeStrings.error
  - typings.elasticApmNode.elasticApmNodeStrings.fatal
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.elasticApmNode.elasticApmNodeStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.elasticApmNode.elasticApmNodeStrings.error = this.cast("error")
  @scala.inline
  def fatal: typings.elasticApmNode.elasticApmNodeStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typings.elasticApmNode.elasticApmNodeStrings.info = this.cast("info")
  @scala.inline
  def trace: typings.elasticApmNode.elasticApmNodeStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typings.elasticApmNode.elasticApmNodeStrings.warn = this.cast("warn")
}

