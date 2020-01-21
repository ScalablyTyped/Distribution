package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for an Android permission and its grant state.
  */
@js.native
trait SchemaPermissionGrant extends js.Object {
  /**
    * The Android permission or group, e.g. android.permission.READ_CALENDAR or
    * android.permission_group.CALENDAR.
    */
  var permission: js.UndefOr[String] = js.native
  /**
    * The policy for granting the permission.
    */
  var policy: js.UndefOr[String] = js.native
}

object SchemaPermissionGrant {
  @scala.inline
  def apply(permission: String = null, policy: String = null): SchemaPermissionGrant = {
    val __obj = js.Dynamic.literal()
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPermissionGrant]
  }
}

