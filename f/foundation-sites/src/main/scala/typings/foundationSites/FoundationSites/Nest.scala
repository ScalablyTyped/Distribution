package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nest extends js.Object {
  
  def Burn(menu: js.Any, `type`: js.Any): Unit = js.native
  
  def Feather(menu: js.Any, `type`: js.Any): Unit = js.native
}
object Nest {
  
  @scala.inline
  def apply(Burn: (js.Any, js.Any) => Unit, Feather: (js.Any, js.Any) => Unit): Nest = {
    val __obj = js.Dynamic.literal(Burn = js.Any.fromFunction2(Burn), Feather = js.Any.fromFunction2(Feather))
    __obj.asInstanceOf[Nest]
  }
  
  @scala.inline
  implicit class NestOps[Self <: Nest] (val x: Self) extends AnyVal {
    
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
    def setBurn(value: (js.Any, js.Any) => Unit): Self = this.set("Burn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFeather(value: (js.Any, js.Any) => Unit): Self = this.set("Feather", js.Any.fromFunction2(value))
  }
}
