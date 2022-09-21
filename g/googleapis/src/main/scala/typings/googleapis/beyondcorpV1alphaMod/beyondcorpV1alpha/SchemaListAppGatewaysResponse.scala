package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAppGatewaysResponse extends StObject {
  
  /**
    * A list of BeyondCorp AppGateways in the project.
    */
  var appGateways: js.UndefOr[js.Array[SchemaAppGateway]] = js.undefined
  
  /**
    * A token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListAppGatewaysResponse {
  
  inline def apply(): SchemaListAppGatewaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAppGatewaysResponse]
  }
  
  extension [Self <: SchemaListAppGatewaysResponse](x: Self) {
    
    inline def setAppGateways(value: js.Array[SchemaAppGateway]): Self = StObject.set(x, "appGateways", value.asInstanceOf[js.Any])
    
    inline def setAppGatewaysUndefined: Self = StObject.set(x, "appGateways", js.undefined)
    
    inline def setAppGatewaysVarargs(value: SchemaAppGateway*): Self = StObject.set(x, "appGateways", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
