package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to update device metadata in batch.
  */
@js.native
trait SchemaUpdateDeviceMetadataInBatchRequest extends js.Object {
  /**
    * Required. The list of metadata updates.
    */
  var updates: js.UndefOr[js.Array[SchemaUpdateMetadataArguments]] = js.native
}

object SchemaUpdateDeviceMetadataInBatchRequest {
  @scala.inline
  def apply(updates: js.Array[SchemaUpdateMetadataArguments] = null): SchemaUpdateDeviceMetadataInBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (updates != null) __obj.updateDynamic("updates")(updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateDeviceMetadataInBatchRequest]
  }
}

