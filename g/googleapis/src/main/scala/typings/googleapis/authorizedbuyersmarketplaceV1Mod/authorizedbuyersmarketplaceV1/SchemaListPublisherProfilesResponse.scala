package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListPublisherProfilesResponse extends StObject {
  
  /**
    * Token to fetch the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of matching publisher profiles.
    */
  var publisherProfiles: js.UndefOr[js.Array[SchemaPublisherProfile]] = js.undefined
}
object SchemaListPublisherProfilesResponse {
  
  inline def apply(): SchemaListPublisherProfilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListPublisherProfilesResponse]
  }
  
  extension [Self <: SchemaListPublisherProfilesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPublisherProfiles(value: js.Array[SchemaPublisherProfile]): Self = StObject.set(x, "publisherProfiles", value.asInstanceOf[js.Any])
    
    inline def setPublisherProfilesUndefined: Self = StObject.set(x, "publisherProfiles", js.undefined)
    
    inline def setPublisherProfilesVarargs(value: SchemaPublisherProfile*): Self = StObject.set(x, "publisherProfiles", js.Array(value*))
  }
}
