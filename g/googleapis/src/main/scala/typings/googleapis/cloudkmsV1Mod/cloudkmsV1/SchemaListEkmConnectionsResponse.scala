package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListEkmConnectionsResponse extends StObject {
  
  /**
    * The list of EkmConnections.
    */
  var ekmConnections: js.UndefOr[js.Array[SchemaEkmConnection]] = js.undefined
  
  /**
    * A token to retrieve next page of results. Pass this value in ListEkmConnectionsRequest.page_token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total number of EkmConnections that matched the query.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaListEkmConnectionsResponse {
  
  inline def apply(): SchemaListEkmConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListEkmConnectionsResponse]
  }
  
  extension [Self <: SchemaListEkmConnectionsResponse](x: Self) {
    
    inline def setEkmConnections(value: js.Array[SchemaEkmConnection]): Self = StObject.set(x, "ekmConnections", value.asInstanceOf[js.Any])
    
    inline def setEkmConnectionsUndefined: Self = StObject.set(x, "ekmConnections", js.undefined)
    
    inline def setEkmConnectionsVarargs(value: SchemaEkmConnection*): Self = StObject.set(x, "ekmConnections", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
