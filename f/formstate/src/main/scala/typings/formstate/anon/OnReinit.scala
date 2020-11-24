package typings.formstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnReinit extends js.Object {
  
  @JSName("on$Reinit")
  def on$Reinit(): Unit = js.native
  
  @JSName("on$ValidationPass")
  def on$ValidationPass(): Unit = js.native
}
object OnReinit {
  
  @scala.inline
  def apply(on$Reinit: () => Unit, on$ValidationPass: () => Unit): OnReinit = {
    val __obj = js.Dynamic.literal(on$Reinit = js.Any.fromFunction0(on$Reinit), on$ValidationPass = js.Any.fromFunction0(on$ValidationPass))
    __obj.asInstanceOf[OnReinit]
  }
  
  @scala.inline
  implicit class OnReinitOps[Self <: OnReinit] (val x: Self) extends AnyVal {
    
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
    def setOn$Reinit(value: () => Unit): Self = this.set("on$Reinit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOn$ValidationPass(value: () => Unit): Self = this.set("on$ValidationPass", js.Any.fromFunction0(value))
  }
}
