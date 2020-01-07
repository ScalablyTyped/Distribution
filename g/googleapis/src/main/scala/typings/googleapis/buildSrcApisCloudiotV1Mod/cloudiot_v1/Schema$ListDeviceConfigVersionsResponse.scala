package typings.googleapis.buildSrcApisCloudiotV1Mod.cloudiot_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for `ListDeviceConfigVersions`.
  */
@js.native
trait Schema$ListDeviceConfigVersionsResponse extends js.Object {
  /**
    * The device configuration for the last few versions. Versions are listed
    * in decreasing order, starting from the most recent one.
    */
  var deviceConfigs: js.UndefOr[js.Array[Schema$DeviceConfig]] = js.native
}

object Schema$ListDeviceConfigVersionsResponse {
  @scala.inline
  def apply(deviceConfigs: js.Array[Schema$DeviceConfig] = null): Schema$ListDeviceConfigVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (deviceConfigs != null) __obj.updateDynamic("deviceConfigs")(deviceConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDeviceConfigVersionsResponse]
  }
}

