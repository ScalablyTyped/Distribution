package typings.firebaseDatabase.serverValuesMod

import typings.firebaseDatabase.nodeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueProvider extends js.Object {
  
  def getImmediateChild(childName: String): ValueProvider = js.native
  
  def node(): Node = js.native
}
object ValueProvider {
  
  @scala.inline
  def apply(getImmediateChild: String => ValueProvider, node: () => Node): ValueProvider = {
    val __obj = js.Dynamic.literal(getImmediateChild = js.Any.fromFunction1(getImmediateChild), node = js.Any.fromFunction0(node))
    __obj.asInstanceOf[ValueProvider]
  }
  
  @scala.inline
  implicit class ValueProviderOps[Self <: ValueProvider] (val x: Self) extends AnyVal {
    
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
    def setGetImmediateChild(value: String => ValueProvider): Self = this.set("getImmediateChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNode(value: () => Node): Self = this.set("node", js.Any.fromFunction0(value))
  }
}
