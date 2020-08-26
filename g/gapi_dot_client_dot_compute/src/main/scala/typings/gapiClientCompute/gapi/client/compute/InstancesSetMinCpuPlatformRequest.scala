package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancesSetMinCpuPlatformRequest extends js.Object {
  /** Minimum cpu/platform this instance should be started at. */
  var minCpuPlatform: js.UndefOr[String] = js.native
}

object InstancesSetMinCpuPlatformRequest {
  @scala.inline
  def apply(): InstancesSetMinCpuPlatformRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesSetMinCpuPlatformRequest]
  }
  @scala.inline
  implicit class InstancesSetMinCpuPlatformRequestOps[Self <: InstancesSetMinCpuPlatformRequest] (val x: Self) extends AnyVal {
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
    def setMinCpuPlatform(value: String): Self = this.set("minCpuPlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinCpuPlatform: Self = this.set("minCpuPlatform", js.undefined)
  }
  
}

