package typings.googleapis.betaMod.computeBeta

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
  def apply(additionalNodeCount: js.UndefOr[Double] = js.undefined): SchemaNodeGroupsAddNodesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(additionalNodeCount)) __obj.updateDynamic("additionalNodeCount")(additionalNodeCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodeGroupsAddNodesRequest]
  }
}

