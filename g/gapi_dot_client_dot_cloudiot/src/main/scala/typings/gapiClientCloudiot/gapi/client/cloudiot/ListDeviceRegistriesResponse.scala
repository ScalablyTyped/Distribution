package typings.gapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeviceRegistriesResponse extends js.Object {
  /** The registries that matched the query. */
  var deviceRegistries: js.UndefOr[js.Array[DeviceRegistry]] = js.undefined
  /**
    * If not empty, indicates that there may be more registries that match the
    * request; this value should be passed in a new
    * `ListDeviceRegistriesRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListDeviceRegistriesResponse {
  @scala.inline
  def apply(deviceRegistries: js.Array[DeviceRegistry] = null, nextPageToken: String = null): ListDeviceRegistriesResponse = {
    val __obj = js.Dynamic.literal()
    if (deviceRegistries != null) __obj.updateDynamic("deviceRegistries")(deviceRegistries.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeviceRegistriesResponse]
  }
}

