package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for customer to remove the configuration from device.
  */
@js.native
trait SchemaCustomerRemoveConfigurationRequest extends js.Object {
  /**
    * Required. The device to remove the configuration from.
    */
  var device: js.UndefOr[SchemaDeviceReference] = js.native
}

object SchemaCustomerRemoveConfigurationRequest {
  @scala.inline
  def apply(): SchemaCustomerRemoveConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerRemoveConfigurationRequest]
  }
  @scala.inline
  implicit class SchemaCustomerRemoveConfigurationRequestOps[Self <: SchemaCustomerRemoveConfigurationRequest] (val x: Self) extends AnyVal {
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

