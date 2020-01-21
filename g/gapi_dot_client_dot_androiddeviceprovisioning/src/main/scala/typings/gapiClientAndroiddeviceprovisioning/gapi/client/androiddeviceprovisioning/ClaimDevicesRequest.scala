package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimDevicesRequest extends js.Object {
  /** List of claims. */
  var claims: js.UndefOr[js.Array[PartnerClaim]] = js.undefined
}

object ClaimDevicesRequest {
  @scala.inline
  def apply(claims: js.Array[PartnerClaim] = null): ClaimDevicesRequest = {
    val __obj = js.Dynamic.literal()
    if (claims != null) __obj.updateDynamic("claims")(claims.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimDevicesRequest]
  }
}

