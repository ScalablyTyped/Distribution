package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubePageInfo[T] extends js.Object {
  /**
    * The ETag of the response.
    */
  var etag: java.lang.String
  /**
    * A list of activities, or events, that match the request criteria.
    */
  var items: js.Array[T]
  /**
    * The type of the API response. For this operation, the value will be youtube#activityListResponse.
    */
  var kind: java.lang.String
}

object GoogleApiYouTubePageInfo {
  @scala.inline
  def apply[T](etag: java.lang.String, items: js.Array[T], kind: java.lang.String): GoogleApiYouTubePageInfo[T] = {
    val __obj = js.Dynamic.literal(etag = etag, items = items, kind = kind)
  
    __obj.asInstanceOf[GoogleApiYouTubePageInfo[T]]
  }
}

