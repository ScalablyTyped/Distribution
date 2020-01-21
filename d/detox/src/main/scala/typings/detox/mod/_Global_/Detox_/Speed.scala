package typings.detox.mod._Global_.Detox_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.detox.detoxStrings.fast
  - typings.detox.detoxStrings.slow
*/
trait Speed extends js.Object

object Speed {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fast: typings.detox.detoxStrings.fast = this.cast("fast")
  @scala.inline
  def slow: typings.detox.detoxStrings.slow = this.cast("slow")
}

