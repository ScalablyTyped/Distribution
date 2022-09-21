package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApplicationPolicy extends StObject {
  
  /**
    * List of the app’s track IDs that a device belonging to the enterprise can access. If the list contains multiple track IDs, devices receive the latest version among all accessible tracks. If the list contains no track IDs, devices only have access to the app’s production track. More details about each track are available in AppTrackInfo.
    */
  var accessibleTrackIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Specifies whether the app is allowed networking when the VPN is not connected and alwaysOnVpnPackage.lockdownEnabled is enabled. If set to VPN_LOCKDOWN_ENFORCED, the app is not allowed networking, and if set to VPN_LOCKDOWN_EXEMPTION, the app is allowed networking. Only supported on devices running Android 10 and above. If this is not supported by the device, the device will contain a NonComplianceDetail with non_compliance_reason set to API_LEVEL and a fieldPath. If this is not applicable to the app, the device will contain a NonComplianceDetail with non_compliance_reason set to UNSUPPORTED and a fieldPath. The fieldPath is set to applications[i].alwaysOnVpnLockdownExemption, where i is the index of the package in the applications policy.
    */
  var alwaysOnVpnLockdownExemption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Controls the auto-update mode for the app.
    */
  var autoUpdateMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Controls whether the app can communicate with itself across a device’s work and personal profiles, subject to user consent.
    */
  var connectedWorkAndPersonalApp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The default policy for all permissions requested by the app. If specified, this overrides the policy-level default_permission_policy which applies to all apps. It does not override the permission_grants which applies to all apps.
    */
  var defaultPermissionPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The scopes delegated to the app from Android Device Policy.
    */
  var delegatedScopes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Whether the app is disabled. When disabled, the app data is still preserved.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Configuration to enable this app as an extension app, with the capability of interacting with Android Device Policy offline.This field can be set for at most one app.
    */
  var extensionConfig: js.UndefOr[SchemaExtensionConfig] = js.undefined
  
  /**
    * The type of installation to perform.
    */
  var installType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the app is allowed to lock itself in full-screen mode. DEPRECATED. Use InstallType KIOSK or kioskCustomLauncherEnabled to to configure a dedicated device.
    */
  var lockTaskAllowed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Managed configuration applied to the app. The format for the configuration is dictated by the ManagedProperty values supported by the app. Each field name in the managed configuration must match the key field of the ManagedProperty. The field value must be compatible with the type of the ManagedProperty: *type* *JSON value* BOOL true or false STRING string INTEGER number CHOICE string MULTISELECT array of strings HIDDEN string BUNDLE_ARRAY array of objects
    */
  var managedConfiguration: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The managed configurations template for the app, saved from the managed configurations iframe. This field is ignored if managed_configuration is set.
    */
  var managedConfigurationTemplate: js.UndefOr[SchemaManagedConfigurationTemplate] = js.undefined
  
  /**
    * The minimum version of the app that runs on the device. If set, the device attempts to update the app to at least this version code. If the app is not up-to-date, the device will contain a NonComplianceDetail with non_compliance_reason set to APP_NOT_UPDATED. The app must already be published to Google Play with a version code greater than or equal to this value. At most 20 apps may specify a minimum version code per policy.
    */
  var minimumVersionCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The package name of the app. For example, com.google.android.youtube for the YouTube app.
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Explicit permission grants or denials for the app. These values override the default_permission_policy and permission_grants which apply to all apps.
    */
  var permissionGrants: js.UndefOr[js.Array[SchemaPermissionGrant]] = js.undefined
}
object SchemaApplicationPolicy {
  
  inline def apply(): SchemaApplicationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationPolicy]
  }
  
  extension [Self <: SchemaApplicationPolicy](x: Self) {
    
    inline def setAccessibleTrackIds(value: js.Array[String]): Self = StObject.set(x, "accessibleTrackIds", value.asInstanceOf[js.Any])
    
    inline def setAccessibleTrackIdsNull: Self = StObject.set(x, "accessibleTrackIds", null)
    
    inline def setAccessibleTrackIdsUndefined: Self = StObject.set(x, "accessibleTrackIds", js.undefined)
    
    inline def setAccessibleTrackIdsVarargs(value: String*): Self = StObject.set(x, "accessibleTrackIds", js.Array(value*))
    
    inline def setAlwaysOnVpnLockdownExemption(value: String): Self = StObject.set(x, "alwaysOnVpnLockdownExemption", value.asInstanceOf[js.Any])
    
    inline def setAlwaysOnVpnLockdownExemptionNull: Self = StObject.set(x, "alwaysOnVpnLockdownExemption", null)
    
    inline def setAlwaysOnVpnLockdownExemptionUndefined: Self = StObject.set(x, "alwaysOnVpnLockdownExemption", js.undefined)
    
    inline def setAutoUpdateMode(value: String): Self = StObject.set(x, "autoUpdateMode", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateModeNull: Self = StObject.set(x, "autoUpdateMode", null)
    
    inline def setAutoUpdateModeUndefined: Self = StObject.set(x, "autoUpdateMode", js.undefined)
    
    inline def setConnectedWorkAndPersonalApp(value: String): Self = StObject.set(x, "connectedWorkAndPersonalApp", value.asInstanceOf[js.Any])
    
    inline def setConnectedWorkAndPersonalAppNull: Self = StObject.set(x, "connectedWorkAndPersonalApp", null)
    
    inline def setConnectedWorkAndPersonalAppUndefined: Self = StObject.set(x, "connectedWorkAndPersonalApp", js.undefined)
    
    inline def setDefaultPermissionPolicy(value: String): Self = StObject.set(x, "defaultPermissionPolicy", value.asInstanceOf[js.Any])
    
    inline def setDefaultPermissionPolicyNull: Self = StObject.set(x, "defaultPermissionPolicy", null)
    
    inline def setDefaultPermissionPolicyUndefined: Self = StObject.set(x, "defaultPermissionPolicy", js.undefined)
    
    inline def setDelegatedScopes(value: js.Array[String]): Self = StObject.set(x, "delegatedScopes", value.asInstanceOf[js.Any])
    
    inline def setDelegatedScopesNull: Self = StObject.set(x, "delegatedScopes", null)
    
    inline def setDelegatedScopesUndefined: Self = StObject.set(x, "delegatedScopes", js.undefined)
    
    inline def setDelegatedScopesVarargs(value: String*): Self = StObject.set(x, "delegatedScopes", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExtensionConfig(value: SchemaExtensionConfig): Self = StObject.set(x, "extensionConfig", value.asInstanceOf[js.Any])
    
    inline def setExtensionConfigUndefined: Self = StObject.set(x, "extensionConfig", js.undefined)
    
    inline def setInstallType(value: String): Self = StObject.set(x, "installType", value.asInstanceOf[js.Any])
    
    inline def setInstallTypeNull: Self = StObject.set(x, "installType", null)
    
    inline def setInstallTypeUndefined: Self = StObject.set(x, "installType", js.undefined)
    
    inline def setLockTaskAllowed(value: Boolean): Self = StObject.set(x, "lockTaskAllowed", value.asInstanceOf[js.Any])
    
    inline def setLockTaskAllowedNull: Self = StObject.set(x, "lockTaskAllowed", null)
    
    inline def setLockTaskAllowedUndefined: Self = StObject.set(x, "lockTaskAllowed", js.undefined)
    
    inline def setManagedConfiguration(value: StringDictionary[Any]): Self = StObject.set(x, "managedConfiguration", value.asInstanceOf[js.Any])
    
    inline def setManagedConfigurationNull: Self = StObject.set(x, "managedConfiguration", null)
    
    inline def setManagedConfigurationTemplate(value: SchemaManagedConfigurationTemplate): Self = StObject.set(x, "managedConfigurationTemplate", value.asInstanceOf[js.Any])
    
    inline def setManagedConfigurationTemplateUndefined: Self = StObject.set(x, "managedConfigurationTemplate", js.undefined)
    
    inline def setManagedConfigurationUndefined: Self = StObject.set(x, "managedConfiguration", js.undefined)
    
    inline def setMinimumVersionCode(value: Double): Self = StObject.set(x, "minimumVersionCode", value.asInstanceOf[js.Any])
    
    inline def setMinimumVersionCodeNull: Self = StObject.set(x, "minimumVersionCode", null)
    
    inline def setMinimumVersionCodeUndefined: Self = StObject.set(x, "minimumVersionCode", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setPermissionGrants(value: js.Array[SchemaPermissionGrant]): Self = StObject.set(x, "permissionGrants", value.asInstanceOf[js.Any])
    
    inline def setPermissionGrantsUndefined: Self = StObject.set(x, "permissionGrants", js.undefined)
    
    inline def setPermissionGrantsVarargs(value: SchemaPermissionGrant*): Self = StObject.set(x, "permissionGrants", js.Array(value*))
  }
}
