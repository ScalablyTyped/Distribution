package typings.gapiDotYoutube.gapi.client.youtube

import typings.gapi.gapi.client.HttpRequest
import typings.gapiDotYoutube.Anon_ChannelIdId
import typings.gapiDotYoutube.Anon_Id
import typings.gapiDotYoutube.Anon_Part
import typings.gapiDotYoutube.GoogleApiYouTubePaginationInfo
import typings.gapiDotYoutube.GoogleApiYouTubePlaylistResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait playlists extends js.Object {
  /**
    * Deletes a playlist.
    */
  def delete(`object`: Anon_Id): HttpRequest[GoogleApiYouTubePlaylistResource]
  /**
    * Creates a playlist.
    */
  def insert(`object`: Anon_Part): HttpRequest[GoogleApiYouTubePlaylistResource]
  /**
    * Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns, or you can retrieve one or more playlists by their unique IDs.
    */
  def list(`object`: Anon_ChannelIdId): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]]
  /**
    * Modifies a playlist. For example, you could change a playlist's title, description, or privacy status.
    */
  def update(`object`: Anon_Part): HttpRequest[GoogleApiYouTubePlaylistResource]
}

object playlists {
  @scala.inline
  def apply(
    delete: Anon_Id => HttpRequest[GoogleApiYouTubePlaylistResource],
    insert: Anon_Part => HttpRequest[GoogleApiYouTubePlaylistResource],
    list: Anon_ChannelIdId => HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]],
    update: Anon_Part => HttpRequest[GoogleApiYouTubePlaylistResource]
  ): playlists = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[playlists]
  }
}

