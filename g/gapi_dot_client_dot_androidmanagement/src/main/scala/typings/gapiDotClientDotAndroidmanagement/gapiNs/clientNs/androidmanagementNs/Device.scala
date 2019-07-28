package typings.gapiDotClientDotAndroidmanagement.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /** The API level of the Android platform version running on the device. */
  var apiLevel: js.UndefOr[Double] = js.undefined
  /** The name of the policy that is currently applied by the device. */
  var appliedPolicyName: js.UndefOr[String] = js.undefined
  /** The version of the policy that is currently applied by the device. */
  var appliedPolicyVersion: js.UndefOr[String] = js.undefined
  /** The state that is currently applied by the device. */
  var appliedState: js.UndefOr[String] = js.undefined
  /**
    * If the device state is DISABLED, an optional message that is displayed on the device indicating the reason the device is disabled. This field may be
    * modified by an update request.
    */
  var disabledReason: js.UndefOr[UserFacingMessage] = js.undefined
  /** Displays on the device. This information is only available when displayInfoEnabled is true in the device's policy. */
  var displays: js.UndefOr[js.Array[Display]] = js.undefined
  /** The time of device enrollment. */
  var enrollmentTime: js.UndefOr[String] = js.undefined
  /** If this device was enrolled with an enrollment token with additional data provided, this field contains that data. */
  var enrollmentTokenData: js.UndefOr[String] = js.undefined
  /** If this device was enrolled with an enrollment token, this field contains the name of the token. */
  var enrollmentTokenName: js.UndefOr[String] = js.undefined
  /** Detailed information about the device hardware. */
  var hardwareInfo: js.UndefOr[HardwareInfo] = js.undefined
  /** Hardware status samples in chronological order. This information is only available when hardwareStatusEnabled is true in the device's policy. */
  var hardwareStatusSamples: js.UndefOr[js.Array[HardwareStatus]] = js.undefined
  /** The last time the device sent a policy compliance report. */
  var lastPolicyComplianceReportTime: js.UndefOr[String] = js.undefined
  /** The last time the device fetched its policy. */
  var lastPolicySyncTime: js.UndefOr[String] = js.undefined
  /** The last time the device sent a status report. */
  var lastStatusReportTime: js.UndefOr[String] = js.undefined
  /**
    * Events related to memory and storage measurements in chronological order. This information is only available when memoryInfoEnabled is true in the
    * device's policy.
    */
  var memoryEvents: js.UndefOr[js.Array[MemoryEvent]] = js.undefined
  /** Memory information. This information is only available when memoryInfoEnabled is true in the device's policy. */
  var memoryInfo: js.UndefOr[MemoryInfo] = js.undefined
  /** The name of the device in the form enterprises/{enterpriseId}/devices/{deviceId} */
  var name: js.UndefOr[String] = js.undefined
  /** Device network information. This information is only available when networkInfoEnabled is true in the device's policy. */
  var networkInfo: js.UndefOr[NetworkInfo] = js.undefined
  /** Details about policy settings for which the device is not in compliance. */
  var nonComplianceDetails: js.UndefOr[js.Array[NonComplianceDetail]] = js.undefined
  /** Whether the device is compliant with its policy. */
  var policyCompliant: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the policy that is intended to be applied to the device. If empty, the policy with id default is applied. This field may be modified by an
    * update request. The name of the policy is in the form enterprises/{enterpriseId}/policies/{policyId}. It is also permissible to only specify the
    * policyId when updating this field as long as the policyId contains no slashes since the rest of the policy name can be inferred from context.
    */
  var policyName: js.UndefOr[String] = js.undefined
  /**
    * Power management events on the device in chronological order. This information is only available when powerManagementEventsEnabled is true in the
    * device's policy.
    */
  var powerManagementEvents: js.UndefOr[js.Array[PowerManagementEvent]] = js.undefined
  /**
    * The previous device names used for the same physical device when it has been enrolled multiple times. The serial number is used as the unique
    * identifier to determine if the same physical device has enrolled previously. The names are in chronological order.
    */
  var previousDeviceNames: js.UndefOr[js.Array[String]] = js.undefined
  /** Detailed information about the device software. This information is only available when softwareInfoEnabled is true in the device's policy. */
  var softwareInfo: js.UndefOr[SoftwareInfo] = js.undefined
  /**
    * The state that is intended to be applied to the device. This field may be modified by an update request. Note that UpdateDevice only handles toggling
    * between ACTIVE and DISABLED states. Use the delete device method to cause the device to enter the DELETED state.
    */
  var state: js.UndefOr[String] = js.undefined
  /**
    * The resource name of the user of the device in the form enterprises/{enterpriseId}/users/{userId}. This is the name of the device account automatically
    * created for this device.
    */
  var userName: js.UndefOr[String] = js.undefined
}

object Device {
  @scala.inline
  def apply(
    apiLevel: Int | Double = null,
    appliedPolicyName: String = null,
    appliedPolicyVersion: String = null,
    appliedState: String = null,
    disabledReason: UserFacingMessage = null,
    displays: js.Array[Display] = null,
    enrollmentTime: String = null,
    enrollmentTokenData: String = null,
    enrollmentTokenName: String = null,
    hardwareInfo: HardwareInfo = null,
    hardwareStatusSamples: js.Array[HardwareStatus] = null,
    lastPolicyComplianceReportTime: String = null,
    lastPolicySyncTime: String = null,
    lastStatusReportTime: String = null,
    memoryEvents: js.Array[MemoryEvent] = null,
    memoryInfo: MemoryInfo = null,
    name: String = null,
    networkInfo: NetworkInfo = null,
    nonComplianceDetails: js.Array[NonComplianceDetail] = null,
    policyCompliant: js.UndefOr[Boolean] = js.undefined,
    policyName: String = null,
    powerManagementEvents: js.Array[PowerManagementEvent] = null,
    previousDeviceNames: js.Array[String] = null,
    softwareInfo: SoftwareInfo = null,
    state: String = null,
    userName: String = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (apiLevel != null) __obj.updateDynamic("apiLevel")(apiLevel.asInstanceOf[js.Any])
    if (appliedPolicyName != null) __obj.updateDynamic("appliedPolicyName")(appliedPolicyName)
    if (appliedPolicyVersion != null) __obj.updateDynamic("appliedPolicyVersion")(appliedPolicyVersion)
    if (appliedState != null) __obj.updateDynamic("appliedState")(appliedState)
    if (disabledReason != null) __obj.updateDynamic("disabledReason")(disabledReason)
    if (displays != null) __obj.updateDynamic("displays")(displays)
    if (enrollmentTime != null) __obj.updateDynamic("enrollmentTime")(enrollmentTime)
    if (enrollmentTokenData != null) __obj.updateDynamic("enrollmentTokenData")(enrollmentTokenData)
    if (enrollmentTokenName != null) __obj.updateDynamic("enrollmentTokenName")(enrollmentTokenName)
    if (hardwareInfo != null) __obj.updateDynamic("hardwareInfo")(hardwareInfo)
    if (hardwareStatusSamples != null) __obj.updateDynamic("hardwareStatusSamples")(hardwareStatusSamples)
    if (lastPolicyComplianceReportTime != null) __obj.updateDynamic("lastPolicyComplianceReportTime")(lastPolicyComplianceReportTime)
    if (lastPolicySyncTime != null) __obj.updateDynamic("lastPolicySyncTime")(lastPolicySyncTime)
    if (lastStatusReportTime != null) __obj.updateDynamic("lastStatusReportTime")(lastStatusReportTime)
    if (memoryEvents != null) __obj.updateDynamic("memoryEvents")(memoryEvents)
    if (memoryInfo != null) __obj.updateDynamic("memoryInfo")(memoryInfo)
    if (name != null) __obj.updateDynamic("name")(name)
    if (networkInfo != null) __obj.updateDynamic("networkInfo")(networkInfo)
    if (nonComplianceDetails != null) __obj.updateDynamic("nonComplianceDetails")(nonComplianceDetails)
    if (!js.isUndefined(policyCompliant)) __obj.updateDynamic("policyCompliant")(policyCompliant)
    if (policyName != null) __obj.updateDynamic("policyName")(policyName)
    if (powerManagementEvents != null) __obj.updateDynamic("powerManagementEvents")(powerManagementEvents)
    if (previousDeviceNames != null) __obj.updateDynamic("previousDeviceNames")(previousDeviceNames)
    if (softwareInfo != null) __obj.updateDynamic("softwareInfo")(softwareInfo)
    if (state != null) __obj.updateDynamic("state")(state)
    if (userName != null) __obj.updateDynamic("userName")(userName)
    __obj.asInstanceOf[Device]
  }
}

