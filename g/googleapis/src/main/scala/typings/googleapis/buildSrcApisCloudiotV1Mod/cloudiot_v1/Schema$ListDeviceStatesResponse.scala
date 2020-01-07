package typings.googleapis.buildSrcApisCloudiotV1Mod.cloudiot_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for `ListDeviceStates`.
  */
@js.native
trait Schema$ListDeviceStatesResponse extends js.Object {
  /**
    * The last few device states. States are listed in descending order of
    * server update time, starting from the most recent one.
    */
  var deviceStates: js.UndefOr[js.Array[Schema$DeviceState]] = js.native
}

object Schema$ListDeviceStatesResponse {
  @scala.inline
  def apply(deviceStates: js.Array[Schema$DeviceState] = null): Schema$ListDeviceStatesResponse = {
    val __obj = js.Dynamic.literal()
    if (deviceStates != null) __obj.updateDynamic("deviceStates")(deviceStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDeviceStatesResponse]
  }
}

