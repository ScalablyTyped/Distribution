package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInfo extends js.Object {
  /** IMEI number of the GSM device, e.g. A1000031212. */
  var imei: js.UndefOr[String] = js.native
  /** MEID number of the CDMA device, e.g. A00000292788E1. */
  var meid: js.UndefOr[String] = js.native
  /** WiFi MAC address of the device, e.g. 7c:11:11:11:11:11. */
  var wifiMacAddress: js.UndefOr[String] = js.native
}

object NetworkInfo {
  @scala.inline
  def apply(): NetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInfo]
  }
  @scala.inline
  implicit class NetworkInfoOps[Self <: NetworkInfo] (val x: Self) extends AnyVal {
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
    def setMeid(value: String): Self = this.set("meid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeid: Self = this.set("meid", js.undefined)
    @scala.inline
    def setWifiMacAddress(value: String): Self = this.set("wifiMacAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWifiMacAddress: Self = this.set("wifiMacAddress", js.undefined)
  }
  
}

