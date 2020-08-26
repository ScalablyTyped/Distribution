package typings.forceGraph.mod.ForceGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces
  */
@js.native
trait GraphData extends js.Object {
  var links: js.Array[GraphLink] = js.native
  var nodes: js.Array[GraphNode] = js.native
}

object GraphData {
  @scala.inline
  def apply(links: js.Array[GraphLink], nodes: js.Array[GraphNode]): GraphData = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphData]
  }
  @scala.inline
  implicit class GraphDataOps[Self <: GraphData] (val x: Self) extends AnyVal {
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
    def setLinksVarargs(value: GraphLink*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[GraphLink]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: GraphNode*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[GraphNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
  
}

