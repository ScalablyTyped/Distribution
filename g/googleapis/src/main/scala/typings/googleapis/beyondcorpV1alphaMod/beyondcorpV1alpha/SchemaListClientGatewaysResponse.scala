package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListClientGatewaysResponse extends StObject {
  
  /**
    * The list of ClientGateway.
    */
  var clientGateways: js.UndefOr[js.Array[SchemaClientGateway]] = js.undefined
  
  /**
    * A token identifying a page of results the server should return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListClientGatewaysResponse {
  
  inline def apply(): SchemaListClientGatewaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClientGatewaysResponse]
  }
  
  extension [Self <: SchemaListClientGatewaysResponse](x: Self) {
    
    inline def setClientGateways(value: js.Array[SchemaClientGateway]): Self = StObject.set(x, "clientGateways", value.asInstanceOf[js.Any])
    
    inline def setClientGatewaysUndefined: Self = StObject.set(x, "clientGateways", js.undefined)
    
    inline def setClientGatewaysVarargs(value: SchemaClientGateway*): Self = StObject.set(x, "clientGateways", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
