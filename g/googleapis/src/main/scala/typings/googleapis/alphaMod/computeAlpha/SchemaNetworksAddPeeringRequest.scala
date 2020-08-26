package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworksAddPeeringRequest extends js.Object {
  /**
    * This field will be deprecated soon. Prefer using exchange_subnet_routes
    * in network_peering instead. Whether Google Compute Engine manages the
    * routes automatically.
    */
  var autoCreateRoutes: js.UndefOr[Boolean] = js.native
  /**
    * This field will be deprecated soon. Prefer using export_custom_routes in
    * network_peering instead. Whether to export the custom routes to peer
    * network.
    */
  var exportCustomRoutes: js.UndefOr[Boolean] = js.native
  /**
    * This field will be deprecated soon. Prefer using import_custom_routes in
    * network_peering instead. Whether to import the custom routes from peer
    * network.
    */
  var importCustomRoutes: js.UndefOr[Boolean] = js.native
  /**
    * Name of the peering, which should conform to RFC1035.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Network peering parameters. In order to specify route policies for
    * peering using import/export custom routes, you will have to fill all
    * peering related parameters (name, peer network, exchange_subnet_routes)
    * in network_peeringfield. Corresponding fields in
    * NetworksAddPeeringRequest will be deprecated soon.
    */
  var networkPeering: js.UndefOr[SchemaNetworkPeering] = js.native
  /**
    * URL of the peer network. It can be either full URL or partial URL. The
    * peer network may belong to a different project. If the partial URL does
    * not contain project, it is assumed that the peer network is in the same
    * project as the current network.
    */
  var peerNetwork: js.UndefOr[String] = js.native
}

object SchemaNetworksAddPeeringRequest {
  @scala.inline
  def apply(): SchemaNetworksAddPeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworksAddPeeringRequest]
  }
  @scala.inline
  implicit class SchemaNetworksAddPeeringRequestOps[Self <: SchemaNetworksAddPeeringRequest] (val x: Self) extends AnyVal {
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
    def setExportCustomRoutes(value: Boolean): Self = this.set("exportCustomRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportCustomRoutes: Self = this.set("exportCustomRoutes", js.undefined)
    @scala.inline
    def setImportCustomRoutes(value: Boolean): Self = this.set("importCustomRoutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportCustomRoutes: Self = this.set("importCustomRoutes", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetworkPeering(value: SchemaNetworkPeering): Self = this.set("networkPeering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkPeering: Self = this.set("networkPeering", js.undefined)
    @scala.inline
    def setPeerNetwork(value: String): Self = this.set("peerNetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeerNetwork: Self = this.set("peerNetwork", js.undefined)
  }
  
}

