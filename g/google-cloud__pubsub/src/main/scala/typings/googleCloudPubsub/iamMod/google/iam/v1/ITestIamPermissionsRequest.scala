package typings.googleCloudPubsub.iamMod.google.iam.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TestIamPermissionsRequest. */
trait ITestIamPermissionsRequest extends js.Object {
  /** TestIamPermissionsRequest permissions */
  var permissions: js.UndefOr[js.Array[String] | Null] = js.undefined
  /** TestIamPermissionsRequest resource */
  var resource: js.UndefOr[String | Null] = js.undefined
}

object ITestIamPermissionsRequest {
  @scala.inline
  def apply(permissions: js.Array[String] = null, resource: String = null): ITestIamPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITestIamPermissionsRequest]
  }
}

