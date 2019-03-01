package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestIamPermissionsRequest extends js.Object {
  /**
    * The set of permissions to check for the `resource`. Permissions with
    * wildcards (such as '&#42;' or 'storage.&#42;') are not allowed. For more
    * information see
    * [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
    */
  var permissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TestIamPermissionsRequest {
  @scala.inline
  def apply(permissions: js.Array[java.lang.String] = null): TestIamPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[TestIamPermissionsRequest]
  }
}

