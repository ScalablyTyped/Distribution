package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindDevicesByOwnerResponse extends js.Object {
  /** Devices found. */
  var devices: js.UndefOr[js.Array[Device]] = js.undefined
  /** Page token of the next page. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object FindDevicesByOwnerResponse {
  @scala.inline
  def apply(devices: js.Array[Device] = null, nextPageToken: java.lang.String = null): FindDevicesByOwnerResponse = {
    val __obj = js.Dynamic.literal()
    if (devices != null) __obj.updateDynamic("devices")(devices)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[FindDevicesByOwnerResponse]
  }
}

