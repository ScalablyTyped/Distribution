package typings.gapiDotYoutube

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
  var id: Anon_ChannelIdKindPlaylistId
  /**
    * The kind, fixed to "youtube#searchResult".
    */
  var kind: String
  /**
    * The snippet object contains basic details about a search result, such as its title or description.
    */
  var snippet: Anon_ChannelIdChannelTitleDescriptionPublishedAtThumbnails
}

object GoogleApiYouTubeSearchResource {
  @scala.inline
  def apply(
    etag: String,
    id: Anon_ChannelIdKindPlaylistId,
    kind: String,
    snippet: Anon_ChannelIdChannelTitleDescriptionPublishedAtThumbnails
  ): GoogleApiYouTubeSearchResource = {
    val __obj = js.Dynamic.literal(etag = etag, id = id, kind = kind, snippet = snippet)
  
    __obj.asInstanceOf[GoogleApiYouTubeSearchResource]
  }
}

