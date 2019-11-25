package typings.gapiDotClientDotAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

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
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceMetadataRequest]
  }
}

