package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartnerClaim extends js.Object {
  /** Customer ID to claim for. */
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  /** Device identifier of the device. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
  /** Metadata to set at claim. */
  var deviceMetadata: js.UndefOr[DeviceMetadata] = js.undefined
  /** Section type to claim. */
  var sectionType: js.UndefOr[java.lang.String] = js.undefined
}

