package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPermissionsRequest extends js.Object {
  /** The set of permissions to check for the 'resource'. Permissions with wildcards (such as '&#42;' or 'storage.&#42;') are not allowed. */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}

object TestPermissionsRequest {
  @scala.inline
  def apply(permissions: js.Array[String] = null): TestPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPermissionsRequest]
  }
}

