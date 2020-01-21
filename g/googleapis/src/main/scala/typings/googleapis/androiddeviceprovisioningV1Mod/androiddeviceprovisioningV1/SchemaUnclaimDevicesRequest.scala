package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to unclaim devices asynchronously in batch.
  */
@js.native
trait SchemaUnclaimDevicesRequest extends js.Object {
  /**
    * Required. The list of devices to unclaim.
    */
  var unclaims: js.UndefOr[js.Array[SchemaPartnerUnclaim]] = js.native
}

object SchemaUnclaimDevicesRequest {
  @scala.inline
  def apply(unclaims: js.Array[SchemaPartnerUnclaim] = null): SchemaUnclaimDevicesRequest = {
    val __obj = js.Dynamic.literal()
    if (unclaims != null) __obj.updateDynamic("unclaims")(unclaims.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUnclaimDevicesRequest]
  }
}

