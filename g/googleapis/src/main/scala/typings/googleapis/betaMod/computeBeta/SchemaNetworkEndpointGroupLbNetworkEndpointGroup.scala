package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkEndpointGroupLbNetworkEndpointGroup extends StObject {
  
  /**
    * The default port used if the port number is not specified in the network endpoint. [Deprecated] This field is deprecated.
    */
  var defaultPort: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The URL of the network to which all network endpoints in the NEG belong. Uses "default" project network if unspecified. [Deprecated] This field is deprecated.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional URL of the subnetwork to which all network endpoints in the NEG belong. [Deprecated] This field is deprecated.
    */
  var subnetwork: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The URL of the zone where the network endpoint group is located. [Deprecated] This field is deprecated.
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworkEndpointGroupLbNetworkEndpointGroup {
  
  inline def apply(): SchemaNetworkEndpointGroupLbNetworkEndpointGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupLbNetworkEndpointGroup]
  }
  
  extension [Self <: SchemaNetworkEndpointGroupLbNetworkEndpointGroup](x: Self) {
    
    inline def setDefaultPort(value: Double): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
    
    inline def setDefaultPortNull: Self = StObject.set(x, "defaultPort", null)
    
    inline def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkNull: Self = StObject.set(x, "subnetwork", null)
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
