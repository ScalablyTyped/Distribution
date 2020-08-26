package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeviceMetadataRequest extends js.Object {
  /** The metdata to set. */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.native
}

object UpdateDeviceMetadataRequest {
  @scala.inline
  def apply(): UpdateDeviceMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeviceMetadataRequest]
  }
  @scala.inline
  implicit class UpdateDeviceMetadataRequestOps[Self <: UpdateDeviceMetadataRequest] (val x: Self) extends AnyVal {
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
    def setDeviceMetadata(value: DeviceMetadata): Self = this.set("deviceMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceMetadata: Self = this.set("deviceMetadata", js.undefined)
  }
  
}

