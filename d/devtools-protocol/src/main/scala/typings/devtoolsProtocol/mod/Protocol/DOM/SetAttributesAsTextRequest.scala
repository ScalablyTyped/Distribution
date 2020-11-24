package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetAttributesAsTextRequest extends js.Object {
  
  /**
    * Attribute name to replace with new attributes derived from text in case text parsed
    * successfully.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Id of the element to set attributes for.
    */
  var nodeId: NodeId = js.native
  
  /**
    * Text with a number of attributes. Will parse this text using HTML parser.
    */
  var text: String = js.native
}
object SetAttributesAsTextRequest {
  
  @scala.inline
  def apply(nodeId: NodeId, text: String): SetAttributesAsTextRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetAttributesAsTextRequest]
  }
  
  @scala.inline
  implicit class SetAttributesAsTextRequestOps[Self <: SetAttributesAsTextRequest] (val x: Self) extends AnyVal {
    
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
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
