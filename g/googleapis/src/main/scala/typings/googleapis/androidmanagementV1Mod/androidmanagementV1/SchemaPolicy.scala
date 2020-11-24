package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A policy resources represents a group settings that govern the behavior of
  * a managed device and the apps installed on it.
  */
@js.native
trait SchemaPolicy extends js.Object {
  
  /**
    * Account types that can&#39;t be managed by the user.
    */
  var accountTypesWithManagementDisabled: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether adding new users and profiles is disabled.
    */
  var addUserDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether adjusting the master volume is disabled.
    */
  var adjustVolumeDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Configuration for an always-on VPN connection. Use with
    * vpn_config_disabled to prevent modification of this setting.
    */
  var alwaysOnVpnPackage: js.UndefOr[SchemaAlwaysOnVpnPackage] = js.native
  
  /**
    * The app tracks for Android Device Policy the device can access. The
    * device receives the latest version among all accessible tracks. If no
    * tracks are specified, then the device only uses the production track.
    */
  var androidDevicePolicyTracks: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The app auto update policy, which controls when automatic app updates can
    * be applied.
    */
  var appAutoUpdatePolicy: js.UndefOr[String] = js.native
  
  /**
    * Policy applied to apps.
    */
  var applications: js.UndefOr[js.Array[SchemaApplicationPolicy]] = js.native
  
  /**
    * Whether auto time is required, which prevents the user from manually
    * setting the date and time.
    */
  var autoTimeRequired: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether applications other than the ones configured in applications are
    * blocked from being installed. When set, applications that were installed
    * under a previous policy but no longer appear in the policy are
    * automatically uninstalled.
    */
  var blockApplicationsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether configuring bluetooth is disabled.
    */
  var bluetoothConfigDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether bluetooth contact sharing is disabled.
    */
  var bluetoothContactSharingDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether bluetooth is disabled. Prefer this setting over
    * bluetooth_config_disabled because bluetooth_config_disabled can be
    * bypassed by the user.
    */
  var bluetoothDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether all cameras on the device are disabled.
    */
  var cameraDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether configuring cell broadcast is disabled.
    */
  var cellBroadcastsConfigDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Rules for automatically choosing a private key and certificate to
    * authenticate the device to a server. The rules are ordered by increasing
    * precedence, so if an outgoing request matches more than one rule, the
    * last rule defines which private key to use.
    */
  var choosePrivateKeyRules: js.UndefOr[js.Array[SchemaChoosePrivateKeyRule]] = js.native
  
  /**
    * Rules declaring which mitigating actions to take when a device is not
    * compliant with its policy. When the conditions for multiple rules are
    * satisfied, all of the mitigating actions for the rules are taken. There
    * is a maximum limit of 100 rules.
    */
  var complianceRules: js.UndefOr[js.Array[SchemaComplianceRule]] = js.native
  
  /**
    * Whether creating windows besides app windows is disabled.
    */
  var createWindowsDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether configuring user credentials is disabled.
    */
  var credentialsConfigDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether roaming data services are disabled.
    */
  var dataRoamingDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the user is allowed to enable debugging features.
    */
  var debuggingFeaturesAllowed: js.UndefOr[Boolean] = js.native
  
  /**
    * The default permission policy for runtime permission requests.
    */
  var defaultPermissionPolicy: js.UndefOr[String] = js.native
  
  /**
    * The device owner information to be shown on the lock screen.
    */
  var deviceOwnerLockScreenInfo: js.UndefOr[SchemaUserFacingMessage] = js.native
  
  /**
    * Whether encryption is enabled
    */
  var encryptionPolicy: js.UndefOr[String] = js.native
  
  /**
    * Whether app verification is force-enabled.
    */
  var ensureVerifyAppsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether factory resetting from settings is disabled.
    */
  var factoryResetDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Email addresses of device administrators for factory reset protection.
    * When the device is factory reset, it will require one of these admins to
    * log in with the Google account email and password to unlock the device.
    * If no admins are specified, the device won&#39;t provide factory reset
    * protection.
    */
  var frpAdminEmails: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether the user is allowed to have fun. Controls whether the Easter egg
    * game in Settings is disabled.
    */
  var funDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether user installation of apps is disabled.
    */
  var installAppsDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the user is allowed to enable the &quot;Unknown Sources&quot;
    * setting, which allows installation of apps from unknown sources.
    */
  var installUnknownSourcesAllowed: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the keyguard is disabled.
    */
  var keyguardDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Disabled keyguard customizations, such as widgets.
    */
  var keyguardDisabledFeatures: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether the kiosk custom launcher is enabled. This replaces the home
    * screen with a launcher that locks down the device to the apps installed
    * via the applications setting. The apps appear on a single page in
    * alphabetical order. It is recommended to also use status_bar_disabled to
    * block access to device settings.
    */
  var kioskCustomLauncherEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The degree of location detection enabled. The user may change the value
    * unless the user is otherwise blocked from accessing device settings.
    */
  var locationMode: js.UndefOr[String] = js.native
  
  /**
    * A message displayed to the user in the device administators settings
    * screen.
    */
  var longSupportMessage: js.UndefOr[SchemaUserFacingMessage] = js.native
  
  /**
    * Maximum time in milliseconds for user activity until the device locks. A
    * value of 0 means there is no restriction.
    */
  var maximumTimeToLock: js.UndefOr[String] = js.native
  
  /**
    * Whether configuring mobile networks is disabled.
    */
  var mobileNetworksConfigDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether adding or removing accounts is disabled.
    */
  var modifyAccountsDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the user mounting physical external media is disabled.
    */
  var mountPhysicalMediaDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the policy in the form
    * enterprises/{enterpriseId}/policies/{policyId}.
    */
  var name: js.UndefOr[String] = js.native
  
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
  var networkEscapeHatchEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether resetting network settings is disabled.
    */
  var networkResetDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Network configuration for the device. See configure networks for more
    * information.
    */
  var openNetworkConfiguration: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Whether using NFC to beam data from apps is disabled.
    */
  var outgoingBeamDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether outgoing calls are disabled.
    */
  var outgoingCallsDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Password requirement policies. Different policies can be set for work
    * profile or fully managed devices by setting the password_scope field in
    * the policy.
    */
  var passwordPolicies: js.UndefOr[js.Array[SchemaPasswordRequirements]] = js.native
  
  /**
    * Password requirements. DEPRECATED - Use password_policies
    */
  var passwordRequirements: js.UndefOr[SchemaPasswordRequirements] = js.native
  
  /**
    * Explicit permission or group grants or denials for all apps. These values
    * override the default_permission_policy.
    */
  var permissionGrants: js.UndefOr[js.Array[SchemaPermissionGrant]] = js.native
  
  /**
    * If present, only the input methods provided by packages in this list are
    * permitted. If this field is present, but the list is empty, then only
    * system input methods are permitted.
    */
  var permittedInputMethods: js.UndefOr[SchemaPackageNameList] = js.native
  
  /**
    * Default intent handler activities.
    */
  var persistentPreferredActivities: js.UndefOr[js.Array[SchemaPersistentPreferredActivity]] = js.native
  
  /**
    * This mode controls which apps are available to the user in the Play Store
    * and the behavior on the device when apps are removed from the policy.
    */
  var playStoreMode: js.UndefOr[String] = js.native
  
  /**
    * Allows showing UI on a device for a user to choose a private key alias if
    * there are no matching rules in ChoosePrivateKeyRules. For devices below
    * Android P, setting this may leave enterprise keys vulnerable.
    */
  var privateKeySelectionEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The network-independent global HTTP proxy. Typically proxies should be
    * configured per-network in open_network_configuration. However for unusual
    * configurations like general internal filtering a global HTTP proxy may be
    * useful. If the proxy is not accessible, network access may break. The
    * global proxy is only a recommendation and some apps may ignore it.
    */
  var recommendedGlobalProxy: js.UndefOr[SchemaProxyInfo] = js.native
  
  /**
    * Whether removing other users is disabled.
    */
  var removeUserDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether rebooting the device into safe boot is disabled.
    */
  var safeBootDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether screen capture is disabled.
    */
  var screenCaptureDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether changing the user icon is disabled.
    */
  var setUserIconDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether changing the wallpaper is disabled.
    */
  var setWallpaperDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Actions to take during the setup process.
    */
  var setupActions: js.UndefOr[js.Array[SchemaSetupAction]] = js.native
  
  /**
    * Whether location sharing is disabled.
    */
  var shareLocationDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A message displayed to the user in the settings screen wherever
    * functionality has been disabled by the admin.
    */
  var shortSupportMessage: js.UndefOr[SchemaUserFacingMessage] = js.native
  
  /**
    * Flag to skip hints on the first use. Enterprise admin can enable the
    * system recommendation for apps to skip their user tutorial and other
    * introductory hints on first start-up.
    */
  var skipFirstUseHintsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether sending and receiving SMS messages is disabled.
    */
  var smsDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the status bar is disabled. This disables notifications, quick
    * settings, and other screen overlays that allow escape from full-screen
    * mode.
    */
  var statusBarDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Status reporting settings
    */
  var statusReportingSettings: js.UndefOr[SchemaStatusReportingSettings] = js.native
  
  /**
    * The battery plugged in modes for which the device stays on. When using
    * this setting, it is recommended to clear maximum_time_to_lock so that the
    * device doesn&#39;t lock itself while it stays on.
    */
  var stayOnPluggedModes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The system update policy, which controls how OS updates are applied. If
    * the update type is WINDOWED, the update window will automatically apply
    * to Play app updates as well.
    */
  var systemUpdate: js.UndefOr[SchemaSystemUpdate] = js.native
  
  /**
    * Whether configuring tethering and portable hotspots is disabled.
    */
  var tetheringConfigDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether user uninstallation of applications is disabled.
    */
  var uninstallAppsDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the microphone is muted and adjusting microphone volume is
    * disabled.
    */
  var unmuteMicrophoneDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether transferring files over USB is disabled.
    */
  var usbFileTransferDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether USB storage is enabled. Deprecated.
    */
  var usbMassStorageEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The version of the policy. This is a read-only field. The version is
    * incremented each time the policy is updated.
    */
  var version: js.UndefOr[String] = js.native
  
  /**
    * Whether configuring VPN is disabled.
    */
  var vpnConfigDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether configuring Wi-Fi access points is disabled.
    */
  var wifiConfigDisabled: js.UndefOr[Boolean] = js.native
  
  /**
    * DEPRECATED - Use wifi_config_disabled.
    */
  var wifiConfigsLockdownEnabled: js.UndefOr[Boolean] = js.native
}
object SchemaPolicy {
  
  @scala.inline
  def apply(): SchemaPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicy]
  }
  
  @scala.inline
  implicit class SchemaPolicyOps[Self <: SchemaPolicy] (val x: Self) extends AnyVal {
    
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
    def setAccountTypesWithManagementDisabledVarargs(value: String*): Self = this.set("accountTypesWithManagementDisabled", js.Array(value :_*))
    
    @scala.inline
    def setAccountTypesWithManagementDisabled(value: js.Array[String]): Self = this.set("accountTypesWithManagementDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountTypesWithManagementDisabled: Self = this.set("accountTypesWithManagementDisabled", js.undefined)
    
    @scala.inline
    def setAddUserDisabled(value: Boolean): Self = this.set("addUserDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddUserDisabled: Self = this.set("addUserDisabled", js.undefined)
    
    @scala.inline
    def setAdjustVolumeDisabled(value: Boolean): Self = this.set("adjustVolumeDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustVolumeDisabled: Self = this.set("adjustVolumeDisabled", js.undefined)
    
    @scala.inline
    def setAlwaysOnVpnPackage(value: SchemaAlwaysOnVpnPackage): Self = this.set("alwaysOnVpnPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysOnVpnPackage: Self = this.set("alwaysOnVpnPackage", js.undefined)
    
    @scala.inline
    def setAndroidDevicePolicyTracksVarargs(value: String*): Self = this.set("androidDevicePolicyTracks", js.Array(value :_*))
    
    @scala.inline
    def setAndroidDevicePolicyTracks(value: js.Array[String]): Self = this.set("androidDevicePolicyTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidDevicePolicyTracks: Self = this.set("androidDevicePolicyTracks", js.undefined)
    
    @scala.inline
    def setAppAutoUpdatePolicy(value: String): Self = this.set("appAutoUpdatePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppAutoUpdatePolicy: Self = this.set("appAutoUpdatePolicy", js.undefined)
    
    @scala.inline
    def setApplicationsVarargs(value: SchemaApplicationPolicy*): Self = this.set("applications", js.Array(value :_*))
    
    @scala.inline
    def setApplications(value: js.Array[SchemaApplicationPolicy]): Self = this.set("applications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplications: Self = this.set("applications", js.undefined)
    
    @scala.inline
    def setAutoTimeRequired(value: Boolean): Self = this.set("autoTimeRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoTimeRequired: Self = this.set("autoTimeRequired", js.undefined)
    
    @scala.inline
    def setBlockApplicationsEnabled(value: Boolean): Self = this.set("blockApplicationsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockApplicationsEnabled: Self = this.set("blockApplicationsEnabled", js.undefined)
    
    @scala.inline
    def setBluetoothConfigDisabled(value: Boolean): Self = this.set("bluetoothConfigDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBluetoothConfigDisabled: Self = this.set("bluetoothConfigDisabled", js.undefined)
    
    @scala.inline
    def setBluetoothContactSharingDisabled(value: Boolean): Self = this.set("bluetoothContactSharingDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBluetoothContactSharingDisabled: Self = this.set("bluetoothContactSharingDisabled", js.undefined)
    
    @scala.inline
    def setBluetoothDisabled(value: Boolean): Self = this.set("bluetoothDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBluetoothDisabled: Self = this.set("bluetoothDisabled", js.undefined)
    
    @scala.inline
    def setCameraDisabled(value: Boolean): Self = this.set("cameraDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCameraDisabled: Self = this.set("cameraDisabled", js.undefined)
    
    @scala.inline
    def setCellBroadcastsConfigDisabled(value: Boolean): Self = this.set("cellBroadcastsConfigDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellBroadcastsConfigDisabled: Self = this.set("cellBroadcastsConfigDisabled", js.undefined)
    
    @scala.inline
    def setChoosePrivateKeyRulesVarargs(value: SchemaChoosePrivateKeyRule*): Self = this.set("choosePrivateKeyRules", js.Array(value :_*))
    
    @scala.inline
    def setChoosePrivateKeyRules(value: js.Array[SchemaChoosePrivateKeyRule]): Self = this.set("choosePrivateKeyRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChoosePrivateKeyRules: Self = this.set("choosePrivateKeyRules", js.undefined)
    
    @scala.inline
    def setComplianceRulesVarargs(value: SchemaComplianceRule*): Self = this.set("complianceRules", js.Array(value :_*))
    
    @scala.inline
    def setComplianceRules(value: js.Array[SchemaComplianceRule]): Self = this.set("complianceRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceRules: Self = this.set("complianceRules", js.undefined)
    
    @scala.inline
    def setCreateWindowsDisabled(value: Boolean): Self = this.set("createWindowsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateWindowsDisabled: Self = this.set("createWindowsDisabled", js.undefined)
    
    @scala.inline
    def setCredentialsConfigDisabled(value: Boolean): Self = this.set("credentialsConfigDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredentialsConfigDisabled: Self = this.set("credentialsConfigDisabled", js.undefined)
    
    @scala.inline
    def setDataRoamingDisabled(value: Boolean): Self = this.set("dataRoamingDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataRoamingDisabled: Self = this.set("dataRoamingDisabled", js.undefined)
    
    @scala.inline
    def setDebuggingFeaturesAllowed(value: Boolean): Self = this.set("debuggingFeaturesAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebuggingFeaturesAllowed: Self = this.set("debuggingFeaturesAllowed", js.undefined)
    
    @scala.inline
    def setDefaultPermissionPolicy(value: String): Self = this.set("defaultPermissionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPermissionPolicy: Self = this.set("defaultPermissionPolicy", js.undefined)
    
    @scala.inline
    def setDeviceOwnerLockScreenInfo(value: SchemaUserFacingMessage): Self = this.set("deviceOwnerLockScreenInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceOwnerLockScreenInfo: Self = this.set("deviceOwnerLockScreenInfo", js.undefined)
    
    @scala.inline
    def setEncryptionPolicy(value: String): Self = this.set("encryptionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionPolicy: Self = this.set("encryptionPolicy", js.undefined)
    
    @scala.inline
    def setEnsureVerifyAppsEnabled(value: Boolean): Self = this.set("ensureVerifyAppsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnsureVerifyAppsEnabled: Self = this.set("ensureVerifyAppsEnabled", js.undefined)
    
    @scala.inline
    def setFactoryResetDisabled(value: Boolean): Self = this.set("factoryResetDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFactoryResetDisabled: Self = this.set("factoryResetDisabled", js.undefined)
    
    @scala.inline
    def setFrpAdminEmailsVarargs(value: String*): Self = this.set("frpAdminEmails", js.Array(value :_*))
    
    @scala.inline
    def setFrpAdminEmails(value: js.Array[String]): Self = this.set("frpAdminEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrpAdminEmails: Self = this.set("frpAdminEmails", js.undefined)
    
    @scala.inline
    def setFunDisabled(value: Boolean): Self = this.set("funDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunDisabled: Self = this.set("funDisabled", js.undefined)
    
    @scala.inline
    def setInstallAppsDisabled(value: Boolean): Self = this.set("installAppsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallAppsDisabled: Self = this.set("installAppsDisabled", js.undefined)
    
    @scala.inline
    def setInstallUnknownSourcesAllowed(value: Boolean): Self = this.set("installUnknownSourcesAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallUnknownSourcesAllowed: Self = this.set("installUnknownSourcesAllowed", js.undefined)
    
    @scala.inline
    def setKeyguardDisabled(value: Boolean): Self = this.set("keyguardDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyguardDisabled: Self = this.set("keyguardDisabled", js.undefined)
    
    @scala.inline
    def setKeyguardDisabledFeaturesVarargs(value: String*): Self = this.set("keyguardDisabledFeatures", js.Array(value :_*))
    
    @scala.inline
    def setKeyguardDisabledFeatures(value: js.Array[String]): Self = this.set("keyguardDisabledFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyguardDisabledFeatures: Self = this.set("keyguardDisabledFeatures", js.undefined)
    
    @scala.inline
    def setKioskCustomLauncherEnabled(value: Boolean): Self = this.set("kioskCustomLauncherEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKioskCustomLauncherEnabled: Self = this.set("kioskCustomLauncherEnabled", js.undefined)
    
    @scala.inline
    def setLocationMode(value: String): Self = this.set("locationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationMode: Self = this.set("locationMode", js.undefined)
    
    @scala.inline
    def setLongSupportMessage(value: SchemaUserFacingMessage): Self = this.set("longSupportMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongSupportMessage: Self = this.set("longSupportMessage", js.undefined)
    
    @scala.inline
    def setMaximumTimeToLock(value: String): Self = this.set("maximumTimeToLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumTimeToLock: Self = this.set("maximumTimeToLock", js.undefined)
    
    @scala.inline
    def setMobileNetworksConfigDisabled(value: Boolean): Self = this.set("mobileNetworksConfigDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileNetworksConfigDisabled: Self = this.set("mobileNetworksConfigDisabled", js.undefined)
    
    @scala.inline
    def setModifyAccountsDisabled(value: Boolean): Self = this.set("modifyAccountsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifyAccountsDisabled: Self = this.set("modifyAccountsDisabled", js.undefined)
    
    @scala.inline
    def setMountPhysicalMediaDisabled(value: Boolean): Self = this.set("mountPhysicalMediaDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMountPhysicalMediaDisabled: Self = this.set("mountPhysicalMediaDisabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNetworkEscapeHatchEnabled(value: Boolean): Self = this.set("networkEscapeHatchEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkEscapeHatchEnabled: Self = this.set("networkEscapeHatchEnabled", js.undefined)
    
    @scala.inline
    def setNetworkResetDisabled(value: Boolean): Self = this.set("networkResetDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkResetDisabled: Self = this.set("networkResetDisabled", js.undefined)
    
    @scala.inline
    def setOpenNetworkConfiguration(value: StringDictionary[js.Any]): Self = this.set("openNetworkConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenNetworkConfiguration: Self = this.set("openNetworkConfiguration", js.undefined)
    
    @scala.inline
    def setOutgoingBeamDisabled(value: Boolean): Self = this.set("outgoingBeamDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutgoingBeamDisabled: Self = this.set("outgoingBeamDisabled", js.undefined)
    
    @scala.inline
    def setOutgoingCallsDisabled(value: Boolean): Self = this.set("outgoingCallsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutgoingCallsDisabled: Self = this.set("outgoingCallsDisabled", js.undefined)
    
    @scala.inline
    def setPasswordPoliciesVarargs(value: SchemaPasswordRequirements*): Self = this.set("passwordPolicies", js.Array(value :_*))
    
    @scala.inline
    def setPasswordPolicies(value: js.Array[SchemaPasswordRequirements]): Self = this.set("passwordPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordPolicies: Self = this.set("passwordPolicies", js.undefined)
    
    @scala.inline
    def setPasswordRequirements(value: SchemaPasswordRequirements): Self = this.set("passwordRequirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordRequirements: Self = this.set("passwordRequirements", js.undefined)
    
    @scala.inline
    def setPermissionGrantsVarargs(value: SchemaPermissionGrant*): Self = this.set("permissionGrants", js.Array(value :_*))
    
    @scala.inline
    def setPermissionGrants(value: js.Array[SchemaPermissionGrant]): Self = this.set("permissionGrants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionGrants: Self = this.set("permissionGrants", js.undefined)
    
    @scala.inline
    def setPermittedInputMethods(value: SchemaPackageNameList): Self = this.set("permittedInputMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermittedInputMethods: Self = this.set("permittedInputMethods", js.undefined)
    
    @scala.inline
    def setPersistentPreferredActivitiesVarargs(value: SchemaPersistentPreferredActivity*): Self = this.set("persistentPreferredActivities", js.Array(value :_*))
    
    @scala.inline
    def setPersistentPreferredActivities(value: js.Array[SchemaPersistentPreferredActivity]): Self = this.set("persistentPreferredActivities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistentPreferredActivities: Self = this.set("persistentPreferredActivities", js.undefined)
    
    @scala.inline
    def setPlayStoreMode(value: String): Self = this.set("playStoreMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlayStoreMode: Self = this.set("playStoreMode", js.undefined)
    
    @scala.inline
    def setPrivateKeySelectionEnabled(value: Boolean): Self = this.set("privateKeySelectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateKeySelectionEnabled: Self = this.set("privateKeySelectionEnabled", js.undefined)
    
    @scala.inline
    def setRecommendedGlobalProxy(value: SchemaProxyInfo): Self = this.set("recommendedGlobalProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendedGlobalProxy: Self = this.set("recommendedGlobalProxy", js.undefined)
    
    @scala.inline
    def setRemoveUserDisabled(value: Boolean): Self = this.set("removeUserDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveUserDisabled: Self = this.set("removeUserDisabled", js.undefined)
    
    @scala.inline
    def setSafeBootDisabled(value: Boolean): Self = this.set("safeBootDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSafeBootDisabled: Self = this.set("safeBootDisabled", js.undefined)
    
    @scala.inline
    def setScreenCaptureDisabled(value: Boolean): Self = this.set("screenCaptureDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenCaptureDisabled: Self = this.set("screenCaptureDisabled", js.undefined)
    
    @scala.inline
    def setSetUserIconDisabled(value: Boolean): Self = this.set("setUserIconDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetUserIconDisabled: Self = this.set("setUserIconDisabled", js.undefined)
    
    @scala.inline
    def setSetWallpaperDisabled(value: Boolean): Self = this.set("setWallpaperDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetWallpaperDisabled: Self = this.set("setWallpaperDisabled", js.undefined)
    
    @scala.inline
    def setSetupActionsVarargs(value: SchemaSetupAction*): Self = this.set("setupActions", js.Array(value :_*))
    
    @scala.inline
    def setSetupActions(value: js.Array[SchemaSetupAction]): Self = this.set("setupActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupActions: Self = this.set("setupActions", js.undefined)
    
    @scala.inline
    def setShareLocationDisabled(value: Boolean): Self = this.set("shareLocationDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareLocationDisabled: Self = this.set("shareLocationDisabled", js.undefined)
    
    @scala.inline
    def setShortSupportMessage(value: SchemaUserFacingMessage): Self = this.set("shortSupportMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortSupportMessage: Self = this.set("shortSupportMessage", js.undefined)
    
    @scala.inline
    def setSkipFirstUseHintsEnabled(value: Boolean): Self = this.set("skipFirstUseHintsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipFirstUseHintsEnabled: Self = this.set("skipFirstUseHintsEnabled", js.undefined)
    
    @scala.inline
    def setSmsDisabled(value: Boolean): Self = this.set("smsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmsDisabled: Self = this.set("smsDisabled", js.undefined)
    
    @scala.inline
    def setStatusBarDisabled(value: Boolean): Self = this.set("statusBarDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusBarDisabled: Self = this.set("statusBarDisabled", js.undefined)
    
    @scala.inline
    def setStatusReportingSettings(value: SchemaStatusReportingSettings): Self = this.set("statusReportingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusReportingSettings: Self = this.set("statusReportingSettings", js.undefined)
    
    @scala.inline
    def setStayOnPluggedModesVarargs(value: String*): Self = this.set("stayOnPluggedModes", js.Array(value :_*))
    
    @scala.inline
    def setStayOnPluggedModes(value: js.Array[String]): Self = this.set("stayOnPluggedModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStayOnPluggedModes: Self = this.set("stayOnPluggedModes", js.undefined)
    
    @scala.inline
    def setSystemUpdate(value: SchemaSystemUpdate): Self = this.set("systemUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSystemUpdate: Self = this.set("systemUpdate", js.undefined)
    
    @scala.inline
    def setTetheringConfigDisabled(value: Boolean): Self = this.set("tetheringConfigDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTetheringConfigDisabled: Self = this.set("tetheringConfigDisabled", js.undefined)
    
    @scala.inline
    def setUninstallAppsDisabled(value: Boolean): Self = this.set("uninstallAppsDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUninstallAppsDisabled: Self = this.set("uninstallAppsDisabled", js.undefined)
    
    @scala.inline
    def setUnmuteMicrophoneDisabled(value: Boolean): Self = this.set("unmuteMicrophoneDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmuteMicrophoneDisabled: Self = this.set("unmuteMicrophoneDisabled", js.undefined)
    
    @scala.inline
    def setUsbFileTransferDisabled(value: Boolean): Self = this.set("usbFileTransferDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsbFileTransferDisabled: Self = this.set("usbFileTransferDisabled", js.undefined)
    
    @scala.inline
    def setUsbMassStorageEnabled(value: Boolean): Self = this.set("usbMassStorageEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsbMassStorageEnabled: Self = this.set("usbMassStorageEnabled", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVpnConfigDisabled(value: Boolean): Self = this.set("vpnConfigDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpnConfigDisabled: Self = this.set("vpnConfigDisabled", js.undefined)
    
    @scala.inline
    def setWifiConfigDisabled(value: Boolean): Self = this.set("wifiConfigDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWifiConfigDisabled: Self = this.set("wifiConfigDisabled", js.undefined)
    
    @scala.inline
    def setWifiConfigsLockdownEnabled(value: Boolean): Self = this.set("wifiConfigsLockdownEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWifiConfigsLockdownEnabled: Self = this.set("wifiConfigsLockdownEnabled", js.undefined)
  }
}
