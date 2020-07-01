package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A device owned by an enterprise. Unless otherwise noted, all fields are
  * read-only and can&#39;t be modified by enterprises.devices.patch.
  */
@js.native
trait SchemaDevice extends js.Object {
  /**
    * The API level of the Android platform version running on the device.
    */
  var apiLevel: js.UndefOr[Double] = js.native
  /**
    * Reports for apps installed on the device. This information is only
    * available when application_reports_enabled is true in the device&#39;s
    * policy.
    */
  var applicationReports: js.UndefOr[js.Array[SchemaApplicationReport]] = js.native
  /**
    * The name of the policy currently applied to the device.
    */
  var appliedPolicyName: js.UndefOr[String] = js.native
  /**
    * The version of the policy currently applied to the device.
    */
  var appliedPolicyVersion: js.UndefOr[String] = js.native
  /**
    * The state currently applied to the device.
    */
  var appliedState: js.UndefOr[String] = js.native
  /**
    * Device settings information. This information is only available if
    * deviceSettingsEnabled is true in the device&#39;s policy.
    */
  var deviceSettings: js.UndefOr[SchemaDeviceSettings] = js.native
  /**
    * If the device state is DISABLED, an optional message that is displayed on
    * the device indicating the reason the device is disabled. This field can
    * be modified by a patch request.
    */
  var disabledReason: js.UndefOr[SchemaUserFacingMessage] = js.native
  /**
    * Detailed information about displays on the device. This information is
    * only available if displayInfoEnabled is true in the device&#39;s policy.
    */
  var displays: js.UndefOr[js.Array[SchemaDisplay]] = js.native
  /**
    * The time of device enrollment.
    */
  var enrollmentTime: js.UndefOr[String] = js.native
  /**
    * If the device was enrolled with an enrollment token with additional data
    * provided, this field contains that data.
    */
  var enrollmentTokenData: js.UndefOr[String] = js.native
  /**
    * If the device was enrolled with an enrollment token, this field contains
    * the name of the token.
    */
  var enrollmentTokenName: js.UndefOr[String] = js.native
  /**
    * Detailed information about the device hardware.
    */
  var hardwareInfo: js.UndefOr[SchemaHardwareInfo] = js.native
  /**
    * Hardware status samples in chronological order. This information is only
    * available if hardwareStatusEnabled is true in the device&#39;s policy.
    */
  var hardwareStatusSamples: js.UndefOr[js.Array[SchemaHardwareStatus]] = js.native
  /**
    * Deprecated.
    */
  var lastPolicyComplianceReportTime: js.UndefOr[String] = js.native
  /**
    * The last time the device fetched its policy.
    */
  var lastPolicySyncTime: js.UndefOr[String] = js.native
  /**
    * The last time the device sent a status report.
    */
  var lastStatusReportTime: js.UndefOr[String] = js.native
  /**
    * The type of management mode Android Device Policy takes on the device.
    * This influences which policy settings are supported.
    */
  var managementMode: js.UndefOr[String] = js.native
  /**
    * Events related to memory and storage measurements in chronological order.
    * This information is only available if memoryInfoEnabled is true in the
    * device&#39;s policy.
    */
  var memoryEvents: js.UndefOr[js.Array[SchemaMemoryEvent]] = js.native
  /**
    * Memory information. This information is only available if
    * memoryInfoEnabled is true in the device&#39;s policy.
    */
  var memoryInfo: js.UndefOr[SchemaMemoryInfo] = js.native
  /**
    * The name of the device in the form
    * enterprises/{enterpriseId}/devices/{deviceId}.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Device network information. This information is only available if
    * networkInfoEnabled is true in the device&#39;s policy.
    */
  var networkInfo: js.UndefOr[SchemaNetworkInfo] = js.native
  /**
    * Details about policy settings that the device is not compliant with.
    */
  var nonComplianceDetails: js.UndefOr[js.Array[SchemaNonComplianceDetail]] = js.native
  /**
    * Whether the device is compliant with its policy.
    */
  var policyCompliant: js.UndefOr[Boolean] = js.native
  /**
    * The name of the policy applied to the device, in the form
    * enterprises/{enterpriseId}/policies/{policyId}. If not specified, the
    * policy_name for the device&#39;s user is applied. This field can be
    * modified by a patch request. You can specify only the policyId when
    * calling enterprises.devices.patch, as long as the policyId doesn’t
    * contain any slashes. The rest of the policy name is inferred.
    */
  var policyName: js.UndefOr[String] = js.native
  /**
    * Power management events on the device in chronological order. This
    * information is only available if powerManagementEventsEnabled is true in
    * the device&#39;s policy.
    */
  var powerManagementEvents: js.UndefOr[js.Array[SchemaPowerManagementEvent]] = js.native
  /**
    * If the same physical device has been enrolled multiple times, this field
    * contains its previous device names. The serial number is used as the
    * unique identifier to determine if the same physical device has enrolled
    * previously. The names are in chronological order.
    */
  var previousDeviceNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Detailed information about the device software. This information is only
    * available if softwareInfoEnabled is true in the device&#39;s policy.
    */
  var softwareInfo: js.UndefOr[SchemaSoftwareInfo] = js.native
  /**
    * The state to be applied to the device. This field can be modified by a
    * patch request. Note that when calling enterprises.devices.patch, ACTIVE
    * and DISABLED are the only allowable values. To enter the device into a
    * DELETED state, call enterprises.devices.delete.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The user who owns the device.
    */
  var user: js.UndefOr[SchemaUser] = js.native
  /**
    * The resource name of the user that owns this device in the form
    * enterprises/{enterpriseId}/users/{userId}.
    */
  var userName: js.UndefOr[String] = js.native
}

object SchemaDevice {
  @scala.inline
  def apply(
    apiLevel: js.UndefOr[Double] = js.undefined,
    applicationReports: js.Array[SchemaApplicationReport] = null,
    appliedPolicyName: String = null,
    appliedPolicyVersion: String = null,
    appliedState: String = null,
    deviceSettings: SchemaDeviceSettings = null,
    disabledReason: SchemaUserFacingMessage = null,
    displays: js.Array[SchemaDisplay] = null,
    enrollmentTime: String = null,
    enrollmentTokenData: String = null,
    enrollmentTokenName: String = null,
    hardwareInfo: SchemaHardwareInfo = null,
    hardwareStatusSamples: js.Array[SchemaHardwareStatus] = null,
    lastPolicyComplianceReportTime: String = null,
    lastPolicySyncTime: String = null,
    lastStatusReportTime: String = null,
    managementMode: String = null,
    memoryEvents: js.Array[SchemaMemoryEvent] = null,
    memoryInfo: SchemaMemoryInfo = null,
    name: String = null,
    networkInfo: SchemaNetworkInfo = null,
    nonComplianceDetails: js.Array[SchemaNonComplianceDetail] = null,
    policyCompliant: js.UndefOr[Boolean] = js.undefined,
    policyName: String = null,
    powerManagementEvents: js.Array[SchemaPowerManagementEvent] = null,
    previousDeviceNames: js.Array[String] = null,
    softwareInfo: SchemaSoftwareInfo = null,
    state: String = null,
    user: SchemaUser = null,
    userName: String = null
  ): SchemaDevice = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(apiLevel)) __obj.updateDynamic("apiLevel")(apiLevel.get.asInstanceOf[js.Any])
    if (applicationReports != null) __obj.updateDynamic("applicationReports")(applicationReports.asInstanceOf[js.Any])
    if (appliedPolicyName != null) __obj.updateDynamic("appliedPolicyName")(appliedPolicyName.asInstanceOf[js.Any])
    if (appliedPolicyVersion != null) __obj.updateDynamic("appliedPolicyVersion")(appliedPolicyVersion.asInstanceOf[js.Any])
    if (appliedState != null) __obj.updateDynamic("appliedState")(appliedState.asInstanceOf[js.Any])
    if (deviceSettings != null) __obj.updateDynamic("deviceSettings")(deviceSettings.asInstanceOf[js.Any])
    if (disabledReason != null) __obj.updateDynamic("disabledReason")(disabledReason.asInstanceOf[js.Any])
    if (displays != null) __obj.updateDynamic("displays")(displays.asInstanceOf[js.Any])
    if (enrollmentTime != null) __obj.updateDynamic("enrollmentTime")(enrollmentTime.asInstanceOf[js.Any])
    if (enrollmentTokenData != null) __obj.updateDynamic("enrollmentTokenData")(enrollmentTokenData.asInstanceOf[js.Any])
    if (enrollmentTokenName != null) __obj.updateDynamic("enrollmentTokenName")(enrollmentTokenName.asInstanceOf[js.Any])
    if (hardwareInfo != null) __obj.updateDynamic("hardwareInfo")(hardwareInfo.asInstanceOf[js.Any])
    if (hardwareStatusSamples != null) __obj.updateDynamic("hardwareStatusSamples")(hardwareStatusSamples.asInstanceOf[js.Any])
    if (lastPolicyComplianceReportTime != null) __obj.updateDynamic("lastPolicyComplianceReportTime")(lastPolicyComplianceReportTime.asInstanceOf[js.Any])
    if (lastPolicySyncTime != null) __obj.updateDynamic("lastPolicySyncTime")(lastPolicySyncTime.asInstanceOf[js.Any])
    if (lastStatusReportTime != null) __obj.updateDynamic("lastStatusReportTime")(lastStatusReportTime.asInstanceOf[js.Any])
    if (managementMode != null) __obj.updateDynamic("managementMode")(managementMode.asInstanceOf[js.Any])
    if (memoryEvents != null) __obj.updateDynamic("memoryEvents")(memoryEvents.asInstanceOf[js.Any])
    if (memoryInfo != null) __obj.updateDynamic("memoryInfo")(memoryInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (networkInfo != null) __obj.updateDynamic("networkInfo")(networkInfo.asInstanceOf[js.Any])
    if (nonComplianceDetails != null) __obj.updateDynamic("nonComplianceDetails")(nonComplianceDetails.asInstanceOf[js.Any])
    if (!js.isUndefined(policyCompliant)) __obj.updateDynamic("policyCompliant")(policyCompliant.get.asInstanceOf[js.Any])
    if (policyName != null) __obj.updateDynamic("policyName")(policyName.asInstanceOf[js.Any])
    if (powerManagementEvents != null) __obj.updateDynamic("powerManagementEvents")(powerManagementEvents.asInstanceOf[js.Any])
    if (previousDeviceNames != null) __obj.updateDynamic("previousDeviceNames")(previousDeviceNames.asInstanceOf[js.Any])
    if (softwareInfo != null) __obj.updateDynamic("softwareInfo")(softwareInfo.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDevice]
  }
}

