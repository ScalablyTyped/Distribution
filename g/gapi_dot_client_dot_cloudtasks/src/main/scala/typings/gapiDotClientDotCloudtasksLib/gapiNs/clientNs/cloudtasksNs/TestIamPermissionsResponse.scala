package typings
package gapiDotClientDotCloudtasksLib.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestIamPermissionsResponse extends js.Object {
  /**
    * A subset of `TestPermissionsRequest.permissions` that the caller is
    * allowed.
    */
  var permissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TestIamPermissionsResponse {
  @scala.inline
  def apply(permissions: js.Array[java.lang.String] = null): TestIamPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[TestIamPermissionsResponse]
  }
}

