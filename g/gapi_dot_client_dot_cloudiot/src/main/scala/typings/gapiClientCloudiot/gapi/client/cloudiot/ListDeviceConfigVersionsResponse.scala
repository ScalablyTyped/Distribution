package typings.gapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeviceConfigVersionsResponse extends js.Object {
  /**
    * The device configuration for the last few versions. Versions are listed
    * in decreasing order, starting from the most recent one.
    */
  var deviceConfigs: js.UndefOr[js.Array[DeviceConfig]] = js.undefined
}

object ListDeviceConfigVersionsResponse {
  @scala.inline
  def apply(deviceConfigs: js.Array[DeviceConfig] = null): ListDeviceConfigVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (deviceConfigs != null) __obj.updateDynamic("deviceConfigs")(deviceConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeviceConfigVersionsResponse]
  }
}

