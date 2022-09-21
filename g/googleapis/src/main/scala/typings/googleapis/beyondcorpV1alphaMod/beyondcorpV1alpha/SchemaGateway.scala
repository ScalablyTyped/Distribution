package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGateway extends StObject {
  
  /**
    * Required. The type of hosting used by the gateway.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Server-defined URI for this resource.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. User port reserved on the gateways for this connection, if not specified or zero, the default port is 19443.
    */
  var userPort: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGateway {
  
  inline def apply(): SchemaGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGateway]
  }
  
  extension [Self <: SchemaGateway](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setUserPort(value: Double): Self = StObject.set(x, "userPort", value.asInstanceOf[js.Any])
    
    inline def setUserPortNull: Self = StObject.set(x, "userPort", null)
    
    inline def setUserPortUndefined: Self = StObject.set(x, "userPort", js.undefined)
  }
}
