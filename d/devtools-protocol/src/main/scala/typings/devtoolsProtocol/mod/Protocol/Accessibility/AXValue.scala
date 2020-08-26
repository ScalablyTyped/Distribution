package typings.devtoolsProtocol.mod.Protocol.Accessibility

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AXValue extends js.Object {
  /**
    * One or more related nodes, if applicable.
    */
  var relatedNodes: js.UndefOr[js.Array[AXRelatedNode]] = js.native
  /**
    * The sources which contributed to the computation of this property.
    */
  var sources: js.UndefOr[js.Array[AXValueSource]] = js.native
  /**
    * The type of this value.
    */
  var `type`: AXValueType = js.native
  /**
    * The computed value of this property.
    */
  var value: js.UndefOr[js.Any] = js.native
}

object AXValue {
  @scala.inline
  def apply(`type`: AXValueType): AXValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AXValue]
  }
  @scala.inline
  implicit class AXValueOps[Self <: AXValue] (val x: Self) extends AnyVal {
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
    def setType(value: AXValueType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelatedNodesVarargs(value: AXRelatedNode*): Self = this.set("relatedNodes", js.Array(value :_*))
    @scala.inline
    def setRelatedNodes(value: js.Array[AXRelatedNode]): Self = this.set("relatedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelatedNodes: Self = this.set("relatedNodes", js.undefined)
    @scala.inline
    def setSourcesVarargs(value: AXValueSource*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[AXValueSource]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

