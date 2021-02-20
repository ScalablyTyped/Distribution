package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNetworksAddPeeringRequest extends StObject {
  
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
  implicit class SchemaNetworksAddPeeringRequestMutableBuilder[Self <: SchemaNetworksAddPeeringRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCreateRoutes(value: Boolean): Self = StObject.set(x, "autoCreateRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCreateRoutesUndefined: Self = StObject.set(x, "autoCreateRoutes", js.undefined)
    
    @scala.inline
    def setExportCustomRoutes(value: Boolean): Self = StObject.set(x, "exportCustomRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportCustomRoutesUndefined: Self = StObject.set(x, "exportCustomRoutes", js.undefined)
    
    @scala.inline
    def setImportCustomRoutes(value: Boolean): Self = StObject.set(x, "importCustomRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportCustomRoutesUndefined: Self = StObject.set(x, "importCustomRoutes", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetworkPeering(value: SchemaNetworkPeering): Self = StObject.set(x, "networkPeering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkPeeringUndefined: Self = StObject.set(x, "networkPeering", js.undefined)
    
    @scala.inline
    def setPeerNetwork(value: String): Self = StObject.set(x, "peerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerNetworkUndefined: Self = StObject.set(x, "peerNetwork", js.undefined)
  }
}
