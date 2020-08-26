package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndeleteServiceResponse extends js.Object {
  /** Revived service resource. */
  var service: js.UndefOr[ManagedService] = js.native
}

object UndeleteServiceResponse {
  @scala.inline
  def apply(): UndeleteServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndeleteServiceResponse]
  }
  @scala.inline
  implicit class UndeleteServiceResponseOps[Self <: UndeleteServiceResponse] (val x: Self) extends AnyVal {
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
    def setService(value: ManagedService): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

