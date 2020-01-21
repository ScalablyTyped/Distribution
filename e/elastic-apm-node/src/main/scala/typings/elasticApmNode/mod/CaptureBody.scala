package typings.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.elasticApmNode.elasticApmNodeStrings.off
  - typings.elasticApmNode.elasticApmNodeStrings.errors
  - typings.elasticApmNode.elasticApmNodeStrings.transactions
  - typings.elasticApmNode.elasticApmNodeStrings.all
*/
trait CaptureBody extends js.Object

object CaptureBody {
  @scala.inline
  def all: typings.elasticApmNode.elasticApmNodeStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def errors: typings.elasticApmNode.elasticApmNodeStrings.errors = this.cast("errors")
  @scala.inline
  def off: typings.elasticApmNode.elasticApmNodeStrings.off = this.cast("off")
  @scala.inline
  def transactions: typings.elasticApmNode.elasticApmNodeStrings.transactions = this.cast("transactions")
}

