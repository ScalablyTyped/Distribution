package typings.flushable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlushableOperation extends js.Object {
  
  /** Stops the callback from being executed */
  def cancel(): Unit = js.native
  
  /** Immediately executes the callback */
  def flush(): Unit = js.native
  
  /** Returns whether or not the callback has been executed */
  def pending(): Boolean = js.native
}
object FlushableOperation {
  
  @scala.inline
  def apply(cancel: () => Unit, flush: () => Unit, pending: () => Boolean): FlushableOperation = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), flush = js.Any.fromFunction0(flush), pending = js.Any.fromFunction0(pending))
    __obj.asInstanceOf[FlushableOperation]
  }
  
  @scala.inline
  implicit class FlushableOperationOps[Self <: FlushableOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlush(value: () => Unit): Self = this.set("flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPending(value: () => Boolean): Self = this.set("pending", js.Any.fromFunction0(value))
  }
}
