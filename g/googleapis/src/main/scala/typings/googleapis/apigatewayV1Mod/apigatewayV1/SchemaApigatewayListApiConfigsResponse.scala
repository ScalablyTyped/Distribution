package typings.googleapis.apigatewayV1Mod.apigatewayV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApigatewayListApiConfigsResponse extends StObject {
  
  /**
    * API Configs.
    */
  var apiConfigs: js.UndefOr[js.Array[SchemaApigatewayApiConfig]] = js.undefined
  
  /**
    * Next page token.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachableLocations: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaApigatewayListApiConfigsResponse {
  
  inline def apply(): SchemaApigatewayListApiConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApigatewayListApiConfigsResponse]
  }
  
  extension [Self <: SchemaApigatewayListApiConfigsResponse](x: Self) {
    
    inline def setApiConfigs(value: js.Array[SchemaApigatewayApiConfig]): Self = StObject.set(x, "apiConfigs", value.asInstanceOf[js.Any])
    
    inline def setApiConfigsUndefined: Self = StObject.set(x, "apiConfigs", js.undefined)
    
    inline def setApiConfigsVarargs(value: SchemaApigatewayApiConfig*): Self = StObject.set(x, "apiConfigs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachableLocations(value: js.Array[String]): Self = StObject.set(x, "unreachableLocations", value.asInstanceOf[js.Any])
    
    inline def setUnreachableLocationsNull: Self = StObject.set(x, "unreachableLocations", null)
    
    inline def setUnreachableLocationsUndefined: Self = StObject.set(x, "unreachableLocations", js.undefined)
    
    inline def setUnreachableLocationsVarargs(value: String*): Self = StObject.set(x, "unreachableLocations", js.Array(value*))
  }
}
