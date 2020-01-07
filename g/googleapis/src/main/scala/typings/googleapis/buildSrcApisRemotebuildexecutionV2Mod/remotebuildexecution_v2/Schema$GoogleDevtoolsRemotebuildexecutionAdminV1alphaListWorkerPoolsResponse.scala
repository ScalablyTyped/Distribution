package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse extends js.Object {
  /**
    * The list of worker pools in a given instance.
    */
  var workerPools: js.UndefOr[js.Array[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool]] = js.native
}

object Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse {
  @scala.inline
  def apply(workerPools: js.Array[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool] = null): Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse = {
    val __obj = js.Dynamic.literal()
    if (workerPools != null) __obj.updateDynamic("workerPools")(workerPools.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse]
  }
}

