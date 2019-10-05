package typings.gapiDotClientDotMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleIamV1__TestIamPermissionsRequest extends js.Object {
  /**
    * The set of permissions to check for the `resource`. Permissions with
    * wildcards (such as '&#42;' or 'storage.&#42;') are not allowed. For more
    * information see
    * [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions).
    */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}

object GoogleIamV1__TestIamPermissionsRequest {
  @scala.inline
  def apply(permissions: js.Array[String] = null): GoogleIamV1__TestIamPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[GoogleIamV1__TestIamPermissionsRequest]
  }
}

