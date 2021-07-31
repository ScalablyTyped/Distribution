package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A policy resources represents a group settings that govern the behavior of
  * a managed device and the apps installed on it.
  */
trait SchemaPolicy extends StObject {
  
  /**
    * Account types that can&#39;t be managed by the user.
    */
  var accountTypesWithManagementDisabled: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether adding new users and profiles is disabled.
    */
  var addUserDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether adjusting the master volume is disabled.
    */
  var adjustVolumeDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configuration for an always-on VPN connection. Use with
    * vpn_config_disabled to prevent modification of this setting.
    */
  var alwaysOnVpnPackage: js.UndefOr[SchemaAlwaysOnVpnPackage] = js.undefined
  
  /**
    * The app tracks for Android Device Policy the device can access. The
    * device receives the latest version among all accessible tracks. If no
    * tracks are specified, then the device only uses the production track.
    */
  var androidDevicePolicyTracks: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The app auto update policy, which controls when automatic app updates can
    * be applied.
    */
  var appAutoUpdatePolicy: js.UndefOr[String] = js.undefined
  
  /**
    * Policy applied to apps.
    */
  var applications: js.UndefOr[js.Array[SchemaApplicationPolicy]] = js.undefined
  
  /**
    * Whether auto time is required, which prevents the user from manually
    * setting the date and time.
    */
  var autoTimeRequired: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether applications other than the ones configured in applications are
    * blocked from being installed. When set, applications that were installed
    * under a previous policy but no longer appear in the policy are
    * automatically uninstalled.
    */
  var blockApplicationsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether configuring bluetooth is disabled.
    */
  var bluetoothConfigDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether bluetooth contact sharing is disabled.
    */
  var bluetoothContactSharingDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether bluetooth is disabled. Prefer this setting over
    * bluetooth_config_disabled because bluetooth_config_disabled can be
    * bypassed by the user.
    */
  var bluetoothDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether all cameras on the device are disabled.
    */
  var cameraDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether configuring cell broadcast is disabled.
    */
  var cellBroadcastsConfigDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Rules for automatically choosing a private key and certificate to
    * authenticate the device to a server. The rules are ordered by increasing
    * precedence, so if an outgoing request matches more than one rule, the
    * last rule defines which private key to use.
    */
  var choosePrivateKeyRules: js.UndefOr[js.Array[SchemaChoosePrivateKeyRule]] = js.undefined
  
  /**
    * Rules declaring which mitigating actions to take when a device is not
    * compliant with its policy. When the conditions for multiple rules are
    * satisfied, all of the mitigating actions for the rules are taken. There
    * is a maximum limit of 100 rules.
    */
  var complianceRules: js.UndefOr[js.Array[SchemaComplianceRule]] = js.undefined
  
  /**
    * Whether creating windows besides app windows is disabled.
    */
  var createWindowsDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether configuring user credentials is disabled.
    */
  var credentialsConfigDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether roaming data services are disabled.
    */
  var dataRoamingDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the user is allowed to enable debugging features.
    */
  var debuggingFeaturesAllowed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default permission policy for runtime permission requests.
    */
  var defaultPermissionPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * The device owner information to be shown on the lock screen.
    */
  var deviceOwnerLockScreenInfo: js.UndefOr[SchemaUserFacingMessage] = js.undefined
  
  /**
    * Whether encryption is enabled
    */
  var encryptionPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * Whether app verification is force-enabled.
    */
  var ensureVerifyAppsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether factory resetting from settings is disabled.
    */
  var factoryResetDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Email addresses of device administrators for factory reset protection.
    * When the device is factory reset, it will require one of these admins to
    * log in with the Google account email and password to unlock the device.
    * If no admins are specified, the device won&#39;t provide factory reset
    * protection.
    */
  var frpAdminEmails: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether the user is allowed to have fun. Controls whether the Easter egg
    * game in Settings is disabled.
    */
  var funDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether user installation of apps is disabled.
    */
  var installAppsDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the user is allowed to enable the &quot;Unknown Sources&quot;
    * setting, which allows installation of apps from unknown sources.
    */
  var installUnknownSourcesAllowed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the keyguard is disabled.
    */
  var keyguardDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disabled keyguard customizations, such as widgets.
    */
  var keyguardDisabledFeatures: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether the kiosk custom launcher is enabled. This replaces the home
    * screen with a launcher that locks down the device to the apps installed
    * via the applications setting. The apps appear on a single page in
    * alphabetical order. It is recommended to also use status_bar_disabled to
    * block access to device settings.
    */
  var kioskCustomLauncherEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The degree of location detection enabled. The user may change the value
    * unless the user is otherwise blocked from accessing device settings.
    */
  var locationMode: js.UndefOr[String] = js.undefined
  
  /**
    * A message displayed to the user in the device administators settings
    * screen.
    */
  var longSupportMessage: js.UndefOr[SchemaUserFacingMessage] = js.undefined
  
  /**
    * Maximum time in milliseconds for user activity until the device locks. A
    * value of 0 means there is no restriction.
    */
  var maximumTimeToLock: js.UndefOr[String] = js.undefined
  
  /**
    * Whether configuring mobile networks is disabled.
    */
  var mobileNetworksConfigDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether adding or removing accounts is disabled.
    */
  var modifyAccountsDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the user mounting physical external media is disabled.
    */
  var mountPhysicalMediaDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the policy in the form
    * enterprises/{enterpriseId}/policies/{policyId}.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the network escape hatch is enabled. If a network connection
    * can&#39;t be made at boot time, the escape hatch prompts the user to
    * temporarily connect to a network in order to refresh the device policy.
    * After applying policy, the temporary network will be forgotten and the
    * device will continue booting. This prevents being unable to connect to a
    * network if there is no suitable network in the last policy and the device
    * boots into an app in lock task mode, or the user is otherwise unable to
    * reach device settings.
    */
  var networkEscapeHatchEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether resetting network settings is disabled.
    */
  var networkResetDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Network configuration for the device. See configure networks for more
    * information.
    */
  var openNetworkConfiguration: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Whether using NFC to beam data from apps is disabled.
    */
  var outgoingBeamDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether outgoing calls are disabled.
    */
  var outgoingCallsDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Password requirement policies. Different policies can be set for work
    * profile or fully managed devices by setting the password_scope field in
    * the policy.
    */
  var passwordPolicies: js.UndefOr[js.Array[SchemaPasswordRequirements]] = js.undefined
  
  /**
    * Password requirements. DEPRECATED - Use password_policies
    */
  var passwordRequirements: js.UndefOr[SchemaPasswordRequirements] = js.undefined
  
  /**
    * Explicit permission or group grants or denials for all apps. These values
    * override the default_permission_policy.
    */
  var permissionGrants: js.UndefOr[js.Array[SchemaPermissionGrant]] = js.undefined
  
  /**
    * If present, only the input methods provided by packages in this list are
    * permitted. If this field is present, but the list is empty, then only
    * system input methods are permitted.
    */
  var permittedInputMethods: js.UndefOr[SchemaPackageNameList] = js.undefined
  
  /**
    * Default intent handler activities.
    */
  var persistentPreferredActivities: js.UndefOr[js.Array[SchemaPersistentPreferredActivity]] = js.undefined
  
  /**
    * This mode controls which apps are available to the user in the Play Store
    * and the behavior on the device when apps are removed from the policy.
    */
  var playStoreMode: js.UndefOr[String] = js.undefined
  
  /**
    * Allows showing UI on a device for a user to choose a private key alias if
    * there are no matching rules in ChoosePrivateKeyRules. For devices below
    * Android P, setting this may leave enterprise keys vulnerable.
    */
  var privateKeySelectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The network-independent global HTTP proxy. Typically proxies should be
    * configured per-network in open_network_configuration. However for unusual
    * configurations like general internal filtering a global HTTP proxy may be
    * useful. If the proxy is not accessible, network access may break. The
    * global proxy is only a recommendation and some apps may ignore it.
    */
  var recommendedGlobalProxy: js.UndefOr[SchemaProxyInfo] = js.undefined
  
  /**
    * Whether removing other users is disabled.
    */
  var removeUserDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether rebooting the device into safe boot is disabled.
    */
  var safeBootDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether screen capture is disabled.
    */
  var screenCaptureDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether changing the user icon is disabled.
    */
  var setUserIconDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether changing the wallpaper is disabled.
    */
  var setWallpaperDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Actions to take during the setup process.
    */
  var setupActions: js.UndefOr[js.Array[SchemaSetupAction]] = js.undefined
  
  /**
    * Whether location sharing is disabled.
    */
  var shareLocationDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A message displayed to the user in the settings screen wherever
    * functionality has been disabled by the admin.
    */
  var shortSupportMessage: js.UndefOr[SchemaUserFacingMessage] = js.undefined
  
  /**
    * Flag to skip hints on the first use. Enterprise admin can enable the
    * system recommendation for apps to skip their user tutorial and other
    * introductory hints on first start-up.
    */
  var skipFirstUseHintsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether sending and receiving SMS messages is disabled.
    */
  var smsDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the status bar is disabled. This disables notifications, quick
    * settings, and other screen overlays that allow escape from full-screen
    * mode.
    */
  var statusBarDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Status reporting settings
    */
  var statusReportingSettings: js.UndefOr[SchemaStatusReportingSettings] = js.undefined
  
  /**
    * The battery plugged in modes for which the device stays on. When using
    * this setting, it is recommended to clear maximum_time_to_lock so that the
    * device doesn&#39;t lock itself while it stays on.
    */
  var stayOnPluggedModes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The system update policy, which controls how OS updates are applied. If
    * the update type is WINDOWED, the update window will automatically apply
    * to Play app updates as well.
    */
  var systemUpdate: js.UndefOr[SchemaSystemUpdate] = js.undefined
  
  /**
    * Whether configuring tethering and portable hotspots is disabled.
    */
  var tetheringConfigDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether user uninstallation of applications is disabled.
    */
  var uninstallAppsDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the microphone is muted and adjusting microphone volume is
    * disabled.
    */
  var unmuteMicrophoneDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether transferring files over USB is disabled.
    */
  var usbFileTransferDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether USB storage is enabled. Deprecated.
    */
  var usbMassStorageEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The version of the policy. This is a read-only field. The version is
    * incremented each time the policy is updated.
    */
  var version: js.UndefOr[String] = js.undefined
  
  /**
    * Whether configuring VPN is disabled.
    */
  var vpnConfigDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether configuring Wi-Fi access points is disabled.
    */
  var wifiConfigDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * DEPRECATED - Use wifi_config_disabled.
    */
  var wifiConfigsLockdownEnabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaPolicy {
  
  @scala.inline
  def apply(): SchemaPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicy]
  }
  
  @scala.inline
  implicit class SchemaPolicyMutableBuilder[Self <: SchemaPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountTypesWithManagementDisabled(value: js.Array[String]): Self = StObject.set(x, "accountTypesWithManagementDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountTypesWithManagementDisabledUndefined: Self = StObject.set(x, "accountTypesWithManagementDisabled", js.undefined)
    
    @scala.inline
    def setAccountTypesWithManagementDisabledVarargs(value: String*): Self = StObject.set(x, "accountTypesWithManagementDisabled", js.Array(value :_*))
    
    @scala.inline
    def setAddUserDisabled(value: Boolean): Self = StObject.set(x, "addUserDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUserDisabledUndefined: Self = StObject.set(x, "addUserDisabled", js.undefined)
    
    @scala.inline
    def setAdjustVolumeDisabled(value: Boolean): Self = StObject.set(x, "adjustVolumeDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustVolumeDisabledUndefined: Self = StObject.set(x, "adjustVolumeDisabled", js.undefined)
    
    @scala.inline
    def setAlwaysOnVpnPackage(value: SchemaAlwaysOnVpnPackage): Self = StObject.set(x, "alwaysOnVpnPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysOnVpnPackageUndefined: Self = StObject.set(x, "alwaysOnVpnPackage", js.undefined)
    
    @scala.inline
    def setAndroidDevicePolicyTracks(value: js.Array[String]): Self = StObject.set(x, "androidDevicePolicyTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidDevicePolicyTracksUndefined: Self = StObject.set(x, "androidDevicePolicyTracks", js.undefined)
    
    @scala.inline
    def setAndroidDevicePolicyTracksVarargs(value: String*): Self = StObject.set(x, "androidDevicePolicyTracks", js.Array(value :_*))
    
    @scala.inline
    def setAppAutoUpdatePolicy(value: String): Self = StObject.set(x, "appAutoUpdatePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppAutoUpdatePolicyUndefined: Self = StObject.set(x, "appAutoUpdatePolicy", js.undefined)
    
    @scala.inline
    def setApplications(value: js.Array[SchemaApplicationPolicy]): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsUndefined: Self = StObject.set(x, "applications", js.undefined)
    
    @scala.inline
    def setApplicationsVarargs(value: SchemaApplicationPolicy*): Self = StObject.set(x, "applications", js.Array(value :_*))
    
    @scala.inline
    def setAutoTimeRequired(value: Boolean): Self = StObject.set(x, "autoTimeRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoTimeRequiredUndefined: Self = StObject.set(x, "autoTimeRequired", js.undefined)
    
    @scala.inline
    def setBlockApplicationsEnabled(value: Boolean): Self = StObject.set(x, "blockApplicationsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockApplicationsEnabledUndefined: Self = StObject.set(x, "blockApplicationsEnabled", js.undefined)
    
    @scala.inline
    def setBluetoothConfigDisabled(value: Boolean): Self = StObject.set(x, "bluetoothConfigDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluetoothConfigDisabledUndefined: Self = StObject.set(x, "bluetoothConfigDisabled", js.undefined)
    
    @scala.inline
    def setBluetoothContactSharingDisabled(value: Boolean): Self = StObject.set(x, "bluetoothContactSharingDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluetoothContactSharingDisabledUndefined: Self = StObject.set(x, "bluetoothContactSharingDisabled", js.undefined)
    
    @scala.inline
    def setBluetoothDisabled(value: Boolean): Self = StObject.set(x, "bluetoothDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluetoothDisabledUndefined: Self = StObject.set(x, "bluetoothDisabled", js.undefined)
    
    @scala.inline
    def setCameraDisabled(value: Boolean): Self = StObject.set(x, "cameraDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraDisabledUndefined: Self = StObject.set(x, "cameraDisabled", js.undefined)
    
    @scala.inline
    def setCellBroadcastsConfigDisabled(value: Boolean): Self = StObject.set(x, "cellBroadcastsConfigDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellBroadcastsConfigDisabledUndefined: Self = StObject.set(x, "cellBroadcastsConfigDisabled", js.undefined)
    
    @scala.inline
    def setChoosePrivateKeyRules(value: js.Array[SchemaChoosePrivateKeyRule]): Self = StObject.set(x, "choosePrivateKeyRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoosePrivateKeyRulesUndefined: Self = StObject.set(x, "choosePrivateKeyRules", js.undefined)
    
    @scala.inline
    def setChoosePrivateKeyRulesVarargs(value: SchemaChoosePrivateKeyRule*): Self = StObject.set(x, "choosePrivateKeyRules", js.Array(value :_*))
    
    @scala.inline
    def setComplianceRules(value: js.Array[SchemaComplianceRule]): Self = StObject.set(x, "complianceRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceRulesUndefined: Self = StObject.set(x, "complianceRules", js.undefined)
    
    @scala.inline
    def setComplianceRulesVarargs(value: SchemaComplianceRule*): Self = StObject.set(x, "complianceRules", js.Array(value :_*))
    
    @scala.inline
    def setCreateWindowsDisabled(value: Boolean): Self = StObject.set(x, "createWindowsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateWindowsDisabledUndefined: Self = StObject.set(x, "createWindowsDisabled", js.undefined)
    
    @scala.inline
    def setCredentialsConfigDisabled(value: Boolean): Self = StObject.set(x, "credentialsConfigDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsConfigDisabledUndefined: Self = StObject.set(x, "credentialsConfigDisabled", js.undefined)
    
    @scala.inline
    def setDataRoamingDisabled(value: Boolean): Self = StObject.set(x, "dataRoamingDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRoamingDisabledUndefined: Self = StObject.set(x, "dataRoamingDisabled", js.undefined)
    
    @scala.inline
    def setDebuggingFeaturesAllowed(value: Boolean): Self = StObject.set(x, "debuggingFeaturesAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggingFeaturesAllowedUndefined: Self = StObject.set(x, "debuggingFeaturesAllowed", js.undefined)
    
    @scala.inline
    def setDefaultPermissionPolicy(value: String): Self = StObject.set(x, "defaultPermissionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPermissionPolicyUndefined: Self = StObject.set(x, "defaultPermissionPolicy", js.undefined)
    
    @scala.inline
    def setDeviceOwnerLockScreenInfo(value: SchemaUserFacingMessage): Self = StObject.set(x, "deviceOwnerLockScreenInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceOwnerLockScreenInfoUndefined: Self = StObject.set(x, "deviceOwnerLockScreenInfo", js.undefined)
    
    @scala.inline
    def setEncryptionPolicy(value: String): Self = StObject.set(x, "encryptionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionPolicyUndefined: Self = StObject.set(x, "encryptionPolicy", js.undefined)
    
    @scala.inline
    def setEnsureVerifyAppsEnabled(value: Boolean): Self = StObject.set(x, "ensureVerifyAppsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnsureVerifyAppsEnabledUndefined: Self = StObject.set(x, "ensureVerifyAppsEnabled", js.undefined)
    
    @scala.inline
    def setFactoryResetDisabled(value: Boolean): Self = StObject.set(x, "factoryResetDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactoryResetDisabledUndefined: Self = StObject.set(x, "factoryResetDisabled", js.undefined)
    
    @scala.inline
    def setFrpAdminEmails(value: js.Array[String]): Self = StObject.set(x, "frpAdminEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrpAdminEmailsUndefined: Self = StObject.set(x, "frpAdminEmails", js.undefined)
    
    @scala.inline
    def setFrpAdminEmailsVarargs(value: String*): Self = StObject.set(x, "frpAdminEmails", js.Array(value :_*))
    
    @scala.inline
    def setFunDisabled(value: Boolean): Self = StObject.set(x, "funDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunDisabledUndefined: Self = StObject.set(x, "funDisabled", js.undefined)
    
    @scala.inline
    def setInstallAppsDisabled(value: Boolean): Self = StObject.set(x, "installAppsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallAppsDisabledUndefined: Self = StObject.set(x, "installAppsDisabled", js.undefined)
    
    @scala.inline
    def setInstallUnknownSourcesAllowed(value: Boolean): Self = StObject.set(x, "installUnknownSourcesAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallUnknownSourcesAllowedUndefined: Self = StObject.set(x, "installUnknownSourcesAllowed", js.undefined)
    
    @scala.inline
    def setKeyguardDisabled(value: Boolean): Self = StObject.set(x, "keyguardDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyguardDisabledFeatures(value: js.Array[String]): Self = StObject.set(x, "keyguardDisabledFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyguardDisabledFeaturesUndefined: Self = StObject.set(x, "keyguardDisabledFeatures", js.undefined)
    
    @scala.inline
    def setKeyguardDisabledFeaturesVarargs(value: String*): Self = StObject.set(x, "keyguardDisabledFeatures", js.Array(value :_*))
    
    @scala.inline
    def setKeyguardDisabledUndefined: Self = StObject.set(x, "keyguardDisabled", js.undefined)
    
    @scala.inline
    def setKioskCustomLauncherEnabled(value: Boolean): Self = StObject.set(x, "kioskCustomLauncherEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKioskCustomLauncherEnabledUndefined: Self = StObject.set(x, "kioskCustomLauncherEnabled", js.undefined)
    
    @scala.inline
    def setLocationMode(value: String): Self = StObject.set(x, "locationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationModeUndefined: Self = StObject.set(x, "locationMode", js.undefined)
    
    @scala.inline
    def setLongSupportMessage(value: SchemaUserFacingMessage): Self = StObject.set(x, "longSupportMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongSupportMessageUndefined: Self = StObject.set(x, "longSupportMessage", js.undefined)
    
    @scala.inline
    def setMaximumTimeToLock(value: String): Self = StObject.set(x, "maximumTimeToLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumTimeToLockUndefined: Self = StObject.set(x, "maximumTimeToLock", js.undefined)
    
    @scala.inline
    def setMobileNetworksConfigDisabled(value: Boolean): Self = StObject.set(x, "mobileNetworksConfigDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileNetworksConfigDisabledUndefined: Self = StObject.set(x, "mobileNetworksConfigDisabled", js.undefined)
    
    @scala.inline
    def setModifyAccountsDisabled(value: Boolean): Self = StObject.set(x, "modifyAccountsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyAccountsDisabledUndefined: Self = StObject.set(x, "modifyAccountsDisabled", js.undefined)
    
    @scala.inline
    def setMountPhysicalMediaDisabled(value: Boolean): Self = StObject.set(x, "mountPhysicalMediaDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountPhysicalMediaDisabledUndefined: Self = StObject.set(x, "mountPhysicalMediaDisabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetworkEscapeHatchEnabled(value: Boolean): Self = StObject.set(x, "networkEscapeHatchEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkEscapeHatchEnabledUndefined: Self = StObject.set(x, "networkEscapeHatchEnabled", js.undefined)
    
    @scala.inline
    def setNetworkResetDisabled(value: Boolean): Self = StObject.set(x, "networkResetDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkResetDisabledUndefined: Self = StObject.set(x, "networkResetDisabled", js.undefined)
    
    @scala.inline
    def setOpenNetworkConfiguration(value: StringDictionary[js.Any]): Self = StObject.set(x, "openNetworkConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenNetworkConfigurationUndefined: Self = StObject.set(x, "openNetworkConfiguration", js.undefined)
    
    @scala.inline
    def setOutgoingBeamDisabled(value: Boolean): Self = StObject.set(x, "outgoingBeamDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoingBeamDisabledUndefined: Self = StObject.set(x, "outgoingBeamDisabled", js.undefined)
    
    @scala.inline
    def setOutgoingCallsDisabled(value: Boolean): Self = StObject.set(x, "outgoingCallsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutgoingCallsDisabledUndefined: Self = StObject.set(x, "outgoingCallsDisabled", js.undefined)
    
    @scala.inline
    def setPasswordPolicies(value: js.Array[SchemaPasswordRequirements]): Self = StObject.set(x, "passwordPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordPoliciesUndefined: Self = StObject.set(x, "passwordPolicies", js.undefined)
    
    @scala.inline
    def setPasswordPoliciesVarargs(value: SchemaPasswordRequirements*): Self = StObject.set(x, "passwordPolicies", js.Array(value :_*))
    
    @scala.inline
    def setPasswordRequirements(value: SchemaPasswordRequirements): Self = StObject.set(x, "passwordRequirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequirementsUndefined: Self = StObject.set(x, "passwordRequirements", js.undefined)
    
    @scala.inline
    def setPermissionGrants(value: js.Array[SchemaPermissionGrant]): Self = StObject.set(x, "permissionGrants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionGrantsUndefined: Self = StObject.set(x, "permissionGrants", js.undefined)
    
    @scala.inline
    def setPermissionGrantsVarargs(value: SchemaPermissionGrant*): Self = StObject.set(x, "permissionGrants", js.Array(value :_*))
    
    @scala.inline
    def setPermittedInputMethods(value: SchemaPackageNameList): Self = StObject.set(x, "permittedInputMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermittedInputMethodsUndefined: Self = StObject.set(x, "permittedInputMethods", js.undefined)
    
    @scala.inline
    def setPersistentPreferredActivities(value: js.Array[SchemaPersistentPreferredActivity]): Self = StObject.set(x, "persistentPreferredActivities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentPreferredActivitiesUndefined: Self = StObject.set(x, "persistentPreferredActivities", js.undefined)
    
    @scala.inline
    def setPersistentPreferredActivitiesVarargs(value: SchemaPersistentPreferredActivity*): Self = StObject.set(x, "persistentPreferredActivities", js.Array(value :_*))
    
    @scala.inline
    def setPlayStoreMode(value: String): Self = StObject.set(x, "playStoreMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayStoreModeUndefined: Self = StObject.set(x, "playStoreMode", js.undefined)
    
    @scala.inline
    def setPrivateKeySelectionEnabled(value: Boolean): Self = StObject.set(x, "privateKeySelectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeySelectionEnabledUndefined: Self = StObject.set(x, "privateKeySelectionEnabled", js.undefined)
    
    @scala.inline
    def setRecommendedGlobalProxy(value: SchemaProxyInfo): Self = StObject.set(x, "recommendedGlobalProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendedGlobalProxyUndefined: Self = StObject.set(x, "recommendedGlobalProxy", js.undefined)
    
    @scala.inline
    def setRemoveUserDisabled(value: Boolean): Self = StObject.set(x, "removeUserDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUserDisabledUndefined: Self = StObject.set(x, "removeUserDisabled", js.undefined)
    
    @scala.inline
    def setSafeBootDisabled(value: Boolean): Self = StObject.set(x, "safeBootDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeBootDisabledUndefined: Self = StObject.set(x, "safeBootDisabled", js.undefined)
    
    @scala.inline
    def setScreenCaptureDisabled(value: Boolean): Self = StObject.set(x, "screenCaptureDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenCaptureDisabledUndefined: Self = StObject.set(x, "screenCaptureDisabled", js.undefined)
    
    @scala.inline
    def setSetUserIconDisabled(value: Boolean): Self = StObject.set(x, "setUserIconDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetUserIconDisabledUndefined: Self = StObject.set(x, "setUserIconDisabled", js.undefined)
    
    @scala.inline
    def setSetWallpaperDisabled(value: Boolean): Self = StObject.set(x, "setWallpaperDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetWallpaperDisabledUndefined: Self = StObject.set(x, "setWallpaperDisabled", js.undefined)
    
    @scala.inline
    def setSetupActions(value: js.Array[SchemaSetupAction]): Self = StObject.set(x, "setupActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupActionsUndefined: Self = StObject.set(x, "setupActions", js.undefined)
    
    @scala.inline
    def setSetupActionsVarargs(value: SchemaSetupAction*): Self = StObject.set(x, "setupActions", js.Array(value :_*))
    
    @scala.inline
    def setShareLocationDisabled(value: Boolean): Self = StObject.set(x, "shareLocationDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareLocationDisabledUndefined: Self = StObject.set(x, "shareLocationDisabled", js.undefined)
    
    @scala.inline
    def setShortSupportMessage(value: SchemaUserFacingMessage): Self = StObject.set(x, "shortSupportMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortSupportMessageUndefined: Self = StObject.set(x, "shortSupportMessage", js.undefined)
    
    @scala.inline
    def setSkipFirstUseHintsEnabled(value: Boolean): Self = StObject.set(x, "skipFirstUseHintsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipFirstUseHintsEnabledUndefined: Self = StObject.set(x, "skipFirstUseHintsEnabled", js.undefined)
    
    @scala.inline
    def setSmsDisabled(value: Boolean): Self = StObject.set(x, "smsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsDisabledUndefined: Self = StObject.set(x, "smsDisabled", js.undefined)
    
    @scala.inline
    def setStatusBarDisabled(value: Boolean): Self = StObject.set(x, "statusBarDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarDisabledUndefined: Self = StObject.set(x, "statusBarDisabled", js.undefined)
    
    @scala.inline
    def setStatusReportingSettings(value: SchemaStatusReportingSettings): Self = StObject.set(x, "statusReportingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReportingSettingsUndefined: Self = StObject.set(x, "statusReportingSettings", js.undefined)
    
    @scala.inline
    def setStayOnPluggedModes(value: js.Array[String]): Self = StObject.set(x, "stayOnPluggedModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStayOnPluggedModesUndefined: Self = StObject.set(x, "stayOnPluggedModes", js.undefined)
    
    @scala.inline
    def setStayOnPluggedModesVarargs(value: String*): Self = StObject.set(x, "stayOnPluggedModes", js.Array(value :_*))
    
    @scala.inline
    def setSystemUpdate(value: SchemaSystemUpdate): Self = StObject.set(x, "systemUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemUpdateUndefined: Self = StObject.set(x, "systemUpdate", js.undefined)
    
    @scala.inline
    def setTetheringConfigDisabled(value: Boolean): Self = StObject.set(x, "tetheringConfigDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTetheringConfigDisabledUndefined: Self = StObject.set(x, "tetheringConfigDisabled", js.undefined)
    
    @scala.inline
    def setUninstallAppsDisabled(value: Boolean): Self = StObject.set(x, "uninstallAppsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUninstallAppsDisabledUndefined: Self = StObject.set(x, "uninstallAppsDisabled", js.undefined)
    
    @scala.inline
    def setUnmuteMicrophoneDisabled(value: Boolean): Self = StObject.set(x, "unmuteMicrophoneDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmuteMicrophoneDisabledUndefined: Self = StObject.set(x, "unmuteMicrophoneDisabled", js.undefined)
    
    @scala.inline
    def setUsbFileTransferDisabled(value: Boolean): Self = StObject.set(x, "usbFileTransferDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsbFileTransferDisabledUndefined: Self = StObject.set(x, "usbFileTransferDisabled", js.undefined)
    
    @scala.inline
    def setUsbMassStorageEnabled(value: Boolean): Self = StObject.set(x, "usbMassStorageEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsbMassStorageEnabledUndefined: Self = StObject.set(x, "usbMassStorageEnabled", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVpnConfigDisabled(value: Boolean): Self = StObject.set(x, "vpnConfigDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpnConfigDisabledUndefined: Self = StObject.set(x, "vpnConfigDisabled", js.undefined)
    
    @scala.inline
    def setWifiConfigDisabled(value: Boolean): Self = StObject.set(x, "wifiConfigDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiConfigDisabledUndefined: Self = StObject.set(x, "wifiConfigDisabled", js.undefined)
    
    @scala.inline
    def setWifiConfigsLockdownEnabled(value: Boolean): Self = StObject.set(x, "wifiConfigsLockdownEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiConfigsLockdownEnabledUndefined: Self = StObject.set(x, "wifiConfigsLockdownEnabled", js.undefined)
  }
}
