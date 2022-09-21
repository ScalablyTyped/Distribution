package typings.googleapis.apigatewayV1betaMod.apigatewayV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApigatewayListLocationsResponse extends StObject {
  
  /**
    * A list of locations that matches the specified filter in the request.
    */
  var locations: js.UndefOr[js.Array[SchemaApigatewayLocation]] = js.undefined
  
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaApigatewayListLocationsResponse {
  
  inline def apply(): SchemaApigatewayListLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApigatewayListLocationsResponse]
  }
  
  extension [Self <: SchemaApigatewayListLocationsResponse](x: Self) {
    
    inline def setLocations(value: js.Array[SchemaApigatewayLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: SchemaApigatewayLocation*): Self = StObject.set(x, "locations", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
