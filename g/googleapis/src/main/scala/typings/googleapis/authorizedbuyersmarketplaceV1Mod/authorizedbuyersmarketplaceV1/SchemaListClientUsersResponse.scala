package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListClientUsersResponse extends StObject {
  
  /**
    * The returned list of client users.
    */
  var clientUsers: js.UndefOr[js.Array[SchemaClientUser]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListClientUsersRequest.pageToken field in the subsequent call to the list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListClientUsersResponse {
  
  inline def apply(): SchemaListClientUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClientUsersResponse]
  }
  
  extension [Self <: SchemaListClientUsersResponse](x: Self) {
    
    inline def setClientUsers(value: js.Array[SchemaClientUser]): Self = StObject.set(x, "clientUsers", value.asInstanceOf[js.Any])
    
    inline def setClientUsersUndefined: Self = StObject.set(x, "clientUsers", js.undefined)
    
    inline def setClientUsersVarargs(value: SchemaClientUser*): Self = StObject.set(x, "clientUsers", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
