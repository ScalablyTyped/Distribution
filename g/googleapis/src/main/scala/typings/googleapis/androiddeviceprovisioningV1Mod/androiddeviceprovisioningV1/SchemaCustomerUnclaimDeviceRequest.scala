package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for customer to unclaim a device.
  */
@js.native
trait SchemaCustomerUnclaimDeviceRequest extends js.Object {
  /**
    * Required. The device to unclaim.
    */
  var device: js.UndefOr[SchemaDeviceReference] = js.native
}

object SchemaCustomerUnclaimDeviceRequest {
  @scala.inline
  def apply(): SchemaCustomerUnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerUnclaimDeviceRequest]
  }
  @scala.inline
  implicit class SchemaCustomerUnclaimDeviceRequestOps[Self <: SchemaCustomerUnclaimDeviceRequest] (val x: Self) extends AnyVal {
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
    def setDevice(value: SchemaDeviceReference): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
  }
  
}

