package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceClaim extends js.Object {
  /** Owner ID. */
  var ownerCompanyId: js.UndefOr[String] = js.native
  /** Section type of the device claim. */
  var sectionType: js.UndefOr[String] = js.native
}

object DeviceClaim {
  @scala.inline
  def apply(): DeviceClaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceClaim]
  }
  @scala.inline
  implicit class DeviceClaimOps[Self <: DeviceClaim] (val x: Self) extends AnyVal {
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
    def setOwnerCompanyId(value: String): Self = this.set("ownerCompanyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerCompanyId: Self = this.set("ownerCompanyId", js.undefined)
    @scala.inline
    def setSectionType(value: String): Self = this.set("sectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSectionType: Self = this.set("sectionType", js.undefined)
  }
  
}

