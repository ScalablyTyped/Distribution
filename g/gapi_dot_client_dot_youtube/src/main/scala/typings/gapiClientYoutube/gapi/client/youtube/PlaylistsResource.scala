package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.AltChannelId
import typings.gapiClientYoutube.anon.OnBehalfOfContentOwnerChannel
import typings.gapiClientYoutube.anon.Part
import typings.gapiClientYoutube.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistsResource extends js.Object {
  /** Deletes a playlist. */
  def delete(request: PrettyPrint): Request[Unit]
  /** Creates a playlist. */
  def insert(request: OnBehalfOfContentOwnerChannel): Request[Playlist]
  /**
    * Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns,
    * or you can retrieve one or more playlists by their unique IDs.
    */
  def list(request: AltChannelId): Request[PlaylistListResponse]
  /** Modifies a playlist. For example, you could change a playlist's title, description, or privacy status. */
  def update(request: Part): Request[Playlist]
}

object PlaylistsResource {
  @scala.inline
  def apply(
    delete: PrettyPrint => Request[Unit],
    insert: OnBehalfOfContentOwnerChannel => Request[Playlist],
    list: AltChannelId => Request[PlaylistListResponse],
    update: Part => Request[Playlist]
  ): PlaylistsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[PlaylistsResource]
  }
}

