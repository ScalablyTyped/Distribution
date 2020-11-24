package typings.elm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortToElm[V] extends js.Object {
  
  def send(value: V): Unit = js.native
}
object PortToElm {
  
  @scala.inline
  def apply[V](send: V => Unit): PortToElm[V] = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[PortToElm[V]]
  }
  
  @scala.inline
  implicit class PortToElmOps[Self <: PortToElm[_], V] (val x: Self with PortToElm[V]) extends AnyVal {
    
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
    def setSend(value: V => Unit): Self = this.set("send", js.Any.fromFunction1(value))
  }
}
