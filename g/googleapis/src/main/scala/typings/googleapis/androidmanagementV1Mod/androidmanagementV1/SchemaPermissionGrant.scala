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
  def apply(): SchemaPermissionGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermissionGrant]
  }
  @scala.inline
  implicit class SchemaPermissionGrantOps[Self <: SchemaPermissionGrant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPermission(value: String): Self = this.set("permission", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
    @scala.inline
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
  
}

