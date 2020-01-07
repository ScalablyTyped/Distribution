package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a request to list devices for a given enterprise.
  */
@js.native
trait Schema$ListDevicesResponse extends js.Object {
  /**
    * The list of devices.
    */
  var devices: js.UndefOr[js.Array[Schema$Device]] = js.native
  /**
    * If there are more results, a token to retrieve next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListDevicesResponse {
  @scala.inline
  def apply(devices: js.Array[Schema$Device] = null, nextPageToken: String = null): Schema$ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    if (devices != null) __obj.updateDynamic("devices")(devices.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDevicesResponse]
  }
}

