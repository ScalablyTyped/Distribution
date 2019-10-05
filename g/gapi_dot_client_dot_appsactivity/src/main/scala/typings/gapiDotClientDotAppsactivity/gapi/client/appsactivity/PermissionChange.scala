package typings.gapiDotClientDotAppsactivity.gapi.client.appsactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionChange extends js.Object {
  /** Lists all Permission objects added. */
  var addedPermissions: js.UndefOr[js.Array[Permission]] = js.undefined
  /** Lists all Permission objects removed. */
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

