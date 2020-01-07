package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The cluster operation triggered by a workflow.
  */
@js.native
trait Schema$ClusterOperation extends js.Object {
  /**
    * Output only. Indicates the operation is done.
    */
  var done: js.UndefOr[Boolean] = js.native
  /**
    * Output only. Error, if operation failed.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * Output only. The id of the cluster operation.
    */
  var operationId: js.UndefOr[String] = js.native
}

object Schema$ClusterOperation {
  @scala.inline
  def apply(done: js.UndefOr[Boolean] = js.undefined, error: String = null, operationId: String = null): Schema$ClusterOperation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClusterOperation]
  }
}

