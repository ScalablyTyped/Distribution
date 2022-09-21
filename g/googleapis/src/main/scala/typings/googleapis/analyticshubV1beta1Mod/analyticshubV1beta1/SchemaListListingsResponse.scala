package typings.googleapis.analyticshubV1beta1Mod.analyticshubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListListingsResponse extends StObject {
  
  /**
    * The list of Listing.
    */
  var listings: js.UndefOr[js.Array[SchemaListing]] = js.undefined
  
  /**
    * A token to request the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListListingsResponse {
  
  inline def apply(): SchemaListListingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListListingsResponse]
  }
  
  extension [Self <: SchemaListListingsResponse](x: Self) {
    
    inline def setListings(value: js.Array[SchemaListing]): Self = StObject.set(x, "listings", value.asInstanceOf[js.Any])
    
    inline def setListingsUndefined: Self = StObject.set(x, "listings", js.undefined)
    
    inline def setListingsVarargs(value: SchemaListing*): Self = StObject.set(x, "listings", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
