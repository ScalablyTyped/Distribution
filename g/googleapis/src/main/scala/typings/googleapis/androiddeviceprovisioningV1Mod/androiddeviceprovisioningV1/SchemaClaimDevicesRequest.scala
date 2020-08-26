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
  def apply(): SchemaClaimDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClaimDevicesRequest]
  }
  @scala.inline
  implicit class SchemaClaimDevicesRequestOps[Self <: SchemaClaimDevicesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClaimsVarargs(value: SchemaPartnerClaim*): Self = this.set("claims", js.Array(value :_*))
    @scala.inline
    def setClaims(value: js.Array[SchemaPartnerClaim]): Self = this.set("claims", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClaims: Self = this.set("claims", js.undefined)
  }
  
}

