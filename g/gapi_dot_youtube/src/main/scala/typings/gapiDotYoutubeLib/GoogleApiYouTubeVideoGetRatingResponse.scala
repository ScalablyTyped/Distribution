package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeVideoGetRatingResponse extends js.Object {
  /**
    * The ETag of the response.
    */
  var etag: java.lang.String
  /**
    * A list of ratings that match the request criteria.
    */
  var items: js.Array[Anon_Rating]
  /**
    * The type of the API response. For this operation, the value will be youtube#videoGetRatingResponse.
    */
  var kind: java.lang.String
}

object GoogleApiYouTubeVideoGetRatingResponse {
  @scala.inline
  def apply(etag: java.lang.String, items: js.Array[Anon_Rating], kind: java.lang.String): GoogleApiYouTubeVideoGetRatingResponse = {
    val __obj = js.Dynamic.literal(etag = etag, items = items, kind = kind)
  
    __obj.asInstanceOf[GoogleApiYouTubeVideoGetRatingResponse]
  }
}

