package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNodePoolsResponse extends js.Object {
  /** A list of node pools for a cluster. */
  var nodePools: js.UndefOr[js.Array[NodePool]] = js.native
}

object ListNodePoolsResponse {
  @scala.inline
  def apply(): ListNodePoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNodePoolsResponse]
  }
  @scala.inline
  implicit class ListNodePoolsResponseOps[Self <: ListNodePoolsResponse] (val x: Self) extends AnyVal {
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
    def setNodePoolsVarargs(value: NodePool*): Self = this.set("nodePools", js.Array(value :_*))
    @scala.inline
    def setNodePools(value: js.Array[NodePool]): Self = this.set("nodePools", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodePools: Self = this.set("nodePools", js.undefined)
  }
  
}

