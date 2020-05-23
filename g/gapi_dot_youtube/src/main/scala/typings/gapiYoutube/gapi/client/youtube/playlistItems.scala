package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiYoutube.GoogleApiYouTubePlaylistItemResource
import typings.gapiYoutube.anon.Id
import typings.gapiYoutube.anon.MaxResults
import typings.gapiYoutube.anon.Part
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait playlistItems extends js.Object {
  /**
    * Deletes a playlist item.
    */
  def delete(`object`: Id): HttpRequest[GoogleApiYouTubePlaylistItemResource]
  /**
    * Adds a resource to a playlist.
    */
  def insert(`object`: Part): HttpRequest[GoogleApiYouTubePlaylistItemResource]
  /**
    * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or retrieve one or more playlist items by their unique IDs.
    */
  def list(`object`: MaxResults): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistItemResource]]
  /**
    * Modifies a playlist item. For example, you could update the item's position in the playlist.
    */
  def update(`object`: Part): HttpRequest[GoogleApiYouTubePlaylistItemResource]
}

object playlistItems {
  @scala.inline
  def apply(
    delete: Id => HttpRequest[GoogleApiYouTubePlaylistItemResource],
    insert: Part => HttpRequest[GoogleApiYouTubePlaylistItemResource],
    list: MaxResults => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistItemResource]],
    update: Part => HttpRequest[GoogleApiYouTubePlaylistItemResource]
  ): playlistItems = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[playlistItems]
  }
}

