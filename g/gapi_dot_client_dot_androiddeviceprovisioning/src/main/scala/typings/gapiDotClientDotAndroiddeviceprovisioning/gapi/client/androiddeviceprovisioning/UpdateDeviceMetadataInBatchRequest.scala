package typings.gapiDotClientDotAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDeviceMetadataInBatchRequest extends js.Object {
  /** List of metadata updates. */
  var updates: js.UndefOr[js.Array[UpdateMetadataArguments]] = js.undefined
}

object UpdateDeviceMetadataInBatchRequest {
  @scala.inline
  def apply(updates: js.Array[UpdateMetadataArguments] = null): UpdateDeviceMetadataInBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (updates != null) __obj.updateDynamic("updates")(updates)
    __obj.asInstanceOf[UpdateDeviceMetadataInBatchRequest]
  }
}

