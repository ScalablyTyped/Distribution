package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeVideoGetRatingResponse extends js.Object {
  /**
    * The ETag of the response.
    */
  var etag: String
  /**
    * A list of ratings that match the request criteria.
    */
  var items: js.Array[AnonRating]
  /**
    * The type of the API response. For this operation, the value will be youtube#videoGetRatingResponse.
    */
  var kind: String
}

object GoogleApiYouTubeVideoGetRatingResponse {
  @scala.inline
  def apply(etag: String, items: js.Array[AnonRating], kind: String): GoogleApiYouTubeVideoGetRatingResponse = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleApiYouTubeVideoGetRatingResponse]
  }
}

