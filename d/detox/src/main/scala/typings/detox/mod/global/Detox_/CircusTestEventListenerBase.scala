package typings.detox.mod.global.Detox_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircusTestEventListenerBase extends js.Object {
  
  def handleTestEvent(event: js.Any, state: js.Any): js.Promise[Unit] = js.native
}
object CircusTestEventListenerBase {
  
  @scala.inline
  def apply(handleTestEvent: (js.Any, js.Any) => js.Promise[Unit]): CircusTestEventListenerBase = {
    val __obj = js.Dynamic.literal(handleTestEvent = js.Any.fromFunction2(handleTestEvent))
    __obj.asInstanceOf[CircusTestEventListenerBase]
  }
  
  @scala.inline
  implicit class CircusTestEventListenerBaseOps[Self <: CircusTestEventListenerBase] (val x: Self) extends AnyVal {
    
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
    def setHandleTestEvent(value: (js.Any, js.Any) => js.Promise[Unit]): Self = this.set("handleTestEvent", js.Any.fromFunction2(value))
  }
}
