package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$NodeGroupsAddNodesRequest extends js.Object {
  /**
    * Count of additional nodes to be added to the node group.
    */
  var additionalNodeCount: js.UndefOr[Double] = js.native
}

object Schema$NodeGroupsAddNodesRequest {
  @scala.inline
  def apply(additionalNodeCount: Int | Double = null): Schema$NodeGroupsAddNodesRequest = {
    val __obj = js.Dynamic.literal()
    if (additionalNodeCount != null) __obj.updateDynamic("additionalNodeCount")(additionalNodeCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NodeGroupsAddNodesRequest]
  }
}

