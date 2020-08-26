package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworksRemovePeeringRequest extends js.Object {
  /** Name of the peering, which should conform to RFC1035. */
  var name: js.UndefOr[String] = js.native
}

object NetworksRemovePeeringRequest {
  @scala.inline
  def apply(): NetworksRemovePeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworksRemovePeeringRequest]
  }
  @scala.inline
  implicit class NetworksRemovePeeringRequestOps[Self <: NetworksRemovePeeringRequest] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

