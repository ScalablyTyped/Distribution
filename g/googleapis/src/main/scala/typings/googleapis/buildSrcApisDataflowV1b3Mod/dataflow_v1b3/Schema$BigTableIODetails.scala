package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for a BigTable connector used by the job.
  */
@js.native
trait Schema$BigTableIODetails extends js.Object {
  /**
    * InstanceId accessed in the connection.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * ProjectId accessed in the connection.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * TableId accessed in the connection.
    */
  var tableId: js.UndefOr[String] = js.native
}

object Schema$BigTableIODetails {
  @scala.inline
  def apply(instanceId: String = null, projectId: String = null, tableId: String = null): Schema$BigTableIODetails = {
    val __obj = js.Dynamic.literal()
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (tableId != null) __obj.updateDynamic("tableId")(tableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BigTableIODetails]
  }
}

