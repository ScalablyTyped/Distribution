package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodePoolAutoscaling contains information required by cluster autoscaler to
  * adjust the size of the node pool to the current cluster usage.
  */
@js.native
trait Schema$NodePoolAutoscaling extends js.Object {
  /**
    * Can this node pool be deleted automatically.
    */
  var autoprovisioned: js.UndefOr[Boolean] = js.native
  /**
    * Is autoscaling enabled for this node pool.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Maximum number of nodes in the NodePool. Must be &gt;= min_node_count.
    * There has to enough quota to scale up the cluster.
    */
  var maxNodeCount: js.UndefOr[Double] = js.native
  /**
    * Minimum number of nodes in the NodePool. Must be &gt;= 1 and &lt;=
    * max_node_count.
    */
  var minNodeCount: js.UndefOr[Double] = js.native
}

object Schema$NodePoolAutoscaling {
  @scala.inline
  def apply(
    autoprovisioned: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    maxNodeCount: Int | Double = null,
    minNodeCount: Int | Double = null
  ): Schema$NodePoolAutoscaling = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoprovisioned)) __obj.updateDynamic("autoprovisioned")(autoprovisioned.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (maxNodeCount != null) __obj.updateDynamic("maxNodeCount")(maxNodeCount.asInstanceOf[js.Any])
    if (minNodeCount != null) __obj.updateDynamic("minNodeCount")(minNodeCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NodePoolAutoscaling]
  }
}

