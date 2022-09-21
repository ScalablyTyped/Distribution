package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDestinationRoute extends StObject {
  
  /**
    * Required. The network address of the subnet for which the packet is routed to the ClientGateway.
    */
  var address: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The network mask of the subnet for which the packet is routed to the ClientGateway.
    */
  var netmask: js.UndefOr[String | Null] = js.undefined
}
object SchemaDestinationRoute {
  
  inline def apply(): SchemaDestinationRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDestinationRoute]
  }
  
  extension [Self <: SchemaDestinationRoute](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setNetmask(value: String): Self = StObject.set(x, "netmask", value.asInstanceOf[js.Any])
    
    inline def setNetmaskNull: Self = StObject.set(x, "netmask", null)
    
    inline def setNetmaskUndefined: Self = StObject.set(x, "netmask", js.undefined)
  }
}
