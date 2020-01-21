package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for `ListDeviceConfigVersions`.
  */
@js.native
trait SchemaListDeviceConfigVersionsResponse extends js.Object {
  /**
    * The device configuration for the last few versions. Versions are listed
    * in decreasing order, starting from the most recent one.
    */
  var deviceConfigs: js.UndefOr[js.Array[SchemaDeviceConfig]] = js.native
}

object SchemaListDeviceConfigVersionsResponse {
  @scala.inline
  def apply(deviceConfigs: js.Array[SchemaDeviceConfig] = null): SchemaListDeviceConfigVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (deviceConfigs != null) __obj.updateDynamic("deviceConfigs")(deviceConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDeviceConfigVersionsResponse]
  }
}

