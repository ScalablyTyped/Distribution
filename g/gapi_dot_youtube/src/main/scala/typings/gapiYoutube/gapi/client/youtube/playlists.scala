package typings.gapiYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiYoutube.AnonId
import typings.gapiYoutube.AnonMine
import typings.gapiYoutube.AnonPart
import typings.gapiYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiYoutube.GoogleApiYouTubePlaylistResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait playlists extends js.Object {
  /**
    * Deletes a playlist.
    */
  def delete(`object`: AnonId): HttpRequest[GoogleApiYouTubePlaylistResource]
  /**
    * Creates a playlist.
    */
  def insert(`object`: AnonPart): HttpRequest[GoogleApiYouTubePlaylistResource]
  /**
    * Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns, or you can retrieve one or more playlists by their unique IDs.
    */
  def list(`object`: AnonMine): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]]
  /**
    * Modifies a playlist. For example, you could change a playlist's title, description, or privacy status.
    */
  def update(`object`: AnonPart): HttpRequest[GoogleApiYouTubePlaylistResource]
}

object playlists {
  @scala.inline
  def apply(
    delete: AnonId => HttpRequest[GoogleApiYouTubePlaylistResource],
    insert: AnonPart => HttpRequest[GoogleApiYouTubePlaylistResource],
    list: AnonMine => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]],
    update: AnonPart => HttpRequest[GoogleApiYouTubePlaylistResource]
  ): playlists = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[playlists]
  }
}

