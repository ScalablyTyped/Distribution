package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindDevicesByDeviceIdentifierResponse extends js.Object {
  /** Found devices. */
  var devices: js.UndefOr[js.Array[Device]] = js.native
  /** Page token of the next page. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object FindDevicesByDeviceIdentifierResponse {
  @scala.inline
  def apply(): FindDevicesByDeviceIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindDevicesByDeviceIdentifierResponse]
  }
  @scala.inline
  implicit class FindDevicesByDeviceIdentifierResponseOps[Self <: FindDevicesByDeviceIdentifierResponse] (val x: Self) extends AnyVal {
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
    def setDevicesVarargs(value: Device*): Self = this.set("devices", js.Array(value :_*))
    @scala.inline
    def setDevices(value: js.Array[Device]): Self = this.set("devices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevices: Self = this.set("devices", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

