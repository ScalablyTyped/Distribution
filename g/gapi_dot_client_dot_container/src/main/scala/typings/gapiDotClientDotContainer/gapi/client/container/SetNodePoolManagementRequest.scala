package typings.gapiDotClientDotContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetNodePoolManagementRequest extends js.Object {
  /** NodeManagement configuration for the node pool. */
  var management: js.UndefOr[NodeManagement] = js.undefined
}

object SetNodePoolManagementRequest {
  @scala.inline
  def apply(management: NodeManagement = null): SetNodePoolManagementRequest = {
    val __obj = js.Dynamic.literal()
    if (management != null) __obj.updateDynamic("management")(management)
    __obj.asInstanceOf[SetNodePoolManagementRequest]
  }
}

