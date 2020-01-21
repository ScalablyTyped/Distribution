package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to set metadata for a device.
  */
@js.native
trait SchemaUpdateDeviceMetadataRequest extends js.Object {
  /**
    * Required. The metdata to attach to the device.
    */
  var deviceMetadata: js.UndefOr[SchemaDeviceMetadata] = js.native
}

object SchemaUpdateDeviceMetadataRequest {
  @scala.inline
  def apply(deviceMetadata: SchemaDeviceMetadata = null): SchemaUpdateDeviceMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateDeviceMetadataRequest]
  }
}

