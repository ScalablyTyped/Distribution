package typings.gapiDotClientDotAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceIdentifier extends js.Object {
  /** IMEI number. */
  var imei: js.UndefOr[String] = js.undefined
  /**
    * Manufacturer name to match `android.os.Build.MANUFACTURER` (required).
    * Allowed values listed in
    * [manufacturer names](/zero-touch/resources/manufacturer-names).
    */
  var manufacturer: js.UndefOr[String] = js.undefined
  /** MEID number. */
  var meid: js.UndefOr[String] = js.undefined
  /** Serial number (optional). */
  var serialNumber: js.UndefOr[String] = js.undefined
}

object DeviceIdentifier {
  @scala.inline
  def apply(imei: String = null, manufacturer: String = null, meid: String = null, serialNumber: String = null): DeviceIdentifier = {
    val __obj = js.Dynamic.literal()
    if (imei != null) __obj.updateDynamic("imei")(imei.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (meid != null) __obj.updateDynamic("meid")(meid.asInstanceOf[js.Any])
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceIdentifier]
  }
}

