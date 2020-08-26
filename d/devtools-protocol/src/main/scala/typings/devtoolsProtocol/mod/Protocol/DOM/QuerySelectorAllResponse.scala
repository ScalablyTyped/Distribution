package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuerySelectorAllResponse extends js.Object {
  /**
    * Query selector result.
    */
  var nodeIds: js.Array[NodeId] = js.native
}

object QuerySelectorAllResponse {
  @scala.inline
  def apply(nodeIds: js.Array[NodeId]): QuerySelectorAllResponse = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuerySelectorAllResponse]
  }
  @scala.inline
  implicit class QuerySelectorAllResponseOps[Self <: QuerySelectorAllResponse] (val x: Self) extends AnyVal {
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
    def setNodeIdsVarargs(value: NodeId*): Self = this.set("nodeIds", js.Array(value :_*))
    @scala.inline
    def setNodeIds(value: js.Array[NodeId]): Self = this.set("nodeIds", value.asInstanceOf[js.Any])
  }
  
}

