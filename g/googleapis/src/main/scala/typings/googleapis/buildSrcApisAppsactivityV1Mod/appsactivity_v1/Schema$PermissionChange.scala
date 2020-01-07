package typings.googleapis.buildSrcApisAppsactivityV1Mod.appsactivity_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a Drive object&#39;s permissions that changed as
  * a result of a permissionChange type event.
  */
@js.native
trait Schema$PermissionChange extends js.Object {
  /**
    * Lists all Permission objects added.
    */
  var addedPermissions: js.UndefOr[js.Array[Schema$Permission]] = js.native
  /**
    * Lists all Permission objects removed.
    */
  var removedPermissions: js.UndefOr[js.Array[Schema$Permission]] = js.native
}

object Schema$PermissionChange {
  @scala.inline
  def apply(
    addedPermissions: js.Array[Schema$Permission] = null,
    removedPermissions: js.Array[Schema$Permission] = null
  ): Schema$PermissionChange = {
    val __obj = js.Dynamic.literal()
    if (addedPermissions != null) __obj.updateDynamic("addedPermissions")(addedPermissions.asInstanceOf[js.Any])
    if (removedPermissions != null) __obj.updateDynamic("removedPermissions")(removedPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PermissionChange]
  }
}

