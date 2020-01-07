package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A policy resources represents a group settings that govern the behavior of
  * a managed device and the apps installed on it.
  */
@js.native
trait Schema$Policy extends js.Object {
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
  var alwaysOnVpnPackage: js.UndefOr[Schema$AlwaysOnVpnPackage] = js.native
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
  var applications: js.UndefOr[js.Array[Schema$ApplicationPolicy]] = js.native
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
  var choosePrivateKeyRules: js.UndefOr[js.Array[Schema$ChoosePrivateKeyRule]] = js.native
  /**
    * Rules declaring which mitigating actions to take when a device is not
    * compliant with its policy. When the conditions for multiple rules are
    * satisfied, all of the mitigating actions for the rules are taken. There
    * is a maximum limit of 100 rules.
    */
  var complianceRules: js.UndefOr[js.Array[Schema$ComplianceRule]] = js.native
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
  var deviceOwnerLockScreenInfo: js.UndefOr[Schema$UserFacingMessage] = js.native
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
  var longSupportMessage: js.UndefOr[Schema$UserFacingMessage] = js.native
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
  var passwordPolicies: js.UndefOr[js.Array[Schema$PasswordRequirements]] = js.native
  /**
    * Password requirements. DEPRECATED - Use password_policies
    */
  var passwordRequirements: js.UndefOr[Schema$PasswordRequirements] = js.native
  /**
    * Explicit permission or group grants or denials for all apps. These values
    * override the default_permission_policy.
    */
  var permissionGrants: js.UndefOr[js.Array[Schema$PermissionGrant]] = js.native
  /**
    * If present, only the input methods provided by packages in this list are
    * permitted. If this field is present, but the list is empty, then only
    * system input methods are permitted.
    */
  var permittedInputMethods: js.UndefOr[Schema$PackageNameList] = js.native
  /**
    * Default intent handler activities.
    */
  var persistentPreferredActivities: js.UndefOr[js.Array[Schema$PersistentPreferredActivity]] = js.native
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
  var recommendedGlobalProxy: js.UndefOr[Schema$ProxyInfo] = js.native
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
  var setupActions: js.UndefOr[js.Array[Schema$SetupAction]] = js.native
  /**
    * Whether location sharing is disabled.
    */
  var shareLocationDisabled: js.UndefOr[Boolean] = js.native
  /**
    * A message displayed to the user in the settings screen wherever
    * functionality has been disabled by the admin.
    */
  var shortSupportMessage: js.UndefOr[Schema$UserFacingMessage] = js.native
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
  var statusReportingSettings: js.UndefOr[Schema$StatusReportingSettings] = js.native
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
  var systemUpdate: js.UndefOr[Schema$SystemUpdate] = js.native
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

object Schema$Policy {
  @scala.inline
  def apply(
    accountTypesWithManagementDisabled: js.Array[String] = null,
    addUserDisabled: js.UndefOr[Boolean] = js.undefined,
    adjustVolumeDisabled: js.UndefOr[Boolean] = js.undefined,
    alwaysOnVpnPackage: Schema$AlwaysOnVpnPackage = null,
    androidDevicePolicyTracks: js.Array[String] = null,
    appAutoUpdatePolicy: String = null,
    applications: js.Array[Schema$ApplicationPolicy] = null,
    autoTimeRequired: js.UndefOr[Boolean] = js.undefined,
    blockApplicationsEnabled: js.UndefOr[Boolean] = js.undefined,
    bluetoothConfigDisabled: js.UndefOr[Boolean] = js.undefined,
    bluetoothContactSharingDisabled: js.UndefOr[Boolean] = js.undefined,
    bluetoothDisabled: js.UndefOr[Boolean] = js.undefined,
    cameraDisabled: js.UndefOr[Boolean] = js.undefined,
    cellBroadcastsConfigDisabled: js.UndefOr[Boolean] = js.undefined,
    choosePrivateKeyRules: js.Array[Schema$ChoosePrivateKeyRule] = null,
    complianceRules: js.Array[Schema$ComplianceRule] = null,
    createWindowsDisabled: js.UndefOr[Boolean] = js.undefined,
    credentialsConfigDisabled: js.UndefOr[Boolean] = js.undefined,
    dataRoamingDisabled: js.UndefOr[Boolean] = js.undefined,
    debuggingFeaturesAllowed: js.UndefOr[Boolean] = js.undefined,
    defaultPermissionPolicy: String = null,
    deviceOwnerLockScreenInfo: Schema$UserFacingMessage = null,
    encryptionPolicy: String = null,
    ensureVerifyAppsEnabled: js.UndefOr[Boolean] = js.undefined,
    factoryResetDisabled: js.UndefOr[Boolean] = js.undefined,
    frpAdminEmails: js.Array[String] = null,
    funDisabled: js.UndefOr[Boolean] = js.undefined,
    installAppsDisabled: js.UndefOr[Boolean] = js.undefined,
    installUnknownSourcesAllowed: js.UndefOr[Boolean] = js.undefined,
    keyguardDisabled: js.UndefOr[Boolean] = js.undefined,
    keyguardDisabledFeatures: js.Array[String] = null,
    kioskCustomLauncherEnabled: js.UndefOr[Boolean] = js.undefined,
    locationMode: String = null,
    longSupportMessage: Schema$UserFacingMessage = null,
    maximumTimeToLock: String = null,
    mobileNetworksConfigDisabled: js.UndefOr[Boolean] = js.undefined,
    modifyAccountsDisabled: js.UndefOr[Boolean] = js.undefined,
    mountPhysicalMediaDisabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    networkEscapeHatchEnabled: js.UndefOr[Boolean] = js.undefined,
    networkResetDisabled: js.UndefOr[Boolean] = js.undefined,
    openNetworkConfiguration: StringDictionary[js.Any] = null,
    outgoingBeamDisabled: js.UndefOr[Boolean] = js.undefined,
    outgoingCallsDisabled: js.UndefOr[Boolean] = js.undefined,
    passwordPolicies: js.Array[Schema$PasswordRequirements] = null,
    passwordRequirements: Schema$PasswordRequirements = null,
    permissionGrants: js.Array[Schema$PermissionGrant] = null,
    permittedInputMethods: Schema$PackageNameList = null,
    persistentPreferredActivities: js.Array[Schema$PersistentPreferredActivity] = null,
    playStoreMode: String = null,
    privateKeySelectionEnabled: js.UndefOr[Boolean] = js.undefined,
    recommendedGlobalProxy: Schema$ProxyInfo = null,
    removeUserDisabled: js.UndefOr[Boolean] = js.undefined,
    safeBootDisabled: js.UndefOr[Boolean] = js.undefined,
    screenCaptureDisabled: js.UndefOr[Boolean] = js.undefined,
    setUserIconDisabled: js.UndefOr[Boolean] = js.undefined,
    setWallpaperDisabled: js.UndefOr[Boolean] = js.undefined,
    setupActions: js.Array[Schema$SetupAction] = null,
    shareLocationDisabled: js.UndefOr[Boolean] = js.undefined,
    shortSupportMessage: Schema$UserFacingMessage = null,
    skipFirstUseHintsEnabled: js.UndefOr[Boolean] = js.undefined,
    smsDisabled: js.UndefOr[Boolean] = js.undefined,
    statusBarDisabled: js.UndefOr[Boolean] = js.undefined,
    statusReportingSettings: Schema$StatusReportingSettings = null,
    stayOnPluggedModes: js.Array[String] = null,
    systemUpdate: Schema$SystemUpdate = null,
    tetheringConfigDisabled: js.UndefOr[Boolean] = js.undefined,
    uninstallAppsDisabled: js.UndefOr[Boolean] = js.undefined,
    unmuteMicrophoneDisabled: js.UndefOr[Boolean] = js.undefined,
    usbFileTransferDisabled: js.UndefOr[Boolean] = js.undefined,
    usbMassStorageEnabled: js.UndefOr[Boolean] = js.undefined,
    version: String = null,
    vpnConfigDisabled: js.UndefOr[Boolean] = js.undefined,
    wifiConfigDisabled: js.UndefOr[Boolean] = js.undefined,
    wifiConfigsLockdownEnabled: js.UndefOr[Boolean] = js.undefined
  ): Schema$Policy = {
    val __obj = js.Dynamic.literal()
    if (accountTypesWithManagementDisabled != null) __obj.updateDynamic("accountTypesWithManagementDisabled")(accountTypesWithManagementDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(addUserDisabled)) __obj.updateDynamic("addUserDisabled")(addUserDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(adjustVolumeDisabled)) __obj.updateDynamic("adjustVolumeDisabled")(adjustVolumeDisabled.asInstanceOf[js.Any])
    if (alwaysOnVpnPackage != null) __obj.updateDynamic("alwaysOnVpnPackage")(alwaysOnVpnPackage.asInstanceOf[js.Any])
    if (androidDevicePolicyTracks != null) __obj.updateDynamic("androidDevicePolicyTracks")(androidDevicePolicyTracks.asInstanceOf[js.Any])
    if (appAutoUpdatePolicy != null) __obj.updateDynamic("appAutoUpdatePolicy")(appAutoUpdatePolicy.asInstanceOf[js.Any])
    if (applications != null) __obj.updateDynamic("applications")(applications.asInstanceOf[js.Any])
    if (!js.isUndefined(autoTimeRequired)) __obj.updateDynamic("autoTimeRequired")(autoTimeRequired.asInstanceOf[js.Any])
    if (!js.isUndefined(blockApplicationsEnabled)) __obj.updateDynamic("blockApplicationsEnabled")(blockApplicationsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(bluetoothConfigDisabled)) __obj.updateDynamic("bluetoothConfigDisabled")(bluetoothConfigDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(bluetoothContactSharingDisabled)) __obj.updateDynamic("bluetoothContactSharingDisabled")(bluetoothContactSharingDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(bluetoothDisabled)) __obj.updateDynamic("bluetoothDisabled")(bluetoothDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(cameraDisabled)) __obj.updateDynamic("cameraDisabled")(cameraDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(cellBroadcastsConfigDisabled)) __obj.updateDynamic("cellBroadcastsConfigDisabled")(cellBroadcastsConfigDisabled.asInstanceOf[js.Any])
    if (choosePrivateKeyRules != null) __obj.updateDynamic("choosePrivateKeyRules")(choosePrivateKeyRules.asInstanceOf[js.Any])
    if (complianceRules != null) __obj.updateDynamic("complianceRules")(complianceRules.asInstanceOf[js.Any])
    if (!js.isUndefined(createWindowsDisabled)) __obj.updateDynamic("createWindowsDisabled")(createWindowsDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(credentialsConfigDisabled)) __obj.updateDynamic("credentialsConfigDisabled")(credentialsConfigDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(dataRoamingDisabled)) __obj.updateDynamic("dataRoamingDisabled")(dataRoamingDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(debuggingFeaturesAllowed)) __obj.updateDynamic("debuggingFeaturesAllowed")(debuggingFeaturesAllowed.asInstanceOf[js.Any])
    if (defaultPermissionPolicy != null) __obj.updateDynamic("defaultPermissionPolicy")(defaultPermissionPolicy.asInstanceOf[js.Any])
    if (deviceOwnerLockScreenInfo != null) __obj.updateDynamic("deviceOwnerLockScreenInfo")(deviceOwnerLockScreenInfo.asInstanceOf[js.Any])
    if (encryptionPolicy != null) __obj.updateDynamic("encryptionPolicy")(encryptionPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(ensureVerifyAppsEnabled)) __obj.updateDynamic("ensureVerifyAppsEnabled")(ensureVerifyAppsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(factoryResetDisabled)) __obj.updateDynamic("factoryResetDisabled")(factoryResetDisabled.asInstanceOf[js.Any])
    if (frpAdminEmails != null) __obj.updateDynamic("frpAdminEmails")(frpAdminEmails.asInstanceOf[js.Any])
    if (!js.isUndefined(funDisabled)) __obj.updateDynamic("funDisabled")(funDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(installAppsDisabled)) __obj.updateDynamic("installAppsDisabled")(installAppsDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(installUnknownSourcesAllowed)) __obj.updateDynamic("installUnknownSourcesAllowed")(installUnknownSourcesAllowed.asInstanceOf[js.Any])
    if (!js.isUndefined(keyguardDisabled)) __obj.updateDynamic("keyguardDisabled")(keyguardDisabled.asInstanceOf[js.Any])
    if (keyguardDisabledFeatures != null) __obj.updateDynamic("keyguardDisabledFeatures")(keyguardDisabledFeatures.asInstanceOf[js.Any])
    if (!js.isUndefined(kioskCustomLauncherEnabled)) __obj.updateDynamic("kioskCustomLauncherEnabled")(kioskCustomLauncherEnabled.asInstanceOf[js.Any])
    if (locationMode != null) __obj.updateDynamic("locationMode")(locationMode.asInstanceOf[js.Any])
    if (longSupportMessage != null) __obj.updateDynamic("longSupportMessage")(longSupportMessage.asInstanceOf[js.Any])
    if (maximumTimeToLock != null) __obj.updateDynamic("maximumTimeToLock")(maximumTimeToLock.asInstanceOf[js.Any])
    if (!js.isUndefined(mobileNetworksConfigDisabled)) __obj.updateDynamic("mobileNetworksConfigDisabled")(mobileNetworksConfigDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(modifyAccountsDisabled)) __obj.updateDynamic("modifyAccountsDisabled")(modifyAccountsDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(mountPhysicalMediaDisabled)) __obj.updateDynamic("mountPhysicalMediaDisabled")(mountPhysicalMediaDisabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(networkEscapeHatchEnabled)) __obj.updateDynamic("networkEscapeHatchEnabled")(networkEscapeHatchEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(networkResetDisabled)) __obj.updateDynamic("networkResetDisabled")(networkResetDisabled.asInstanceOf[js.Any])
    if (openNetworkConfiguration != null) __obj.updateDynamic("openNetworkConfiguration")(openNetworkConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(outgoingBeamDisabled)) __obj.updateDynamic("outgoingBeamDisabled")(outgoingBeamDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(outgoingCallsDisabled)) __obj.updateDynamic("outgoingCallsDisabled")(outgoingCallsDisabled.asInstanceOf[js.Any])
    if (passwordPolicies != null) __obj.updateDynamic("passwordPolicies")(passwordPolicies.asInstanceOf[js.Any])
    if (passwordRequirements != null) __obj.updateDynamic("passwordRequirements")(passwordRequirements.asInstanceOf[js.Any])
    if (permissionGrants != null) __obj.updateDynamic("permissionGrants")(permissionGrants.asInstanceOf[js.Any])
    if (permittedInputMethods != null) __obj.updateDynamic("permittedInputMethods")(permittedInputMethods.asInstanceOf[js.Any])
    if (persistentPreferredActivities != null) __obj.updateDynamic("persistentPreferredActivities")(persistentPreferredActivities.asInstanceOf[js.Any])
    if (playStoreMode != null) __obj.updateDynamic("playStoreMode")(playStoreMode.asInstanceOf[js.Any])
    if (!js.isUndefined(privateKeySelectionEnabled)) __obj.updateDynamic("privateKeySelectionEnabled")(privateKeySelectionEnabled.asInstanceOf[js.Any])
    if (recommendedGlobalProxy != null) __obj.updateDynamic("recommendedGlobalProxy")(recommendedGlobalProxy.asInstanceOf[js.Any])
    if (!js.isUndefined(removeUserDisabled)) __obj.updateDynamic("removeUserDisabled")(removeUserDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(safeBootDisabled)) __obj.updateDynamic("safeBootDisabled")(safeBootDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(screenCaptureDisabled)) __obj.updateDynamic("screenCaptureDisabled")(screenCaptureDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(setUserIconDisabled)) __obj.updateDynamic("setUserIconDisabled")(setUserIconDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(setWallpaperDisabled)) __obj.updateDynamic("setWallpaperDisabled")(setWallpaperDisabled.asInstanceOf[js.Any])
    if (setupActions != null) __obj.updateDynamic("setupActions")(setupActions.asInstanceOf[js.Any])
    if (!js.isUndefined(shareLocationDisabled)) __obj.updateDynamic("shareLocationDisabled")(shareLocationDisabled.asInstanceOf[js.Any])
    if (shortSupportMessage != null) __obj.updateDynamic("shortSupportMessage")(shortSupportMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(skipFirstUseHintsEnabled)) __obj.updateDynamic("skipFirstUseHintsEnabled")(skipFirstUseHintsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(smsDisabled)) __obj.updateDynamic("smsDisabled")(smsDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(statusBarDisabled)) __obj.updateDynamic("statusBarDisabled")(statusBarDisabled.asInstanceOf[js.Any])
    if (statusReportingSettings != null) __obj.updateDynamic("statusReportingSettings")(statusReportingSettings.asInstanceOf[js.Any])
    if (stayOnPluggedModes != null) __obj.updateDynamic("stayOnPluggedModes")(stayOnPluggedModes.asInstanceOf[js.Any])
    if (systemUpdate != null) __obj.updateDynamic("systemUpdate")(systemUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(tetheringConfigDisabled)) __obj.updateDynamic("tetheringConfigDisabled")(tetheringConfigDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(uninstallAppsDisabled)) __obj.updateDynamic("uninstallAppsDisabled")(uninstallAppsDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(unmuteMicrophoneDisabled)) __obj.updateDynamic("unmuteMicrophoneDisabled")(unmuteMicrophoneDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(usbFileTransferDisabled)) __obj.updateDynamic("usbFileTransferDisabled")(usbFileTransferDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(usbMassStorageEnabled)) __obj.updateDynamic("usbMassStorageEnabled")(usbMassStorageEnabled.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(vpnConfigDisabled)) __obj.updateDynamic("vpnConfigDisabled")(vpnConfigDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(wifiConfigDisabled)) __obj.updateDynamic("wifiConfigDisabled")(wifiConfigDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(wifiConfigsLockdownEnabled)) __obj.updateDynamic("wifiConfigsLockdownEnabled")(wifiConfigsLockdownEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Policy]
  }
}

