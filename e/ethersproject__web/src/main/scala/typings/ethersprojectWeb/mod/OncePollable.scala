package typings.ethersprojectWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OncePollable extends js.Object {
  
  @JSName("once")
  def once_poll(eventName: typings.ethersprojectWeb.ethersprojectWebStrings.poll, handler: js.Function0[Unit]): Unit = js.native
}
object OncePollable {
  
  @scala.inline
  def apply(once: (typings.ethersprojectWeb.ethersprojectWebStrings.poll, js.Function0[Unit]) => Unit): OncePollable = {
    val __obj = js.Dynamic.literal(once = js.Any.fromFunction2(once))
    __obj.asInstanceOf[OncePollable]
  }
  
  @scala.inline
  implicit class OncePollableOps[Self <: OncePollable] (val x: Self) extends AnyVal {
    
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
    def setOnce(value: (typings.ethersprojectWeb.ethersprojectWebStrings.poll, js.Function0[Unit]) => Unit): Self = this.set("once", js.Any.fromFunction2(value))
  }
}
