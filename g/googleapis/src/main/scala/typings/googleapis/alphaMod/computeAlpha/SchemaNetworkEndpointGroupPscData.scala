package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkEndpointGroupPscData extends StObject {
  
  /**
    * [Output Only] Address allocated from given subnetwork for PSC. This IP address acts as a VIP for a PSC NEG, allowing it to act as an endpoint in L7 PSC-XLB.
    */
  var consumerPscAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The PSC connection id of the PSC Network Endpoint Group Consumer.
    */
  var pscConnectionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The connection status of the PSC Forwarding Rule.
    */
  var pscConnectionStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworkEndpointGroupPscData {
  
  inline def apply(): SchemaNetworkEndpointGroupPscData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpointGroupPscData]
  }
  
  extension [Self <: SchemaNetworkEndpointGroupPscData](x: Self) {
    
    inline def setConsumerPscAddress(value: String): Self = StObject.set(x, "consumerPscAddress", value.asInstanceOf[js.Any])
    
    inline def setConsumerPscAddressNull: Self = StObject.set(x, "consumerPscAddress", null)
    
    inline def setConsumerPscAddressUndefined: Self = StObject.set(x, "consumerPscAddress", js.undefined)
    
    inline def setPscConnectionId(value: String): Self = StObject.set(x, "pscConnectionId", value.asInstanceOf[js.Any])
    
    inline def setPscConnectionIdNull: Self = StObject.set(x, "pscConnectionId", null)
    
    inline def setPscConnectionIdUndefined: Self = StObject.set(x, "pscConnectionId", js.undefined)
    
    inline def setPscConnectionStatus(value: String): Self = StObject.set(x, "pscConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setPscConnectionStatusNull: Self = StObject.set(x, "pscConnectionStatus", null)
    
    inline def setPscConnectionStatusUndefined: Self = StObject.set(x, "pscConnectionStatus", js.undefined)
  }
}
