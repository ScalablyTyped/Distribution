package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetNodePoolManagementRequest extends js.Object {
  /** NodeManagement configuration for the node pool. */
  var management: js.UndefOr[NodeManagement] = js.native
}

object SetNodePoolManagementRequest {
  @scala.inline
  def apply(): SetNodePoolManagementRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetNodePoolManagementRequest]
  }
  @scala.inline
  implicit class SetNodePoolManagementRequestOps[Self <: SetNodePoolManagementRequest] (val x: Self) extends AnyVal {
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
    def setManagement(value: NodeManagement): Self = this.set("management", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagement: Self = this.set("management", js.undefined)
  }
  
}

