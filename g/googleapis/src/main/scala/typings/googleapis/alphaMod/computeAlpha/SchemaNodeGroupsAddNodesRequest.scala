package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeGroupsAddNodesRequest extends js.Object {
  /**
    * Count of additional nodes to be added to the node group.
    */
  var additionalNodeCount: js.UndefOr[Double] = js.native
}

object SchemaNodeGroupsAddNodesRequest {
  @scala.inline
  def apply(additionalNodeCount: Int | Double = null): SchemaNodeGroupsAddNodesRequest = {
    val __obj = js.Dynamic.literal()
    if (additionalNodeCount != null) __obj.updateDynamic("additionalNodeCount")(additionalNodeCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodeGroupsAddNodesRequest]
  }
}

