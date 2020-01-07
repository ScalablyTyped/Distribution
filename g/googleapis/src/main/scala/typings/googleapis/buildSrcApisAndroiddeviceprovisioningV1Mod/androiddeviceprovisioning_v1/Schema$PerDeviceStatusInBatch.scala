package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Captures the processing status for each device in the operation.
  */
@js.native
trait Schema$PerDeviceStatusInBatch extends js.Object {
  /**
    * If processing succeeds, the device ID of the device.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * If processing fails, the error type.
    */
  var errorIdentifier: js.UndefOr[String] = js.native
  /**
    * If processing fails, a developer message explaining what went wrong.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * The result status of the device after processing.
    */
  var status: js.UndefOr[String] = js.native
}

object Schema$PerDeviceStatusInBatch {
  @scala.inline
  def apply(
    deviceId: String = null,
    errorIdentifier: String = null,
    errorMessage: String = null,
    status: String = null
  ): Schema$PerDeviceStatusInBatch = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (errorIdentifier != null) __obj.updateDynamic("errorIdentifier")(errorIdentifier.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PerDeviceStatusInBatch]
  }
}

