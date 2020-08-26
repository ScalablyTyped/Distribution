package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNodePoolRequest extends js.Object {
  /** The node pool to create. */
  var nodePool: js.UndefOr[NodePool] = js.native
}

object CreateNodePoolRequest {
  @scala.inline
  def apply(): CreateNodePoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNodePoolRequest]
  }
  @scala.inline
  implicit class CreateNodePoolRequestOps[Self <: CreateNodePoolRequest] (val x: Self) extends AnyVal {
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
    def setNodePool(value: NodePool): Self = this.set("nodePool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodePool: Self = this.set("nodePool", js.undefined)
  }
  
}

