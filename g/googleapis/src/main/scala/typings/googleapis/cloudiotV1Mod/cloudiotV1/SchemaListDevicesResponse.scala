package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for `ListDevices`.
  */
@js.native
trait SchemaListDevicesResponse extends js.Object {
  /**
    * The devices that match the request.
    */
  var devices: js.UndefOr[js.Array[SchemaDevice]] = js.native
  /**
    * If not empty, indicates that there may be more devices that match the
    * request; this value should be passed in a new `ListDevicesRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDevicesResponse {
  @scala.inline
  def apply(devices: js.Array[SchemaDevice] = null, nextPageToken: String = null): SchemaListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    if (devices != null) __obj.updateDynamic("devices")(devices.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDevicesResponse]
  }
}

