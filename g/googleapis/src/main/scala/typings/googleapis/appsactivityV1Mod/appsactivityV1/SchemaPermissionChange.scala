package typings.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a Drive object&#39;s permissions that changed as
  * a result of a permissionChange type event.
  */
@js.native
trait SchemaPermissionChange extends js.Object {
  /**
    * Lists all Permission objects added.
    */
  var addedPermissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
  /**
    * Lists all Permission objects removed.
    */
  var removedPermissions: js.UndefOr[js.Array[SchemaPermission]] = js.native
}

object SchemaPermissionChange {
  @scala.inline
  def apply(
    addedPermissions: js.Array[SchemaPermission] = null,
    removedPermissions: js.Array[SchemaPermission] = null
  ): SchemaPermissionChange = {
    val __obj = js.Dynamic.literal()
    if (addedPermissions != null) __obj.updateDynamic("addedPermissions")(addedPermissions.asInstanceOf[js.Any])
    if (removedPermissions != null) __obj.updateDynamic("removedPermissions")(removedPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPermissionChange]
  }
}

