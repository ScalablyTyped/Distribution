package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResolveConnectionsResponse extends StObject {
  
  /**
    * A list of BeyondCorp Connections with details in the project.
    */
  var connectionDetails: js.UndefOr[js.Array[SchemaConnectionDetails]] = js.undefined
  
  /**
    * A token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaResolveConnectionsResponse {
  
  inline def apply(): SchemaResolveConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResolveConnectionsResponse]
  }
  
  extension [Self <: SchemaResolveConnectionsResponse](x: Self) {
    
    inline def setConnectionDetails(value: js.Array[SchemaConnectionDetails]): Self = StObject.set(x, "connectionDetails", value.asInstanceOf[js.Any])
    
    inline def setConnectionDetailsUndefined: Self = StObject.set(x, "connectionDetails", js.undefined)
    
    inline def setConnectionDetailsVarargs(value: SchemaConnectionDetails*): Self = StObject.set(x, "connectionDetails", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
