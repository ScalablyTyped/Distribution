package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceIdentifier extends js.Object {
  /** IMEI number. */
  var imei: js.UndefOr[String] = js.native
  /**
    * Manufacturer name to match `android.os.Build.MANUFACTURER` (required).
    * Allowed values listed in
    * [manufacturer names](/zero-touch/resources/manufacturer-names).
    */
  var manufacturer: js.UndefOr[String] = js.native
  /** MEID number. */
  var meid: js.UndefOr[String] = js.native
  /** Serial number (optional). */
  var serialNumber: js.UndefOr[String] = js.native
}

object DeviceIdentifier {
  @scala.inline
  def apply(): DeviceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceIdentifier]
  }
  @scala.inline
  implicit class DeviceIdentifierOps[Self <: DeviceIdentifier] (val x: Self) extends AnyVal {
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
    def setImei(value: String): Self = this.set("imei", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImei: Self = this.set("imei", js.undefined)
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    @scala.inline
    def setMeid(value: String): Self = this.set("meid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeid: Self = this.set("meid", js.undefined)
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
  }
  
}

