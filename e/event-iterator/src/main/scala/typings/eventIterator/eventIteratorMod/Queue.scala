package typings.eventIterator.eventIteratorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Queue[T] extends js.Object {
  
  def fail(error: Error): Unit = js.native
  
  def on[E /* <: QueueEvent */](
    event: E,
    fn: /* import warning: importer.ImportType#apply Failed type conversion: event-iterator.event-iterator/lib/event-iterator.EventHandlers[E] */ js.Any
  ): Unit = js.native
  
  def push(value: T): Unit = js.native
  
  def stop(): Unit = js.native
}
object Queue {
  
  @scala.inline
  def apply[T](
    fail: Error => Unit,
    on: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: event-iterator.event-iterator/lib/event-iterator.EventHandlers[E] */ js.Any) => Unit,
    push: T => Unit,
    stop: () => Unit
  ): Queue[T] = {
    val __obj = js.Dynamic.literal(fail = js.Any.fromFunction1(fail), on = js.Any.fromFunction2(on), push = js.Any.fromFunction1(push), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Queue[T]]
  }
  
  @scala.inline
  implicit class QueueOps[Self <: Queue[_], T] (val x: Self with Queue[T]) extends AnyVal {
    
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
    def setFail(value: Error => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOn(
      value: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: event-iterator.event-iterator/lib/event-iterator.EventHandlers[E] */ js.Any) => Unit
    ): Self = this.set("on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPush(value: T => Unit): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
}
