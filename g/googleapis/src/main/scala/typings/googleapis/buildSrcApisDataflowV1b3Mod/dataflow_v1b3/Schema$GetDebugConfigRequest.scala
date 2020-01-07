package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to get updated debug configuration for component.
  */
@js.native
trait Schema$GetDebugConfigRequest extends js.Object {
  /**
    * The internal component id for which debug configuration is requested.
    */
  var componentId: js.UndefOr[String] = js.native
  /**
    * The [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * contains the job specified by job_id.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The worker id, i.e., VM hostname.
    */
  var workerId: js.UndefOr[String] = js.native
}

object Schema$GetDebugConfigRequest {
  @scala.inline
  def apply(componentId: String = null, location: String = null, workerId: String = null): Schema$GetDebugConfigRequest = {
    val __obj = js.Dynamic.literal()
    if (componentId != null) __obj.updateDynamic("componentId")(componentId.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (workerId != null) __obj.updateDynamic("workerId")(workerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GetDebugConfigRequest]
  }
}

