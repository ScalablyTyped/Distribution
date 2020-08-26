package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Policy extends js.Object {
  /** Whether adding new users and profiles is disabled. */
  var addUserDisabled: js.UndefOr[Boolean] = js.native
  /** Whether adjusting the master volume is disabled. */
  var adjustVolumeDisabled: js.UndefOr[Boolean] = js.native
  /** Policy applied to apps. */
  var applications: js.UndefOr[js.Array[ApplicationPolicy]] = js.native
  /** Whether auto time is required, which prevents the user from manually setting the date and time. */
  var autoTimeRequired: js.UndefOr[Boolean] = js.native
  /**
    * Whether applications other than the ones configured in applications are blocked from being installed. When set, applications that were installed under
    * a previous policy but no longer appear in the policy are automatically uninstalled.
    */
  var blockApplicationsEnabled: js.UndefOr[Boolean] = js.native
  /** Whether all cameras on the device are disabled. */
  var cameraDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Rules declaring which mitigating actions to take when a device is not compliant with its policy. When the conditions for multiple rules are satisfied,
    * all of the mitigating actions for the rules are taken. There is a maximum limit of 100 rules.
    */
  var complianceRules: js.UndefOr[js.Array[ComplianceRule]] = js.native
  /** Whether the user is allowed to enable debugging features. */
  var debuggingFeaturesAllowed: js.UndefOr[Boolean] = js.native
  /** The default permission policy for requests for runtime permissions. */
  var defaultPermissionPolicy: js.UndefOr[String] = js.native
  /** Whether factory resetting from settings is disabled. */
  var factoryResetDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Email addresses of device administrators for factory reset protection. When the device is factory reset, it will require one of these admins to log in
    * with the Google account email and password to unlock the device. If no admins are specified, the device will not provide factory reset protection.
    */
  var frpAdminEmails: js.UndefOr[js.Array[String]] = js.native
  /** Whether the user is allowed to have fun. Controls whether the Easter egg game in Settings is disabled. */
  var funDisabled: js.UndefOr[Boolean] = js.native
  /** Whether the user is allowed to enable the "Unknown Sources" setting, which allows installation of apps from unknown sources. */
  var installUnknownSourcesAllowed: js.UndefOr[Boolean] = js.native
  /** Whether the keyguard is disabled. */
  var keyguardDisabled: js.UndefOr[Boolean] = js.native
  /** Maximum time in milliseconds for user activity until the device will lock. A value of 0 means there is no restriction. */
  var maximumTimeToLock: js.UndefOr[String] = js.native
  /** Whether adding or removing accounts is disabled. */
  var modifyAccountsDisabled: js.UndefOr[Boolean] = js.native
  /** The name of the policy in the form enterprises/{enterpriseId}/policies/{policyId} */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether the network escape hatch is enabled. If a network connection can't be made at boot time, the escape hatch prompts the user to temporarily
    * connect to a network in order to refresh the device policy. After applying policy, the temporary network will be forgotten and the device will continue
    * booting. This prevents being unable to connect to a network if there is no suitable network in the last policy and the device boots into an app in lock
    * task mode, or the user is otherwise unable to reach device settings.
    */
  var networkEscapeHatchEnabled: js.UndefOr[Boolean] = js.native
  /** Network configuration for the device. See configure networks for more information. */
  var openNetworkConfiguration: js.UndefOr[Record[String, _]] = js.native
  /** Password requirements. */
  var passwordRequirements: js.UndefOr[PasswordRequirements] = js.native
  /** Default intent handler activities. */
  var persistentPreferredActivities: js.UndefOr[js.Array[PersistentPreferredActivity]] = js.native
  /** Whether removing other users is disabled. */
  var removeUserDisabled: js.UndefOr[Boolean] = js.native
  /** Whether rebooting the device into safe boot is disabled. */
  var safeBootDisabled: js.UndefOr[Boolean] = js.native
  /** Whether screen capture is disabled. */
  var screenCaptureDisabled: js.UndefOr[Boolean] = js.native
  /** Whether the status bar is disabled. This disables notifications, quick settings and other screen overlays that allow escape from full-screen mode. */
  var statusBarDisabled: js.UndefOr[Boolean] = js.native
  /** Status reporting settings */
  var statusReportingSettings: js.UndefOr[StatusReportingSettings] = js.native
  /**
    * The battery plugged in modes for which the device stays on. When using this setting, it is recommended to clear maximum_time_to_lock so that the device
    * doesn't lock itself while it stays on.
    */
  var stayOnPluggedModes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The system update policy, which controls how OS updates are applied. If the update type is WINDOWED and the device has a device account, the update
    * window will automatically apply to Play app updates as well.
    */
  var systemUpdate: js.UndefOr[SystemUpdate] = js.native
  /** Whether the microphone is muted and adjusting microphone volume is disabled. */
  var unmuteMicrophoneDisabled: js.UndefOr[Boolean] = js.native
  /** The version of the policy. This is a read-only field. The version is incremented each time the policy is updated. */
  var version: js.UndefOr[String] = js.native
  /** Whether configuring WiFi access points is disabled. */
  var wifiConfigDisabled: js.UndefOr[Boolean] = js.native
  /** Whether WiFi networks defined in Open Network Configuration are locked so they cannot be edited by the user. */
  var wifiConfigsLockdownEnabled: js.UndefOr[Boolean] = js.native
}

object Policy {
  @scala.inline
  def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  @scala.inline
  implicit class PolicyOps[Self <: Policy] (val x: Self) extends AnyVal {
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
    def setAddUserDisabled(value: Boolean): Self = this.set("addUserDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddUserDisabled: Self = this.set("addUserDisabled", js.undefined)
    @scala.inline
    def setAdjustVolumeDisabled(value: Boolean): Self = this.set("adjustVolumeDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustVolumeDisabled: Self = this.set("adjustVolumeDisabled", js.undefined)
    @scala.inline
    def setApplicationsVarargs(value: ApplicationPolicy*): Self = this.set("applications", js.Array(value :_*))
    @scala.inline
    def setApplications(value: js.Array[ApplicationPolicy]): Self = this.set("applications", value.asInstanceOf[js.Any])
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
    def setCameraDisabled(value: Boolean): Self = this.set("cameraDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameraDisabled: Self = this.set("cameraDisabled", js.undefined)
    @scala.inline
    def setComplianceRulesVarargs(value: ComplianceRule*): Self = this.set("complianceRules", js.Array(value :_*))
    @scala.inline
    def setComplianceRules(value: js.Array[ComplianceRule]): Self = this.set("complianceRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplianceRules: Self = this.set("complianceRules", js.undefined)
    @scala.inline
    def setDebuggingFeaturesAllowed(value: Boolean): Self = this.set("debuggingFeaturesAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebuggingFeaturesAllowed: Self = this.set("debuggingFeaturesAllowed", js.undefined)
    @scala.inline
    def setDefaultPermissionPolicy(value: String): Self = this.set("defaultPermissionPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPermissionPolicy: Self = this.set("defaultPermissionPolicy", js.undefined)
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
    def setInstallUnknownSourcesAllowed(value: Boolean): Self = this.set("installUnknownSourcesAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstallUnknownSourcesAllowed: Self = this.set("installUnknownSourcesAllowed", js.undefined)
    @scala.inline
    def setKeyguardDisabled(value: Boolean): Self = this.set("keyguardDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyguardDisabled: Self = this.set("keyguardDisabled", js.undefined)
    @scala.inline
    def setMaximumTimeToLock(value: String): Self = this.set("maximumTimeToLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumTimeToLock: Self = this.set("maximumTimeToLock", js.undefined)
    @scala.inline
    def setModifyAccountsDisabled(value: Boolean): Self = this.set("modifyAccountsDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyAccountsDisabled: Self = this.set("modifyAccountsDisabled", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetworkEscapeHatchEnabled(value: Boolean): Self = this.set("networkEscapeHatchEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkEscapeHatchEnabled: Self = this.set("networkEscapeHatchEnabled", js.undefined)
    @scala.inline
    def setOpenNetworkConfiguration(value: Record[String, _]): Self = this.set("openNetworkConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenNetworkConfiguration: Self = this.set("openNetworkConfiguration", js.undefined)
    @scala.inline
    def setPasswordRequirements(value: PasswordRequirements): Self = this.set("passwordRequirements", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordRequirements: Self = this.set("passwordRequirements", js.undefined)
    @scala.inline
    def setPersistentPreferredActivitiesVarargs(value: PersistentPreferredActivity*): Self = this.set("persistentPreferredActivities", js.Array(value :_*))
    @scala.inline
    def setPersistentPreferredActivities(value: js.Array[PersistentPreferredActivity]): Self = this.set("persistentPreferredActivities", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistentPreferredActivities: Self = this.set("persistentPreferredActivities", js.undefined)
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
    def setStatusBarDisabled(value: Boolean): Self = this.set("statusBarDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusBarDisabled: Self = this.set("statusBarDisabled", js.undefined)
    @scala.inline
    def setStatusReportingSettings(value: StatusReportingSettings): Self = this.set("statusReportingSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusReportingSettings: Self = this.set("statusReportingSettings", js.undefined)
    @scala.inline
    def setStayOnPluggedModesVarargs(value: String*): Self = this.set("stayOnPluggedModes", js.Array(value :_*))
    @scala.inline
    def setStayOnPluggedModes(value: js.Array[String]): Self = this.set("stayOnPluggedModes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStayOnPluggedModes: Self = this.set("stayOnPluggedModes", js.undefined)
    @scala.inline
    def setSystemUpdate(value: SystemUpdate): Self = this.set("systemUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemUpdate: Self = this.set("systemUpdate", js.undefined)
    @scala.inline
    def setUnmuteMicrophoneDisabled(value: Boolean): Self = this.set("unmuteMicrophoneDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnmuteMicrophoneDisabled: Self = this.set("unmuteMicrophoneDisabled", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
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

