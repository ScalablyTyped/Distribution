package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Policy for an individual app.
  */
trait SchemaApplicationPolicy extends StObject {
  
  /**
    * The default policy for all permissions requested by the app. If
    * specified, this overrides the policy-level default_permission_policy
    * which applies to all apps. It does not override the permission_grants
    * which applies to all apps.
    */
  var defaultPermissionPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * The scopes delegated to the app from Android Device Policy.
    */
  var delegatedScopes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether the app is disabled. When disabled, the app data is still
    * preserved.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of installation to perform.
    */
  var installType: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the app is allowed to lock itself in full-screen mode.
    */
  var lockTaskAllowed: js.UndefOr[Boolean] = js.undefined
  
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
  var managedConfiguration: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * The managed configurations template for the app, saved from the managed
    * configurations iframe. This field is ignored if managed_configuration is
    * set.
    */
  var managedConfigurationTemplate: js.UndefOr[SchemaManagedConfigurationTemplate] = js.undefined
  
  /**
    * The minimum version of the app that runs on the device. If set, the
    * device attempts to update the app to at least this version code. If the
    * app is not up-to-date, the device will contain a NonComplianceDetail with
    * non_compliance_reason set to APP_NOT_UPDATED. The app must already be
    * published to Google Play with a version code greater than or equal to
    * this value. At most 20 apps may specify a minimum version code per
    * policy.
    */
  var minimumVersionCode: js.UndefOr[Double] = js.undefined
  
  /**
    * The package name of the app. For example, com.google.android.youtube for
    * the YouTube app.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Explicit permission grants or denials for the app. These values override
    * the default_permission_policy and permission_grants which apply to all
    * apps.
    */
  var permissionGrants: js.UndefOr[js.Array[SchemaPermissionGrant]] = js.undefined
}
object SchemaApplicationPolicy {
  
  inline def apply(): SchemaApplicationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationPolicy]
  }
  
  extension [Self <: SchemaApplicationPolicy](x: Self) {
    
    inline def setDefaultPermissionPolicy(value: String): Self = StObject.set(x, "defaultPermissionPolicy", value.asInstanceOf[js.Any])
    
    inline def setDefaultPermissionPolicyUndefined: Self = StObject.set(x, "defaultPermissionPolicy", js.undefined)
    
    inline def setDelegatedScopes(value: js.Array[String]): Self = StObject.set(x, "delegatedScopes", value.asInstanceOf[js.Any])
    
    inline def setDelegatedScopesUndefined: Self = StObject.set(x, "delegatedScopes", js.undefined)
    
    inline def setDelegatedScopesVarargs(value: String*): Self = StObject.set(x, "delegatedScopes", js.Array(value :_*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setInstallType(value: String): Self = StObject.set(x, "installType", value.asInstanceOf[js.Any])
    
    inline def setInstallTypeUndefined: Self = StObject.set(x, "installType", js.undefined)
    
    inline def setLockTaskAllowed(value: Boolean): Self = StObject.set(x, "lockTaskAllowed", value.asInstanceOf[js.Any])
    
    inline def setLockTaskAllowedUndefined: Self = StObject.set(x, "lockTaskAllowed", js.undefined)
    
    inline def setManagedConfiguration(value: StringDictionary[js.Any]): Self = StObject.set(x, "managedConfiguration", value.asInstanceOf[js.Any])
    
    inline def setManagedConfigurationTemplate(value: SchemaManagedConfigurationTemplate): Self = StObject.set(x, "managedConfigurationTemplate", value.asInstanceOf[js.Any])
    
    inline def setManagedConfigurationTemplateUndefined: Self = StObject.set(x, "managedConfigurationTemplate", js.undefined)
    
    inline def setManagedConfigurationUndefined: Self = StObject.set(x, "managedConfiguration", js.undefined)
    
    inline def setMinimumVersionCode(value: Double): Self = StObject.set(x, "minimumVersionCode", value.asInstanceOf[js.Any])
    
    inline def setMinimumVersionCodeUndefined: Self = StObject.set(x, "minimumVersionCode", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setPermissionGrants(value: js.Array[SchemaPermissionGrant]): Self = StObject.set(x, "permissionGrants", value.asInstanceOf[js.Any])
    
    inline def setPermissionGrantsUndefined: Self = StObject.set(x, "permissionGrants", js.undefined)
    
    inline def setPermissionGrantsVarargs(value: SchemaPermissionGrant*): Self = StObject.set(x, "permissionGrants", js.Array(value :_*))
  }
}
