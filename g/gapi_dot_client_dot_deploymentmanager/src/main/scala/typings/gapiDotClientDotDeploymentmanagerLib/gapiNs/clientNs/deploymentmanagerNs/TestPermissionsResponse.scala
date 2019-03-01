package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPermissionsResponse extends js.Object {
  /** A subset of `TestPermissionsRequest.permissions` that the caller is allowed. */
  var permissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TestPermissionsResponse {
  @scala.inline
  def apply(permissions: js.Array[java.lang.String] = null): TestPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[TestPermissionsResponse]
  }
}

