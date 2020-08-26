package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  /** Claims. */
  var claims: js.UndefOr[js.Array[DeviceClaim]] = js.native
  /**
    * The resource name of the configuration.
    * Only set for customers.
    */
  var configuration: js.UndefOr[String] = js.native
  /** Device ID. */
  var deviceId: js.UndefOr[String] = js.native
  /** Device identifier. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.native
  /** Device metadata. */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.native
  /** Resource name in `partners/[PARTNER_ID]/devices/[DEVICE_ID]`. */
  var name: js.UndefOr[String] = js.native
}

object Device {
  @scala.inline
  def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
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
    def setClaimsVarargs(value: DeviceClaim*): Self = this.set("claims", js.Array(value :_*))
    @scala.inline
    def setClaims(value: js.Array[DeviceClaim]): Self = this.set("claims", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClaims: Self = this.set("claims", js.undefined)
    @scala.inline
    def setConfiguration(value: String): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    @scala.inline
    def setDeviceIdentifier(value: DeviceIdentifier): Self = this.set("deviceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceIdentifier: Self = this.set("deviceIdentifier", js.undefined)
    @scala.inline
    def setDeviceMetadata(value: DeviceMetadata): Self = this.set("deviceMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceMetadata: Self = this.set("deviceMetadata", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

