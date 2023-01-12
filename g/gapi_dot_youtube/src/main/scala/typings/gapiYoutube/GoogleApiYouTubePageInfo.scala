package typings.gapiYoutube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiYouTubePageInfo[T] extends StObject {
  
  /**
    * The ETag of the response.
    */
  var etag: String
  
  /**
    * A list of activities, or events, that match the request criteria.
    */
  var items: js.Array[T]
  
  /**
    * The type of the API response. For this operation, the value will be youtube#activityListResponse.
    */
  var kind: String
}
object GoogleApiYouTubePageInfo {
  
  inline def apply[T](etag: String, items: js.Array[T], kind: String): GoogleApiYouTubePageInfo[T] = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubePageInfo[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleApiYouTubePageInfo[?], T] (val x: Self & GoogleApiYouTubePageInfo[T]) extends AnyVal {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
