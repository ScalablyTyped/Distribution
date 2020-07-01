package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response containing found devices.
  */
@js.native
trait SchemaFindDevicesByDeviceIdentifierResponse extends js.Object {
  /**
    * Found devices.
    */
  var devices: js.UndefOr[js.Array[SchemaDevice]] = js.native
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

object SchemaFindDevicesByDeviceIdentifierResponse {
  @scala.inline
  def apply(
    devices: js.Array[SchemaDevice] = null,
    nextPageToken: String = null,
    totalSize: js.UndefOr[Double] = js.undefined
  ): SchemaFindDevicesByDeviceIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    if (devices != null) __obj.updateDynamic("devices")(devices.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(totalSize)) __obj.updateDynamic("totalSize")(totalSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFindDevicesByDeviceIdentifierResponse]
  }
}

