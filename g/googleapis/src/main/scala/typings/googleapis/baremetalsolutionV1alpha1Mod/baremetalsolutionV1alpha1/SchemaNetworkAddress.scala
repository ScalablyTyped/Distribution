package typings.googleapis.baremetalsolutionV1alpha1Mod.baremetalsolutionV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkAddress extends StObject {
  
  /**
    * IP address to be assigned to the server.
    */
  var address: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the existing network to use. Will be of the format at--vlan for pre-intake UI networks like for eg, at-123456-vlan001 or any user-defined name like for eg, my-network-name for networks provisioned using intake UI. The field is exclusively filled only in case of an already existing network. Mutually exclusive with network_id.
    */
  var existingNetworkId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the network to use, within the same ProvisioningConfig request. This represents a new network being provisioned in the same request. Can have any user-defined name like for eg, my-network-name. Mutually exclusive with existing_network_id.
    */
  var networkId: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworkAddress {
  
  inline def apply(): SchemaNetworkAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkAddress]
  }
  
  extension [Self <: SchemaNetworkAddress](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setExistingNetworkId(value: String): Self = StObject.set(x, "existingNetworkId", value.asInstanceOf[js.Any])
    
    inline def setExistingNetworkIdNull: Self = StObject.set(x, "existingNetworkId", null)
    
    inline def setExistingNetworkIdUndefined: Self = StObject.set(x, "existingNetworkId", js.undefined)
    
    inline def setNetworkId(value: String): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
    
    inline def setNetworkIdNull: Self = StObject.set(x, "networkId", null)
    
    inline def setNetworkIdUndefined: Self = StObject.set(x, "networkId", js.undefined)
  }
}
