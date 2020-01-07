package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to update device metadata in batch.
  */
@js.native
trait Schema$UpdateDeviceMetadataInBatchRequest extends js.Object {
  /**
    * Required. The list of metadata updates.
    */
  var updates: js.UndefOr[js.Array[Schema$UpdateMetadataArguments]] = js.native
}

object Schema$UpdateDeviceMetadataInBatchRequest {
  @scala.inline
  def apply(updates: js.Array[Schema$UpdateMetadataArguments] = null): Schema$UpdateDeviceMetadataInBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (updates != null) __obj.updateDynamic("updates")(updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateDeviceMetadataInBatchRequest]
  }
}

