package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkAddress extends StObject {
  
  /**
    * IPv4 address to be assigned to the server.
    */
  var address: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the existing network to use.
    */
  var existingNetworkId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Id of the network to use, within the same ProvisioningConfig request.
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
