package typings.gapiDotClientDotAndroiddeviceprovisioning.gapiNs.clientNs.androiddeviceprovisioningNs

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
    if (imei != null) __obj.updateDynamic("imei")(imei)
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer)
    if (meid != null) __obj.updateDynamic("meid")(meid)
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber)
    __obj.asInstanceOf[DeviceIdentifier]
  }
}

