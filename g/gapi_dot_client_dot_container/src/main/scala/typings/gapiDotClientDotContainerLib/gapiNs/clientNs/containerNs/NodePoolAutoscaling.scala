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

