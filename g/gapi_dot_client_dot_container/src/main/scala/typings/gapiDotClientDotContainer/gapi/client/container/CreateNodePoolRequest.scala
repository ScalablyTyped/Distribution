package typings.gapiDotClientDotContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNodePoolRequest extends js.Object {
  /** The node pool to create. */
  var nodePool: js.UndefOr[NodePool] = js.undefined
}

object CreateNodePoolRequest {
  @scala.inline
  def apply(nodePool: NodePool = null): CreateNodePoolRequest = {
    val __obj = js.Dynamic.literal()
    if (nodePool != null) __obj.updateDynamic("nodePool")(nodePool.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNodePoolRequest]
  }
}

