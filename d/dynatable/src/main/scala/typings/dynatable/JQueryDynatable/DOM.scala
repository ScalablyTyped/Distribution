package typings.dynatable.JQueryDynatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOM extends js.Object {
  
  /**
    * Manually update the dom with the current record set...
    * This can be useful after multiple calls to `domcolumns.add()` with `skipUpdate` set to true.
    * This way we improve performance by generating the DOM only once.
    */
  def update(): Unit = js.native
}
object DOM {
  
  @scala.inline
  def apply(update: () => Unit): DOM = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[DOM]
  }
  
  @scala.inline
  implicit class DOMOps[Self <: DOM] (val x: Self) extends AnyVal {
    
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
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
