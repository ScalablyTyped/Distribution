package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.AnonId
import typings.gapiYoutube.AnonMaxResults
import typings.gapiYoutube.AnonPart
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiYoutube.GoogleApiYouTubePlaylistItemResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait playlistItems extends js.Object {
  /**
    * Deletes a playlist item.
    */
  def delete(`object`: AnonId): HttpRequest[GoogleApiYouTubePlaylistItemResource]
  /**
    * Adds a resource to a playlist.
    */
  def insert(`object`: AnonPart): HttpRequest[GoogleApiYouTubePlaylistItemResource]
  /**
    * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or retrieve one or more playlist items by their unique IDs.
    */
  def list(`object`: AnonMaxResults): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistItemResource]]
  /**
    * Modifies a playlist item. For example, you could update the item's position in the playlist.
    */
  def update(`object`: AnonPart): HttpRequest[GoogleApiYouTubePlaylistItemResource]
}

object playlistItems {
  @scala.inline
  def apply(
    delete: AnonId => HttpRequest[GoogleApiYouTubePlaylistItemResource],
    insert: AnonPart => HttpRequest[GoogleApiYouTubePlaylistItemResource],
    list: AnonMaxResults => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistItemResource]],
    update: AnonPart => HttpRequest[GoogleApiYouTubePlaylistItemResource]
  ): playlistItems = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[playlistItems]
  }
}

