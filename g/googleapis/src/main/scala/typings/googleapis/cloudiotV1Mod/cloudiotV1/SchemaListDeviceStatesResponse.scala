package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for `ListDeviceStates`.
  */
@js.native
trait SchemaListDeviceStatesResponse extends js.Object {
  /**
    * The last few device states. States are listed in descending order of
    * server update time, starting from the most recent one.
    */
  var deviceStates: js.UndefOr[js.Array[SchemaDeviceState]] = js.native
}

object SchemaListDeviceStatesResponse {
  @scala.inline
  def apply(deviceStates: js.Array[SchemaDeviceState] = null): SchemaListDeviceStatesResponse = {
    val __obj = js.Dynamic.literal()
    if (deviceStates != null) __obj.updateDynamic("deviceStates")(deviceStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDeviceStatesResponse]
  }
}

