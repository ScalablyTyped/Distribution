package typings
package gapiDotClientDotAndroiddeviceprovisioningLib.gapiNs.clientNs.androiddeviceprovisioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OperationPerDevice extends js.Object {
  /** Request to claim a device. */
  var claim: js.UndefOr[PartnerClaim] = js.undefined
  /** Processing result for every device. */
  var result: js.UndefOr[PerDeviceStatusInBatch] = js.undefined
  /** Request to unclaim a device. */
  var unclaim: js.UndefOr[PartnerUnclaim] = js.undefined
  /** Request to set metadata for a device. */
  var updateMetadata: js.UndefOr[UpdateMetadataArguments] = js.undefined
}

