package typings.gapiDotClientDotContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListNodePoolsResponse extends js.Object {
  /** A list of node pools for a cluster. */
  var nodePools: js.UndefOr[js.Array[NodePool]] = js.undefined
}

object ListNodePoolsResponse {
  @scala.inline
  def apply(nodePools: js.Array[NodePool] = null): ListNodePoolsResponse = {
    val __obj = js.Dynamic.literal()
    if (nodePools != null) __obj.updateDynamic("nodePools")(nodePools.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNodePoolsResponse]
  }
}

