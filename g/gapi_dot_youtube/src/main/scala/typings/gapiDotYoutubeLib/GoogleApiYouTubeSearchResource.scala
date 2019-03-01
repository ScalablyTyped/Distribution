package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeSearchResource extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: java.lang.String
  /**
    * The id object contains information that can be used to uniquely identify the resource that matches the search request.
    */
  var id: Anon_ChannelIdKindPlaylistId
  /**
    * The kind, fixed to "youtube#searchResult".
    */
  var kind: java.lang.String
  /**
    * The snippet object contains basic details about a search result, such as its title or description.
    */
  var snippet: Anon_ChannelIdChannelTitleDescriptionPublishedAtThumbnails
}

object GoogleApiYouTubeSearchResource {
  @scala.inline
  def apply(
    etag: java.lang.String,
    id: Anon_ChannelIdKindPlaylistId,
    kind: java.lang.String,
    snippet: Anon_ChannelIdChannelTitleDescriptionPublishedAtThumbnails
  ): GoogleApiYouTubeSearchResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("etag")(etag)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("snippet")(snippet)
    __obj.asInstanceOf[GoogleApiYouTubeSearchResource]
  }
}

