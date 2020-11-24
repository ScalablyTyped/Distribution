package typings.esfxInternalHashcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Counter extends js.Object {
  
  var next: Double = js.native
}
object Counter {
  
  @scala.inline
  def apply(next: Double): Counter = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counter]
  }
  
  @scala.inline
  implicit class CounterOps[Self <: Counter] (val x: Self) extends AnyVal {
    
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
    def setNext(value: Double): Self = this.set("next", value.asInstanceOf[js.Any])
  }
}
