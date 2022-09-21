package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfig extends StObject {
  
  /**
    * Required. The settings used to configure basic ClientGateways.
    */
  var destinationRoutes: js.UndefOr[js.Array[SchemaDestinationRoute]] = js.undefined
  
  /**
    * Required. Immutable. The transport protocol used between the client and the server.
    */
  var transportProtocol: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfig {
  
  inline def apply(): SchemaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfig]
  }
  
  extension [Self <: SchemaConfig](x: Self) {
    
    inline def setDestinationRoutes(value: js.Array[SchemaDestinationRoute]): Self = StObject.set(x, "destinationRoutes", value.asInstanceOf[js.Any])
    
    inline def setDestinationRoutesUndefined: Self = StObject.set(x, "destinationRoutes", js.undefined)
    
    inline def setDestinationRoutesVarargs(value: SchemaDestinationRoute*): Self = StObject.set(x, "destinationRoutes", js.Array(value*))
    
    inline def setTransportProtocol(value: String): Self = StObject.set(x, "transportProtocol", value.asInstanceOf[js.Any])
    
    inline def setTransportProtocolNull: Self = StObject.set(x, "transportProtocol", null)
    
    inline def setTransportProtocolUndefined: Self = StObject.set(x, "transportProtocol", js.undefined)
  }
}
