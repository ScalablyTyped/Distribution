package typings.googleapis.buildSrcApisCloudiotV1Mod.cloudiot_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for `ListDeviceRegistries`.
  */
@js.native
trait Schema$ListDeviceRegistriesResponse extends js.Object {
  /**
    * The registries that matched the query.
    */
  var deviceRegistries: js.UndefOr[js.Array[Schema$DeviceRegistry]] = js.native
  /**
    * If not empty, indicates that there may be more registries that match the
    * request; this value should be passed in a new
    * `ListDeviceRegistriesRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListDeviceRegistriesResponse {
  @scala.inline
  def apply(deviceRegistries: js.Array[Schema$DeviceRegistry] = null, nextPageToken: String = null): Schema$ListDeviceRegistriesResponse = {
    val __obj = js.Dynamic.literal()
    if (deviceRegistries != null) __obj.updateDynamic("deviceRegistries")(deviceRegistries.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDeviceRegistriesResponse]
  }
}

