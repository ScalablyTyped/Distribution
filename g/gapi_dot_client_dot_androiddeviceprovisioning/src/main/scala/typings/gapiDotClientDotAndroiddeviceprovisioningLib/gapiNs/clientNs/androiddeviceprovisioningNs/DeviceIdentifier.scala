package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceIdentifier extends js.Object {
  /** IMEI number. */
  var imei: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Manufacturer name to match `android.os.Build.MANUFACTURER` (required).
    * Allowed values listed in
    * [manufacturer names](/zero-touch/resources/manufacturer-names).
    */
  var manufacturer: js.UndefOr[java.lang.String] = js.undefined
  /** MEID number. */
  var meid: js.UndefOr[java.lang.String] = js.undefined
  /** Serial number (optional). */
  var serialNumber: js.UndefOr[java.lang.String] = js.undefined
}

object DeviceIdentifier {
  @scala.inline
  def apply(
    imei: java.lang.String = null,
    manufacturer: java.lang.String = null,
    meid: java.lang.String = null,
    serialNumber: java.lang.String = null
  ): DeviceIdentifier = {
    val __obj = js.Dynamic.literal()
    if (imei != null) __obj.updateDynamic("imei")(imei)
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer)
    if (meid != null) __obj.updateDynamic("meid")(meid)
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber)
    __obj.asInstanceOf[DeviceIdentifier]
  }
}

