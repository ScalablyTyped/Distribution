package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicesListResponse extends js.Object {
  /** A managed device. */
  var device: js.UndefOr[js.Array[Device]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#devicesListResponse". */
  var kind: js.UndefOr[String] = js.native
}

object DevicesListResponse {
  @scala.inline
  def apply(): DevicesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicesListResponse]
  }
  @scala.inline
  implicit class DevicesListResponseOps[Self <: DevicesListResponse] (val x: Self) extends AnyVal {
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
    def setDeviceVarargs(value: Device*): Self = this.set("device", js.Array(value :_*))
    @scala.inline
    def setDevice(value: js.Array[Device]): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

