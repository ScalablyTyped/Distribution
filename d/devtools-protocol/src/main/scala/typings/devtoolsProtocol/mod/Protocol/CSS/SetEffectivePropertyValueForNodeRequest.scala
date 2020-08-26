package typings.devtoolsProtocol.mod.Protocol.CSS

import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetEffectivePropertyValueForNodeRequest extends js.Object {
  /**
    * The element id for which to set property.
    */
  var nodeId: NodeId = js.native
  var propertyName: String = js.native
  var value: String = js.native
}

object SetEffectivePropertyValueForNodeRequest {
  @scala.inline
  def apply(nodeId: NodeId, propertyName: String, value: String): SetEffectivePropertyValueForNodeRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEffectivePropertyValueForNodeRequest]
  }
  @scala.inline
  implicit class SetEffectivePropertyValueForNodeRequestOps[Self <: SetEffectivePropertyValueForNodeRequest] (val x: Self) extends AnyVal {
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
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

