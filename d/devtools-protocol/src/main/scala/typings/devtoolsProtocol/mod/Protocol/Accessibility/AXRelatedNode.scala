package typings.devtoolsProtocol.mod.Protocol.Accessibility

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AXRelatedNode extends js.Object {
  
  /**
    * The BackendNodeId of the related DOM node.
    */
  var backendDOMNodeId: BackendNodeId = js.native
  
  /**
    * The IDRef value provided, if any.
    */
  var idref: js.UndefOr[String] = js.native
  
  /**
    * The text alternative of this node in the current context.
    */
  var text: js.UndefOr[String] = js.native
}
object AXRelatedNode {
  
  @scala.inline
  def apply(backendDOMNodeId: BackendNodeId): AXRelatedNode = {
    val __obj = js.Dynamic.literal(backendDOMNodeId = backendDOMNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AXRelatedNode]
  }
  
  @scala.inline
  implicit class AXRelatedNodeOps[Self <: AXRelatedNode] (val x: Self) extends AnyVal {
    
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
    def setBackendDOMNodeId(value: BackendNodeId): Self = this.set("backendDOMNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdref(value: String): Self = this.set("idref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdref: Self = this.set("idref", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
