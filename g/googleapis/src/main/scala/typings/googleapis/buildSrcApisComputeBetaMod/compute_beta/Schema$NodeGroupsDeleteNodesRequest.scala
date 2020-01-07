package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$NodeGroupsDeleteNodesRequest extends js.Object {
  var nodes: js.UndefOr[js.Array[String]] = js.native
}

object Schema$NodeGroupsDeleteNodesRequest {
  @scala.inline
  def apply(nodes: js.Array[String] = null): Schema$NodeGroupsDeleteNodesRequest = {
    val __obj = js.Dynamic.literal()
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NodeGroupsDeleteNodesRequest]
  }
}

