package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Device network info.
  */
@js.native
trait SchemaNetworkInfo extends js.Object {
  /**
    * IMEI number of the GSM device. For example, A1000031212.
    */
  var imei: js.UndefOr[String] = js.native
  /**
    * MEID number of the CDMA device. For example, A00000292788E1.
    */
  var meid: js.UndefOr[String] = js.native
  /**
    * Alphabetic name of current registered operator. For example, Vodafone.
    */
  var networkOperatorName: js.UndefOr[String] = js.native
  /**
    * Wi-Fi MAC address of the device. For example, 7c:11:11:11:11:11.
    */
  var wifiMacAddress: js.UndefOr[String] = js.native
}

object SchemaNetworkInfo {
  @scala.inline
  def apply(
    imei: String = null,
    meid: String = null,
    networkOperatorName: String = null,
    wifiMacAddress: String = null
  ): SchemaNetworkInfo = {
    val __obj = js.Dynamic.literal()
    if (imei != null) __obj.updateDynamic("imei")(imei.asInstanceOf[js.Any])
    if (meid != null) __obj.updateDynamic("meid")(meid.asInstanceOf[js.Any])
    if (networkOperatorName != null) __obj.updateDynamic("networkOperatorName")(networkOperatorName.asInstanceOf[js.Any])
    if (wifiMacAddress != null) __obj.updateDynamic("wifiMacAddress")(wifiMacAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworkInfo]
  }
}

