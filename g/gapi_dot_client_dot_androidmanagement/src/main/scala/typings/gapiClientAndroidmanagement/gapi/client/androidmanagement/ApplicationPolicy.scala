package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationPolicy extends js.Object {
  /**
    * The default policy for all permissions requested by the app. If specified, this overrides the policy-level default_permission_policy which applies to
    * all apps.
    */
  var defaultPermissionPolicy: js.UndefOr[String] = js.native
  /** The type of installation to perform. */
  var installType: js.UndefOr[String] = js.native
  /** Whether the application is allowed to lock itself in full-screen mode. */
  var lockTaskAllowed: js.UndefOr[Boolean] = js.native
  /**
    * Managed configuration applied to the app. The format for the configuration is dictated by the ManagedProperty values supported by the app. Each field
    * name in the managed configuration must match the key field of the ManagedProperty. The field value must be compatible with the type of the
    * ManagedProperty: <table> <tr><td><i>type</i></td><td><i>JSON value</i></td></tr> <tr><td>BOOL</td><td>true or false</td></tr>
    * <tr><td>STRING</td><td>string</td></tr> <tr><td>INTEGER</td><td>number</td></tr> <tr><td>CHOICE</td><td>string</td></tr>
    * <tr><td>MULTISELECT</td><td>array of strings</td></tr> <tr><td>HIDDEN</td><td>string</td></tr> <tr><td>BUNDLE_ARRAY</td><td>array of objects</td></tr>
    * </table>
    */
  var managedConfiguration: js.UndefOr[Record[String, _]] = js.native
  /** The package name of the app, e.g. com.google.android.youtube for the YouTube app. */
  var packageName: js.UndefOr[String] = js.native
  /** Explicit permission grants or denials for the app. These values override the default_permission_policy. */
  var permissionGrants: js.UndefOr[js.Array[PermissionGrant]] = js.native
}

object ApplicationPolicy {
  @scala.inline
  def apply(): ApplicationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationPolicy]
  }
  @scala.inline
  implicit class ApplicationPolicyOps[Self <: ApplicationPolicy] (val x: Self) extends AnyVal {
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
    def setDefaultPermissionPolicy(value: String): Self = this.set("defaultPermissionPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPermissionPolicy: Self = this.set("defaultPermissionPolicy", js.undefined)
    @scala.inline
    def setInstallType(value: String): Self = this.set("installType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallType: Self = this.set("installType", js.undefined)
    @scala.inline
    def setLockTaskAllowed(value: Boolean): Self = this.set("lockTaskAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockTaskAllowed: Self = this.set("lockTaskAllowed", js.undefined)
    @scala.inline
    def setManagedConfiguration(value: Record[String, _]): Self = this.set("managedConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedConfiguration: Self = this.set("managedConfiguration", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    @scala.inline
    def setPermissionGrantsVarargs(value: PermissionGrant*): Self = this.set("permissionGrants", js.Array(value :_*))
    @scala.inline
    def setPermissionGrants(value: js.Array[PermissionGrant]): Self = this.set("permissionGrants", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionGrants: Self = this.set("permissionGrants", js.undefined)
  }
  
}

