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
  def apply(): SchemaUnclaimDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnclaimDevicesRequest]
  }
  @scala.inline
  implicit class SchemaUnclaimDevicesRequestOps[Self <: SchemaUnclaimDevicesRequest] (val x: Self) extends AnyVal {
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
    def setUnclaimsVarargs(value: SchemaPartnerUnclaim*): Self = this.set("unclaims", js.Array(value :_*))
    @scala.inline
    def setUnclaims(value: js.Array[SchemaPartnerUnclaim]): Self = this.set("unclaims", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnclaims: Self = this.set("unclaims", js.undefined)
  }
  
}

