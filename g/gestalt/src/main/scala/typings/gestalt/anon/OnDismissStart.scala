package typings.gestalt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnDismissStart extends js.Object {
  
  def onDismissStart(): Unit = js.native
}
object OnDismissStart {
  
  @scala.inline
  def apply(onDismissStart: () => Unit): OnDismissStart = {
    val __obj = js.Dynamic.literal(onDismissStart = js.Any.fromFunction0(onDismissStart))
    __obj.asInstanceOf[OnDismissStart]
  }
  
  @scala.inline
  implicit class OnDismissStartOps[Self <: OnDismissStart] (val x: Self) extends AnyVal {
    
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
    def setOnDismissStart(value: () => Unit): Self = this.set("onDismissStart", js.Any.fromFunction0(value))
  }
}
