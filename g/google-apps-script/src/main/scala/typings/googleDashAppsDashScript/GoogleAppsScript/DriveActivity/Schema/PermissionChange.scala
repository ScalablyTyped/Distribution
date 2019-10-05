package typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionChange extends js.Object {
  var addedPermissions: js.UndefOr[js.Array[Permission]] = js.undefined
  var removedPermissions: js.UndefOr[js.Array[Permission]] = js.undefined
}

object PermissionChange {
  @scala.inline
  def apply(addedPermissions: js.Array[Permission] = null, removedPermissions: js.Array[Permission] = null): PermissionChange = {
    val __obj = js.Dynamic.literal()
    if (addedPermissions != null) __obj.updateDynamic("addedPermissions")(addedPermissions)
    if (removedPermissions != null) __obj.updateDynamic("removedPermissions")(removedPermissions)
    __obj.asInstanceOf[PermissionChange]
  }
}

