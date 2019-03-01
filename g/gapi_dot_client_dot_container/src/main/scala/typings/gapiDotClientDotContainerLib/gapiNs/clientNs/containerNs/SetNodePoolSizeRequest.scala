package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetNodePoolSizeRequest extends js.Object {
  /** The desired node count for the pool. */
  var nodeCount: js.UndefOr[scala.Double] = js.undefined
}

object SetNodePoolSizeRequest {
  @scala.inline
  def apply(nodeCount: scala.Int | scala.Double = null): SetNodePoolSizeRequest = {
    val __obj = js.Dynamic.literal()
    if (nodeCount != null) __obj.updateDynamic("nodeCount")(nodeCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetNodePoolSizeRequest]
  }
}

