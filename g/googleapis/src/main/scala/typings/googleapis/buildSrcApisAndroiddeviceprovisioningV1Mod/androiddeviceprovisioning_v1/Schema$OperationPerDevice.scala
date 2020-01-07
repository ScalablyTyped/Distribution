package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A task for each device in the operation. Corresponds to each device change
  * in the request.
  */
@js.native
trait Schema$OperationPerDevice extends js.Object {
  /**
    * A copy of the original device-claim request received by the server.
    */
  var claim: js.UndefOr[Schema$PartnerClaim] = js.native
  /**
    * The processing result for each device.
    */
  var result: js.UndefOr[Schema$PerDeviceStatusInBatch] = js.native
  /**
    * A copy of the original device-unclaim request received by the server.
    */
  var unclaim: js.UndefOr[Schema$PartnerUnclaim] = js.native
  /**
    * A copy of the original metadata-update request received by the server.
    */
  var updateMetadata: js.UndefOr[Schema$UpdateMetadataArguments] = js.native
}

object Schema$OperationPerDevice {
  @scala.inline
  def apply(
    claim: Schema$PartnerClaim = null,
    result: Schema$PerDeviceStatusInBatch = null,
    unclaim: Schema$PartnerUnclaim = null,
    updateMetadata: Schema$UpdateMetadataArguments = null
  ): Schema$OperationPerDevice = {
    val __obj = js.Dynamic.literal()
    if (claim != null) __obj.updateDynamic("claim")(claim.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (unclaim != null) __obj.updateDynamic("unclaim")(unclaim.asInstanceOf[js.Any])
    if (updateMetadata != null) __obj.updateDynamic("updateMetadata")(updateMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OperationPerDevice]
  }
}

