package typings.gapiDotClientDotCloudiot.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDevicesResponse extends js.Object {
  /** The devices that match the request. */
  var devices: js.UndefOr[js.Array[Device]] = js.undefined
  /**
    * If not empty, indicates that there may be more devices that match the
    * request; this value should be passed in a new `ListDevicesRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListDevicesResponse {
  @scala.inline
  def apply(devices: js.Array[Device] = null, nextPageToken: String = null): ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    if (devices != null) __obj.updateDynamic("devices")(devices)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListDevicesResponse]
  }
}

