package typings.gapiDotClientDotAndroidmanagement.gapi.client.androidmanagement

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationPolicy extends js.Object {
  /**
    * The default policy for all permissions requested by the app. If specified, this overrides the policy-level default_permission_policy which applies to
    * all apps.
    */
  var defaultPermissionPolicy: js.UndefOr[String] = js.undefined
  /** The type of installation to perform. */
  var installType: js.UndefOr[String] = js.undefined
  /** Whether the application is allowed to lock itself in full-screen mode. */
  var lockTaskAllowed: js.UndefOr[Boolean] = js.undefined
  /**
    * Managed configuration applied to the app. The format for the configuration is dictated by the ManagedProperty values supported by the app. Each field
    * name in the managed configuration must match the key field of the ManagedProperty. The field value must be compatible with the type of the
    * ManagedProperty: <table> <tr><td><i>type</i></td><td><i>JSON value</i></td></tr> <tr><td>BOOL</td><td>true or false</td></tr>
    * <tr><td>STRING</td><td>string</td></tr> <tr><td>INTEGER</td><td>number</td></tr> <tr><td>CHOICE</td><td>string</td></tr>
    * <tr><td>MULTISELECT</td><td>array of strings</td></tr> <tr><td>HIDDEN</td><td>string</td></tr> <tr><td>BUNDLE_ARRAY</td><td>array of objects</td></tr>
    * </table>
    */
  var managedConfiguration: js.UndefOr[Record[String, _]] = js.undefined
  /** The package name of the app, e.g. com.google.android.youtube for the YouTube app. */
  var packageName: js.UndefOr[String] = js.undefined
  /** Explicit permission grants or denials for the app. These values override the default_permission_policy. */
  var permissionGrants: js.UndefOr[js.Array[PermissionGrant]] = js.undefined
}

object ApplicationPolicy {
  @scala.inline
  def apply(
    defaultPermissionPolicy: String = null,
    installType: String = null,
    lockTaskAllowed: js.UndefOr[Boolean] = js.undefined,
    managedConfiguration: Record[String, _] = null,
    packageName: String = null,
    permissionGrants: js.Array[PermissionGrant] = null
  ): ApplicationPolicy = {
    val __obj = js.Dynamic.literal()
    if (defaultPermissionPolicy != null) __obj.updateDynamic("defaultPermissionPolicy")(defaultPermissionPolicy)
    if (installType != null) __obj.updateDynamic("installType")(installType)
    if (!js.isUndefined(lockTaskAllowed)) __obj.updateDynamic("lockTaskAllowed")(lockTaskAllowed)
    if (managedConfiguration != null) __obj.updateDynamic("managedConfiguration")(managedConfiguration)
    if (packageName != null) __obj.updateDynamic("packageName")(packageName)
    if (permissionGrants != null) __obj.updateDynamic("permissionGrants")(permissionGrants)
    __obj.asInstanceOf[ApplicationPolicy]
  }
}

