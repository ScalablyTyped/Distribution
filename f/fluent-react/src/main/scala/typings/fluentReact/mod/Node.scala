package typings.fluentReact.mod

import typings.fluentReact.fluentReactNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends js.Object {
  
  var TEXT_NODE: `3` = js.native
  
  var localName: js.UndefOr[String] = js.native
  
  var nodeType: Double = js.native
  
  var textContext: String = js.native
}
object Node {
  
  @scala.inline
  def apply(TEXT_NODE: `3`, nodeType: Double, textContext: String): Node = {
    val __obj = js.Dynamic.literal(TEXT_NODE = TEXT_NODE.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], textContext = textContext.asInstanceOf[js.Any])
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
    def setTEXT_NODE(value: `3`): Self = this.set("TEXT_NODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeType(value: Double): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextContext(value: String): Self = this.set("textContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalName(value: String): Self = this.set("localName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalName: Self = this.set("localName", js.undefined)
  }
}
