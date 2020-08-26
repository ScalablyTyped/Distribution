package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisksResizeRequest extends js.Object {
  /** The new size of the persistent disk, which is specified in GB. */
  var sizeGb: js.UndefOr[String] = js.native
}

object DisksResizeRequest {
  @scala.inline
  def apply(): DisksResizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisksResizeRequest]
  }
  @scala.inline
  implicit class DisksResizeRequestOps[Self <: DisksResizeRequest] (val x: Self) extends AnyVal {
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
    def setSizeGb(value: String): Self = this.set("sizeGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeGb: Self = this.set("sizeGb", js.undefined)
  }
  
}

