package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDevicesResponse extends js.Object {
  /** The list of devices. */
  var devices: js.UndefOr[js.Array[Device]] = js.undefined
  /** If there are more results, a token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListDevicesResponse {
  @scala.inline
  def apply(devices: js.Array[Device] = null, nextPageToken: java.lang.String = null): ListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    if (devices != null) __obj.updateDynamic("devices")(devices)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListDevicesResponse]
  }
}

