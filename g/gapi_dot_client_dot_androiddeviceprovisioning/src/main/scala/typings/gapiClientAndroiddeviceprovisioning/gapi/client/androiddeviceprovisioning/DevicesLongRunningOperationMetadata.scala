package typings.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicesLongRunningOperationMetadata extends js.Object {
  /** Number of devices parsed in your requests. */
  var devicesCount: js.UndefOr[Double] = js.native
  /** The overall processing status. */
  var processingStatus: js.UndefOr[String] = js.native
  /** Processing progress from 0 to 100. */
  var progress: js.UndefOr[Double] = js.native
}

object DevicesLongRunningOperationMetadata {
  @scala.inline
  def apply(): DevicesLongRunningOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicesLongRunningOperationMetadata]
  }
  @scala.inline
  implicit class DevicesLongRunningOperationMetadataOps[Self <: DevicesLongRunningOperationMetadata] (val x: Self) extends AnyVal {
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
    def setDevicesCount(value: Double): Self = this.set("devicesCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevicesCount: Self = this.set("devicesCount", js.undefined)
    @scala.inline
    def setProcessingStatus(value: String): Self = this.set("processingStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessingStatus: Self = this.set("processingStatus", js.undefined)
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
  }
  
}

