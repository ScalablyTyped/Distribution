package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request used for UpdateWorkerPool.
  */
@js.native
trait Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest extends js.Object {
  /**
    * The update mask applies to worker_pool. For the `FieldMask` definition,
    * see
    * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    * If an empty update_mask is provided, only the non-default valued field in
    * the worker pool field will be updated. Note that in order to update a
    * field to the default value (zero, false, empty string) an explicit
    * update_mask must be provided.
    */
  var updateMask: js.UndefOr[String] = js.native
  /**
    * Specifies the worker pool to update.
    */
  var workerPool: js.UndefOr[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] = js.native
}

object Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest {
  @scala.inline
  def apply(
    updateMask: String = null,
    workerPool: Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool = null
  ): Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest = {
    val __obj = js.Dynamic.literal()
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    if (workerPool != null) __obj.updateDynamic("workerPool")(workerPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaUpdateWorkerPoolRequest]
  }
}

