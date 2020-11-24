package typings.expressSlowDown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store extends js.Object {
  
  def decrement(key: String): Unit = js.native
  
  def incr(key: String, cb: StoreIncrementCallback): Unit = js.native
  
  def resetKey(key: String): Unit = js.native
}
object Store {
  
  @scala.inline
  def apply(
    decrement: String => Unit,
    incr: (String, StoreIncrementCallback) => Unit,
    resetKey: String => Unit
  ): Store = {
    val __obj = js.Dynamic.literal(decrement = js.Any.fromFunction1(decrement), incr = js.Any.fromFunction2(incr), resetKey = js.Any.fromFunction1(resetKey))
    __obj.asInstanceOf[Store]
  }
  
  @scala.inline
  implicit class StoreOps[Self <: Store] (val x: Self) extends AnyVal {
    
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
    def setDecrement(value: String => Unit): Self = this.set("decrement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIncr(value: (String, StoreIncrementCallback) => Unit): Self = this.set("incr", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResetKey(value: String => Unit): Self = this.set("resetKey", js.Any.fromFunction1(value))
  }
}
