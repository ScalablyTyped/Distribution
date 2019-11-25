package typings.gapiDotClientDotCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeviceStatesResponse extends js.Object {
  /**
    * The last few device states. States are listed in descending order of server
    * update time, starting from the most recent one.
    */
  var deviceStates: js.UndefOr[js.Array[DeviceState]] = js.undefined
}

object ListDeviceStatesResponse {
  @scala.inline
  def apply(deviceStates: js.Array[DeviceState] = null): ListDeviceStatesResponse = {
    val __obj = js.Dynamic.literal()
    if (deviceStates != null) __obj.updateDynamic("deviceStates")(deviceStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeviceStatesResponse]
  }
}

