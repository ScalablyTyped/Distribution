package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartnerUnclaim extends js.Object {
  /** Device ID of the device. */
  var deviceId: js.UndefOr[String] = js.native
  /** Device identifier of the device. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.native
  /** Section type to unclaim. */
  var sectionType: js.UndefOr[String] = js.native
}

object PartnerUnclaim {
  @scala.inline
  def apply(): PartnerUnclaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerUnclaim]
  }
  @scala.inline
  implicit class PartnerUnclaimOps[Self <: PartnerUnclaim] (val x: Self) extends AnyVal {
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
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    @scala.inline
    def setDeviceIdentifier(value: DeviceIdentifier): Self = this.set("deviceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceIdentifier: Self = this.set("deviceIdentifier", js.undefined)
    @scala.inline
    def setSectionType(value: String): Self = this.set("sectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSectionType: Self = this.set("sectionType", js.undefined)
  }
  
}

