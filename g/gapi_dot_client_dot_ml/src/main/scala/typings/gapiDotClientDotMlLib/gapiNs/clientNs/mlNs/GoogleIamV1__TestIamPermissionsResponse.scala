package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleIamV1__TestIamPermissionsResponse extends js.Object {
  /**
    * A subset of `TestPermissionsRequest.permissions` that the caller is
    * allowed.
    */
  var permissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object GoogleIamV1__TestIamPermissionsResponse {
  @scala.inline
  def apply(permissions: js.Array[java.lang.String] = null): GoogleIamV1__TestIamPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[GoogleIamV1__TestIamPermissionsResponse]
  }
}

