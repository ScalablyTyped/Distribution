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
  def apply(): SchemaUpdateMetadataArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateMetadataArguments]
  }
  @scala.inline
  implicit class SchemaUpdateMetadataArgumentsOps[Self <: SchemaUpdateMetadataArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    @scala.inline
    def setDeviceIdentifier(value: SchemaDeviceIdentifier): Self = this.set("deviceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceIdentifier: Self = this.set("deviceIdentifier", js.undefined)
    @scala.inline
    def setDeviceMetadata(value: SchemaDeviceMetadata): Self = this.set("deviceMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceMetadata: Self = this.set("deviceMetadata", js.undefined)
  }
  
}

