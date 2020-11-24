package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumerateCallbacks[T] extends js.Object {
  
  def onComplete(): Unit = js.native
  
  def onMatch(item: T): Unit | EnumerateAction = js.native
}
object EnumerateCallbacks {
  
  @scala.inline
  def apply[T](onComplete: () => Unit, onMatch: T => Unit | EnumerateAction): EnumerateCallbacks[T] = {
    val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction0(onComplete), onMatch = js.Any.fromFunction1(onMatch))
    __obj.asInstanceOf[EnumerateCallbacks[T]]
  }
  
  @scala.inline
  implicit class EnumerateCallbacksOps[Self <: EnumerateCallbacks[_], T] (val x: Self with EnumerateCallbacks[T]) extends AnyVal {
    
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
    def setOnComplete(value: () => Unit): Self = this.set("onComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMatch(value: T => Unit | EnumerateAction): Self = this.set("onMatch", js.Any.fromFunction1(value))
  }
}
