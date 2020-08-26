package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceState extends js.Object {
  /**
    * The state of the Google account on the device. "enabled" indicates that the Google account on the device can be used to access Google services
    * (including Google Play), while "disabled" means that it cannot. A new device is initially in the "disabled" state.
    */
  var accountState: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#deviceState". */
  var kind: js.UndefOr[String] = js.native
}

object DeviceState {
  @scala.inline
  def apply(): DeviceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceState]
  }
  @scala.inline
  implicit class DeviceStateOps[Self <: DeviceState] (val x: Self) extends AnyVal {
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
    def setAccountState(value: String): Self = this.set("accountState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountState: Self = this.set("accountState", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

