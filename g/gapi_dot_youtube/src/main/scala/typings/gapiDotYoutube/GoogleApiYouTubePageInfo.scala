package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubePageInfo[T] extends js.Object {
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
  @scala.inline
  def apply[T](etag: String, items: js.Array[T], kind: String): GoogleApiYouTubePageInfo[T] = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleApiYouTubePageInfo[T]]
  }
}

