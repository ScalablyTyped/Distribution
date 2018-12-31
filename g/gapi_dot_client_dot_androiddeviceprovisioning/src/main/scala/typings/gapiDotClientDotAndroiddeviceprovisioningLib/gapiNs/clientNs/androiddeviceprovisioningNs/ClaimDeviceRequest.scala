package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimDeviceRequest extends js.Object {
  /** The customer to claim for. */
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  /** The device identifier of the device to claim. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  /** The section to claim. */
  var sectionType: js.UndefOr[java.lang.String] = js.undefined
}

