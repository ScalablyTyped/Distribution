package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A network peering attached to a network resource. The message includes the
  * peering name, peer network, peering state, and a flag indicating whether
  * Google Compute Engine should automatically create routes for the peering.
  */
trait SchemaNetworkPeering extends StObject {
  
  /**
    * Whether Cloud Routers in this network can automatically advertise subnets
    * from the peer network.
    */
  var advertisePeerSubnetsViaRouters: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This field will be deprecated soon. Prefer using exchange_subnet_routes
    * instead. Indicates whether full mesh connectivity is created and managed
    * automatically. When it is set to true, Google Compute Engine will
    * automatically create and manage the routes between two networks when the
    * state is ACTIVE. Otherwise, user needs to create routes manually to route
    * packets to peer network.
    */
  var autoCreateRoutes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether full mesh connectivity is created and managed automatically. When
    * it is set to true, Google Compute Engine will automatically create and
    * manage the routes between two networks when the peering state is ACTIVE.
    * Otherwise, user needs to create routes manually to route packets to peer
    * network.
    */
  var exchangeSubnetRoutes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to export the custom routes to peer network.
    */
  var exportCustomRoutes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether subnet routes with public IP range are exported. The default
    * value is true, all subnet routes are exported. The IPv4 special-use
    * ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always
    * exported to peers and are not controlled by this field.
    */
  var exportSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to import the custom routes from peer network.
    */
  var importCustomRoutes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether subnet routes with public IP range are imported. The default
    * value is false. The IPv4 special-use ranges
    * (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always
    * imported from peers and are not controlled by this field.
    */
  var importSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Name of this peering. Provided by the client when the peering is created.
    * The name must comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
    * which means the first character must be a lowercase letter, and all the
    * following characters must be a dash, lowercase letter, or digit, except
    * the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the peer network. It can be either full URL or partial URL.
    * The peer network may belong to a different project. If the partial URL
    * does not contain project, it is assumed that the peer network is in the
    * same project as the current network.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] State for the peering.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Details about the current state of the peering.
    */
  var stateDetails: js.UndefOr[String] = js.undefined
}
object SchemaNetworkPeering {
  
  @scala.inline
  def apply(): SchemaNetworkPeering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkPeering]
  }
  
  @scala.inline
  implicit class SchemaNetworkPeeringMutableBuilder[Self <: SchemaNetworkPeering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertisePeerSubnetsViaRouters(value: Boolean): Self = StObject.set(x, "advertisePeerSubnetsViaRouters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisePeerSubnetsViaRoutersUndefined: Self = StObject.set(x, "advertisePeerSubnetsViaRouters", js.undefined)
    
    @scala.inline
    def setAutoCreateRoutes(value: Boolean): Self = StObject.set(x, "autoCreateRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCreateRoutesUndefined: Self = StObject.set(x, "autoCreateRoutes", js.undefined)
    
    @scala.inline
    def setExchangeSubnetRoutes(value: Boolean): Self = StObject.set(x, "exchangeSubnetRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeSubnetRoutesUndefined: Self = StObject.set(x, "exchangeSubnetRoutes", js.undefined)
    
    @scala.inline
    def setExportCustomRoutes(value: Boolean): Self = StObject.set(x, "exportCustomRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportCustomRoutesUndefined: Self = StObject.set(x, "exportCustomRoutes", js.undefined)
    
    @scala.inline
    def setExportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "exportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "exportSubnetRoutesWithPublicIp", js.undefined)
    
    @scala.inline
    def setImportCustomRoutes(value: Boolean): Self = StObject.set(x, "importCustomRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportCustomRoutesUndefined: Self = StObject.set(x, "importCustomRoutes", js.undefined)
    
    @scala.inline
    def setImportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "importSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "importSubnetRoutesWithPublicIp", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateDetails(value: String): Self = StObject.set(x, "stateDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateDetailsUndefined: Self = StObject.set(x, "stateDetails", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
