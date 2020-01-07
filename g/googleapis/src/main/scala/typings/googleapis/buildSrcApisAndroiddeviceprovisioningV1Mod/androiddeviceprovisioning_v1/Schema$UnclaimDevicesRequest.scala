package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to unclaim devices asynchronously in batch.
  */
@js.native
trait Schema$UnclaimDevicesRequest extends js.Object {
  /**
    * Required. The list of devices to unclaim.
    */
  var unclaims: js.UndefOr[js.Array[Schema$PartnerUnclaim]] = js.native
}

object Schema$UnclaimDevicesRequest {
  @scala.inline
  def apply(unclaims: js.Array[Schema$PartnerUnclaim] = null): Schema$UnclaimDevicesRequest = {
    val __obj = js.Dynamic.literal()
    if (unclaims != null) __obj.updateDynamic("unclaims")(unclaims.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UnclaimDevicesRequest]
  }
}

