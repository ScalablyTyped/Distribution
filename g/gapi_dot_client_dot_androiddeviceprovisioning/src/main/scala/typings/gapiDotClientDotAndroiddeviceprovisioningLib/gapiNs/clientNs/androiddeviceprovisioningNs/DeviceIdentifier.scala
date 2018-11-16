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

