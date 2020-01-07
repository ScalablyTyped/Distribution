package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest extends js.Object {
  /**
    * Resource name of the project. Format: `projects/[PROJECT_ID]`.
    */
  var parent: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest {
  @scala.inline
  def apply(parent: String = null): Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesRequest]
  }
}

