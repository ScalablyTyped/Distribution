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
  def apply(
    defaultPermissionPolicy: String = null,
    delegatedScopes: js.Array[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    installType: String = null,
    lockTaskAllowed: js.UndefOr[Boolean] = js.undefined,
    managedConfiguration: StringDictionary[js.Any] = null,
    managedConfigurationTemplate: SchemaManagedConfigurationTemplate = null,
    minimumVersionCode: js.UndefOr[Double] = js.undefined,
    packageName: String = null,
    permissionGrants: js.Array[SchemaPermissionGrant] = null
  ): SchemaApplicationPolicy = {
    val __obj = js.Dynamic.literal()
    if (defaultPermissionPolicy != null) __obj.updateDynamic("defaultPermissionPolicy")(defaultPermissionPolicy.asInstanceOf[js.Any])
    if (delegatedScopes != null) __obj.updateDynamic("delegatedScopes")(delegatedScopes.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (installType != null) __obj.updateDynamic("installType")(installType.asInstanceOf[js.Any])
    if (!js.isUndefined(lockTaskAllowed)) __obj.updateDynamic("lockTaskAllowed")(lockTaskAllowed.get.asInstanceOf[js.Any])
    if (managedConfiguration != null) __obj.updateDynamic("managedConfiguration")(managedConfiguration.asInstanceOf[js.Any])
    if (managedConfigurationTemplate != null) __obj.updateDynamic("managedConfigurationTemplate")(managedConfigurationTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumVersionCode)) __obj.updateDynamic("minimumVersionCode")(minimumVersionCode.get.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (permissionGrants != null) __obj.updateDynamic("permissionGrants")(permissionGrants.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaApplicationPolicy]
  }
}

