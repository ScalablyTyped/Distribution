package typings.gapiYoutube

import typings.gapiYoutube.anon.Rating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiYouTubeVideoGetRatingResponse extends StObject {
  
  /**
    * The ETag of the response.
    */
  var etag: String = js.native
  
  /**
    * A list of ratings that match the request criteria.
    */
  var items: js.Array[Rating] = js.native
  
  /**
    * The type of the API response. For this operation, the value will be youtube#videoGetRatingResponse.
    */
  var kind: String = js.native
}
object GoogleApiYouTubeVideoGetRatingResponse {
  
  @scala.inline
  def apply(etag: String, items: js.Array[Rating], kind: String): GoogleApiYouTubeVideoGetRatingResponse = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeVideoGetRatingResponse]
  }
  
  @scala.inline
  implicit class GoogleApiYouTubeVideoGetRatingResponseMutableBuilder[Self <: GoogleApiYouTubeVideoGetRatingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[Rating]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: Rating*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
