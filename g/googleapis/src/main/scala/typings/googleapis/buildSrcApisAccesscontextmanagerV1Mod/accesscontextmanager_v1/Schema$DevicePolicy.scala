package typings.googleapis.buildSrcApisAccesscontextmanagerV1Mod.accesscontextmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `DevicePolicy` specifies device specific restrictions necessary to acquire
  * a given access level. A `DevicePolicy` specifies requirements for requests
  * from devices to be granted access levels, it does not do any enforcement on
  * the device. `DevicePolicy` acts as an AND over all specified fields, and
  * each repeated field is an OR over its elements. Any unset fields are
  * ignored. For example, if the proto is { os_type : DESKTOP_WINDOWS, os_type
  * : DESKTOP_LINUX, encryption_status: ENCRYPTED}, then the DevicePolicy will
  * be true for requests originating from encrypted Linux desktops and
  * encrypted Windows desktops.
  */
@js.native
trait Schema$DevicePolicy extends js.Object {
  /**
    * Allowed device management levels, an empty list allows all management
    * levels.
    */
  var allowedDeviceManagementLevels: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allowed encryptions statuses, an empty list allows all statuses.
    */
  var allowedEncryptionStatuses: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allowed OS versions, an empty list allows all types and all versions.
    */
  var osConstraints: js.UndefOr[js.Array[Schema$OsConstraint]] = js.native
  /**
    * Whether the device needs to be approved by the customer admin.
    */
  var requireAdminApproval: js.UndefOr[Boolean] = js.native
  /**
    * Whether the device needs to be corp owned.
    */
  var requireCorpOwned: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not screenlock is required for the DevicePolicy to be true.
    * Defaults to `false`.
    */
  var requireScreenlock: js.UndefOr[Boolean] = js.native
}

object Schema$DevicePolicy {
  @scala.inline
  def apply(
    allowedDeviceManagementLevels: js.Array[String] = null,
    allowedEncryptionStatuses: js.Array[String] = null,
    osConstraints: js.Array[Schema$OsConstraint] = null,
    requireAdminApproval: js.UndefOr[Boolean] = js.undefined,
    requireCorpOwned: js.UndefOr[Boolean] = js.undefined,
    requireScreenlock: js.UndefOr[Boolean] = js.undefined
  ): Schema$DevicePolicy = {
    val __obj = js.Dynamic.literal()
    if (allowedDeviceManagementLevels != null) __obj.updateDynamic("allowedDeviceManagementLevels")(allowedDeviceManagementLevels.asInstanceOf[js.Any])
    if (allowedEncryptionStatuses != null) __obj.updateDynamic("allowedEncryptionStatuses")(allowedEncryptionStatuses.asInstanceOf[js.Any])
    if (osConstraints != null) __obj.updateDynamic("osConstraints")(osConstraints.asInstanceOf[js.Any])
    if (!js.isUndefined(requireAdminApproval)) __obj.updateDynamic("requireAdminApproval")(requireAdminApproval.asInstanceOf[js.Any])
    if (!js.isUndefined(requireCorpOwned)) __obj.updateDynamic("requireCorpOwned")(requireCorpOwned.asInstanceOf[js.Any])
    if (!js.isUndefined(requireScreenlock)) __obj.updateDynamic("requireScreenlock")(requireScreenlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DevicePolicy]
  }
}

