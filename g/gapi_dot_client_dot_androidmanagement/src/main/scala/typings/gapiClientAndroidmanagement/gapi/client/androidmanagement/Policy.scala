package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policy extends js.Object {
  /** Whether adding new users and profiles is disabled. */
  var addUserDisabled: js.UndefOr[Boolean] = js.undefined
  /** Whether adjusting the master volume is disabled. */
  var adjustVolumeDisabled: js.UndefOr[Boolean] = js.undefined
  /** Policy applied to apps. */
  var applications: js.UndefOr[js.Array[ApplicationPolicy]] = js.undefined
  /** Whether auto time is required, which prevents the user from manually setting the date and time. */
  var autoTimeRequired: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether applications other than the ones configured in applications are blocked from being installed. When set, applications that were installed under
    * a previous policy but no longer appear in the policy are automatically uninstalled.
    */
  var blockApplicationsEnabled: js.UndefOr[Boolean] = js.undefined
  /** Whether all cameras on the device are disabled. */
  var cameraDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Rules declaring which mitigating actions to take when a device is not compliant with its policy. When the conditions for multiple rules are satisfied,
    * all of the mitigating actions for the rules are taken. There is a maximum limit of 100 rules.
    */
  var complianceRules: js.UndefOr[js.Array[ComplianceRule]] = js.undefined
  /** Whether the user is allowed to enable debugging features. */
  var debuggingFeaturesAllowed: js.UndefOr[Boolean] = js.undefined
  /** The default permission policy for requests for runtime permissions. */
  var defaultPermissionPolicy: js.UndefOr[String] = js.undefined
  /** Whether factory resetting from settings is disabled. */
  var factoryResetDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Email addresses of device administrators for factory reset protection. When the device is factory reset, it will require one of these admins to log in
    * with the Google account email and password to unlock the device. If no admins are specified, the device will not provide factory reset protection.
    */
  var frpAdminEmails: js.UndefOr[js.Array[String]] = js.undefined
  /** Whether the user is allowed to have fun. Controls whether the Easter egg game in Settings is disabled. */
  var funDisabled: js.UndefOr[Boolean] = js.undefined
  /** Whether the user is allowed to enable the "Unknown Sources" setting, which allows installation of apps from unknown sources. */
  var installUnknownSourcesAllowed: js.UndefOr[Boolean] = js.undefined
  /** Whether the keyguard is disabled. */
  var keyguardDisabled: js.UndefOr[Boolean] = js.undefined
  /** Maximum time in milliseconds for user activity until the device will lock. A value of 0 means there is no restriction. */
  var maximumTimeToLock: js.UndefOr[String] = js.undefined
  /** Whether adding or removing accounts is disabled. */
  var modifyAccountsDisabled: js.UndefOr[Boolean] = js.undefined
  /** The name of the policy in the form enterprises/{enterpriseId}/policies/{policyId} */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Whether the network escape hatch is enabled. If a network connection can't be made at boot time, the escape hatch prompts the user to temporarily
    * connect to a network in order to refresh the device policy. After applying policy, the temporary network will be forgotten and the device will continue
    * booting. This prevents being unable to connect to a network if there is no suitable network in the last policy and the device boots into an app in lock
    * task mode, or the user is otherwise unable to reach device settings.
    */
  var networkEscapeHatchEnabled: js.UndefOr[Boolean] = js.undefined
  /** Network configuration for the device. See configure networks for more information. */
  var openNetworkConfiguration: js.UndefOr[Record[String, _]] = js.undefined
  /** Password requirements. */
  var passwordRequirements: js.UndefOr[PasswordRequirements] = js.undefined
  /** Default intent handler activities. */
  var persistentPreferredActivities: js.UndefOr[js.Array[PersistentPreferredActivity]] = js.undefined
  /** Whether removing other users is disabled. */
  var removeUserDisabled: js.UndefOr[Boolean] = js.undefined
  /** Whether rebooting the device into safe boot is disabled. */
  var safeBootDisabled: js.UndefOr[Boolean] = js.undefined
  /** Whether screen capture is disabled. */
  var screenCaptureDisabled: js.UndefOr[Boolean] = js.undefined
  /** Whether the status bar is disabled. This disables notifications, quick settings and other screen overlays that allow escape from full-screen mode. */
  var statusBarDisabled: js.UndefOr[Boolean] = js.undefined
  /** Status reporting settings */
  var statusReportingSettings: js.UndefOr[StatusReportingSettings] = js.undefined
  /**
    * The battery plugged in modes for which the device stays on. When using this setting, it is recommended to clear maximum_time_to_lock so that the device
    * doesn't lock itself while it stays on.
    */
  var stayOnPluggedModes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The system update policy, which controls how OS updates are applied. If the update type is WINDOWED and the device has a device account, the update
    * window will automatically apply to Play app updates as well.
    */
  var systemUpdate: js.UndefOr[SystemUpdate] = js.undefined
  /** Whether the microphone is muted and adjusting microphone volume is disabled. */
  var unmuteMicrophoneDisabled: js.UndefOr[Boolean] = js.undefined
  /** The version of the policy. This is a read-only field. The version is incremented each time the policy is updated. */
  var version: js.UndefOr[String] = js.undefined
  /** Whether configuring WiFi access points is disabled. */
  var wifiConfigDisabled: js.UndefOr[Boolean] = js.undefined
  /** Whether WiFi networks defined in Open Network Configuration are locked so they cannot be edited by the user. */
  var wifiConfigsLockdownEnabled: js.UndefOr[Boolean] = js.undefined
}

object Policy {
  @scala.inline
  def apply(
    addUserDisabled: js.UndefOr[Boolean] = js.undefined,
    adjustVolumeDisabled: js.UndefOr[Boolean] = js.undefined,
    applications: js.Array[ApplicationPolicy] = null,
    autoTimeRequired: js.UndefOr[Boolean] = js.undefined,
    blockApplicationsEnabled: js.UndefOr[Boolean] = js.undefined,
    cameraDisabled: js.UndefOr[Boolean] = js.undefined,
    complianceRules: js.Array[ComplianceRule] = null,
    debuggingFeaturesAllowed: js.UndefOr[Boolean] = js.undefined,
    defaultPermissionPolicy: String = null,
    factoryResetDisabled: js.UndefOr[Boolean] = js.undefined,
    frpAdminEmails: js.Array[String] = null,
    funDisabled: js.UndefOr[Boolean] = js.undefined,
    installUnknownSourcesAllowed: js.UndefOr[Boolean] = js.undefined,
    keyguardDisabled: js.UndefOr[Boolean] = js.undefined,
    maximumTimeToLock: String = null,
    modifyAccountsDisabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    networkEscapeHatchEnabled: js.UndefOr[Boolean] = js.undefined,
    openNetworkConfiguration: Record[String, _] = null,
    passwordRequirements: PasswordRequirements = null,
    persistentPreferredActivities: js.Array[PersistentPreferredActivity] = null,
    removeUserDisabled: js.UndefOr[Boolean] = js.undefined,
    safeBootDisabled: js.UndefOr[Boolean] = js.undefined,
    screenCaptureDisabled: js.UndefOr[Boolean] = js.undefined,
    statusBarDisabled: js.UndefOr[Boolean] = js.undefined,
    statusReportingSettings: StatusReportingSettings = null,
    stayOnPluggedModes: js.Array[String] = null,
    systemUpdate: SystemUpdate = null,
    unmuteMicrophoneDisabled: js.UndefOr[Boolean] = js.undefined,
    version: String = null,
    wifiConfigDisabled: js.UndefOr[Boolean] = js.undefined,
    wifiConfigsLockdownEnabled: js.UndefOr[Boolean] = js.undefined
  ): Policy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addUserDisabled)) __obj.updateDynamic("addUserDisabled")(addUserDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(adjustVolumeDisabled)) __obj.updateDynamic("adjustVolumeDisabled")(adjustVolumeDisabled.get.asInstanceOf[js.Any])
    if (applications != null) __obj.updateDynamic("applications")(applications.asInstanceOf[js.Any])
    if (!js.isUndefined(autoTimeRequired)) __obj.updateDynamic("autoTimeRequired")(autoTimeRequired.get.asInstanceOf[js.Any])
    if (!js.isUndefined(blockApplicationsEnabled)) __obj.updateDynamic("blockApplicationsEnabled")(blockApplicationsEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cameraDisabled)) __obj.updateDynamic("cameraDisabled")(cameraDisabled.get.asInstanceOf[js.Any])
    if (complianceRules != null) __obj.updateDynamic("complianceRules")(complianceRules.asInstanceOf[js.Any])
    if (!js.isUndefined(debuggingFeaturesAllowed)) __obj.updateDynamic("debuggingFeaturesAllowed")(debuggingFeaturesAllowed.get.asInstanceOf[js.Any])
    if (defaultPermissionPolicy != null) __obj.updateDynamic("defaultPermissionPolicy")(defaultPermissionPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(factoryResetDisabled)) __obj.updateDynamic("factoryResetDisabled")(factoryResetDisabled.get.asInstanceOf[js.Any])
    if (frpAdminEmails != null) __obj.updateDynamic("frpAdminEmails")(frpAdminEmails.asInstanceOf[js.Any])
    if (!js.isUndefined(funDisabled)) __obj.updateDynamic("funDisabled")(funDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(installUnknownSourcesAllowed)) __obj.updateDynamic("installUnknownSourcesAllowed")(installUnknownSourcesAllowed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keyguardDisabled)) __obj.updateDynamic("keyguardDisabled")(keyguardDisabled.get.asInstanceOf[js.Any])
    if (maximumTimeToLock != null) __obj.updateDynamic("maximumTimeToLock")(maximumTimeToLock.asInstanceOf[js.Any])
    if (!js.isUndefined(modifyAccountsDisabled)) __obj.updateDynamic("modifyAccountsDisabled")(modifyAccountsDisabled.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(networkEscapeHatchEnabled)) __obj.updateDynamic("networkEscapeHatchEnabled")(networkEscapeHatchEnabled.get.asInstanceOf[js.Any])
    if (openNetworkConfiguration != null) __obj.updateDynamic("openNetworkConfiguration")(openNetworkConfiguration.asInstanceOf[js.Any])
    if (passwordRequirements != null) __obj.updateDynamic("passwordRequirements")(passwordRequirements.asInstanceOf[js.Any])
    if (persistentPreferredActivities != null) __obj.updateDynamic("persistentPreferredActivities")(persistentPreferredActivities.asInstanceOf[js.Any])
    if (!js.isUndefined(removeUserDisabled)) __obj.updateDynamic("removeUserDisabled")(removeUserDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(safeBootDisabled)) __obj.updateDynamic("safeBootDisabled")(safeBootDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenCaptureDisabled)) __obj.updateDynamic("screenCaptureDisabled")(screenCaptureDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(statusBarDisabled)) __obj.updateDynamic("statusBarDisabled")(statusBarDisabled.get.asInstanceOf[js.Any])
    if (statusReportingSettings != null) __obj.updateDynamic("statusReportingSettings")(statusReportingSettings.asInstanceOf[js.Any])
    if (stayOnPluggedModes != null) __obj.updateDynamic("stayOnPluggedModes")(stayOnPluggedModes.asInstanceOf[js.Any])
    if (systemUpdate != null) __obj.updateDynamic("systemUpdate")(systemUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(unmuteMicrophoneDisabled)) __obj.updateDynamic("unmuteMicrophoneDisabled")(unmuteMicrophoneDisabled.get.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (!js.isUndefined(wifiConfigDisabled)) __obj.updateDynamic("wifiConfigDisabled")(wifiConfigDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wifiConfigsLockdownEnabled)) __obj.updateDynamic("wifiConfigsLockdownEnabled")(wifiConfigsLockdownEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
}

