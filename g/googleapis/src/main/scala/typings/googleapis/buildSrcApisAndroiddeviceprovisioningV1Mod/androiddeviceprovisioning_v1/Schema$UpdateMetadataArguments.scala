package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies metdata updates to one device.
  */
@js.native
trait Schema$UpdateMetadataArguments extends js.Object {
  /**
    * Device ID of the device.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * Device identifier.
    */
  var deviceIdentifier: js.UndefOr[Schema$DeviceIdentifier] = js.native
  /**
    * Required. The metadata to update.
    */
  var deviceMetadata: js.UndefOr[Schema$DeviceMetadata] = js.native
}

object Schema$UpdateMetadataArguments {
  @scala.inline
  def apply(
    deviceId: String = null,
    deviceIdentifier: Schema$DeviceIdentifier = null,
    deviceMetadata: Schema$DeviceMetadata = null
  ): Schema$UpdateMetadataArguments = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier.asInstanceOf[js.Any])
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateMetadataArguments]
  }
}

