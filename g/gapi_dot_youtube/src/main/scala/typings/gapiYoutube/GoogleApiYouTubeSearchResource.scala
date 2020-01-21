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
  var id: AnonChannelIdKindPlaylistId
  /**
    * The kind, fixed to "youtube#searchResult".
    */
  var kind: String
  /**
    * The snippet object contains basic details about a search result, such as its title or description.
    */
  var snippet: AnonChannelIdChannelTitleDescriptionPublishedAtThumbnails
}

object GoogleApiYouTubeSearchResource {
  @scala.inline
  def apply(
    etag: String,
    id: AnonChannelIdKindPlaylistId,
    kind: String,
    snippet: AnonChannelIdChannelTitleDescriptionPublishedAtThumbnails
  ): GoogleApiYouTubeSearchResource = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GoogleApiYouTubeSearchResource]
  }
}

