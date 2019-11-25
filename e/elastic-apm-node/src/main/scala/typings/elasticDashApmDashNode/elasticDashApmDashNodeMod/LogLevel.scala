package typings.elasticDashApmDashNode.elasticDashApmDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.elasticDashApmDashNode.elasticDashApmDashNodeStrings.trace
  - typings.elasticDashApmDashNode.elasticDashApmDashNodeStrings.debug
  - typings.elasticDashApmDashNode.elasticDashApmDashNodeStrings.info
  - typings.elasticDashApmDashNode.elasticDashApmDashNodeStrings.warn
  - typings.elasticDashApmDashNode.elasticDashApmDashNodeStrings.error
  - typings.elasticDashApmDashNode.elasticDashApmDashNodeStrings.fatal
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typings.elasticDashApmDashNode.elasticDashApmDashNodeStrings.debug = this.cast("debug")
  @scala.inline
  def error: typings.elasticDashApmDashNode.elasticDashApmDashNodeStrings.error = this.cast("error")
  @scala.inline
  def fatal: typings.elasticDashApmDashNode.elasticDashApmDashNodeStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typings.elasticDashApmDashNode.elasticDashApmDashNodeStrings.info = this.cast("info")
  @scala.inline
  def trace: typings.elasticDashApmDashNode.elasticDashApmDashNodeStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typings.elasticDashApmDashNode.elasticDashApmDashNodeStrings.warn = this.cast("warn")
}

