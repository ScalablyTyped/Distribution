package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response containing found devices.
  */
@js.native
trait Schema$FindDevicesByDeviceIdentifierResponse extends js.Object {
  /**
    * Found devices.
    */
  var devices: js.UndefOr[js.Array[Schema$Device]] = js.native
  /**
    * A token used to access the next page of results. Omitted if no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total count of items in the list irrespective of pagination.
    */
  var totalSize: js.UndefOr[Double] = js.native
}

object Schema$FindDevicesByDeviceIdentifierResponse {
  @scala.inline
  def apply(
    devices: js.Array[Schema$Device] = null,
    nextPageToken: String = null,
    totalSize: Int | Double = null
  ): Schema$FindDevicesByDeviceIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    if (devices != null) __obj.updateDynamic("devices")(devices.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FindDevicesByDeviceIdentifierResponse]
  }
}

