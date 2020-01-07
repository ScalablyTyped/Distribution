package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message of customer&#39;s liting devices.
  */
@js.native
trait Schema$CustomerListDevicesResponse extends js.Object {
  /**
    * The customer&#39;s devices.
    */
  var devices: js.UndefOr[js.Array[Schema$Device]] = js.native
  /**
    * A token used to access the next page of results. Omitted if no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$CustomerListDevicesResponse {
  @scala.inline
  def apply(devices: js.Array[Schema$Device] = null, nextPageToken: String = null): Schema$CustomerListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    if (devices != null) __obj.updateDynamic("devices")(devices.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomerListDevicesResponse]
  }
}

