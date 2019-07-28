package typings.atGoogleDashCloudTasks.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestIamPermissionsRequest extends js.Object {
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}

object TestIamPermissionsRequest {
  @scala.inline
  def apply(permissions: js.Array[String] = null): TestIamPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    __obj.asInstanceOf[TestIamPermissionsRequest]
  }
}

