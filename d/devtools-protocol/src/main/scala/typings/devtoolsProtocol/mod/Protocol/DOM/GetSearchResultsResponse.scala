package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSearchResultsResponse extends js.Object {
  /**
    * Ids of the search result nodes.
    */
  var nodeIds: js.Array[NodeId] = js.native
}

object GetSearchResultsResponse {
  @scala.inline
  def apply(nodeIds: js.Array[NodeId]): GetSearchResultsResponse = {
    val __obj = js.Dynamic.literal(nodeIds = nodeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSearchResultsResponse]
  }
  @scala.inline
  implicit class GetSearchResultsResponseOps[Self <: GetSearchResultsResponse] (val x: Self) extends AnyVal {
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

