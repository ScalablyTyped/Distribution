package typings.googleapis.apigatewayV1Mod.apigatewayV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApigatewayListApisResponse extends StObject {
  
  /**
    * APIs.
    */
  var apis: js.UndefOr[js.Array[SchemaApigatewayApi]] = js.undefined
  
  /**
    * Next page token.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachableLocations: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaApigatewayListApisResponse {
  
  inline def apply(): SchemaApigatewayListApisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApigatewayListApisResponse]
  }
  
  extension [Self <: SchemaApigatewayListApisResponse](x: Self) {
    
    inline def setApis(value: js.Array[SchemaApigatewayApi]): Self = StObject.set(x, "apis", value.asInstanceOf[js.Any])
    
    inline def setApisUndefined: Self = StObject.set(x, "apis", js.undefined)
    
    inline def setApisVarargs(value: SchemaApigatewayApi*): Self = StObject.set(x, "apis", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachableLocations(value: js.Array[String]): Self = StObject.set(x, "unreachableLocations", value.asInstanceOf[js.Any])
    
    inline def setUnreachableLocationsNull: Self = StObject.set(x, "unreachableLocations", null)
    
    inline def setUnreachableLocationsUndefined: Self = StObject.set(x, "unreachableLocations", js.undefined)
    
    inline def setUnreachableLocationsVarargs(value: String*): Self = StObject.set(x, "unreachableLocations", js.Array(value*))
  }
}
