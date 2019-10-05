package typings.gapiDotYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiDotYoutube.Anon_Id
import typings.gapiDotYoutube.Anon_IdMaxResults
import typings.gapiDotYoutube.Anon_Part
import typings.gapiDotYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiDotYoutube.GoogleApiYouTubePlaylistItemResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait playlistItems extends js.Object {
  /**
    * Deletes a playlist item.
    */
  def delete(`object`: Anon_Id): HttpRequest[GoogleApiYouTubePlaylistItemResource]
  /**
    * Adds a resource to a playlist.
    */
  def insert(`object`: Anon_Part): HttpRequest[GoogleApiYouTubePlaylistItemResource]
  /**
    * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or retrieve one or more playlist items by their unique IDs.
    */
  def list(`object`: Anon_IdMaxResults): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistItemResource]]
  /**
    * Modifies a playlist item. For example, you could update the item's position in the playlist.
    */
  def update(`object`: Anon_Part): HttpRequest[GoogleApiYouTubePlaylistItemResource]
}

object playlistItems {
  @scala.inline
  def apply(
    delete: Anon_Id => HttpRequest[GoogleApiYouTubePlaylistItemResource],
    insert: Anon_Part => HttpRequest[GoogleApiYouTubePlaylistItemResource],
    list: Anon_IdMaxResults => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistItemResource]],
    update: Anon_Part => HttpRequest[GoogleApiYouTubePlaylistItemResource]
  ): playlistItems = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[playlistItems]
  }
}

