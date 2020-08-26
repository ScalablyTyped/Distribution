package typings.gapiClientSpectrum.gapi.client.spectrum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceValidity extends js.Object {
  /** The descriptor of the device for which the validity check was requested. It will always be present. */
  var deviceDesc: js.UndefOr[DeviceDescriptor] = js.native
  /** The validity status: true if the device is valid for operation, false otherwise. It will always be present. */
  var isValid: js.UndefOr[Boolean] = js.native
  /**
    * If the device identifier is not valid, the database may include a reason. The reason may be in any language. The length of the value should not exceed
    * 128 characters.
    */
  var reason: js.UndefOr[String] = js.native
}

object DeviceValidity {
  @scala.inline
  def apply(): DeviceValidity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceValidity]
  }
  @scala.inline
  implicit class DeviceValidityOps[Self <: DeviceValidity] (val x: Self) extends AnyVal {
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
    def setDeviceDesc(value: DeviceDescriptor): Self = this.set("deviceDesc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceDesc: Self = this.set("deviceDesc", js.undefined)
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

