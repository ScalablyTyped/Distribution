package typings
package flushableLib.flushableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlushableOperation extends js.Object {
  /** Stops the callback from being executed */
  def cancel(): scala.Unit
  /** Immediately executes the callback */
  def flush(): scala.Unit
  /** Returns whether or not the callback has been executed */
  def pending(): scala.Boolean
}

object FlushableOperation {
  @scala.inline
  def apply(
    cancel: js.Function0[scala.Unit],
    flush: js.Function0[scala.Unit],
    pending: js.Function0[scala.Boolean]
  ): FlushableOperation = {
    val __obj = js.Dynamic.literal(cancel = cancel, flush = flush, pending = pending)
  
    __obj.asInstanceOf[FlushableOperation]
  }
}

