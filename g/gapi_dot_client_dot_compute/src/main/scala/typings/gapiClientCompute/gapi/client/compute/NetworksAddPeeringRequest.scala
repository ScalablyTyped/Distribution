package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworksAddPeeringRequest extends js.Object {
  /** Whether Google Compute Engine manages the routes automatically. */
  var autoCreateRoutes: js.UndefOr[Boolean] = js.native
  /** Name of the peering, which should conform to RFC1035. */
  var name: js.UndefOr[String] = js.native
  /**
    * URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not
    * contain project, it is assumed that the peer network is in the same project as the current network.
    */
  var peerNetwork: js.UndefOr[String] = js.native
}

object NetworksAddPeeringRequest {
  @scala.inline
  def apply(): NetworksAddPeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworksAddPeeringRequest]
  }
  @scala.inline
  implicit class NetworksAddPeeringRequestOps[Self <: NetworksAddPeeringRequest] (val x: Self) extends AnyVal {
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
    def setAutoCreateRoutes(value: Boolean): Self = this.set("autoCreateRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCreateRoutes: Self = this.set("autoCreateRoutes", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPeerNetwork(value: String): Self = this.set("peerNetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerNetwork: Self = this.set("peerNetwork", js.undefined)
  }
  
}

