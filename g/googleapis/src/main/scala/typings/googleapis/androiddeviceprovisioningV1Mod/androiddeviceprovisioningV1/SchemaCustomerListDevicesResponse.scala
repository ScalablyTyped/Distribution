package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message of customer&#39;s liting devices.
  */
@js.native
trait SchemaCustomerListDevicesResponse extends js.Object {
  /**
    * The customer&#39;s devices.
    */
  var devices: js.UndefOr[js.Array[SchemaDevice]] = js.native
  /**
    * A token used to access the next page of results. Omitted if no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaCustomerListDevicesResponse {
  @scala.inline
  def apply(devices: js.Array[SchemaDevice] = null, nextPageToken: String = null): SchemaCustomerListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    if (devices != null) __obj.updateDynamic("devices")(devices.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomerListDevicesResponse]
  }
}

