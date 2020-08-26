package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message to unclaim a device.
  */
@js.native
trait SchemaUnclaimDeviceRequest extends js.Object {
  /**
    * The device ID returned by `ClaimDevice`.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * The device identifier you used when you claimed this device.
    */
  var deviceIdentifier: js.UndefOr[SchemaDeviceIdentifier] = js.native
  /**
    * Required. The section type of the device&#39;s provisioning record.
    */
  var sectionType: js.UndefOr[String] = js.native
}

object SchemaUnclaimDeviceRequest {
  @scala.inline
  def apply(): SchemaUnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnclaimDeviceRequest]
  }
  @scala.inline
  implicit class SchemaUnclaimDeviceRequestOps[Self <: SchemaUnclaimDeviceRequest] (val x: Self) extends AnyVal {
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
    def setSectionType(value: String): Self = this.set("sectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSectionType: Self = this.set("sectionType", js.undefined)
  }
  
}

