package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse extends js.Object {
  /**
    * The list of instances in a given project.
    */
  var instances: js.UndefOr[js.Array[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]] = js.native
}

object Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse {
  @scala.inline
  def apply(instances: js.Array[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance] = null): Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaListInstancesResponse]
  }
}

