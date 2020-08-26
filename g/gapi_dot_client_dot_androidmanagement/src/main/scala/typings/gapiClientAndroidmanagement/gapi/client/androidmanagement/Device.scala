package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  /** The API level of the Android platform version running on the device. */
  var apiLevel: js.UndefOr[Double] = js.native
  /** The name of the policy that is currently applied by the device. */
  var appliedPolicyName: js.UndefOr[String] = js.native
  /** The version of the policy that is currently applied by the device. */
  var appliedPolicyVersion: js.UndefOr[String] = js.native
  /** The state that is currently applied by the device. */
  var appliedState: js.UndefOr[String] = js.native
  /**
    * If the device state is DISABLED, an optional message that is displayed on the device indicating the reason the device is disabled. This field may be
    * modified by an update request.
    */
  var disabledReason: js.UndefOr[UserFacingMessage] = js.native
  /** Displays on the device. This information is only available when displayInfoEnabled is true in the device's policy. */
  var displays: js.UndefOr[js.Array[Display]] = js.native
  /** The time of device enrollment. */
  var enrollmentTime: js.UndefOr[String] = js.native
  /** If this device was enrolled with an enrollment token with additional data provided, this field contains that data. */
  var enrollmentTokenData: js.UndefOr[String] = js.native
  /** If this device was enrolled with an enrollment token, this field contains the name of the token. */
  var enrollmentTokenName: js.UndefOr[String] = js.native
  /** Detailed information about the device hardware. */
  var hardwareInfo: js.UndefOr[HardwareInfo] = js.native
  /** Hardware status samples in chronological order. This information is only available when hardwareStatusEnabled is true in the device's policy. */
  var hardwareStatusSamples: js.UndefOr[js.Array[HardwareStatus]] = js.native
  /** The last time the device sent a policy compliance report. */
  var lastPolicyComplianceReportTime: js.UndefOr[String] = js.native
  /** The last time the device fetched its policy. */
  var lastPolicySyncTime: js.UndefOr[String] = js.native
  /** The last time the device sent a status report. */
  var lastStatusReportTime: js.UndefOr[String] = js.native
  /**
    * Events related to memory and storage measurements in chronological order. This information is only available when memoryInfoEnabled is true in the
    * device's policy.
    */
  var memoryEvents: js.UndefOr[js.Array[MemoryEvent]] = js.native
  /** Memory information. This information is only available when memoryInfoEnabled is true in the device's policy. */
  var memoryInfo: js.UndefOr[MemoryInfo] = js.native
  /** The name of the device in the form enterprises/{enterpriseId}/devices/{deviceId} */
  var name: js.UndefOr[String] = js.native
  /** Device network information. This information is only available when networkInfoEnabled is true in the device's policy. */
  var networkInfo: js.UndefOr[NetworkInfo] = js.native
  /** Details about policy settings for which the device is not in compliance. */
  var nonComplianceDetails: js.UndefOr[js.Array[NonComplianceDetail]] = js.native
  /** Whether the device is compliant with its policy. */
  var policyCompliant: js.UndefOr[Boolean] = js.native
  /**
    * The name of the policy that is intended to be applied to the device. If empty, the policy with id default is applied. This field may be modified by an
    * update request. The name of the policy is in the form enterprises/{enterpriseId}/policies/{policyId}. It is also permissible to only specify the
    * policyId when updating this field as long as the policyId contains no slashes since the rest of the policy name can be inferred from context.
    */
  var policyName: js.UndefOr[String] = js.native
  /**
    * Power management events on the device in chronological order. This information is only available when powerManagementEventsEnabled is true in the
    * device's policy.
    */
  var powerManagementEvents: js.UndefOr[js.Array[PowerManagementEvent]] = js.native
  /**
    * The previous device names used for the same physical device when it has been enrolled multiple times. The serial number is used as the unique
    * identifier to determine if the same physical device has enrolled previously. The names are in chronological order.
    */
  var previousDeviceNames: js.UndefOr[js.Array[String]] = js.native
  /** Detailed information about the device software. This information is only available when softwareInfoEnabled is true in the device's policy. */
  var softwareInfo: js.UndefOr[SoftwareInfo] = js.native
  /**
    * The state that is intended to be applied to the device. This field may be modified by an update request. Note that UpdateDevice only handles toggling
    * between ACTIVE and DISABLED states. Use the delete device method to cause the device to enter the DELETED state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The resource name of the user of the device in the form enterprises/{enterpriseId}/users/{userId}. This is the name of the device account automatically
    * created for this device.
    */
  var userName: js.UndefOr[String] = js.native
}

object Device {
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
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
    def setApiLevel(value: Double): Self = this.set("apiLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiLevel: Self = this.set("apiLevel", js.undefined)
    @scala.inline
    def setAppliedPolicyName(value: String): Self = this.set("appliedPolicyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppliedPolicyName: Self = this.set("appliedPolicyName", js.undefined)
    @scala.inline
    def setAppliedPolicyVersion(value: String): Self = this.set("appliedPolicyVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppliedPolicyVersion: Self = this.set("appliedPolicyVersion", js.undefined)
    @scala.inline
    def setAppliedState(value: String): Self = this.set("appliedState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppliedState: Self = this.set("appliedState", js.undefined)
    @scala.inline
    def setDisabledReason(value: UserFacingMessage): Self = this.set("disabledReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledReason: Self = this.set("disabledReason", js.undefined)
    @scala.inline
    def setDisplaysVarargs(value: Display*): Self = this.set("displays", js.Array(value :_*))
    @scala.inline
    def setDisplays(value: js.Array[Display]): Self = this.set("displays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplays: Self = this.set("displays", js.undefined)
    @scala.inline
    def setEnrollmentTime(value: String): Self = this.set("enrollmentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnrollmentTime: Self = this.set("enrollmentTime", js.undefined)
    @scala.inline
    def setEnrollmentTokenData(value: String): Self = this.set("enrollmentTokenData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnrollmentTokenData: Self = this.set("enrollmentTokenData", js.undefined)
    @scala.inline
    def setEnrollmentTokenName(value: String): Self = this.set("enrollmentTokenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnrollmentTokenName: Self = this.set("enrollmentTokenName", js.undefined)
    @scala.inline
    def setHardwareInfo(value: HardwareInfo): Self = this.set("hardwareInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardwareInfo: Self = this.set("hardwareInfo", js.undefined)
    @scala.inline
    def setHardwareStatusSamplesVarargs(value: HardwareStatus*): Self = this.set("hardwareStatusSamples", js.Array(value :_*))
    @scala.inline
    def setHardwareStatusSamples(value: js.Array[HardwareStatus]): Self = this.set("hardwareStatusSamples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardwareStatusSamples: Self = this.set("hardwareStatusSamples", js.undefined)
    @scala.inline
    def setLastPolicyComplianceReportTime(value: String): Self = this.set("lastPolicyComplianceReportTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPolicyComplianceReportTime: Self = this.set("lastPolicyComplianceReportTime", js.undefined)
    @scala.inline
    def setLastPolicySyncTime(value: String): Self = this.set("lastPolicySyncTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPolicySyncTime: Self = this.set("lastPolicySyncTime", js.undefined)
    @scala.inline
    def setLastStatusReportTime(value: String): Self = this.set("lastStatusReportTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastStatusReportTime: Self = this.set("lastStatusReportTime", js.undefined)
    @scala.inline
    def setMemoryEventsVarargs(value: MemoryEvent*): Self = this.set("memoryEvents", js.Array(value :_*))
    @scala.inline
    def setMemoryEvents(value: js.Array[MemoryEvent]): Self = this.set("memoryEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemoryEvents: Self = this.set("memoryEvents", js.undefined)
    @scala.inline
    def setMemoryInfo(value: MemoryInfo): Self = this.set("memoryInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemoryInfo: Self = this.set("memoryInfo", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetworkInfo(value: NetworkInfo): Self = this.set("networkInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInfo: Self = this.set("networkInfo", js.undefined)
    @scala.inline
    def setNonComplianceDetailsVarargs(value: NonComplianceDetail*): Self = this.set("nonComplianceDetails", js.Array(value :_*))
    @scala.inline
    def setNonComplianceDetails(value: js.Array[NonComplianceDetail]): Self = this.set("nonComplianceDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonComplianceDetails: Self = this.set("nonComplianceDetails", js.undefined)
    @scala.inline
    def setPolicyCompliant(value: Boolean): Self = this.set("policyCompliant", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyCompliant: Self = this.set("policyCompliant", js.undefined)
    @scala.inline
    def setPolicyName(value: String): Self = this.set("policyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyName: Self = this.set("policyName", js.undefined)
    @scala.inline
    def setPowerManagementEventsVarargs(value: PowerManagementEvent*): Self = this.set("powerManagementEvents", js.Array(value :_*))
    @scala.inline
    def setPowerManagementEvents(value: js.Array[PowerManagementEvent]): Self = this.set("powerManagementEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePowerManagementEvents: Self = this.set("powerManagementEvents", js.undefined)
    @scala.inline
    def setPreviousDeviceNamesVarargs(value: String*): Self = this.set("previousDeviceNames", js.Array(value :_*))
    @scala.inline
    def setPreviousDeviceNames(value: js.Array[String]): Self = this.set("previousDeviceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousDeviceNames: Self = this.set("previousDeviceNames", js.undefined)
    @scala.inline
    def setSoftwareInfo(value: SoftwareInfo): Self = this.set("softwareInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoftwareInfo: Self = this.set("softwareInfo", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
  
}

