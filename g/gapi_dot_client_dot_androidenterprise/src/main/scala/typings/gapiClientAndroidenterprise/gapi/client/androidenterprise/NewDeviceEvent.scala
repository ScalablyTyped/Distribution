package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewDeviceEvent extends js.Object {
  /** The Android ID of the device. This field will always be present. */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * Identifies the extent to which the device is controlled by an Android EMM in various deployment configurations.
    *
    * Possible values include:
    * - "managedDevice", a device where the DPC is set as device owner,
    * - "managedProfile", a device where the DPC is set as profile owner.
    */
  var managementType: js.UndefOr[String] = js.native
  /** The ID of the user. This field will always be present. */
  var userId: js.UndefOr[String] = js.native
}

object NewDeviceEvent {
  @scala.inline
  def apply(): NewDeviceEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewDeviceEvent]
  }
  @scala.inline
  implicit class NewDeviceEventOps[Self <: NewDeviceEvent] (val x: Self) extends AnyVal {
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
    def setManagementType(value: String): Self = this.set("managementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagementType: Self = this.set("managementType", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

