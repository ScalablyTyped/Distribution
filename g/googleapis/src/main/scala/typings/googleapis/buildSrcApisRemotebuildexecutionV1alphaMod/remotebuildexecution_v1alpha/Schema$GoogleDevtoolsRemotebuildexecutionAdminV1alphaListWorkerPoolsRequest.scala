package typings.googleapis.buildSrcApisRemotebuildexecutionV1alphaMod.remotebuildexecution_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest extends js.Object {
  /**
    * Resource name of the instance. Format:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest {
  @scala.inline
  def apply(parent: String = null): Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsRequest]
  }
}

