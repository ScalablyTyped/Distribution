package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Streaming appliance snapshot configuration.
  */
@js.native
trait Schema$StreamingApplianceSnapshotConfig extends js.Object {
  /**
    * Indicates which endpoint is used to import appliance state.
    */
  var importStateEndpoint: js.UndefOr[String] = js.native
  /**
    * If set, indicates the snapshot id for the snapshot being performed.
    */
  var snapshotId: js.UndefOr[String] = js.native
}

object Schema$StreamingApplianceSnapshotConfig {
  @scala.inline
  def apply(importStateEndpoint: String = null, snapshotId: String = null): Schema$StreamingApplianceSnapshotConfig = {
    val __obj = js.Dynamic.literal()
    if (importStateEndpoint != null) __obj.updateDynamic("importStateEndpoint")(importStateEndpoint.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StreamingApplianceSnapshotConfig]
  }
}

