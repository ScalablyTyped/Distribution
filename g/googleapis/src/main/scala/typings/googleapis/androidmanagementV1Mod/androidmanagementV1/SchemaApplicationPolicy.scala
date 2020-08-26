package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Policy for an individual app.
  */
@js.native
trait SchemaApplicationPolicy extends js.Object {
  /**
    * The default policy for all permissions requested by the app. If
    * specified, this overrides the policy-level default_permission_policy
    * which applies to all apps. It does not override the permission_grants
    * which applies to all apps.
    */
  var defaultPermissionPolicy: js.UndefOr[String] = js.native
  /**
    * The scopes delegated to the app from Android Device Policy.
    */
  var delegatedScopes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether the app is disabled. When disabled, the app data is still
    * preserved.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The type of installation to perform.
    */
  var installType: js.UndefOr[String] = js.native
  /**
    * Whether the app is allowed to lock itself in full-screen mode.
    */
  var lockTaskAllowed: js.UndefOr[Boolean] = js.native
  /**
    * Managed configuration applied to the app. The format for the
    * configuration is dictated by the ManagedProperty values supported by the
    * app. Each field name in the managed configuration must match the key
    * field of the ManagedProperty. The field value must be compatible with the
    * type of the ManagedProperty: &lt;table&gt;
    * &lt;tr&gt;&lt;td&gt;&lt;i&gt;type&lt;/i&gt;&lt;/td&gt;&lt;td&gt;&lt;i&gt;JSON
    * value&lt;/i&gt;&lt;/td&gt;&lt;/tr&gt;
    * &lt;tr&gt;&lt;td&gt;BOOL&lt;/td&gt;&lt;td&gt;true or
    * false&lt;/td&gt;&lt;/tr&gt;
    * &lt;tr&gt;&lt;td&gt;STRING&lt;/td&gt;&lt;td&gt;string&lt;/td&gt;&lt;/tr&gt;
    * &lt;tr&gt;&lt;td&gt;INTEGER&lt;/td&gt;&lt;td&gt;number&lt;/td&gt;&lt;/tr&gt;
    * &lt;tr&gt;&lt;td&gt;CHOICE&lt;/td&gt;&lt;td&gt;string&lt;/td&gt;&lt;/tr&gt;
    * &lt;tr&gt;&lt;td&gt;MULTISELECT&lt;/td&gt;&lt;td&gt;array of
    * strings&lt;/td&gt;&lt;/tr&gt;
    * &lt;tr&gt;&lt;td&gt;HIDDEN&lt;/td&gt;&lt;td&gt;string&lt;/td&gt;&lt;/tr&gt;
    * &lt;tr&gt;&lt;td&gt;BUNDLE_ARRAY&lt;/td&gt;&lt;td&gt;array of
    * objects&lt;/td&gt;&lt;/tr&gt; &lt;/table&gt;
    */
  var managedConfiguration: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The managed configurations template for the app, saved from the managed
    * configurations iframe. This field is ignored if managed_configuration is
    * set.
    */
  var managedConfigurationTemplate: js.UndefOr[SchemaManagedConfigurationTemplate] = js.native
  /**
    * The minimum version of the app that runs on the device. If set, the
    * device attempts to update the app to at least this version code. If the
    * app is not up-to-date, the device will contain a NonComplianceDetail with
    * non_compliance_reason set to APP_NOT_UPDATED. The app must already be
    * published to Google Play with a version code greater than or equal to
    * this value. At most 20 apps may specify a minimum version code per
    * policy.
    */
  var minimumVersionCode: js.UndefOr[Double] = js.native
  /**
    * The package name of the app. For example, com.google.android.youtube for
    * the YouTube app.
    */
  var packageName: js.UndefOr[String] = js.native
  /**
    * Explicit permission grants or denials for the app. These values override
    * the default_permission_policy and permission_grants which apply to all
    * apps.
    */
  var permissionGrants: js.UndefOr[js.Array[SchemaPermissionGrant]] = js.native
}

object SchemaApplicationPolicy {
  @scala.inline
  def apply(): SchemaApplicationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationPolicy]
  }
  @scala.inline
  implicit class SchemaApplicationPolicyOps[Self <: SchemaApplicationPolicy] (val x: Self) extends AnyVal {
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
    def setDelegatedScopesVarargs(value: String*): Self = this.set("delegatedScopes", js.Array(value :_*))
    @scala.inline
    def setDelegatedScopes(value: js.Array[String]): Self = this.set("delegatedScopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegatedScopes: Self = this.set("delegatedScopes", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setInstallType(value: String): Self = this.set("installType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallType: Self = this.set("installType", js.undefined)
    @scala.inline
    def setLockTaskAllowed(value: Boolean): Self = this.set("lockTaskAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockTaskAllowed: Self = this.set("lockTaskAllowed", js.undefined)
    @scala.inline
    def setManagedConfiguration(value: StringDictionary[js.Any]): Self = this.set("managedConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedConfiguration: Self = this.set("managedConfiguration", js.undefined)
    @scala.inline
    def setManagedConfigurationTemplate(value: SchemaManagedConfigurationTemplate): Self = this.set("managedConfigurationTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedConfigurationTemplate: Self = this.set("managedConfigurationTemplate", js.undefined)
    @scala.inline
    def setMinimumVersionCode(value: Double): Self = this.set("minimumVersionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumVersionCode: Self = this.set("minimumVersionCode", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    @scala.inline
    def setPermissionGrantsVarargs(value: SchemaPermissionGrant*): Self = this.set("permissionGrants", js.Array(value :_*))
    @scala.inline
    def setPermissionGrants(value: js.Array[SchemaPermissionGrant]): Self = this.set("permissionGrants", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionGrants: Self = this.set("permissionGrants", js.undefined)
  }
  
}

