package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodePoolAutoscaling extends js.Object {
  /** Is autoscaling enabled for this node pool. */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Maximum number of nodes in the NodePool. Must be >= min_node_count. There
    * has to enough quota to scale up the cluster.
    */
  var maxNodeCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minimum number of nodes in the NodePool. Must be >= 1 and <=
    * max_node_count.
    */
  var minNodeCount: js.UndefOr[scala.Double] = js.undefined
}

object NodePoolAutoscaling {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    maxNodeCount: scala.Int | scala.Double = null,
    minNodeCount: scala.Int | scala.Double = null
  ): NodePoolAutoscaling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (maxNodeCount != null) __obj.updateDynamic("maxNodeCount")(maxNodeCount.asInstanceOf[js.Any])
    if (minNodeCount != null) __obj.updateDynamic("minNodeCount")(minNodeCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodePoolAutoscaling]
  }
}

