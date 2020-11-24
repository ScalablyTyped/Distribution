package typings.estreeWalker.walkerMod

import typings.estree.mod.BaseNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WalkerContext extends js.Object {
  
  def remove(): Unit = js.native
  
  def replace(node: BaseNode): Unit = js.native
  
  def skip(): Unit = js.native
}
object WalkerContext {
  
  @scala.inline
  def apply(remove: () => Unit, replace: BaseNode => Unit, skip: () => Unit): WalkerContext = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove), replace = js.Any.fromFunction1(replace), skip = js.Any.fromFunction0(skip))
    __obj.asInstanceOf[WalkerContext]
  }
  
  @scala.inline
  implicit class WalkerContextOps[Self <: WalkerContext] (val x: Self) extends AnyVal {
    
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
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplace(value: BaseNode => Unit): Self = this.set("replace", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkip(value: () => Unit): Self = this.set("skip", js.Any.fromFunction0(value))
  }
}
