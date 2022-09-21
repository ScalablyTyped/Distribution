package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudSecurityZerotrustApplinkAppConnectorProtoConnectionConfig extends StObject {
  
  /**
    * application_endpoint is the endpoint of the application the form of host:port. For example, "localhost:80".
    */
  var applicationEndpoint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * application_name represents the given name of the application the connection is connecting with.
    */
  var applicationName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * gateway lists all instances running a gateway in GCP. They all connect to a connector on the host.
    */
  var gateway: js.UndefOr[js.Array[SchemaCloudSecurityZerotrustApplinkAppConnectorProtoGateway]] = js.undefined
  
  /**
    * name is the unique ID for each connection. TODO(b/190732451) returns connection name from user-specified name in config. Now, name = ${application_name\}:${application_endpoint\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * project represents the consumer project the connection belongs to.
    */
  var project: js.UndefOr[String | Null] = js.undefined
  
  /**
    * tunnels_per_gateway reflects the number of tunnels between a connector and a gateway.
    */
  var tunnelsPerGateway: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * user_port specifies the reserved port on gateways for user connections.
    */
  var userPort: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCloudSecurityZerotrustApplinkAppConnectorProtoConnectionConfig {
  
  inline def apply(): SchemaCloudSecurityZerotrustApplinkAppConnectorProtoConnectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudSecurityZerotrustApplinkAppConnectorProtoConnectionConfig]
  }
  
  extension [Self <: SchemaCloudSecurityZerotrustApplinkAppConnectorProtoConnectionConfig](x: Self) {
    
    inline def setApplicationEndpoint(value: String): Self = StObject.set(x, "applicationEndpoint", value.asInstanceOf[js.Any])
    
    inline def setApplicationEndpointNull: Self = StObject.set(x, "applicationEndpoint", null)
    
    inline def setApplicationEndpointUndefined: Self = StObject.set(x, "applicationEndpoint", js.undefined)
    
    inline def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameNull: Self = StObject.set(x, "applicationName", null)
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    inline def setGateway(value: js.Array[SchemaCloudSecurityZerotrustApplinkAppConnectorProtoGateway]): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
    
    inline def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
    
    inline def setGatewayVarargs(value: SchemaCloudSecurityZerotrustApplinkAppConnectorProtoGateway*): Self = StObject.set(x, "gateway", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setTunnelsPerGateway(value: Double): Self = StObject.set(x, "tunnelsPerGateway", value.asInstanceOf[js.Any])
    
    inline def setTunnelsPerGatewayNull: Self = StObject.set(x, "tunnelsPerGateway", null)
    
    inline def setTunnelsPerGatewayUndefined: Self = StObject.set(x, "tunnelsPerGateway", js.undefined)
    
    inline def setUserPort(value: Double): Self = StObject.set(x, "userPort", value.asInstanceOf[js.Any])
    
    inline def setUserPortNull: Self = StObject.set(x, "userPort", null)
    
    inline def setUserPortUndefined: Self = StObject.set(x, "userPort", js.undefined)
  }
}
