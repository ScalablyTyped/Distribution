package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstancesSetMinCpuPlatformRequest extends js.Object {
  /**
    * Minimum cpu/platform this instance should be started at.
    */
  var minCpuPlatform: js.UndefOr[String] = js.native
}

object SchemaInstancesSetMinCpuPlatformRequest {
  @scala.inline
  def apply(): SchemaInstancesSetMinCpuPlatformRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesSetMinCpuPlatformRequest]
  }
  @scala.inline
  implicit class SchemaInstancesSetMinCpuPlatformRequestOps[Self <: SchemaInstancesSetMinCpuPlatformRequest] (val x: Self) extends AnyVal {
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

