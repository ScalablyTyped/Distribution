package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListingsListResponse extends StObject {
  
  /**
    * The kind of this response ("androidpublisher#listingsListResponse").
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * All localized listings.
    */
  var listings: js.UndefOr[js.Array[SchemaListing]] = js.undefined
}
object SchemaListingsListResponse {
  
  inline def apply(): SchemaListingsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListingsListResponse]
  }
  
  extension [Self <: SchemaListingsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setListings(value: js.Array[SchemaListing]): Self = StObject.set(x, "listings", value.asInstanceOf[js.Any])
    
    inline def setListingsUndefined: Self = StObject.set(x, "listings", js.undefined)
    
    inline def setListingsVarargs(value: SchemaListing*): Self = StObject.set(x, "listings", js.Array(value*))
  }
}
