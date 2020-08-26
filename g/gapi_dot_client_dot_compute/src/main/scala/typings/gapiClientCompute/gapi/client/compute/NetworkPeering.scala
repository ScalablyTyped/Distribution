package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkPeering extends js.Object {
  /**
    * Whether full mesh connectivity is created and managed automatically. When it is set to true, Google Compute Engine will automatically create and manage
    * the routes between two networks when the state is ACTIVE. Otherwise, user needs to create routes manually to route packets to peer network.
    */
  var autoCreateRoutes: js.UndefOr[Boolean] = js.native
  /**
    * Name of this peering. Provided by the client when the peering is created. The name must comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be a lowercase letter, and all the
    * following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not
    * contain project, it is assumed that the peer network is in the same project as the current network.
    */
  var network: js.UndefOr[String] = js.native
  /** [Output Only] State for the peering. */
  var state: js.UndefOr[String] = js.native
  /** [Output Only] Details about the current state of the peering. */
  var stateDetails: js.UndefOr[String] = js.native
}

object NetworkPeering {
  @scala.inline
  def apply(): NetworkPeering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkPeering]
  }
  @scala.inline
  implicit class NetworkPeeringOps[Self <: NetworkPeering] (val x: Self) extends AnyVal {
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
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStateDetails(value: String): Self = this.set("stateDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateDetails: Self = this.set("stateDetails", js.undefined)
  }
  
}

