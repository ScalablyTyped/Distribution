package typings.gapiYoutube

import typings.gapiYoutube.anon.ResultsPerPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleApiYouTubePaginationInfo[T] extends StObject {
  
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
  
  /**
    * The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set.
    */
  var nextPageToken: String
  
  /**
    * The pageInfo object encapsulates paging information for the result set.
    */
  var pageInfo: ResultsPerPage
  
  /**
    * The token that can be used as the value of the pageToken parameter to retrieve the previous page in the result set.
    */
  var prevPageToken: String
}
object GoogleApiYouTubePaginationInfo {
  
  inline def apply[T](
    etag: String,
    items: js.Array[T],
    kind: String,
    nextPageToken: String,
    pageInfo: ResultsPerPage,
    prevPageToken: String
  ): GoogleApiYouTubePaginationInfo[T] = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], nextPageToken = nextPageToken.asInstanceOf[js.Any], pageInfo = pageInfo.asInstanceOf[js.Any], prevPageToken = prevPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubePaginationInfo[T]]
  }
  
  extension [Self <: GoogleApiYouTubePaginationInfo[?], T](x: Self & GoogleApiYouTubePaginationInfo[T]) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setPageInfo(value: ResultsPerPage): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    inline def setPrevPageToken(value: String): Self = StObject.set(x, "prevPageToken", value.asInstanceOf[js.Any])
  }
}
