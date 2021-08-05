package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworksAddPeeringRequest extends StObject {
  
  /**
    * This field will be deprecated soon. Prefer using exchange_subnet_routes
    * in network_peering instead. Whether Google Compute Engine manages the
    * routes automatically.
    */
  var autoCreateRoutes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Name of the peering, which should conform to RFC1035.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Network peering parameters. In order to specify route policies for
    * peering using import/export custom routes, you will have to fill all
    * peering related parameters (name, peer network, exchange_subnet_routes)
    * in network_peeringfield. Corresponding fields in
    * NetworksAddPeeringRequest will be deprecated soon.
    */
  var networkPeering: js.UndefOr[SchemaNetworkPeering] = js.undefined
  
  /**
    * URL of the peer network. It can be either full URL or partial URL. The
    * peer network may belong to a different project. If the partial URL does
    * not contain project, it is assumed that the peer network is in the same
    * project as the current network.
    */
  var peerNetwork: js.UndefOr[String] = js.undefined
}
object SchemaNetworksAddPeeringRequest {
  
  inline def apply(): SchemaNetworksAddPeeringRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworksAddPeeringRequest]
  }
  
  extension [Self <: SchemaNetworksAddPeeringRequest](x: Self) {
    
    inline def setAutoCreateRoutes(value: Boolean): Self = StObject.set(x, "autoCreateRoutes", value.asInstanceOf[js.Any])
    
    inline def setAutoCreateRoutesUndefined: Self = StObject.set(x, "autoCreateRoutes", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkPeering(value: SchemaNetworkPeering): Self = StObject.set(x, "networkPeering", value.asInstanceOf[js.Any])
    
    inline def setNetworkPeeringUndefined: Self = StObject.set(x, "networkPeering", js.undefined)
    
    inline def setPeerNetwork(value: String): Self = StObject.set(x, "peerNetwork", value.asInstanceOf[js.Any])
    
    inline def setPeerNetworkUndefined: Self = StObject.set(x, "peerNetwork", js.undefined)
  }
}
