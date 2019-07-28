package typings.gapiDotClientDotAndroiddeviceprovisioning.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDeviceMetadataRequest extends js.Object {
  /** The metdata to set. */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.undefined
}

object UpdateDeviceMetadataRequest {
  @scala.inline
  def apply(deviceMetadata: DeviceMetadata = null): UpdateDeviceMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata)
    __obj.asInstanceOf[UpdateDeviceMetadataRequest]
  }
}

