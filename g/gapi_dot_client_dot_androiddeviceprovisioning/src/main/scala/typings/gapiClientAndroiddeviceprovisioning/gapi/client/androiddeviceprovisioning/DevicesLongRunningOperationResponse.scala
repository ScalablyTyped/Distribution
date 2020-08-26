package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicesLongRunningOperationResponse extends js.Object {
  /**
    * Processing status for each device.
    * One `PerDeviceStatus` per device. The order is the same as in your requests.
    */
  var perDeviceStatus: js.UndefOr[js.Array[OperationPerDevice]] = js.native
  /** Number of succeesfully processed ones. */
  var successCount: js.UndefOr[Double] = js.native
}

object DevicesLongRunningOperationResponse {
  @scala.inline
  def apply(): DevicesLongRunningOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicesLongRunningOperationResponse]
  }
  @scala.inline
  implicit class DevicesLongRunningOperationResponseOps[Self <: DevicesLongRunningOperationResponse] (val x: Self) extends AnyVal {
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
    def setPerDeviceStatusVarargs(value: OperationPerDevice*): Self = this.set("perDeviceStatus", js.Array(value :_*))
    @scala.inline
    def setPerDeviceStatus(value: js.Array[OperationPerDevice]): Self = this.set("perDeviceStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerDeviceStatus: Self = this.set("perDeviceStatus", js.undefined)
    @scala.inline
    def setSuccessCount(value: Double): Self = this.set("successCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessCount: Self = this.set("successCount", js.undefined)
  }
  
}

