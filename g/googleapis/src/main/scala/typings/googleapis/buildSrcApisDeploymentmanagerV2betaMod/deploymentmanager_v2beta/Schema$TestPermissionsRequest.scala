package typings.googleapis.buildSrcApisDeploymentmanagerV2betaMod.deploymentmanager_v2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TestPermissionsRequest extends js.Object {
  /**
    * The set of permissions to check for the &#39;resource&#39;. Permissions
    * with wildcards (such as &#39;*&#39; or &#39;storage.*&#39;) are not
    * allowed.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}

object Schema$TestPermissionsRequest {
  @scala.inline
  def apply(permissions: js.Array[String] = null): Schema$TestPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TestPermissionsRequest]
  }
}

