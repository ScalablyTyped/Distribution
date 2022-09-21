package typings.googleapis.admobV1betaMod.admobV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPublisherAccountsResponse extends StObject {
  
  /**
    * Publisher that the client credentials can access.
    */
  var account: js.UndefOr[js.Array[SchemaPublisherAccount]] = js.undefined
  
  /**
    * If not empty, indicates that there might be more accounts for the request; you must pass this value in a new `ListPublisherAccountsRequest`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListPublisherAccountsResponse {
  
  inline def apply(): SchemaListPublisherAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPublisherAccountsResponse]
  }
  
  extension [Self <: SchemaListPublisherAccountsResponse](x: Self) {
    
    inline def setAccount(value: js.Array[SchemaPublisherAccount]): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setAccountVarargs(value: SchemaPublisherAccount*): Self = StObject.set(x, "account", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
