package typings.googleCloudPubsub.pubsubMod.google.iam.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a TestIamPermissionsResponse. */
trait ITestIamPermissionsResponse extends js.Object {
  /** TestIamPermissionsResponse permissions */
  var permissions: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object ITestIamPermissionsResponse {
  @scala.inline
  def apply(permissions: js.Array[String] = null): ITestIamPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITestIamPermissionsResponse]
  }
}

