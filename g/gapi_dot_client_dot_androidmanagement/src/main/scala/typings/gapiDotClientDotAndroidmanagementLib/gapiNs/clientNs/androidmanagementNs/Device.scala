package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /** The API level of the Android platform version running on the device. */
  var apiLevel: js.UndefOr[scala.Double] = js.undefined
  /** The name of the policy that is currently applied by the device. */
  var appliedPolicyName: js.UndefOr[java.lang.String] = js.undefined
  /** The version of the policy that is currently applied by the device. */
  var appliedPolicyVersion: js.UndefOr[java.lang.String] = js.undefined
  /** The state that is currently applied by the device. */
  var appliedState: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the device state is DISABLED, an optional message that is displayed on the device indicating the reason the device is disabled. This field may be
    * modified by an update request.
    */
  var disabledReason: js.UndefOr[UserFacingMessage] = js.undefined
  /** Displays on the device. This information is only available when displayInfoEnabled is true in the device's policy. */
  var displays: js.UndefOr[js.Array[Display]] = js.undefined
  /** The time of device enrollment. */
  var enrollmentTime: js.UndefOr[java.lang.String] = js.undefined
  /** If this device was enrolled with an enrollment token with additional data provided, this field contains that data. */
  var enrollmentTokenData: js.UndefOr[java.lang.String] = js.undefined
  /** If this device was enrolled with an enrollment token, this field contains the name of the token. */
  var enrollmentTokenName: js.UndefOr[java.lang.String] = js.undefined
  /** Detailed information about the device hardware. */
  var hardwareInfo: js.UndefOr[HardwareInfo] = js.undefined
  /** Hardware status samples in chronological order. This information is only available when hardwareStatusEnabled is true in the device's policy. */
  var hardwareStatusSamples: js.UndefOr[js.Array[HardwareStatus]] = js.undefined
  /** The last time the device sent a policy compliance report. */
  var lastPolicyComplianceReportTime: js.UndefOr[java.lang.String] = js.undefined
  /** The last time the device fetched its policy. */
  var lastPolicySyncTime: js.UndefOr[java.lang.String] = js.undefined
  /** The last time the device sent a status report. */
  var lastStatusReportTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Events related to memory and storage measurements in chronological order. This information is only available when memoryInfoEnabled is true in the
    * device's policy.
    */
  var memoryEvents: js.UndefOr[js.Array[MemoryEvent]] = js.undefined
  /** Memory information. This information is only available when memoryInfoEnabled is true in the device's policy. */
  var memoryInfo: js.UndefOr[MemoryInfo] = js.undefined
  /** The name of the device in the form enterprises/{enterpriseId}/devices/{deviceId} */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Device network information. This information is only available when networkInfoEnabled is true in the device's policy. */
  var networkInfo: js.UndefOr[NetworkInfo] = js.undefined
  /** Details about policy settings for which the device is not in compliance. */
  var nonComplianceDetails: js.UndefOr[js.Array[NonComplianceDetail]] = js.undefined
  /** Whether the device is compliant with its policy. */
  var policyCompliant: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the policy that is intended to be applied to the device. If empty, the policy with id default is applied. This field may be modified by an
    * update request. The name of the policy is in the form enterprises/{enterpriseId}/policies/{policyId}. It is also permissible to only specify the
    * policyId when updating this field as long as the policyId contains no slashes since the rest of the policy name can be inferred from context.
    */
  var policyName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Power management events on the device in chronological order. This information is only available when powerManagementEventsEnabled is true in the
    * device's policy.
    */
  var powerManagementEvents: js.UndefOr[js.Array[PowerManagementEvent]] = js.undefined
  /**
    * The previous device names used for the same physical device when it has been enrolled multiple times. The serial number is used as the unique
    * identifier to determine if the same physical device has enrolled previously. The names are in chronological order.
    */
  var previousDeviceNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Detailed information about the device software. This information is only available when softwareInfoEnabled is true in the device's policy. */
  var softwareInfo: js.UndefOr[SoftwareInfo] = js.undefined
  /**
    * The state that is intended to be applied to the device. This field may be modified by an update request. Note that UpdateDevice only handles toggling
    * between ACTIVE and DISABLED states. Use the delete device method to cause the device to enter the DELETED state.
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The resource name of the user of the device in the form enterprises/{enterpriseId}/users/{userId}. This is the name of the device account automatically
    * created for this device.
    */
  var userName: js.UndefOr[java.lang.String] = js.undefined
}

