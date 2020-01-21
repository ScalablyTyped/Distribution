package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The state of a table&#39;s data in a particular cluster.
  */
@js.native
trait SchemaClusterState extends js.Object {
  /**
    * Output only. The state of replication for the table in this cluster.
    */
  var replicationState: js.UndefOr[String] = js.native
}

object SchemaClusterState {
  @scala.inline
  def apply(replicationState: String = null): SchemaClusterState = {
    val __obj = js.Dynamic.literal()
    if (replicationState != null) __obj.updateDynamic("replicationState")(replicationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClusterState]
  }
}

