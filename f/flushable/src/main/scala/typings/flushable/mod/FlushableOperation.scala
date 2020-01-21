package typings.flushable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlushableOperation extends js.Object {
  /** Stops the callback from being executed */
  def cancel(): Unit
  /** Immediately executes the callback */
  def flush(): Unit
  /** Returns whether or not the callback has been executed */
  def pending(): Boolean
}

object FlushableOperation {
  @scala.inline
  def apply(cancel: () => Unit, flush: () => Unit, pending: () => Boolean): FlushableOperation = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), flush = js.Any.fromFunction0(flush), pending = js.Any.fromFunction0(pending))
  
    __obj.asInstanceOf[FlushableOperation]
  }
}

