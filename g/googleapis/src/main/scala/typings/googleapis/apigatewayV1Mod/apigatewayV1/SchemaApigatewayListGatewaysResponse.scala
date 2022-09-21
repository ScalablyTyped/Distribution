package typings.googleapis.apigatewayV1Mod.apigatewayV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApigatewayListGatewaysResponse extends StObject {
  
  /**
    * Gateways.
    */
  var gateways: js.UndefOr[js.Array[SchemaApigatewayGateway]] = js.undefined
  
  /**
    * Next page token.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachableLocations: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaApigatewayListGatewaysResponse {
  
  inline def apply(): SchemaApigatewayListGatewaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApigatewayListGatewaysResponse]
  }
  
  extension [Self <: SchemaApigatewayListGatewaysResponse](x: Self) {
    
    inline def setGateways(value: js.Array[SchemaApigatewayGateway]): Self = StObject.set(x, "gateways", value.asInstanceOf[js.Any])
    
    inline def setGatewaysUndefined: Self = StObject.set(x, "gateways", js.undefined)
    
    inline def setGatewaysVarargs(value: SchemaApigatewayGateway*): Self = StObject.set(x, "gateways", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachableLocations(value: js.Array[String]): Self = StObject.set(x, "unreachableLocations", value.asInstanceOf[js.Any])
    
    inline def setUnreachableLocationsNull: Self = StObject.set(x, "unreachableLocations", null)
    
    inline def setUnreachableLocationsUndefined: Self = StObject.set(x, "unreachableLocations", js.undefined)
    
    inline def setUnreachableLocationsVarargs(value: String*): Self = StObject.set(x, "unreachableLocations", js.Array(value*))
  }
}
