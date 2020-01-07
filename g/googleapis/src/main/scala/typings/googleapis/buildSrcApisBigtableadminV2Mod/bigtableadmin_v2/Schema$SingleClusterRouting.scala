package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Unconditionally routes all read/write requests to a specific cluster. This
  * option preserves read-your-writes consistency, but does not improve
  * availability.
  */
@js.native
trait Schema$SingleClusterRouting extends js.Object {
  /**
    * Whether or not `CheckAndMutateRow` and `ReadModifyWriteRow` requests are
    * allowed by this app profile. It is unsafe to send these requests to the
    * same table/row/column in multiple clusters.
    */
  var allowTransactionalWrites: js.UndefOr[Boolean] = js.native
  /**
    * The cluster to which read/write requests should be routed.
    */
  var clusterId: js.UndefOr[String] = js.native
}

object Schema$SingleClusterRouting {
  @scala.inline
  def apply(allowTransactionalWrites: js.UndefOr[Boolean] = js.undefined, clusterId: String = null): Schema$SingleClusterRouting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTransactionalWrites)) __obj.updateDynamic("allowTransactionalWrites")(allowTransactionalWrites.asInstanceOf[js.Any])
    if (clusterId != null) __obj.updateDynamic("clusterId")(clusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SingleClusterRouting]
  }
}

