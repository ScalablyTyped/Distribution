package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeviceMetadataInBatchRequest extends js.Object {
  /** List of metadata updates. */
  var updates: js.UndefOr[js.Array[UpdateMetadataArguments]] = js.native
}

object UpdateDeviceMetadataInBatchRequest {
  @scala.inline
  def apply(): UpdateDeviceMetadataInBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeviceMetadataInBatchRequest]
  }
  @scala.inline
  implicit class UpdateDeviceMetadataInBatchRequestOps[Self <: UpdateDeviceMetadataInBatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUpdatesVarargs(value: UpdateMetadataArguments*): Self = this.set("updates", js.Array(value :_*))
    @scala.inline
    def setUpdates(value: js.Array[UpdateMetadataArguments]): Self = this.set("updates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdates: Self = this.set("updates", js.undefined)
  }
  
}

