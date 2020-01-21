package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to claim devices asynchronously in batch. Claiming a device adds
  * the device to zero-touch enrollment and shows the device in the
  * customer&#39;s view of the portal.
  */
@js.native
trait SchemaClaimDevicesRequest extends js.Object {
  /**
    * Required. A list of device claims.
    */
  var claims: js.UndefOr[js.Array[SchemaPartnerClaim]] = js.native
}

object SchemaClaimDevicesRequest {
  @scala.inline
  def apply(claims: js.Array[SchemaPartnerClaim] = null): SchemaClaimDevicesRequest = {
    val __obj = js.Dynamic.literal()
    if (claims != null) __obj.updateDynamic("claims")(claims.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClaimDevicesRequest]
  }
}

