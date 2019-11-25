package typings.gapiDotClientDotAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerDeviceStatusInBatch extends js.Object {
  /** Device ID of the device if process succeeds. */
  var deviceId: js.UndefOr[String] = js.undefined
  /** Error identifier. */
  var errorIdentifier: js.UndefOr[String] = js.undefined
  /** Error message. */
  var errorMessage: js.UndefOr[String] = js.undefined
  /** Process result. */
  var status: js.UndefOr[String] = js.undefined
}

object PerDeviceStatusInBatch {
  @scala.inline
  def apply(
    deviceId: String = null,
    errorIdentifier: String = null,
    errorMessage: String = null,
    status: String = null
  ): PerDeviceStatusInBatch = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (errorIdentifier != null) __obj.updateDynamic("errorIdentifier")(errorIdentifier.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerDeviceStatusInBatch]
  }
}

