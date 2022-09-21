package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListClientConnectorServicesResponse extends StObject {
  
  /**
    * The list of ClientConnectorService.
    */
  var clientConnectorServices: js.UndefOr[js.Array[SchemaClientConnectorService]] = js.undefined
  
  /**
    * A token identifying a page of results the server should return.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListClientConnectorServicesResponse {
  
  inline def apply(): SchemaListClientConnectorServicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClientConnectorServicesResponse]
  }
  
  extension [Self <: SchemaListClientConnectorServicesResponse](x: Self) {
    
    inline def setClientConnectorServices(value: js.Array[SchemaClientConnectorService]): Self = StObject.set(x, "clientConnectorServices", value.asInstanceOf[js.Any])
    
    inline def setClientConnectorServicesUndefined: Self = StObject.set(x, "clientConnectorServices", js.undefined)
    
    inline def setClientConnectorServicesVarargs(value: SchemaClientConnectorService*): Self = StObject.set(x, "clientConnectorServices", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
