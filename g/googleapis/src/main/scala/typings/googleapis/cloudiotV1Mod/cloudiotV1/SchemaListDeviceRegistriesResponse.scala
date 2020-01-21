package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for `ListDeviceRegistries`.
  */
@js.native
trait SchemaListDeviceRegistriesResponse extends js.Object {
  /**
    * The registries that matched the query.
    */
  var deviceRegistries: js.UndefOr[js.Array[SchemaDeviceRegistry]] = js.native
  /**
    * If not empty, indicates that there may be more registries that match the
    * request; this value should be passed in a new
    * `ListDeviceRegistriesRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDeviceRegistriesResponse {
  @scala.inline
  def apply(deviceRegistries: js.Array[SchemaDeviceRegistry] = null, nextPageToken: String = null): SchemaListDeviceRegistriesResponse = {
    val __obj = js.Dynamic.literal()
    if (deviceRegistries != null) __obj.updateDynamic("deviceRegistries")(deviceRegistries.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDeviceRegistriesResponse]
  }
}

