package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetNodePoolSizeRequest extends js.Object {
  /** The desired node count for the pool. */
  var nodeCount: js.UndefOr[Double] = js.undefined
}

object SetNodePoolSizeRequest {
  @scala.inline
  def apply(nodeCount: js.UndefOr[Double] = js.undefined): SetNodePoolSizeRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nodeCount)) __obj.updateDynamic("nodeCount")(nodeCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNodePoolSizeRequest]
  }
}

