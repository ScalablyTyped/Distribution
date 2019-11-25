package typings.gapiDotClientDotAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindDevicesByDeviceIdentifierResponse extends js.Object {
  /** Found devices. */
  var devices: js.UndefOr[js.Array[Device]] = js.undefined
  /** Page token of the next page. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object FindDevicesByDeviceIdentifierResponse {
  @scala.inline
  def apply(devices: js.Array[Device] = null, nextPageToken: String = null): FindDevicesByDeviceIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    if (devices != null) __obj.updateDynamic("devices")(devices.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindDevicesByDeviceIdentifierResponse]
  }
}

