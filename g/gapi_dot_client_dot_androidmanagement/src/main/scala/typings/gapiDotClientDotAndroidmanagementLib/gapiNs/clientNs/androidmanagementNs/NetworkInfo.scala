package typings
package gapiDotClientDotAndroidmanagementLib.gapiNs.clientNs.androidmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInfo extends js.Object {
  /** IMEI number of the GSM device, e.g. A1000031212. */
  var imei: js.UndefOr[java.lang.String] = js.undefined
  /** MEID number of the CDMA device, e.g. A00000292788E1. */
  var meid: js.UndefOr[java.lang.String] = js.undefined
  /** WiFi MAC address of the device, e.g. 7c:11:11:11:11:11. */
  var wifiMacAddress: js.UndefOr[java.lang.String] = js.undefined
}

object NetworkInfo {
  @scala.inline
  def apply(
    imei: java.lang.String = null,
    meid: java.lang.String = null,
    wifiMacAddress: java.lang.String = null
  ): NetworkInfo = {
    val __obj = js.Dynamic.literal()
    if (imei != null) __obj.updateDynamic("imei")(imei)
    if (meid != null) __obj.updateDynamic("meid")(meid)
    if (wifiMacAddress != null) __obj.updateDynamic("wifiMacAddress")(wifiMacAddress)
    __obj.asInstanceOf[NetworkInfo]
  }
}

