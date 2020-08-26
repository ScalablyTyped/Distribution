package typings.gapiYoutube

import typings.gapiYoutube.anon.Rating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiYouTubeVideoGetRatingResponse extends js.Object {
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
  implicit class GoogleApiYouTubeVideoGetRatingResponseOps[Self <: GoogleApiYouTubeVideoGetRatingResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: Rating*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Rating]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

