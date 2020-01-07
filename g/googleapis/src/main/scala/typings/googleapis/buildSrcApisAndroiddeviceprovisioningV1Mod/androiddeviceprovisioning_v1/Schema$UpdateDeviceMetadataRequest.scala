package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to set metadata for a device.
  */
@js.native
trait Schema$UpdateDeviceMetadataRequest extends js.Object {
  /**
    * Required. The metdata to attach to the device.
    */
  var deviceMetadata: js.UndefOr[Schema$DeviceMetadata] = js.native
}

object Schema$UpdateDeviceMetadataRequest {
  @scala.inline
  def apply(deviceMetadata: Schema$DeviceMetadata = null): Schema$UpdateDeviceMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateDeviceMetadataRequest]
  }
}

