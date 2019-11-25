package typings.atGoogleDashCloudTasks.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestIamPermissionsResponse extends js.Object {
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}

object TestIamPermissionsResponse {
  @scala.inline
  def apply(permissions: js.Array[String] = null): TestIamPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestIamPermissionsResponse]
  }
}

