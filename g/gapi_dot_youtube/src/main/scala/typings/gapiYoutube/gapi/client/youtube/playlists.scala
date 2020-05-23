package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiYoutube.GoogleApiYouTubePlaylistResource
import typings.gapiYoutube.anon.Id
import typings.gapiYoutube.anon.Mine
import typings.gapiYoutube.anon.Part
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait playlists extends js.Object {
  /**
    * Deletes a playlist.
    */
  def delete(`object`: Id): HttpRequest[GoogleApiYouTubePlaylistResource]
  /**
    * Creates a playlist.
    */
  def insert(`object`: Part): HttpRequest[GoogleApiYouTubePlaylistResource]
  /**
    * Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns, or you can retrieve one or more playlists by their unique IDs.
    */
  def list(`object`: Mine): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]]
  /**
    * Modifies a playlist. For example, you could change a playlist's title, description, or privacy status.
    */
  def update(`object`: Part): HttpRequest[GoogleApiYouTubePlaylistResource]
}

object playlists {
  @scala.inline
  def apply(
    delete: Id => HttpRequest[GoogleApiYouTubePlaylistResource],
    insert: Part => HttpRequest[GoogleApiYouTubePlaylistResource],
    list: Mine => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]],
    update: Part => HttpRequest[GoogleApiYouTubePlaylistResource]
  ): playlists = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[playlists]
  }
}

