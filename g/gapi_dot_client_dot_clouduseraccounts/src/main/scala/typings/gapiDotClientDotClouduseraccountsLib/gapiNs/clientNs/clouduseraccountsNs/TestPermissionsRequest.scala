package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestPermissionsRequest extends js.Object {
  /** The set of permissions to check for the 'resource'. Permissions with wildcards (such as '&#42;' or 'storage.&#42;') are not allowed. */
  var permissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TestPermissionsRequest {
  @scala.inline
  def apply(permissions: js.Array[java.lang.String] = null): TestPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[TestPermissionsRequest]
  }
}

