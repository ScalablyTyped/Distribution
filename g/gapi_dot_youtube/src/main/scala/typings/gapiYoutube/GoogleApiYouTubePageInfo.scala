package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiYouTubePageInfo[T] extends js.Object {
  
  /**
    * The ETag of the response.
    */
  var etag: String = js.native
  
  /**
    * A list of activities, or events, that match the request criteria.
    */
  var items: js.Array[T] = js.native
  
  /**
    * The type of the API response. For this operation, the value will be youtube#activityListResponse.
    */
  var kind: String = js.native
}
object GoogleApiYouTubePageInfo {
  
  @scala.inline
  def apply[T](etag: String, items: js.Array[T], kind: String): GoogleApiYouTubePageInfo[T] = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubePageInfo[T]]
  }
  
  @scala.inline
  implicit class GoogleApiYouTubePageInfoOps[Self <: GoogleApiYouTubePageInfo[_], T] (val x: Self with GoogleApiYouTubePageInfo[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: T*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[T]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
}
