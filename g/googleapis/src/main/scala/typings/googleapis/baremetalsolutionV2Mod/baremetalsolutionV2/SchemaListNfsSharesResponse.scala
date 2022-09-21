package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListNfsSharesResponse extends StObject {
  
  /**
    * A token identifying a page of results from the server.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of NFS shares.
    */
  var nfsShares: js.UndefOr[js.Array[SchemaNfsShare]] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListNfsSharesResponse {
  
  inline def apply(): SchemaListNfsSharesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNfsSharesResponse]
  }
  
  extension [Self <: SchemaListNfsSharesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNfsShares(value: js.Array[SchemaNfsShare]): Self = StObject.set(x, "nfsShares", value.asInstanceOf[js.Any])
    
    inline def setNfsSharesUndefined: Self = StObject.set(x, "nfsShares", js.undefined)
    
    inline def setNfsSharesVarargs(value: SchemaNfsShare*): Self = StObject.set(x, "nfsShares", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
