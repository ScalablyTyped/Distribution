package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeSearchResource extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: String
  /**
    * The id object contains information that can be used to uniquely identify the resource that matches the search request.
    */
  var id: AnonKindPlaylistId
  /**
    * The kind, fixed to "youtube#searchResult".
    */
  var kind: String
  /**
    * The snippet object contains basic details about a search result, such as its title or description.
    */
  var snippet: AnonThumbnails
}

object GoogleApiYouTubeSearchResource {
  @scala.inline
  def apply(etag: String, id: AnonKindPlaylistId, kind: String, snippet: AnonThumbnails): GoogleApiYouTubeSearchResource = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeSearchResource]
  }
}

