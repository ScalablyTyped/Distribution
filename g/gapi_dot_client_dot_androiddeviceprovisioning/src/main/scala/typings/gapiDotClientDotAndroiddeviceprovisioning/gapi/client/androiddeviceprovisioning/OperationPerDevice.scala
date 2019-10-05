package typings.gapiDotClientDotAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

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

object OperationPerDevice {
  @scala.inline
  def apply(
    claim: PartnerClaim = null,
    result: PerDeviceStatusInBatch = null,
    unclaim: PartnerUnclaim = null,
    updateMetadata: UpdateMetadataArguments = null
  ): OperationPerDevice = {
    val __obj = js.Dynamic.literal()
    if (claim != null) __obj.updateDynamic("claim")(claim)
    if (result != null) __obj.updateDynamic("result")(result)
    if (unclaim != null) __obj.updateDynamic("unclaim")(unclaim)
    if (updateMetadata != null) __obj.updateDynamic("updateMetadata")(updateMetadata)
    __obj.asInstanceOf[OperationPerDevice]
  }
}

