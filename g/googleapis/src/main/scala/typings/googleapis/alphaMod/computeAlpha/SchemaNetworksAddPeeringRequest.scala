package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworksAddPeeringRequest extends StObject {
  
  /**
    * This field will be deprecated soon. Use exchange_subnet_routes in network_peering instead. Indicates whether full mesh connectivity is created and managed automatically between peered networks. Currently this field should always be true since Google Compute Engine will automatically create and manage subnetwork routes between two networks when peering state is ACTIVE.
    */
  var autoCreateRoutes: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This field will be deprecated soon. Use export_custom_routes in network_peering instead. Whether to export the custom routes to peer network.
    */
  var exportCustomRoutes: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This field will be deprecated soon. Use import_custom_routes in network_peering instead. Whether to import the custom routes from peer network.
    */
  var importCustomRoutes: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Name of the peering, which should conform to RFC1035.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Network peering parameters. In order to specify route policies for peering using import and export custom routes, you must specify all peering related parameters (name, peer network, exchange_subnet_routes) in the network_peering field. The corresponding fields in NetworksAddPeeringRequest will be deprecated soon.
    */
  var networkPeering: js.UndefOr[SchemaNetworkPeering] = js.undefined
  
  /**
    * URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not contain project, it is assumed that the peer network is in the same project as the current network.
    */
  var peerNetwork: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworksAddPeeringRequest {
  
  inline def apply(): SchemaNetworksAddPeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworksAddPeeringRequest]
  }
  
  extension [Self <: SchemaNetworksAddPeeringRequest](x: Self) {
    
    inline def setAutoCreateRoutes(value: Boolean): Self = StObject.set(x, "autoCreateRoutes", value.asInstanceOf[js.Any])
    
    inline def setAutoCreateRoutesNull: Self = StObject.set(x, "autoCreateRoutes", null)
    
    inline def setAutoCreateRoutesUndefined: Self = StObject.set(x, "autoCreateRoutes", js.undefined)
    
    inline def setExportCustomRoutes(value: Boolean): Self = StObject.set(x, "exportCustomRoutes", value.asInstanceOf[js.Any])
    
    inline def setExportCustomRoutesNull: Self = StObject.set(x, "exportCustomRoutes", null)
    
    inline def setExportCustomRoutesUndefined: Self = StObject.set(x, "exportCustomRoutes", js.undefined)
    
    inline def setImportCustomRoutes(value: Boolean): Self = StObject.set(x, "importCustomRoutes", value.asInstanceOf[js.Any])
    
    inline def setImportCustomRoutesNull: Self = StObject.set(x, "importCustomRoutes", null)
    
    inline def setImportCustomRoutesUndefined: Self = StObject.set(x, "importCustomRoutes", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkPeering(value: SchemaNetworkPeering): Self = StObject.set(x, "networkPeering", value.asInstanceOf[js.Any])
    
    inline def setNetworkPeeringUndefined: Self = StObject.set(x, "networkPeering", js.undefined)
    
    inline def setPeerNetwork(value: String): Self = StObject.set(x, "peerNetwork", value.asInstanceOf[js.Any])
    
    inline def setPeerNetworkNull: Self = StObject.set(x, "peerNetwork", null)
    
    inline def setPeerNetworkUndefined: Self = StObject.set(x, "peerNetwork", js.undefined)
  }
}
