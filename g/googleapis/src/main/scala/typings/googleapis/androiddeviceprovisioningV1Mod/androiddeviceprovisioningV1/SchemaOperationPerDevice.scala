package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A task for each device in the operation. Corresponds to each device change
  * in the request.
  */
@js.native
trait SchemaOperationPerDevice extends js.Object {
  /**
    * A copy of the original device-claim request received by the server.
    */
  var claim: js.UndefOr[SchemaPartnerClaim] = js.native
  /**
    * The processing result for each device.
    */
  var result: js.UndefOr[SchemaPerDeviceStatusInBatch] = js.native
  /**
    * A copy of the original device-unclaim request received by the server.
    */
  var unclaim: js.UndefOr[SchemaPartnerUnclaim] = js.native
  /**
    * A copy of the original metadata-update request received by the server.
    */
  var updateMetadata: js.UndefOr[SchemaUpdateMetadataArguments] = js.native
}

object SchemaOperationPerDevice {
  @scala.inline
  def apply(
    claim: SchemaPartnerClaim = null,
    result: SchemaPerDeviceStatusInBatch = null,
    unclaim: SchemaPartnerUnclaim = null,
    updateMetadata: SchemaUpdateMetadataArguments = null
  ): SchemaOperationPerDevice = {
    val __obj = js.Dynamic.literal()
    if (claim != null) __obj.updateDynamic("claim")(claim.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (unclaim != null) __obj.updateDynamic("unclaim")(unclaim.asInstanceOf[js.Any])
    if (updateMetadata != null) __obj.updateDynamic("updateMetadata")(updateMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOperationPerDevice]
  }
}

