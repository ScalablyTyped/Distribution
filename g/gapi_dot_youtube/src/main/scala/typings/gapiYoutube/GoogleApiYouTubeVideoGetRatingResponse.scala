package typings.gapiYoutube

import typings.gapiYoutube.anon.Rating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiYouTubeVideoGetRatingResponse extends StObject {
  
  /**
    * The ETag of the response.
    */
  var etag: String
  
  /**
    * A list of ratings that match the request criteria.
    */
  var items: js.Array[Rating]
  
  /**
    * The type of the API response. For this operation, the value will be youtube#videoGetRatingResponse.
    */
  var kind: String
}
object GoogleApiYouTubeVideoGetRatingResponse {
  
  inline def apply(etag: String, items: js.Array[Rating], kind: String): GoogleApiYouTubeVideoGetRatingResponse = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeVideoGetRatingResponse]
  }
  
  extension [Self <: GoogleApiYouTubeVideoGetRatingResponse](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[Rating]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Rating*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
