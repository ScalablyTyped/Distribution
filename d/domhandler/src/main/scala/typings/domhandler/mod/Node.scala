package typings.domhandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends DomElement {
  
  val firstChild: DomElement = js.native
  
  val lastChild: DomElement = js.native
  
  val nodeType: Double = js.native
}
object Node {
  
  @scala.inline
  def apply(firstChild: DomElement, lastChild: DomElement, nodeType: Double): Node = {
    val __obj = js.Dynamic.literal(firstChild = firstChild.asInstanceOf[js.Any], lastChild = lastChild.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    
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
    def setFirstChild(value: DomElement): Self = this.set("firstChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChild(value: DomElement): Self = this.set("lastChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeType(value: Double): Self = this.set("nodeType", value.asInstanceOf[js.Any])
  }
}
