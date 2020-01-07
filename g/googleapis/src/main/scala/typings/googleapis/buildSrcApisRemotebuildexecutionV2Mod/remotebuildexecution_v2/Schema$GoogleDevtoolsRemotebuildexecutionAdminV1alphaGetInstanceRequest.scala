package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request used for `GetInstance`.
  */
@js.native
trait Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaGetInstanceRequest extends js.Object {
  /**
    * Name of the instance to retrieve. Format:
    * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaGetInstanceRequest {
  @scala.inline
  def apply(name: String = null): Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaGetInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleDevtoolsRemotebuildexecutionAdminV1alphaGetInstanceRequest]
  }
}

