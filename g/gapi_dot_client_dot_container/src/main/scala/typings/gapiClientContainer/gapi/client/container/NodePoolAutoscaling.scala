package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodePoolAutoscaling extends js.Object {
  /** Is autoscaling enabled for this node pool. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum number of nodes in the NodePool. Must be >= min_node_count. There
    * has to enough quota to scale up the cluster.
    */
  var maxNodeCount: js.UndefOr[Double] = js.undefined
  /**
    * Minimum number of nodes in the NodePool. Must be >= 1 and <=
    * max_node_count.
    */
  var minNodeCount: js.UndefOr[Double] = js.undefined
}

object NodePoolAutoscaling {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    maxNodeCount: js.UndefOr[Double] = js.undefined,
    minNodeCount: js.UndefOr[Double] = js.undefined
  ): NodePoolAutoscaling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNodeCount)) __obj.updateDynamic("maxNodeCount")(maxNodeCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minNodeCount)) __obj.updateDynamic("minNodeCount")(minNodeCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodePoolAutoscaling]
  }
}

