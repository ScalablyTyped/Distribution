package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /** Claims. */
  var claims: js.UndefOr[js.Array[DeviceClaim]] = js.undefined
  /**
    * The resource name of the configuration.
    * Only set for customers.
    */
  var configuration: js.UndefOr[java.lang.String] = js.undefined
  /** Device ID. */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /** Device identifier. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  /** Device metadata. */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.undefined
  /** Resource name in `partners/[PARTNER_ID]/devices/[DEVICE_ID]`. */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

