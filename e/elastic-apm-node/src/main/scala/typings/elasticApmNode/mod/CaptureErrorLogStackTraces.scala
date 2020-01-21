package typings.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.elasticApmNode.elasticApmNodeStrings.never
  - typings.elasticApmNode.elasticApmNodeStrings.messages
  - typings.elasticApmNode.elasticApmNodeStrings.always
*/
trait CaptureErrorLogStackTraces extends js.Object

object CaptureErrorLogStackTraces {
  @scala.inline
  def always: typings.elasticApmNode.elasticApmNodeStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def messages: typings.elasticApmNode.elasticApmNodeStrings.messages = this.cast("messages")
  @scala.inline
  def never: typings.elasticApmNode.elasticApmNodeStrings.never = this.cast("never")
}

