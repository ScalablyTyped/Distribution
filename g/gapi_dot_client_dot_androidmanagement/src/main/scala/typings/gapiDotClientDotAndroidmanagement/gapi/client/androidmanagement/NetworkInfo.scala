package typings.gapiDotClientDotAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInfo extends js.Object {
  /** IMEI number of the GSM device, e.g. A1000031212. */
  var imei: js.UndefOr[String] = js.undefined
  /** MEID number of the CDMA device, e.g. A00000292788E1. */
  var meid: js.UndefOr[String] = js.undefined
  /** WiFi MAC address of the device, e.g. 7c:11:11:11:11:11. */
  var wifiMacAddress: js.UndefOr[String] = js.undefined
}

object NetworkInfo {
  @scala.inline
  def apply(imei: String = null, meid: String = null, wifiMacAddress: String = null): NetworkInfo = {
    val __obj = js.Dynamic.literal()
    if (imei != null) __obj.updateDynamic("imei")(imei.asInstanceOf[js.Any])
    if (meid != null) __obj.updateDynamic("meid")(meid.asInstanceOf[js.Any])
    if (wifiMacAddress != null) __obj.updateDynamic("wifiMacAddress")(wifiMacAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInfo]
  }
}

