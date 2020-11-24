package typings.freedom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveEventListener extends js.Object {
  
  def removeEventListener(s: String, f: js.Function, b: Boolean): Unit = js.native
}
object RemoveEventListener {
  
  @scala.inline
  def apply(removeEventListener: (String, js.Function, Boolean) => Unit): RemoveEventListener = {
    val __obj = js.Dynamic.literal(removeEventListener = js.Any.fromFunction3(removeEventListener))
    __obj.asInstanceOf[RemoveEventListener]
  }
  
  @scala.inline
  implicit class RemoveEventListenerOps[Self <: RemoveEventListener] (val x: Self) extends AnyVal {
    
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
    def setRemoveEventListener(value: (String, js.Function, Boolean) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction3(value))
  }
}
