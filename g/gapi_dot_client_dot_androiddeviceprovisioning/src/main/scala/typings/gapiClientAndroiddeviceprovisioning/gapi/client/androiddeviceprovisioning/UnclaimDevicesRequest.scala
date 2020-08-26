package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnclaimDevicesRequest extends js.Object {
  /** List of devices to unclaim. */
  var unclaims: js.UndefOr[js.Array[PartnerUnclaim]] = js.native
}

object UnclaimDevicesRequest {
  @scala.inline
  def apply(): UnclaimDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnclaimDevicesRequest]
  }
  @scala.inline
  implicit class UnclaimDevicesRequestOps[Self <: UnclaimDevicesRequest] (val x: Self) extends AnyVal {
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
    def setUnclaimsVarargs(value: PartnerUnclaim*): Self = this.set("unclaims", js.Array(value :_*))
    @scala.inline
    def setUnclaims(value: js.Array[PartnerUnclaim]): Self = this.set("unclaims", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnclaims: Self = this.set("unclaims", js.undefined)
  }
  
}

