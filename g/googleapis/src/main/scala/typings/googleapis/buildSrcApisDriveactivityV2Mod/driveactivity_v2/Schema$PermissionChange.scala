package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A change of the permission setting on an item.
  */
@js.native
trait Schema$PermissionChange extends js.Object {
  /**
    * The set of permissions added by this change.
    */
  var addedPermissions: js.UndefOr[js.Array[Schema$Permission]] = js.native
  /**
    * The set of permissions removed by this change.
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

