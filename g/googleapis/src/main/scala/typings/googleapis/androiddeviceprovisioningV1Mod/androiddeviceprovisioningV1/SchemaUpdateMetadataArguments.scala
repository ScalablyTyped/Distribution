package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies metdata updates to one device.
  */
@js.native
trait SchemaUpdateMetadataArguments extends js.Object {
  /**
    * Device ID of the device.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * Device identifier.
    */
  var deviceIdentifier: js.UndefOr[SchemaDeviceIdentifier] = js.native
  /**
    * Required. The metadata to update.
    */
  var deviceMetadata: js.UndefOr[SchemaDeviceMetadata] = js.native
}

object SchemaUpdateMetadataArguments {
  @scala.inline
  def apply(
    deviceId: String = null,
    deviceIdentifier: SchemaDeviceIdentifier = null,
    deviceMetadata: SchemaDeviceMetadata = null
  ): SchemaUpdateMetadataArguments = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceIdentifier != null) __obj.updateDynamic("deviceIdentifier")(deviceIdentifier.asInstanceOf[js.Any])
    if (deviceMetadata != null) __obj.updateDynamic("deviceMetadata")(deviceMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUpdateMetadataArguments]
  }
}

