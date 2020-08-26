package typings.forceGraph.mod.ForceGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphNode extends GraphEntity {
  var name: js.UndefOr[String] = js.native
  var `val`: js.UndefOr[js.Any] = js.native
}

object GraphNode {
  @scala.inline
  def apply(id: String): GraphNode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphNode]
  }
  @scala.inline
  implicit class GraphNodeOps[Self <: GraphNode] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setVal(value: js.Any): Self = this.set("val", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVal: Self = this.set("val", js.undefined)
  }
  
}

