package typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request used for GetWorkerPool.
  */
@js.native
trait Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaGetWorkerPoolRequest extends js.Object {
  /**
    * Name of the worker pool to retrieve. Format:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaGetWorkerPoolRequest {
  @scala.inline
  def apply(name: String = null): Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaGetWorkerPoolRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaGetWorkerPoolRequest]
  }
}

