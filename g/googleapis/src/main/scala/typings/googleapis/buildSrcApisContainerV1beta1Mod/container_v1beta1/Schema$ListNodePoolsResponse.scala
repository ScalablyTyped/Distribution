package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListNodePoolsResponse is the result of ListNodePoolsRequest.
  */
@js.native
trait Schema$ListNodePoolsResponse extends js.Object {
  /**
    * A list of node pools for a cluster.
    */
  var nodePools: js.UndefOr[js.Array[Schema$NodePool]] = js.native
}

object Schema$ListNodePoolsResponse {
  @scala.inline
  def apply(nodePools: js.Array[Schema$NodePool] = null): Schema$ListNodePoolsResponse = {
    val __obj = js.Dynamic.literal()
    if (nodePools != null) __obj.updateDynamic("nodePools")(nodePools.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListNodePoolsResponse]
  }
}

