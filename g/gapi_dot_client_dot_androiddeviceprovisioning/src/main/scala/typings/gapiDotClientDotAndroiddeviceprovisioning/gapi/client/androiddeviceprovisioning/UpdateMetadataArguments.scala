package typings.gapiDotClientDotAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateMetadataArguments extends js.Object {
  /** Device ID of the device. */
  var deviceId: js.UndefOr[String] = js.undefined
  /** Device identifier. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  /** The metadata to update. */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.undefined
}

object UpdateMetadataArguments {
  @scala.inline
  def apply(
    deviceId: String = null,
    deviceIdentifier: DeviceIdentifier = null,
    deviceMetadata: DeviceMetadata = null
  ): UpdateMetadataArguments = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier.asInstanceOf[js.Any])
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMetadataArguments]
  }
}

