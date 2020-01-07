package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request used for DeleteWorkerPool.
  */
@js.native
trait Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaDeleteWorkerPoolRequest extends js.Object {
  /**
    * Name of the worker pool to delete. Format:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaDeleteWorkerPoolRequest {
  @scala.inline
  def apply(name: String = null): Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaDeleteWorkerPoolRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaDeleteWorkerPoolRequest]
  }
}

